package com.cafe24.hanboa.classformation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ClassController {
	//반 관련 컨트롤러
	
	//반 리스트 출력
	@Autowired
	private ClassService classService;
	
		@RequestMapping(value="/classSetting")
		public String classSettingList(Model model) {
			
			List<KidsClass> list = classService.selectKidsClassList();
			
			model.addAttribute("list", list);
			
			return "class/class_setting";
		}

}
