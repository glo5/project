package com.hr.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.dao.ManaDAO;
import com.hr.model.ManaVO;
import com.hr.service.ManaService;

@Service
public class ManaServiceImpl implements ManaService {
	
	@Autowired
	ManaDAO dao;

	@Override
	public void deleteMana(ManaVO vo) {
		dao.deleteMana(vo);
		
	}

	@Override
	public List<ManaVO> getMana() {
		
		return dao.getMana();
	}

	

	
}
