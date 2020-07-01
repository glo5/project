package com.hr.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hr.model.ManaVO;

@Repository
public interface ManaDAO {
	public List<ManaVO> getManaList(ManaVO vo);
	public void deleteMana(ManaVO vo);
	public List<ManaVO> getGroupList(ManaVO vo);
	
	
}
