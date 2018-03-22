package com.cafe24.hanboa.client;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClientService {
	@Autowired
	public ClientDao clientDao;
	
	private static final Logger logger= LoggerFactory.getLogger(ClientService.class);
	
	//1.목록조회
	public List<Client> getClientList(){
		List<Client> list = clientDao.selectClientList();
		logger.debug("{} <- getClientList ClientService.java", list);	
		return list;
	}
	
	//2.업데이트 정보요청
	public Client modifyGetClient(String clientCd) {
		Client modifyGet = clientDao.modifyGetClient(clientCd);
		logger.debug("{} <- modifyGetClient ClientService.java", modifyGet);
		return modifyGet;
	}
	
	//3.업데이트
	public int updateClient(Client client) {
		int update = clientDao.updateClient(client);
		logger.debug("{} <- updateClient ClientService.java", update);
		return update;
	}
	//4. 삭제
	public int deleteClient(String clientCd) {
		int delete = clientDao.deleteClient(clientCd);
		logger.debug("{} <- deleteClient ClientService.java", delete);
		return delete;		
	}
	
	
}