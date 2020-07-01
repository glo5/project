package com.hr.daoimpl;



import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.hr.dao.EmpDAO;

import com.hr.model.EmpVO;
import com.mysql.cj.api.Session;

@Repository
public class EmpDAOImpl implements EmpDAO {

	@Autowired
	SqlSession session;

	private final String ns = "com.hr.mappers.EmpMapper";
	
	@Override
	public EmpVO getEmp(EmpVO vo) {
		return session.selectOne(ns+".getEmp",vo);
	}

	@Override
	public void insertEmp(EmpVO vo) {
		
		session.insert(ns+".insertEmp",vo);
	}

	@Override
	public void updateEmp(EmpVO vo ) {
		session.update(ns+".updateEmp",vo);
	}

	@Override
	public void deleteEmp(EmpVO vo) {
		session.delete(ns+".deleteEmp",vo);

	}

	@Override
	public int getMaxId() {
		if(session.selectOne(ns+".getMaxId") == null) {
			return 1;
		}
		return session.selectOne(ns+".getMaxId");
	}

	@Override
	public EmpVO getEmpId(EmpVO vo) {
		return session.selectOne(ns+".getEmpId",vo);
	}

}
