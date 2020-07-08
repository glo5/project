package com.hr.serviceimpl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hr.dao.OptionDAO;
import com.hr.model.EmpVO;
import com.hr.service.OptionService;
@Repository
public class OptionServiceImpl implements OptionService{

	@Autowired
	OptionDAO dao;
	
	@Override
	public List<EmpVO> getBlodType() {
		
		return dao.getBlodType();
	}
	@Override
	public List<EmpVO> getEmail() {
		// TODO Auto-generated method stub
		return dao.getEmail();
	}
}
