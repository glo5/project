package com.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.hr.model.ManaVO;
import com.hr.service.ManaService;

@Controller	
@RequestMapping("/mana/")
public class ManaController {
	
	@Autowired
	ManaService service;
	
	@RequestMapping(value ="",method=RequestMethod.GET)
	public String showmanaData() {
		return "mana/manaData";
	}
	
	@RequestMapping(value ="manaList",method=RequestMethod.GET)
	public String showmanaList() {
		return "mana/manaList";
	}
	
	
	
	@RequestMapping(value = "select",method=RequestMethod.GET)
	@ResponseBody
	public List<ManaVO> getMana() {
			
		List<ManaVO> list = service.getMana();
		
		return service.getMana();
	}
	
	@RequestMapping(value = "delete")
	@ResponseBody
	public String deleteMana(ManaVO vo) {
	
		service.deleteMana(vo);
		return "";
	}
	

}
