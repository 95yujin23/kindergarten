package com.cafe24.hanboa.kids;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.hanboa.teacher.Teacher;
import com.cafe24.hanboa.teacher.TeacherService;

@Service
@Transactional
public class KidsService {

	@Autowired
	private KidsDao kidsDao;
	private static final Logger logger = LoggerFactory.getLogger(TeacherService.class);
	
	// 1. 영유아목록조회
	public List<Kids> getKidsList(HashMap<String, Object> map) {
		logger.debug("1. KidsService -- List<Kids> getKidsList(HashMap<String, Object> map) : {}", map);
		List<Kids> list = kidsDao.selectKidsList(map);
		logger.debug("List<Kids> list {}", list);
		logger.debug("-----------------------------------------");
		return list;
	}
	// 2. 영유아 편성 반별 조회
	public List<Kids> getKidsListByClass(Teacher teacher){
		logger.debug("2. KidsService -- List<Kids> getKidsListByClass(Teacher teacher) : {}", teacher);
		List<Kids> list = kidsDao.selectKidsListByClass(teacher);
		logger.debug("List<Kids> : {}", list);
		logger.debug("-----------------------------------------");
		return list;
	}
	// 3. 영유아 개인 조회
	public Kids getKidsOne(String kidsCd) {
		logger.debug("3. KidsService -- getKidsOne(String kidsCd) : {}", kidsCd);
		Kids kids = kidsDao.selectKidsOne(kidsCd);
		logger.debug("Kids kids", kids);
		logger.debug("-----------------------------------------");
		return kids;
	}
	// 4. 영유아 수정
	public int modifyKids(Kids kids) {
		logger.debug("3. KidsService -- modifyKids(Kids kids) : {}", kids);
		int modifyKids = kidsDao.updateKids(kids);
		logger.debug("Kids kids", kids);
		return modifyKids;
	}
	// 4-2. 영유아 수정 : 졸업
	public int modifyKidsGraduation(String kidsCd) {
		logger.debug("3. KidsService -- modifyKidsGraduation(String kidsCd) : {}", kidsCd);
		int modifyKidsGraduation = kidsDao.updateKidsGraduation(kidsCd);
		logger.debug("-----------------------------------------");
		return modifyKidsGraduation;
		
	}
	// 5. 영유아 삭제
	public int removeKids(String kidsCd) {
		logger.debug("3. KidsService -- removeKids(String kidsCd) : {}", kidsCd);
		int removeKids = kidsDao.deleteKids(kidsCd);
		logger.debug("-----------------------------------------");
		return removeKids;
	}
}
