package com.hr.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.hr.model.WorkDTO;
import com.hr.model.WorkVO;

public interface WorkDAO {
	
	public WorkVO getWorkId(WorkVO vo);
	public List<WorkVO> workList(WorkDTO dto);
	
	public void workInsert(WorkVO vo);
}
