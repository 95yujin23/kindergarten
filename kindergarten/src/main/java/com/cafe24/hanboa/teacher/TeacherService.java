package com.cafe24.hanboa.teacher;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TeacherService {
	@Autowired
	private TeacherDao teacherDao;
	
	private static final Logger logger = LoggerFactory.getLogger(TeacherService.class);
	
	// 1. 교직원 목록 조회
	public List<Teacher> getTeacherList(){
		List<Teacher> list = teacherDao.selectTeacherList();
		logger.debug("1. TeacherService -- getTeacherList() : {}", list);
		logger.debug("-----------------------------------------");
		return list;
	}
	// 2. 교직원 개인 조회
	public Teacher getTeacherOne(String memberCd){
		Teacher teacher = teacherDao.selectTeacherOne(memberCd);
		logger.debug("2. TeacherService -- getTeacherOne(String memberCd) : {}", teacher);
		logger.debug("-----------------------------------------");
		return teacher;
	}
	// 3. 로그인
	public Teacher login(Teacher teacher){
		logger.debug("3. TeacherService -- login(String teacherEmail, String teacherPw)");
		teacher = teacherDao.login(teacher);
		logger.debug("-----------------------------------------");
		return teacher;
	}
	// 4. 교직원 등록
	public int addTeacher(Teacher teacher) {
		logger.debug("4. TeacherService -- addTeacher(Teacher teacher) : {}",teacher);
		int addTeacher = teacherDao.insertTeacher(teacher);
		logger.debug("-----------------------------------------");
		return addTeacher;		
	}
	// 4-2. 교직원 등록시 이메일 중복검사
	public int getTeacherEmail(String teacherEmail) {
		logger.debug("4. TeacherService -- getTeacherEmail(String teacherEmail) : {}",teacherEmail);
		int getTeacherEmail = teacherDao.selectTeacherEmail(teacherEmail);
		logger.debug("-----------------------------------------");
		return getTeacherEmail;	
	}
	
	// 5. 교직원 수정
	public int modifyTeacher(Teacher teacher) {
		logger.debug("5. TeacherService -- modifyTeacher(Teacher teacher) : {}",teacher);
		int modifyTeacher = teacherDao.updateTeacher(teacher);
		logger.debug("-----------------------------------------");
		return modifyTeacher;
	}
	// 6. 교직원 삭제 & 탈퇴
	public int removeTeacher(String teacherCd) {
		logger.debug("6. TeacherService -- removeTeacher(String teacherCd) : {}",teacherCd);
		int removeTeacher = teacherDao.deleteTeacher(teacherCd);
		logger.debug("-----------------------------------------");
		return removeTeacher;
	}
	// 7-1. 인건비 지급 목록 조회
	public HashMap<String, Object> getTeacherPayList(int currentPage, int pagePerRow, String month, String year) {
		logger.debug("7. TeacherService -- getTeacherPayList(int currentPage, int pagePerRow)");
		logger.debug(" currentPage : {}", currentPage);
		logger.debug(" pagePerRow : {}", pagePerRow);
		// 페이징 작업
		int startPage = 0;
		if(currentPage!=1) { //현재 페이지가 1이 아닌 조건
			startPage = (currentPage-1)*pagePerRow;
			//시작페이지 = (현재페이지-1) * 5(보여줄목록수) 
		}
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("startPage", startPage);
		map.put("pagePerRow", pagePerRow);
		map.put("month",month);
		map.put("year",year);
		List<TeacherAndTeacherPay> list = teacherDao.selectTeacherPayList(map);
		logger.debug("teacherDao.selectTeacherPayList(map) -- List<TeacherAndTeacherPay> : {}", list);
		int TotalCount = teacherDao.selectTeacherPayTotalCount();
		logger.debug("teacherDao.selectTeacherPayTotalCount() -- int TotalCount : {}", TotalCount);
		int countPage = TotalCount/pagePerRow;
						//페이지 수 = 총 목록수/보여줄목록수
		if(TotalCount%pagePerRow!=0) { //총 목록 수를 보여줄 목록수로 나눴을 때 나머지가 0이 아닌 조건
			countPage++; //countPage에 1씩 더한다.
		}
		logger.debug("TotalCount/pagePerRow = int countPage : {}", countPage);
		//return
		HashMap<String, Object> returnMap = new HashMap<String, Object>();
		returnMap.put("list", list);
		returnMap.put("countPage",countPage);
		logger.debug("HashMap<String, Object> returnMap : {}", returnMap);
		logger.debug("-----------------------------------------");
		return returnMap;
	}
	// 7-2. 인건비 지급 총 목록 수
	public int getTeacherPayTotalCount() {
		logger.debug("7. TeacherService -- getTeacherPayTotalCount()");
		int totalCount = teacherDao.selectTeacherPayTotalCount();
		logger.debug("-----------------------------------------");
		return totalCount;
	}
	// 8. 인건비 지급 개인 조회
	public List<TeacherPay> getTeacherPayOne(Teacher teacher) {
		logger.debug("8. TeacherService -- removeTeacher(String teacherCd) : {}",teacher);
		List<TeacherPay> list = teacherDao.selectTeacherPayOne(teacher);
		logger.debug("-----------------------------------------");
		return list;
	}
	// 9. 인건비 지급 등록
	public int addTeacherPay(TeacherPay teacherPay) {
		logger.debug("9. TeacherService -- addTeacherPay(TeacherPay teacherPay) : {}",teacherPay);
		int addTeacherPay = 0;
		try{
			addTeacherPay = teacherDao.insertTeacherPay(teacherPay);
			addTeacherPay = teacherDao.modifyPayClosingCd(teacherPay);
		}catch(DataAccessException dae){
				dae.printStackTrace();
		}catch(Exception e){
				e.printStackTrace();
		}finally {
		}
		logger.debug("-----------------------------------------");
		return addTeacherPay;
	}
	// 9-1. 인건비 마감 코드 수정
	/*public int modifyPayClosingCd(TeacherPay teacherPay){
		logger.debug("9-1. TeacherService -- modifyPayClosingCd(TeacherPay teacherPay) : {}",teacherPay);
		int modifyPayClosingCd = teacherDao.modifyPayClosingCd(teacherPay);
		logger.debug("-----------------------------------------");
		return modifyPayClosingCd;
	}*/
	// 10. 인건비 지급 수정
		public int modifyTeacherPay(TeacherPay teacherPay) {
			logger.debug("5. TeacherService -- modifyTeacherPay(TeacherPay teacherPay) : {}",teacherPay);
			int modifyTeacher = teacherDao.updateTeacherPay(teacherPay);
			logger.debug("-----------------------------------------");
			return modifyTeacher;
	}
	// 11. 인건비 지급 삭제
	public int removeTeacherPay(String teacherCd) {
		logger.debug("6. TeacherService -- removeTeacherPay(String teacherCd) : {}",teacherCd);
		int removeTeacher = teacherDao.deleteTeacherPay(teacherCd);
		logger.debug("-----------------------------------------");
		return removeTeacher;
	}
}
