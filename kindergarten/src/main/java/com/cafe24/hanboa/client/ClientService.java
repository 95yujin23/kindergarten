package com.cafe24.hanboa.client;

import java.text.SimpleDateFormat;
import java.util.Date;
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
		Client client = clientDao.modifyGetClient(clientCd);
		logger.debug("{} <- updateClient ClientDao.java",clientCd);
		logger.debug("{} <- updateClient ClientDao.java",client);
		return client;
	}
	
	//3.업데이트
	public int updateClient(Client client) {
		int modifyClient = clientDao.updateClient(client);
		logger.debug("{} <- updateClient ClientService.java", client);
		logger.debug("{} <- updateClient ClientService.java", modifyClient);
		return modifyClient;
	}
	//4. 삭제
	public int deleteClient(String clientCd) {
		int delete = clientDao.deleteClient(clientCd);
		logger.debug("{} <- deleteClient ClientService.java", clientCd);
		logger.debug("{} <- deleteClient ClientService.java", delete);
		return delete;		
	}
	//5.등록
	public void cleintAdd(Client client) {
		String inDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
		client.setClientRegistrationDate(inDate);
		clientDao.insertClient(client);
		logger.debug("{} < -- cleintAdd clientDao.java",client);
	}
	
	
}