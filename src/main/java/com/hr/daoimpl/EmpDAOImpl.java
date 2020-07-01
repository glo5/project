package com.hr.daoimpl;



import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.hr.dao.EmpDAO;

import com.hr.model.EmpVO;

@Repository
public class EmpDAOImpl implements EmpDAO {

	@Autowired
	SqlSession session;

	private final String nameSpace = "com.hr.mappers.EmpMapper";
	
	@Override
	public EmpVO getEmp(EmpVO vo) {
		return session.selectOne(nameSpace+".getEmp",vo);
	}

	@Override
	public void insertEmp(EmpVO vo) {
		
		session.insert(nameSpace+".insertEmp",vo);
	}

	@Override
	public void updateEmp(EmpVO vo ) {
		session.update(nameSpace+".updateEmp",vo);
	}

	@Override
	public void deleteEmp(EmpVO vo) {
		session.delete(nameSpace+".deleteEmp",vo);

	}

	@Override
	public int getEmpId() {
		if(session.selectOne(nameSpace+".getEmpId") == null) {
			return 1;
		}
		return session.selectOne(nameSpace+".getEmpId");
	}

}
