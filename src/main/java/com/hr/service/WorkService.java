package com.hr.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hr.model.WorkDTO;
import com.hr.model.WorkVO;


public interface WorkService {
	

	public List<WorkVO> workList(WorkDTO dto);
	
	public void workInsert(WorkVO vo);
}
