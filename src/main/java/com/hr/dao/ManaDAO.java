package com.hr.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hr.model.ManaVO;

@Repository
public interface ManaDAO {
	public List<ManaVO> getMana();
	public void deleteMana(ManaVO vo);

}
