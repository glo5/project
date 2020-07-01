package com.hr.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.model.WorkDTO;
import com.hr.model.WorkVO;
import com.hr.service.WorkService;

@Controller
@RequestMapping("/work/")
public class WorkController {

	@Autowired
	WorkService service;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String workList(WorkVO vo,Model model) {
		
		
		return "work/workList";

	}
	
	@RequestMapping(value="select",method=RequestMethod.GET)
	@ResponseBody
	public List<WorkVO>selectList(WorkDTO dto,Model model){
	
		
	
		return service.workList(dto);
	}
	
	@RequestMapping(value = "input", method = RequestMethod.GET)
	public String workInput() {

		return "work/workInput";
	}

	@RequestMapping(value = "insert", method = RequestMethod.GET)
	@ResponseBody
	public String workInsert(WorkVO vo) {
		System.out.println(vo.getStartTime());
		String start[] = vo.getStartTime().split(":");
		int startHour = Integer.parseInt(start[0]);
		int startMinute = Integer.parseInt(start[1]);

		String end[] = vo.getEndTime().split(":");
		int endHour = Integer.parseInt(end[0]);
		int endMinute = Integer.parseInt(end[1]);

		String msg = "";
		if (startHour >= 9 && startMinute > 0) {
			msg = "지각";
		} else {
			msg = "정상출근";
		}

		if (endHour < 18) {
			msg += ",조퇴";
		}

		vo.setWorkCode(msg);

		service.workInsert(vo);

		return "";
	}

}
