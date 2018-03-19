package com.cafe24.hanboa.program;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProgramService {
	@Autowired
	private ProgramDao programDao;
	private static final Logger logger = LoggerFactory.getLogger(ProgramService.class);
	
	public List<Program> selectProgramList() {
		logger.debug("{} <- selectProgramList ProgramService.java");
		return programDao.getProgramList();
	}
}
