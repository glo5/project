package com.hr.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.dao.EmpDAO;
import com.hr.model.EmpVO;
import com.hr.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDAO dao;

	@Override
	public EmpVO getEmp(EmpVO vo) {
		return dao.getEmp(vo);
	}

	@Override
	public void insertEmp(EmpVO vo) {
		dao.insertEmp(vo);
	}

	@Override
	public void updateEmp(EmpVO vo) {
		dao.updateEmp(vo);
	}

	@Override
	public void deleteEmp(EmpVO vo) {
		dao.deleteEmp(vo);

	}

	@Override
	public int getEmpId() {
		return dao.getEmpId();
	}

}
