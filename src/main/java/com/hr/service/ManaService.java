package com.hr.service;

import java.util.List;

import com.hr.model.ManaVO;

public interface ManaService {
	public List<ManaVO> getMana();
	public void deleteMana(ManaVO vo);
}
