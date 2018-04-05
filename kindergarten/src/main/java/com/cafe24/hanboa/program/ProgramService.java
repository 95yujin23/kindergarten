package com.cafe24.hanboa.program;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.hanboa.contract.Contract;
import com.cafe24.hanboa.kids.Kids;
import com.cafe24.hanboa.totalResource.TotalResource;

@Service
@Transactional
public class ProgramService {
	@Autowired
	private ProgramDao programDao;
	private static final Logger logger = LoggerFactory.getLogger(ProgramService.class);
	
	// 특별활동
	// 1-1. 특별활동 등록 : 특별활동 등록을 위한 통합자원 코드 불러오기 
	public List<TotalResource> callTotalResource() {
		return programDao.callTotalResource();
	}
	// 1-2. 특별활동 등록 : 특별활동 등록을 위한 계약 코드 불러오기
	public List<Contract> callContract() {
		return programDao.callContract();
	}
	// 1-3. 특별활동 등록
	public void insertProgram(Program program) {
		String inDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
		program.setProgramRegistrationDate(inDate);
		programDao.insertProgram(program);
		logger.debug("{} <- insertProgram ProgramService.java", program);
	}
	// 2. 특별활동 전체조회+검색+페이징
	public Map<String, Object> selectProgramList(int currentPage, int pagePerRow, String searchOption, String keyword) {
		logger.debug("{} : <- currentPage selectPlanList ProgramService.java", currentPage);
		logger.debug("{} : <- pagePerRow selectPlanList ProgramService.java", pagePerRow);
		logger.debug("{} <- searchOption selectPlanList ProgramService.java", searchOption);
		logger.debug("{} <- keyword selectPlanList ProgramService.java", keyword);
		int startPage = 0;
		if(currentPage > 1) {
			startPage = (currentPage-1)*pagePerRow;
		}
		// DAO에 시작 페이지와 행의 수 보내기
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("searchOption", searchOption);
		map.put("keyword", keyword);
		map.put("startPage", startPage);
		map.put("pagePerRow", pagePerRow);
		List<Program> list = programDao.getProgramList(map);
		logger.debug("{} : <- list cityService.java", list);
		// 총 행의 수를 보여줄 행의 수로 나눈 뒤 나머지가 0일 경우는 넘어가고 아닐 경우 +1 한다.
		int count = programDao.selectProgramCountByPage(map);
		logger.debug("{} : <- count ProgramService.java", count);
		int countPage = count/pagePerRow;
		if(count%pagePerRow != 0) {
				countPage++;
		}
		logger.debug("{} : <- countPage cityService.java", countPage);
		// list, 페이지 수 리턴
		Map<String, Object> returnMap = new HashMap<String, Object>();
		returnMap.put("searchOption", searchOption);
		returnMap.put("keyword", keyword);
		returnMap.put("list", list);
		returnMap.put("countPage", countPage);
		return returnMap;
	}	
	// 3-1. 특별활동 업데이트 정보요청
	public Program getProgramOne(String programCd) {
		Program program = programDao.modifyGetProgram(programCd);
		logger.debug("{} <- getProgramOne ProgramService.java", program);
		return program;
	}
	// 3-2. 특별활동 업데이트
	public int programModify(Program program) {
		int programOne = programDao.programModify(program);
		logger.debug("{} <- programModify ProgramService.java", programOne);
		return programOne;
	}
	// 4. 특별활동 삭제
	public int programDelete(String programCd) {
		int programOne = programDao.programDelete(programCd);
		return programOne;
	}
	
	// 특별활동신청
	// 1-1. 특별활동신청 등록 : 특별활동신청 등록을 위한 영유아 목록 불러오기
	public List<Kids> callKids() {
		return programDao.callKids();
	}
	// 1-2. 특별활동신청 등록 : 특별활동신청 등록을 위한 특별활동 목록 불러오기
	public List<Program> callProgram() {
		return programDao.callProgram();
	}
	// 1-3. 특별활동신청 등록
	public void insertProgramApplication(ProgramApplication programApplication) {
		String inDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
		programApplication.setPRAPRegistrationDate(inDate);
		programDao.insertProgramApplication(programApplication);
		logger.debug("{} <- insertProgramApplication ProgramService.java", programApplication);
	}
	// 2. 특별활동신청 전체조회+검색
	public Map<String, Object> getProgramApplicationList(String searchOption, String keyword) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("searchOption", searchOption);
		map.put("keyword", keyword);
		List<ProgramApplication> list = programDao.getProgramApplicationList(map);
		logger.debug("{} <- searchOption getProgramApplicationList ProgramService.java", searchOption);
		logger.debug("{} <- keyword getProgramApplicationList ProgramService.java", keyword);
		map.put("list", list);
		return map;
	}
	// 3-1. 특별활동신청 업데이트 정보요청 개별조회
	public ProgramApplication GetProgramApplication(String programApplCd) {
		ProgramApplication programApplication = programDao.modifyGetProgramApplication(programApplCd);
		logger.debug("{} <- GetProgramApplication ProgramService.java", programApplication);
		return programApplication;
	}
	// 3-2. 특별활동신청 업데이트
	public int programApplicationModify(ProgramApplication programApplication) {
		int programApplicationOne = programDao.modifyProgramApplication(programApplication);
		logger.debug("{} <- programApplicationModify ProgramService.java", programApplicationOne);
		return programApplicationOne;
	}
	// 4. 특별활동신청 삭제
	public int programApplicationDelete(String programApplCd) {
		int programApplicationOne = programDao.programApplicationDelete(programApplCd);
		logger.debug("{} <- programApplicationDelete ProgramService.java", programApplicationOne);
		return programApplicationOne;
	}
}
