package com.cafe24.hanboa.program;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.hanboa.contract.Contract;
import com.cafe24.hanboa.totalResource.TotalResource;

@Service
@Transactional
public class ProgramService {
	@Autowired
	private ProgramDao programDao;
	private static final Logger logger = LoggerFactory.getLogger(ProgramService.class);
	
	// 1-1. 특별활동 등록 : 특별활동 등록을 위한 통합자원 코드 불러오기 
	public List<TotalResource> callTotalResource() {
		return programDao.callTotalResource();
	}
	// 1-2. 특별활동 등록 : 특별활동 등록을 위한 통합자원 코드 불러오기
	public List<Contract> callContract() {
		return programDao.callContract();
	}
	// 1-3. 특별활동 등록
	public void insertProgram(Program program) {
		String inDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
		program.setProgramRegistrationDate(inDate);
		programDao.insertProgram(program);
		logger.debug("{} <- insertProgram ProgramService.java", program);
		logger.debug("-------------------------------------------------------------");	
	}
	
	
	// Program 전체 조회(교직원)
	public List<Program> selectProgramList() {
		logger.debug("{} <- selectProgramList ProgramService.java");
		return programDao.getProgramList();
	}	
	// Program 수정 정보요청
	public Program getProgramOne(String programCd) {
		Program program = programDao.modifyGetProgram(programCd);
		logger.debug("{} <- getProgramOne ProgramService.java", program);
		return program;
	}
	// Program 수정
	public int programModify(Program program) {
		int programOne = programDao.programModify(program);
		logger.debug("{} <- programModify ProgramService.java", programOne);
		return programOne;
	}
}
