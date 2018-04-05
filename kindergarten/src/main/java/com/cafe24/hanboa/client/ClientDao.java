package com.cafe24.hanboa.client;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClientDao {
	@Autowired
	public SqlSessionTemplate sqlSession;
	private static final Logger logger = LoggerFactory.getLogger(ClientDao.class);
	
	String localName = "com.cafe24.hanboa.client.ClientMapper.";
	
	// 1.목록조회
	public List<Client> selectClientList(Map<String, Object> map) {
		logger.debug("{} <-- selectClientList메소드 실행 ClientDao.java");
		logger.debug("{} <-- startPage ClientDao.java", map.get("startPage"));
		logger.debug("{} < -- pagePerRow ClientDao.java", map.get("pagePerRow"));
		logger.debug("{} <-- keyword ClientDao.java", map.get("keywored"));
		logger.debug("{} <-- keywored ClientDao.java", map.get("keyword"));
		return sqlSession.selectList(localName+"getClientList",map);
	}
	//1-1 전체 거래처 페이징
	public int selectClientCountByPage(Map<String, Object> map) {
		logger.debug("{} < -- selectClientCountByPage메서드 실행 ClientDao.java",map.get("keyword"));
		logger.debug("{} < -- word selectClientCountByPage ClientDao.java",map);
		return sqlSession.selectOne(localName+"selectClientCountByPage",map);		
	}
	
	// 2.업데이트 정보요청
	public Client modifyGetClient(String clientCd) {
		logger.debug("{} <- modifyGetClient ClientDao.java",clientCd);
		return sqlSession.selectOne(localName+"getClientOne", clientCd);	
	}	
	// 3.업데이트
	public int updateClient(Client client) {
		logger.debug("{} <- updateClient ClientDao.java");
		return sqlSession.update(localName+"clientModify", client);
	}
	// 4.삭제
	public int deleteClient(String clientCd) {
		return sqlSession.delete(localName+"clientDelete", clientCd);
	}
	// 5.등록
	public int insertClient(Client client) {
		logger.debug("{} < -- insertClient ClientDao.java",client);
		return sqlSession.insert(localName+"clientAdd", client);		
	}

	
	

}
