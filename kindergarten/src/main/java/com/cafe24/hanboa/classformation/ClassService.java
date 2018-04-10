package com.cafe24.hanboa.classformation;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClassService {
	// 반 편성 처리 service
	
	@Autowired
	private ClassDao classDao;
	private static final Logger logger = LoggerFactory.getLogger(ClassService.class);
	//tb_kids_class
	public List<KidsClass> selectKidsClassList() {
		logger.debug("ClassService --> selectKidsClassList()메소드 실행");
		List<KidsClass> list = classDao.selectKidsClassList();
		return list;
	}
	// 반 추가
	public void addKidsClass(KidsClass kidsClass) {
		logger.debug("ClassService --> removeKidsClass()메소드 실행");
		classDao.addKidsClass(kidsClass);
	}
	// 반 수정
	public void modifyKidsClass(KidsClass kidsClass) {
		logger.debug("ClassService --> modifyKidsClass()메소드 실행");
		classDao.modifyKidsClass(kidsClass);
	}
	// 반 삭제
	public void removeKidsClass(KidsClass kidsClass) {
		logger.debug("ClassService --> removeKidsClass()메소드 실행");
		classDao.removeKidsClass(kidsClass);
	}
	// 반편성 미분류 인원 추가하기
	public void addUnClassification(ClassFormation classFormation){
		logger.debug("ClassService --> addUnClassification()메소드 실행");
		classDao.addUnClassification(classFormation);
		
	}
	
	// 분류된 인원 리스트 ajax
	public List<KidsFormation> kidsFormationList(KidsFormation kidsformation){
		logger.debug("ClassService --> kidsFormationList()메소드 실행");
		List<KidsFormation> list = classDao.kidsFormationList(kidsformation);
		return list;
	}
	// 미분류 인원 리스트 ajax
	public List<KidsFormation> unformationkids(KidsFormation kidsformation){
		logger.debug("ClassService --> unformationkids()메소드 실행");
		List<KidsFormation> list = classDao.unFormationKidsList(kidsformation);
		return list;
	}

}
