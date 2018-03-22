package com.cafe24.hanboa.client;

import java.util.List;

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
	public List<Client> selectClientList() {
		logger.debug("{} <- selectClientList ClientDao.java");		
		return sqlSession.selectList(localName+"getClientList");
	}	
	// 2.업데이트 정보요청
	public Client modifyGetClient(String clientCd) {
		logger.debug("{} <- modifyGetClient ClientDao.java");
		return sqlSession.selectOne(localName+"clientModify", clientCd);		
	}	
	// 3.업데이트
	public int updateClient(Client client) {
		logger.debug("{} <- updateClient ClientDao.java");
		return sqlSession.update(localName+"updateClient", client);
	}
	// 4.삭제
	public int deleteClient(String clientCd) {
		return sqlSession.delete(localName+"deleteClient", clientCd);
	}
	// 5.등록
	public int insertClient(Client client) {
		return sqlSession.insert(localName+"clientAdd", client);		
	}
	
	

}
