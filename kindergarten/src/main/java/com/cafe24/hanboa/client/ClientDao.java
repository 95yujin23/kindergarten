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
		logger.debug("1-1. ClientDao -- List<Client> selectClient() 메서드 실행");		
		return sqlSession.selectList(localName+"getClientList");
	}	
	// 2.업데이트 정보요청
	public Client updateClient(String clientCd) {
		return sqlSession.selectOne(localName+"getClient", clientCd);		
	}	
	// 3.업데이트
	public int updateClient(Client client) {
		return sqlSession.update(localName+"updateClient", client);
	}
	// 4.삭제
	public int deleteClient(int clientCd) {
		return sqlSession.delete(localName+"deleteClient", clientCd);
	}
	// 5.등록
	public int insertClient(Client client) {
		return sqlSession.insert(localName+"insertClient", client);		
	}
	
	

}
