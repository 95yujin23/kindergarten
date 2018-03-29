package com.cafe24.hanboa.totalResource;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TotalResourceController {
	@Autowired
	private TotalResourceService totalResourceService;
	private static final Logger logger = LoggerFactory.getLogger(TotalResourceController.class);
	
	// 1. 통합자원코드 목록 조회
		@RequestMapping(value="/TotalResourceList")
		public String totalResourceList(Model model, HttpSession session) {
			logger.debug("1. TotalResourceController -- TotalResourceList");
			List<TotalResource> list = totalResourceService.getTotalResourceList();
			logger.debug("List<TotalResource> : {}",list);
			logger.debug("-----------------------------------------");
			model.addAttribute("list", list);
			return "total_resource/total_resource_list";
		}
	// 2-1. 통합자원코드 등록 화면
		@RequestMapping(value="/TotalResourceAdd", method=RequestMethod.GET)
		public String totalResourceAdd() {
			logger.debug("2-1. TotalResourceController -- TotalResourceAddForm");
			logger.debug("-----------------------------------------");
			return "total_resource/total_resource_add";
		}
	// 2-2. 통합자원코드 등록
	@RequestMapping(value="/TotalResourceAdd", method=RequestMethod.POST)
	public String totalResourceAdd(Model model, TotalResource totalResource) {
		logger.debug("2-2. TotalResourceController -- TotalResourceAdd");
		logger.debug("TotalResource : {}",totalResource);
		totalResourceService.addTotalResource(totalResource);
		logger.debug("-----------------------------------------");
		return "redirect:/";
	}
	// 3-1. 통합자원코드 수정 화면
	@RequestMapping(value="/TotalResourceModify", method=RequestMethod.GET)
	public String totalResourceModify() {
		logger.debug("3-1. TotalResourceController -- TotalResourceModify");
		logger.debug("-----------------------------------------");
		return "total_resource/total_resource_modify";
	}
	// 3-2. 통합자원코드 수정
	@RequestMapping(value="/TotalResourceModify", method=RequestMethod.POST)
	public String totalResourceModify(Model model, TotalResource totalResource) {
		logger.debug("3-2. TotalResourceController -- TotalResourceModify");
		logger.debug("TotalResource : {}",totalResource);
		totalResourceService.modifyTotalResource(totalResource);
		logger.debug("-----------------------------------------");
		return "redirect:/";
	}
	// 4. 통합자원코드 삭제
	@RequestMapping(value="/TotalResourceRemove")
	public String totalResourceRemove(Model model, HttpSession session, String totalResourceCd) {
		logger.debug("4. TotalResourceController -- TotalResourceRemove");
		logger.debug("String totalResourceCd : {}",totalResourceCd);
		totalResourceService.removeTotalResource(totalResourceCd);
		logger.debug("-----------------------------------------");
		return "redirect:/";
	}
}
