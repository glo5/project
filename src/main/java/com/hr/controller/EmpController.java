package com.hr.controller;




import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.model.EmpVO;
import com.hr.service.EmpService;
import com.hr.service.OptionService;

@Controller
@RequestMapping("/emp/")
public class EmpController {
	
	@Autowired
	EmpService eService;
	
	@Autowired
	OptionService oService;
	
	@RequestMapping(value ="basicData",method=RequestMethod.GET)
	public String showBasicData(Model model) {
		
		int id = eService.getMaxId();
		model.addAttribute("id",id);
		model.addAttribute("blodType",oService.getBlodType());
		model.addAttribute("webAddress",oService.getEmail());
		
		
		
		return "emp/basicdata";
	}
	@RequestMapping(value = "basicData/select",method=RequestMethod.GET)
	@ResponseBody
	public EmpVO getEmp(EmpVO vo) {
		EmpVO a = eService.getEmp(vo); 
		int now = a.getEmail().indexOf("@");
		a.setWebAddress(a.getEmail().substring(now));

		a.setEmail(a.getEmail().substring(0,now));
;		return a;
	}
	
	@RequestMapping(value = "basicData/insert")
	@ResponseBody
	public String insertEmp(EmpVO vo, Model model) {
		vo.setEmail(vo.getEmail()+vo.getWebAddress());
		eService.insertEmp(vo);
		int id = eService.getMaxId();	
		return id+"";
	}
	@RequestMapping(value = "basicData/update")
	@ResponseBody
	public String updateEmp(EmpVO vo) {
		if(eService.getEmp(vo) == null) {
			eService.insertEmp(vo);
			return "insert";
		}
		vo.setEmail(vo.getEmail()+vo.getWebAddress());
		eService.updateEmp(vo);
		return "";
	}
	@RequestMapping(value = "basicData/delete")
	@ResponseBody
	public String deleteEmp(EmpVO vo) {
		EmpVO a = eService.getEmp(vo);
		System.out.println(a);
		if(a == null) {
			return "null";
		}
		eService.deleteEmp(vo);
		return "";
	}
}
