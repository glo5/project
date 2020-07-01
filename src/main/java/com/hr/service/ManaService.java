package com.hr.service;

import java.util.List;

import com.hr.model.ManaVO;

public interface ManaService {
	public List<ManaVO> getManaList(ManaVO vo);
	public void deleteMana(ManaVO vo);

	public List<ManaVO> getGroupList(ManaVO vo);
}
