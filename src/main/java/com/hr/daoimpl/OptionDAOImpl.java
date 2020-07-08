package com.hr.daoimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hr.dao.OptionDAO;
import com.hr.model.EmpVO;

@Repository
public class OptionDAOImpl implements OptionDAO{

	@Autowired
	SqlSession session;
	
	private final String ns = "com.hr.mappers.OptionMapper";
	@Override
	public List<EmpVO> getBlodType() {
		
		return session.selectList(ns+".getBlodType");
	}
	@Override
	public List<EmpVO> getEmail() {
		// TODO Auto-generated method stub
		return session.selectList(ns+".getEmail");
	}

}
