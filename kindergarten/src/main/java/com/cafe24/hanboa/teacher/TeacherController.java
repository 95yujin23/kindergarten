package com.cafe24.hanboa.teacher;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TeacherController {
	@Autowired
	private TeacherService teacherService;

	private static final Logger logger = LoggerFactory.getLogger(TeacherController.class);
	
	// 1. 교직원 전체 목록 조회
	@RequestMapping(value="/TeacherList")
	public String teacherList(Model model, HttpSession session
							,@RequestParam(value="currentPage", defaultValue="1") int currentPage
						 	,@RequestParam(value="pagePerRow", defaultValue="5") int pagePerRow) {
		logger.debug("1. TeacherController -- TeacherList");
		if(session.getAttribute("loginTeacher")==null) {
			return "redirect:/Login";
		}else if(session.getAttribute("loginTeacher")!=null) {
			HashMap<String, Object> map = teacherService.getTeacherList(currentPage, pagePerRow);
			logger.debug("HashMap<String, Object> map : {}",map);
			List<Teacher> list = (List<Teacher>) map.get("list");
			logger.debug("List<Teacher> list : {}",list);
			int countPage = (Integer) map.get("countPage");
			logger.debug("int countPage : {}",countPage);
			model.addAttribute("list", list);
			model.addAttribute("countPage", countPage);
			return "teacher/teacher_list";
		}
		logger.debug("-----------------------------------------");
		return "teacher/teacher_list";
	}
	
	// 2. 교직원 개인 조회
	@RequestMapping(value="/TeacherSelect")
	public String teacherOne(Model model, HttpSession session, Teacher teacher) {
		logger.debug("2. TeacherController -- TeacherOne : {}", teacher);
		Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
		if(loginTeacher == null) {
			return "redirect:/Login";
		}else {
			session.setAttribute("loginTeacher", loginTeacher);
		}
		logger.debug("-----------------------------------------");
		
		/*Teacher teacher = teacherService.getTeacherOne(memberCd);*/
		logger.debug("-----------------------------------------");
		return "teacher/teacher_select";
	}
	
	// 3-1. 로그인 화면
	@RequestMapping(value="/Login", method = RequestMethod.GET)
	public String login() {
		logger.info("3-1. TeacherController -- LoginForm");;
		logger.debug("-----------------------------------------");
		return "login/login";
		}
	
	// 3-2. 로그인 실행
	@RequestMapping(value="/Login", method = RequestMethod.POST)
	public String login(Model model, HttpSession session, Teacher teacher) {
		logger.debug("3-2. TeacherController -- LoginAction : {}, {}", teacher);
		Teacher loginTeacher = teacherService.login(teacher);
		if(loginTeacher == null) {
			return "redirect:/Login";
		}else {
			session.setAttribute("loginTeacher", loginTeacher);
		}
		logger.debug("-----------------------------------------");
		/*	1. 로그인이 되면 로그인된 선생님의 정보에서 license를 가져옴
		 *	2. 최초 로그인을 하는 사람 - 최초로 라이센스를 부여받은 원장님
		 *	3. 원장님이 부여받은 라이센스를 가지고 교직원을 등록
		 * 	4. 라이센스가 원장이 등록한 교직원에게 부여
		 */
		return "redirect:/Preview";
			}
	
	// 4. 로그아웃
	@RequestMapping(value="/Logout", method = RequestMethod.GET)
	public String logout(Model model, HttpSession session) {
		logger.debug("4. TeacherController -- LogOut");
		session.invalidate();
		logger.debug("-----------------------------------------");
		return "redirect:/";
		}
		
	// 5-1. 교직원 등록 화면
	@RequestMapping(value="/TeacherAdd", method = RequestMethod.GET)
	public String teacherAdd() {
		logger.debug("5-1. TeacherController -- TeacherAddForm");
		logger.debug("-----------------------------------------");
		return "teacher/teacher_add";
		}	
	
	// 5-2. 교직원 등록
	@RequestMapping(value="/TeacherAdd", method = RequestMethod.POST)
	public String teacherAdd(Model model, HttpSession session, Teacher teacher) {
		logger.debug("5-2. TeacherController -- TeacherAdd : {}", teacher);
		Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
		// loginTeacher객체에 session에 담긴 loginTeacher의 값을 담는다.
		if(loginTeacher == null) {
			// loginTeacher의 값이 null이라면 login화면으로
			return "redirect:/Login";
		}
		// null이 아니라면 loginTeacher세션에서 라이센스를 받아서 teacher객체에 셋팅한다.
		teacher.setLicenseKindergarten(loginTeacher.getLicenseKindergarten());
		teacherService.addTeacher(teacher);
		logger.debug("-----------------------------------------");
		return "redirect:/";
		}	
	
	// 5-3. 교직원 등록시 이메일 중복검사
	@RequestMapping(value="/TeacherEmailCheck", method = RequestMethod.POST)
	public @ResponseBody int getTeacherEmail(@RequestParam("teacherEmail")String teacherEmail) {
		logger.debug("5-3. TeacherController --  getTeacherEmail : {}", teacherEmail);
		int result = teacherService.getTeacherEmail(teacherEmail);
		logger.debug("result : {}", result);
		logger.debug("-----------------------------------------");
		return result;
	}
	// 6-1. 교직원 수정 화면
	@RequestMapping(value="/TeacherModify", method = RequestMethod.GET)
	public String teacherModify() {
		logger.debug("6-1. TeacherController -- TeacherModifyForm");
		logger.debug("-----------------------------------------");
		return "teacher/teacher_modify";
		}
	
	// 6-2. 교직원 수정
	@RequestMapping(value="/TeacherModify", method = RequestMethod.POST)
	public String teacherModify(Model model, HttpSession session, Teacher teacher) {
		logger.debug("6-2. TeacherController -- TeacherModify");
		teacherService.modifyTeacher(teacher);
		logger.debug("-----------------------------------------");
		//수정은 되는데 결과가 바로 안나옴 ...  ? 로그아웃했다가 다시 로그인하면 나옴
		//수정이 되면 로그아웃이 되게 만듬 - 로그인하면 변경된 정보로 들어감
		//더 나은 방법을 생각해야봐야할거같음...
		session.invalidate();
		return "redirect:/";
		}
	
	// 7. 교직원 삭제 & 탈퇴
	@RequestMapping(value="/teacherRemove", method = RequestMethod.GET)
	public String teacherRemove(Model model, HttpSession session, String teacherCd) {
		logger.debug("7. TeacherController -- TeacherRemove");
		teacherService.removeTeacher(teacherCd);
		logger.debug("-----------------------------------------");
		return "redirect:/";
		}	
	
	// 8. 교직원 인건비 지급 목록 전체 조회
	@RequestMapping(value="/TeacherPayList")
	public String teacherPayList(Model model, HttpSession session
								,@RequestParam(value="year", defaultValue="") String year
							 	,@RequestParam(value="month", defaultValue="") String month
							 	,@RequestParam(value="currentPage", defaultValue="1") int currentPage
							 	,@RequestParam(value="pagePerRow", defaultValue="5") int pagePerRow) {
		logger.debug("8. TeacherController -- TeacherPayList");
		if(session.getAttribute("loginTeacher")==null) {
			return "redirect:/Login";
		}else if(session.getAttribute("loginTeacher")!=null) {
			HashMap<String, Object> map = teacherService.getTeacherPayList(currentPage, pagePerRow, month, year);
			logger.debug("HashMap<String, Object> map : {}",map);
			List<TeacherAndTeacherPay> list = (List<TeacherAndTeacherPay>) map.get("list");
			logger.debug("List<TeacherAndTeacherPay> list : {}",list);
			int countPage = (Integer) map.get("countPage");
			logger.debug("int countPage : {}",countPage);
			model.addAttribute("list", list);
			model.addAttribute("countPage", countPage);
			return "teacher/teacher_pay_list";
		}
		logger.debug("-----------------------------------------");
		return "teacher/teacher_pay_list";
		}	
	
	// 9. 교직원 인건비 지급 목록 개인 조회
	@RequestMapping(value="/TeacherPaySelect", method = RequestMethod.GET)
	public String teacherPaySelect(Model model, HttpSession session, Teacher teacher) {		
		logger.debug("9. TeacherController -- TeacherPaySelect : {}");
		Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
		// loginTeacher객체에 session에 담긴 loginTeacher의 값을 담는다.
		if(loginTeacher == null) {
			// loginTeacher의 값이 null이라면 login화면으로
			return "redirect:/Login";
		}
		// null이 아니라면 loginTeacher세션에서 teacherCd 받아서 teacher객체에 셋팅한다.
		teacher.setTeacherCd(loginTeacher.getTeacherCd());
		List<TeacherPay> list = teacherService.getTeacherPayOne(teacher);
		logger.debug("-----------------------------------------");
		model.addAttribute("list", list);
		return "teacher/teacher_pay_select";
		}
	
	// 10-1. 교직원 인건비 지급 등록 화면
		@RequestMapping(value="/TeacherPayAdd", method = RequestMethod.GET)
		public String teacherPayAdd(Model model) {
			logger.debug("10-1. TeacherController -- TeacherPayModifyForm");
			//교직원 목록 가져오기 ( 교직원코드 & 교직원이름)
			List<Teacher> list = teacherService.getTeacherNm();
			logger.debug("list {} :",list);
			//list에 교직원목록을 담아서 화면에 뿌려줌 : select의 option value
			logger.debug("-----------------------------------------");
			model.addAttribute("list", list);
			return "teacher/teacher_pay_add";
			}

	// 10-2. 교직원 인건비 지급 등록
	@RequestMapping(value="/TeacherPayAdd", method = RequestMethod.POST)
	public String teacherPayAdd(Model model, HttpSession session, TeacherPay teacherPay) {
		logger.debug("10-2. TeacherController -- teacherPayModify {}", teacherPay);
		Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
		// loginTeacher객체에 session에 담긴 loginTeacher의 값을 담는다.
		logger.debug("loginTeacher : {}", loginTeacher);
		if(loginTeacher == null) {
			// loginTeacher의 값이 null이라면 login화면으로
			return "redirect:/Login";
		}
		// null이 아니라면 loginTeacher세션에서 라이센스를 받아서 teacher객체에 셋팅한다.
		teacherPay.setLicenseKindergarten(loginTeacher.getLicenseKindergarten());
		logger.debug("teacherPay : {}", teacherPay);
		teacherService.addTeacherPay(teacherPay);
		logger.debug("-----------------------------------------");
		return "redirect:/";
		}
	
	// 11-1. 교직원 인건비 지급 수정 화면
	@RequestMapping(value="/TeacherPayModify", method = RequestMethod.GET)
	public String teacherPayModify() {
		
		logger.debug("10-1. TeacherController -- TeacherPayModifyForm");
		logger.debug("-----------------------------------------");
		return "teacher/teacher_pay_modify";
		}

	// 11-2. 교직원 인건비 지급 수정
	@RequestMapping(value="/TeacherPayModify", method = RequestMethod.POST)
	public String teacherPayModify(Model model, HttpSession session, TeacherPay teacherPay) {
		teacherService.modifyTeacherPay(teacherPay);
		logger.debug("10-2. TeacherController -- teacherPayModify {}", teacherPay);
		logger.debug("-----------------------------------------");
		return "redirect:/";
		}
	
	// 12. 교직원 인건비 지급 삭제
	@RequestMapping(value="/TeacherPayRemove", method = RequestMethod.GET)
	public String teacherPayRemove(Model model, HttpSession session, String teacherCd) {
		//원장만 가능하도록 만들기 - 직급이 원장님인 경우만 삭제 가능 - session에서 가져오기
		logger.debug("11. TeacherController -- LogOut");
		teacherService.removeTeacherPay(teacherCd);
		logger.debug("-----------------------------------------");
		return "redirect:/";
		}	
}
