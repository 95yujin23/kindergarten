package com.cafe24.hanboa.attendance;



import java.util.List;
import java.util.Map;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AttendanceDao {
	//출석 처리 DAO
	@Autowired
	private SqlSessionTemplate sqlSessionTemlate;
	private static final Logger logger = LoggerFactory.getLogger(AttendanceDao.class);
	String localName = "com.cafe24.hanboa.attendance.AttendanceMapper.";
	
	// 교직원
	// 1. 교직원 출근 입력
	public int insertTeacherAttendance(TeacherAttendance teacherAttendance) {
		logger.debug("AttendanceDao.java 1. insertTeacherAttendance() 메소드 실행"); 
		return sqlSessionTemlate.insert(localName + "insertTeacherAttendance", teacherAttendance);
	}
	// 2-1. 교직원 출퇴근 전체 조회(원장용)
	public List<TeacherAttendance> selectTeacherAttendance() {
		logger.debug("AttendanceDao.java 2-1. selectTheacherAttendance() 메소드 실행"); 
		return sqlSessionTemlate.selectList(localName+"selectTeacherAttendance");
	}
	// 2-1-1. 교직원 출퇴근 조회(원장용) 페이징 & 검색
//	public List<TeacherAttendance> selectTeacherAttendanceListByPage() {
//		logger.debug("AttendanceDao.java 2-1-1. selectTeacherAttendanceListByPage() 메소드 실행");
//		return sqlSessionTemlate.selectList(localName+"selectTeacherAttendanceListByPage");
//	}
	// 2-1-2. 전체 교직원 출퇴근 수(페이징)
//	public int selectTeacherAttendanceByPage(Map<String, Object> map) {
//		logger.debug("AttendanceDao.java 2-1-2. selectTeacherAttendanceByPage() 메소드 실행");
//		return sqlSessionTemlate.selectOne(localName+"selectTeacherAttendanceByPage", map);
//	}
	// 2-2. 교직원 출퇴근 전체 조회(선생님용)
	public List<TeacherAttendance> selectTeacherAttendanceOne(String teacherCd) {
		logger.debug("AttendanceDao.java 2-2. selectTeacherAttendanceOne() 메소드 실행");
		return sqlSessionTemlate.selectList(localName+"selectTeacherAttendanceOne", teacherCd);
	}
	// 3. 교직원 퇴근 입력(업데이트)
	public int updateTheacherAttendance(Map<String, Object> map) {
		logger.debug("AttendanceDao.java 3. updateTheacherAttendance() 메소드 실행");
		return sqlSessionTemlate.update(localName+"updateTeacherAttendance", map);
	}
	
	
	// 영유아
	// 1. 영유아 등원 입력
	public int insertKidsAttendance(KidsAttendance kidsAttendance) {
		logger.debug("AttendanceDao.java 1. insertKidsAttendance() 메소드 실행");
		return sqlSessionTemlate.insert(localName+"insertKidsAttendance", kidsAttendance);
	}
	// 2-1. 영유아 등하원 전체 조회(교직원용)
	public List<KidsAttendance> selectKidsAttendance() {
		logger.debug("AttendanceDao.java 2-1. selectKidsAttendance() 메소드 실행");
		return sqlSessionTemlate.selectList(localName+"selectKidsAttendance");
	}
	// 2-2. 영유아 등하원 개인 조회(영유아용)
	public List<KidsAttendance> selectKidsAttendanceOne(String kids) {
		logger.debug("AttendanceDao.java 2-2. selectKidsAttendanceOne() 메소드 실행");
		return sqlSessionTemlate.selectList(localName+"selectKidsAttendanceOne", kids);
	}
	// 3. 영유아 하원 입력(업데이트)
	public int updateKidsAttendance(Map<String, Object> map) {
		logger.debug("AttendanceDao.java 2-2. updateKidsAttendance() 메소드 실행");
		return sqlSessionTemlate.update(localName+"updateKidsAttendance", map);
	}
	
}
