package com.cafe24.hanboa.feeding;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.hanboa.kids.Kids;

@Repository
public class FeedingApplicationDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(FeedingApplicationDao.class);

	String localName = "com.cafe24.hanboa.feeding.FeedingMapper.";
	
	// 1. 목록조회
	public List<FeedingApplication> selectFeedingApplicationList(HashMap<String, Object> map){
		logger.debug("{} <- selectFeedingApplicationList FeedingApplicationDao.java");
		return sqlSession.selectList(localName+"getFeedingApplication",map);
	}
	// 1-2 급식신청 총 목록 조회
	public int selectFeapTotalCount() {
		logger.debug("{} <- selectFeapTotalCount FeedingApplicationDao.java");
		return sqlSession.selectOne(localName+"getFeapTotalCount");		
	}
	
	// 1-3 kids 불러오기
	public List<Kids> callKids(){
		logger.debug("{} < -- callKids FeedingApplicationDao.java");
		return sqlSession.selectList(localName+"callKids");
	}
	
	// 1-2 월별급식 불러오기
	public List<FeedingMonthly> callFeedingMonthly(){
		logger.debug("{} < -- callFeedingMonthly FeedingApplicationDao.java");
		return sqlSession.selectList(localName+"callMonthly");		
	}
	
	// 2. 업데이트 정보요청
	public FeedingApplication modifyGetFeedingApplication(String feedingApplicationCd) {
		logger.debug("{} <- modifyGetFeedingApplication FeedingApplicationDao.java",feedingApplicationCd);
		return sqlSession.selectOne(localName+"selectFeapONE",feedingApplicationCd);
	}
	
	// 3. 업데이트
	public int modifyFeap(FeedingApplication feedingApplication) {
		logger.debug("{} < -- modifyFeap FeedingApplicationDao.java",feedingApplication);
		return sqlSession.update(localName+"feapModify",feedingApplication);
	}
	
	//4.입력처리
	public int feedingApplicationAdd(FeedingApplication feedingApplication) {
		logger.debug("{} <-- feedingApplicationAdd FeedingApplicationDao.java",feedingApplication);
		return sqlSession.insert(localName+"feapInsert",feedingApplication);	
	}
	
	//5. 삭제처리
	public int feedingApplicationDelete(String feedingApplicationCd) {
		logger.debug("{} < -- feedingApplicationDelete메서드 실행 FeedingApplicationDao.java",feedingApplicationCd);
		return sqlSession.delete(localName+"feapDelete",feedingApplicationCd);		
	}
	//6.급식신청 마감회계_수입급식비 수정
	public int modifyFeapClosingIncome(FeedingApplication feedingApplication) {
		logger.debug("{} <-- modifyFeapClosingIncome메서드실행 FeedingApplicationDao.java",feedingApplication);
		return sqlSession.insert(localName+"updateFeapClosingIncome",feedingApplication);		
	}
	
}
