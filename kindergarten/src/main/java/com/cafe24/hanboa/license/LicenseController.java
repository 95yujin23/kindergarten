package com.cafe24.hanboa.license;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LicenseController {
	
	@Autowired
	private LicenseService licenseService;
	
	private static final Logger logger = LoggerFactory.getLogger(LicenseController.class);

	// 1. 모든 유치원 라이센스 목록 조회 (유치원명으로 검색) -관리자
	@RequestMapping(value="/LicenseList", method = RequestMethod.GET)
	public String licenseList(Model model) {
	logger.debug("1. LicenseController -- LicenseList");
	List<License> list = licenseService.getLicenseList();
	logger.debug("List<License> : {}",list);
	model.addAttribute("list", list);
	logger.debug("----------------------------------------");
		return "license/license_list";
	}
	
	// 2. 유치원 개별 조회 (유치원 마다)
	// 3-1. 유치원 라이센스 등록 화면
	@RequestMapping(value="/LicenseAdd", method = RequestMethod.GET)
	public String licenseAdd() {
	logger.debug("3-1. LicenseController -- LicenseAddForm");
	logger.debug("----------------------------------------");
		return "license/license_add";
	}
	// 3-2. 유치원 라이센스 등록
	@RequestMapping(value="/LicenseAdd", method = RequestMethod.POST)
	public String licenseAdd(Model model) {
	logger.debug("3-2. LicenseController -- LicenseAdd");
	
	logger.debug("----------------------------------------");
		return "redirect:/";
	}
	// 3-3. 유치원 라이센스 등록 시 주소 요청
	/*@RequestMapping(value="/sample/getAddrApi.do", method = RequestMethod.POST)
    public void getAddrApi(HttpServletRequest req, ModelMap model, HttpServletResponse response) throws Exception {
		// 요청변수 설정
    String currentPage = req.getParameter("currentPage");    //요청 변수 설정 (현재 페이지. currentPage : n > 0)
		String countPerPage = req.getParameter("countPerPage");  //요청 변수 설정 (페이지당 출력 개수. countPerPage 범위 : 0 < n <= 100)
		String resultType = req.getParameter("resultType");      //요청 변수 설정 (검색결과형식 설정, json)
		String confmKey = req.getParameter("confmKey");          //요청 변수 설정 (승인키)
		String keyword = req.getParameter("keyword");            //요청 변수 설정 (키워드)
		// OPEN API 호출 URL 정보 설정
		String apiUrl = "http://www.juso.go.kr/addrlink/addrLinkApi.do?currentPage="+currentPage+"&countPerPage="+countPerPage+"&keyword="+URLEncoder.encode(keyword,"UTF-8")+"&confmKey="+confmKey+"&resultType="+resultType;
		URL url = new URL(apiUrl);
    	BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(),"UTF-8"));
    	StringBuffer sb = new StringBuffer();
    	String tempStr = null;

    	while(true){
    		tempStr = br.readLine();
    		if(tempStr == null) break;
    		sb.append(tempStr);								// 응답결과 JSON 저장
    	}
    	br.close();
    	response.setCharacterEncoding("UTF-8");
		response.setContentType("text/xml");
		response.getWriter().write(sb.toString());			// 응답결과 반환
    }
	// 3-4. 주소 팝업창으로 이동
	@RequestMapping(value="/license/jusoPopup.jsp", method = RequestMethod.GET)
	public String goPopup() {
	logger.debug("3-4. LicenseController -- GoPopup");
	logger.debug("----------------------------------------");
		return "license/jusoPopup";
	}*/

	// 4-1. 유치원 라이센스 수정 화면
	// 4-2. 유치원 라이센스 수정
	// 5. 유치원 라이센스 삭제
}
