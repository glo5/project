package com.hr.controller;




import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.model.EmpVO;
import com.hr.service.EmpService;

@Controller
@RequestMapping("/emp/")
public class EmpController {
	
	@Autowired
	EmpService service;
	
	@RequestMapping(value ="basicData",method=RequestMethod.GET)
	public String showBasicData(Model model) {

		
		int id = service.getMaxId();
		model.addAttribute("id",id);
		
		return "emp/basicdata";
	}
	@RequestMapping(value = "basicData/select",method=RequestMethod.GET)
	@ResponseBody
	public EmpVO getEmp(EmpVO vo) {
		
		
		return service.getEmp(vo);
	}
	
	@RequestMapping(value = "basicData/insert")
	@ResponseBody
	public String insertEmp(EmpVO vo, Model model) {
		service.insertEmp(vo);
		int id = service.getMaxId();	
		return id+"";
	}
	@RequestMapping(value = "basicData/update")
	@ResponseBody
	public String updateEmp(EmpVO vo) {
		if(service.getEmp(vo) == null) {
			service.insertEmp(vo);
			return "insert";
		}
		service.updateEmp(vo);
		return "";
	}
	@RequestMapping(value = "basicData/delete")
	@ResponseBody
	public String deleteEmp(EmpVO vo) {
		EmpVO a = service.getEmp(vo);
		System.out.println(a);
		if(a == null) {
			return "null";
		}
		service.deleteEmp(vo);
		return "";
	}
}
