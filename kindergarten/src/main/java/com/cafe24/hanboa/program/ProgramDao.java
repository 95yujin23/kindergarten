package com.cafe24.hanboa.program;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.hanboa.contract.Contract;
import com.cafe24.hanboa.totalResource.TotalResource;

@Repository
public class ProgramDao {
	@Autowired
	private SqlSessionTemplate sqlSesionTamplate;
	// 경로 중복처리
	String localName = "com.cafe24.hanboa.ProgramMapper.";
	private static final Logger logger = LoggerFactory.getLogger(ProgramDao.class);

	// 1-1. 특별활동 등록 : 특별활동 등록을 위한 통합자원 코드 불러오기 
	public List<TotalResource> callTotalResource() {
		logger.debug("ProgramDao.java 1-1. callTotalResource() 메소드 실행"); 
		return sqlSesionTamplate.selectList(localName+"callTotalResource");
	}
	// 1-2. 특별활동 등록 : 특별활동 등록을 위한 통합자원 코드 불러오기
	public List<Contract> callContract() {
		logger.debug("ProgramDao.java 1-2. callContract() 메소드 실행");
		return sqlSesionTamplate.selectList(localName+"callContract");
	}
	// 1-3. 특별활동 등록
	public int insertProgram(Program program) {
		logger.debug("ProgramDao.java 1-3. insertProgram() 메소드 실행");
		return sqlSesionTamplate.insert(localName+"insertProgram");
	}
	// 전체조회
	public List<Program> getProgramList() {
		 return sqlSesionTamplate.selectList(localName+"getProgramList");
	}
	// 업데이트 정보요청
	public Program modifyGetProgram(String programCd) {
		logger.debug("{} <- programCd modifyGetProgram ProgramDao.java", programCd);
		return sqlSesionTamplate.selectOne(localName+"selectProgramOne", programCd);
	}
	// 업데이트
	public int programModify(Program program) {
		logger.debug("{} <- updateProgram ProgramDao.java", program);
		return sqlSesionTamplate.update(localName+"programModify", program);
	}
}