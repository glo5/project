package com.hr.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.hr.model.EmpVO;
import com.hr.model.WorkDTO;
import com.hr.model.WorkVO;
import com.hr.service.EmpService;
import com.hr.service.WorkService;
import com.hr.util.FileUtil;

@Controller
@RequestMapping("/work/")
public class WorkController {

	@Autowired
	WorkService serviceW;
	
	@Autowired
	EmpService serviceE;
	
	@Autowired
	EmpVO e;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String workList(WorkVO vo, Model model) {

		return "work/workList";

	}

	@RequestMapping(value = "select", method = RequestMethod.GET)
	@ResponseBody
	public List<WorkVO> selectList(WorkDTO dto, Model model) {

		return serviceW.workList(dto);
	}

	@RequestMapping(value = "input", method = RequestMethod.GET)
	public String workInput(WorkDTO dto) {
		
		
		return "work/workInput";
	}

	@RequestMapping(value = "upload", method = RequestMethod.POST)
	@ResponseBody
	public List<WorkVO> fileUpload(@RequestParam("file") MultipartFile file,HttpServletRequest req,HttpServletResponse resp) {
		
		List<WorkVO> a = new ArrayList<WorkVO>();
		WorkVO vo;
		
		try {
			String originalName = file.getOriginalFilename();
			String ext = originalName.substring(originalName.lastIndexOf(".") + 1);
			if(!ext.equalsIgnoreCase("txt")) {
				return null;
			}
			InputStreamReader isr = new InputStreamReader(file.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			String line;
		
			while((line = br.readLine()) != null) {
				String arr[] = line.split(" ");
				System.out.println(line);
				vo  = new WorkVO();
				vo.setId(Integer.parseInt(arr[0]));
				vo.setName(arr[1]);
				vo.setDepartment(arr[2]);
				vo.setStaff(arr[3]);
				vo.setDate(Date.valueOf(arr[4]));
				vo.setDay(arr[5]);
				vo.setStartTime(arr[6]);
				vo.setEndTime(arr[7]);
				vo.setAddTime(arr[8]);
				vo.setWorkCode(arr[9]);
				a.add(vo);
			}
			
	
		} catch (Exception e) {
			e.printStackTrace();
			resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		
		return a;
	}

	@RequestMapping(value = "download", method = RequestMethod.GET,produces = "text/plain")
	@ResponseBody
	public String fileDownload(WorkDTO dto,HttpServletRequest req, HttpServletResponse resp) {
		
		String filePath = req.getSession().getServletContext().getRealPath("resources\\download");
		try {
			FileUtil.downloadFile(serviceW.workList(dto), filePath,resp);

		} catch (Exception e) {
			e.printStackTrace();
			resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}

			
		

		
		

		return "";
	}

	@RequestMapping(value = "insert", method = RequestMethod.GET)
	@ResponseBody
	public String workInsert(WorkVO vo) {
		
		e.setId(vo.getId());
		e.setName(vo.getName());
		if(serviceE.getEmpId(e) == null) {
			return "null";
		}
		
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

		serviceW.workInsert(vo);

		return "";
	}

}
