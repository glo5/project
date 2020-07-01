package com.hr.dao;

import com.hr.model.EmpVO;

public interface EmpDAO {
	public EmpVO getEmp(EmpVO  vo);
	public void insertEmp(EmpVO vo);
	public void updateEmp(EmpVO vo);
	public void deleteEmp(EmpVO vo);
	public int getEmpId();
	
	
}	
