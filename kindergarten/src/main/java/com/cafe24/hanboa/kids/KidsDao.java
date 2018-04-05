package com.cafe24.hanboa.kids;


import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.hanboa.teacher.Teacher;

@Repository
public class KidsDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(KidsDao.class);
	
	String localName = "com.cafe24.hanboa.kids.KidsMapper.";
	
	// 1-1. 전체 영유아 조회
	public List<Kids> selectKidsList(){
		logger.debug("1. KidsDao -- List<Kids> selectKidsList() 매서드 실행");
		return sqlSession.selectList(localName + "getKidsList");
	}
	// 1-2. 영유아 조회 : 반 별로
	public List<Kids> selectKidsListByClass(HashMap<String, Object> map) {
		logger.debug("1-2. KidsDao -- List<Kids> selectKidsList(HashMap<String, Object> map) 매서드 실행");
		logger.debug("map : {}",map);
		// parameter로 map에 값을 담아서 넘겨준다. keyword의 value값
		return sqlSession.selectList(localName + "getKidsListByClass", map);
	}
	// 1-3. 영유아 파일 전체 목록 조회
	public List<KidsAndKidsFile> selectKidsAndKidsFileList() {
		logger.debug("1-3. KidsDao --  KidsAndKidsFile selectKidsFile(String kidsCd) 매서드 실행");
		// parameter로 map에 값을 담아서 넘겨준다. keyword의 value값
		return sqlSession.selectList(localName + "getKidsAndKidsFileList");
	}
	// 1-4. 영유아 파일 개인 조회
	public KidsAndKidsFile selectKidsAndKidsFileOne(String kidsCd) {
		logger.debug("1-3. KidsDao --  KidsAndKidsFile selectKidsFile(String kidsCd) 매서드 실행");
		// parameter로 map에 값을 담아서 넘겨준다. keyword의 value값
		return sqlSession.selectOne(localName + "getKidsAndKidsFileOne",kidsCd);
	}
	// 2. 편성 반별 영유아 조회 : 선생님이 맡은 반
	public List<Kids> selectKidsListByTeacher(Teacher teacher){
		logger.debug("2. KidsDao -- List<Kids> selectKidsListByClass(Teacher teacher) : {}",teacher);
		return sqlSession.selectList(localName + "getKidsListByTeacher",teacher);
	}
	// 3. 영유아 개인 조회
	public Kids selectKidsOne(String kidsCd) {
		logger.debug("3. KidsDao --  Kids selectKidsOne(String kidsCd) : {}",kidsCd);
		return sqlSession.selectOne(localName + "getKidsOne",kidsCd);
	}
	// 4-1. 영유아 등록
	public int insertKids(Kids kids) {
		logger.debug("4-1. KidsDao -- int insertKids(Kids kids) : {}",kids);
		return sqlSession.insert(localName + "insertKids",kids);
	}
	// 4-2. 영유아 파일 등록
	public int insertKidsFile(KidsFile kidsFile) {
		logger.debug("4-2. KidsDao -- int insertKidsFile(KidsFile kidsFile) : {}",kidsFile);
		return sqlSession.insert(localName + "insertKidsFile",kidsFile);
	}
	// 5-1. 영유아 수정
	public int updateKids(Kids kids) {
		logger.debug("5. KidsDao -- int updateKids(Kids kids) : {}",kids);
		return sqlSession.update(localName + "updateKids",kids);
	}
	// 5-2. 영유아 파일 수정
	public int updateKidsFile(KidsFile kidsFile) {
		logger.debug("5. KidsDao -- int updateKidsFile(KidsFile kidsFile) : {}",kidsFile);
		return sqlSession.update(localName + "updateKidsFile",kidsFile);
	}
	// 5-3. 영유아 수정 : 졸업 update
	public int updateKidsGraduation(String kidsCd) {
		logger.debug("5-2. KidsDao -- int updateKidsGraduation(String kidsCd) : {}",kidsCd);
		return sqlSession.update(localName + "updateKidsGraduation",kidsCd);
	}
	// 6-1. 영유아 삭제
	public int deleteKids(String kidsCd) {
		logger.debug("6-1. KidsDao -- int deleteKids(String kidsCd) : {}",kidsCd);
		return sqlSession.delete(localName + "deleteKids",kidsCd);
	}
	// 6-2. 영유아 파일 삭제
	public int deleteKidsFile(String kidsCd) {
		logger.debug("6-2. KidsDao -- deleteKidsFile(String kidsCd) : {}",kidsCd);
		return sqlSession.delete(localName + "deleteKidsFile",kidsCd);
	}
}
