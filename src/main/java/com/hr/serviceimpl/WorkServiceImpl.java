package com.hr.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hr.dao.WorkDAO;
import com.hr.model.WorkDTO;
import com.hr.model.WorkVO;
import com.hr.service.WorkService;

@Service
public class WorkServiceImpl implements WorkService{

	
	@Autowired
	WorkDAO dao;
	
	@Override
	public List<WorkVO> workList(WorkDTO dto) {
		
		return dao.workList(dto);
	}

	@Override
	public void workInsert(WorkVO vo) {
		dao.workInsert(vo);
		
	}
	
	
}
