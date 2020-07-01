package com.hr.service;

import com.hr.model.EmpVO;

public interface EmpService {
	public EmpVO getEmp(EmpVO vo);
	public void insertEmp(EmpVO vo);
	public void updateEmp(EmpVO vo);
	public void deleteEmp( EmpVO vo);
	public int getMaxId();
	public EmpVO getEmpId(EmpVO vo);
}
