package com.cafe24.hanboa.client;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	//1.목록조회 +검색+페이징
	public Map<String, Object> getClientList(int currentPage, int pagePerRow, String searchOption, String keyword){
		logger.debug("{} <-- getClientList메서드 실행(currentPage) ClientService.java",currentPage);
		logger.debug("{} <-- getClientList메서드 실행(pagePerRow) ClientService.java",pagePerRow);
		logger.debug("{} <-- getClientList메서드 실행(searchOption) ClientService.java",searchOption);
		logger.debug("{} <-- getClientList메서드 실행(keyword) ClientService.java",keyword);
		int startPage = 0;
		if(currentPage > 1) {
			startPage = (currentPage-1)*pagePerRow;
		}
		// Dao에서 시작 페이지와 행의 수 보내기
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("searchOption", searchOption);
		map.put("keyword", keyword);
		map.put("startPage", startPage);
		map.put("pagePerRow", pagePerRow);
		List<Client> list = clientDao.selectClientList(map);
		logger.debug("{} <- getClientList ClientService.java", list);
		// 총 행의 수를 보여줄 행의 수로 나눈 뒤 나머지가 0일 경우는 넘어가고 아닐 경우 +1 한다.
		int count = clientDao.selectClientCountByPage(map);
		logger.debug("{} : < - conut ClientService.java",count);
		int countPage = count/pagePerRow;
		if(count%pagePerRow !=0) {
				countPage++;			
		}
		logger.debug("{} : < - countPage ClientService.java", countPage);
		// list 페이지 수 리턴
		Map<String,Object> returnMap = new HashMap<String,Object>();
		returnMap.put("searchOption", searchOption);
		returnMap.put("keyword", keyword);
		returnMap.put("list", list);
		returnMap.put("countPage", countPage);
		return returnMap;
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