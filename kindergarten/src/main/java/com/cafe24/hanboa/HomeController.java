package com.cafe24.hanboa;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.hanboa.license.License;
import com.cafe24.hanboa.license.LicenseService;
import com.cafe24.hanboa.teacher.Teacher;

import sun.util.logging.resources.logging;

@Controller
public class HomeController {
	
	@Autowired
	private LicenseService licenseService;
	
	@Autowired
	private AdminService adminService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	// 관리자 로그인
	@RequestMapping(value="/AdminLogin", method = RequestMethod.POST)
	public String adminLogin(Admin admin, HttpSession session
							,@RequestParam("adminId")String adminId
							,@RequestParam("adminPw")String adminPw){
		logger.debug("HomeController -- adminLogin : {}", admin);
		admin = adminService.login(admin);
		session.setAttribute("loginAdmin", admin);
		logger.debug("HomeController -- adminLogin : {}", admin);
		return "redirect:/";
		
	}
	// 1. 메인 화면 (프로젝트 소개)
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		/*logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );*/
		return "home/home";
	}
	// 2. 팀 소개 화면
	@RequestMapping(value = "/Team", method = RequestMethod.GET)
	public String team() {
		/*logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );*/
		return "home/team";
	}
	// 3. 사이트맵
	@RequestMapping(value = "/SiteMap", method = RequestMethod.GET)
	public String siteMap() {
		/*logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );*/
		return "home/site_map";
	}
	// 4. 유치원 정보 공시
	@RequestMapping(value = "/Preview", method = RequestMethod.GET)
	public String preview(HttpSession session,Model model, License license) {
		logger.debug("4. HomeController -- Preview");
		if(session.getAttribute("loginTeacher")==null) {
			return "redirect:/Login";
		}else if(session.getAttribute("loginTeacher")!=null) {
			Teacher loginTeacher = (Teacher) session.getAttribute("loginTeacher");
			logger.debug("Teacher loginTeacher : {}",loginTeacher);
			license.setLicenseKindergarten(loginTeacher.getLicenseKindergarten());
			logger.debug("license : {}",license);
			license = licenseService.getLicenseOne(license);
			logger.debug("license : {}",license);
			model.addAttribute("license",license);
			return "home/preview";
		}
		
		logger.debug("------------------------------");
		return "home/preview";
	}
	// 달력 테스트
	@RequestMapping(value = "/str", method = RequestMethod.GET)
	public String str() {
		return "NewFile";
	}
}
