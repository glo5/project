package com.hr.daoimpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hr.dao.ManaDAO;
import com.hr.model.ManaVO;

@Repository
public class ManaDAOimpl implements ManaDAO {

	@Autowired
	SqlSession session;
	
	private final String nameSpace = "com.hr.mappers.ManagerMapper";
	@Override
	public void deleteMana(ManaVO vo) {

		session.delete(nameSpace+".deleteMana",vo);
	}

	@Override
	public List<ManaVO> getManaList(ManaVO vo) {

		return session.selectList(nameSpace+".getManaList",vo);

	}

	@Override
	public List<ManaVO> getGroupList(ManaVO vo) {
		
		return session.selectList(nameSpace+".getGroupList",vo) ;
	}



	

}
