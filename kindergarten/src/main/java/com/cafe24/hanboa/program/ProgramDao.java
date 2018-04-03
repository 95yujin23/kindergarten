package com.cafe24.hanboa.program;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.hanboa.contract.Contract;
import com.cafe24.hanboa.kids.Kids;
import com.cafe24.hanboa.totalResource.TotalResource;

@Repository
public class ProgramDao {
	@Autowired
	private SqlSessionTemplate sqlSesionTamplate;
	// 경로 중복처리
	String localName = "com.cafe24.hanboa.ProgramMapper.";
	private static final Logger logger = LoggerFactory.getLogger(ProgramDao.class);
	
	// 특별활동
	// 1-1. 특별활동 등록 : 특별활동 등록을 위한 통합자원 코드 불러오기 
	public List<TotalResource> callTotalResource() {
		logger.debug("ProgramDao.java 1-1. callTotalResource() 메소드 실행"); 
		return sqlSesionTamplate.selectList(localName+"callTotalResource");
	}
	// 1-2. 특별활동 등록 : 특별활동 등록을 위한 계약 코드 불러오기
	public List<Contract> callContract() {
		logger.debug("ProgramDao.java 1-2. callContract() 메소드 실행");
		return sqlSesionTamplate.selectList(localName+"callContract");
	}
	// 1-3. 특별활동 등록
	public int insertProgram(Program program) {
		logger.debug("ProgramDao.java 1-3. insertProgram() 메소드 실행");
		return sqlSesionTamplate.insert(localName+"insertProgram", program);
	}
	// 2. 특별활동 전체조회
	public List<Program> getProgramList() {
		logger.debug("ProgramDao.java 2. getProgramList() 메소드 실행");
		 return sqlSesionTamplate.selectList(localName+"getProgramList");
	}
	// 3-1. 특별활동 업데이트 정보요청
	public Program modifyGetProgram(String programCd) {
		logger.debug("{} <- programCd ProgramDao.java 3-1. modifyGetProgram() 메소드 실행", programCd);
		return sqlSesionTamplate.selectOne(localName+"selectProgramOne", programCd);
	}
	// 3-2. 특별활동 업데이트
	public int programModify(Program program) {
		logger.debug("{} <- program ProgramDao.java 3-2. programModify() 메소드 실행", program);
		return sqlSesionTamplate.update(localName+"programModify", program);
	}
	// 4. 특별활동 삭제
	public int programDelete(String programCd) {
		logger.debug("{} <- programCd ProgramDao.java 4. programDelete() 메소드 실행", programCd);
		return sqlSesionTamplate.delete(localName+"programDelete", programCd);
	}
	
	// 특별활동신청
	// 1-1. 특별활동신청 등록 : 특별활동신청 등록을 위한 영유아 목록 불러오기
	public List<Kids> callKids() {
		logger.debug("ProgramDao.java 1-1. callKids() 메소드 실행"); 
		return sqlSesionTamplate.selectList(localName+"callKids");
	}
	// 1-2. 특별활동신청 등록 : 특별활동신청 등록을 위한 특별활동 목록 불러오기
	public List<Program> callProgram() {
		logger.debug("ProgramDao.java 1-2. callProgram() 메소드 실행");
		return sqlSesionTamplate.selectList(localName+"callProgram");
	}
	// 1-3. 특별활동신청 등록
	public int insertProgramApplication(ProgramApplication programApplication) {
		logger.debug("ProgramDao.java 1-3. insertProgramApplication() 메소드 실행");
		return sqlSesionTamplate.insert(localName+"insertProgramApplication", programApplication);
	}
	// 2. 특별활동신청 전체조회+검색
	public List<ProgramApplication> getProgramApplicationList(Map<String, Object> map) {
		logger.debug("ProgramDao.java 2. getProgramApplicationList() 메소드 실행");
		logger.debug("{} <- searchOption ProgramDao.java", map.get("searchOption"));
		logger.debug("{} <- keyword ProgramDao.java", map.get("keyword"));
		return sqlSesionTamplate.selectList(localName+"getProgramApplicationList", map);
	}
	// 3-1. 특별활동신청 업데이트 정보요청 개별조회
	public ProgramApplication modifyGetProgramApplication(String programApplCd) {
		logger.debug("{} <- programApplCd ProgramDao.java 3-1. getProgramApplicationList() 메소드 실행", programApplCd);
		return sqlSesionTamplate.selectOne(localName+"selectProgramApplicationOne", programApplCd);
	}
	// 3-2. 특별활동신청 업데이트
	public int modifyProgramApplication(ProgramApplication programApplication) {
		logger.debug("{} <- programApplication ProgramDao.java 3-2. modifyProgramApplication() 메소드 실행", programApplication);
		return sqlSesionTamplate.update(localName+"programApplicationModify", programApplication);
	}
	// 4. 특별활동신청 삭제
	public int programApplicationDelete(String programApplCd) {
		logger.debug("{} <- programApplCd ProgramDao.java 3-2. programApplicationDelete() 메소드 실행", programApplCd);
		return sqlSesionTamplate.delete(localName+"programApplicationDelete", programApplCd);
	}
}