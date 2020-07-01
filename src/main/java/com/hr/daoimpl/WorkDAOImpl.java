package com.hr.daoimpl;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hr.dao.WorkDAO;
import com.hr.model.WorkDTO;
import com.hr.model.WorkVO;

@Repository
public class WorkDAOImpl implements WorkDAO{
	@Autowired
	SqlSession session;
	
	private final String ns = "com.hr.mappers.WorkMapper";
	
	@Override
	public List<WorkVO> workList(WorkDTO dto) {
		
		return session.selectList(ns+".workList",dto);
	}

	@Override
	public void workInsert(WorkVO vo) {
		session.insert(ns+".workInsert",vo);
	}

	@Override
	public WorkVO getWorkId(WorkVO vo) {
		
		return session.selectOne(ns+".getWorkId",vo);
		
	}

}