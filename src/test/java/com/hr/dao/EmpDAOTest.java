package com.hr.dao;

import static org.junit.Assert.*;

import java.sql.Date;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hr.model.EmpVO;
import com.mysql.cj.api.Session;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class EmpDAOTest {
	
	@Autowired
	EmpDAO dao;

	
	@Test 
	public void getEmpA() throws SQLException {
		EmpVO v = new EmpVO();
		v.setId(3);
		EmpVO vo = dao.getEmp(v);
		System.out.println(vo);
	}
	@Test @Ignore
	public void getEmpB() throws SQLException {
		EmpVO v = new EmpVO(2,"q");
		EmpVO vo = dao.getEmp(v);
		System.out.println(vo);
	}

	
	@Test @Ignore
	public void insertEmp() {
		EmpVO vo = new EmpVO("이민형","020202-1234567","남","B","q","q","q","q","Q","q");
		
		dao.insertEmp(vo);
	}
	
	@Test @Ignore
	public void updateEmp() {
		EmpVO vo = new EmpVO(1,"이민형","020202-4567899","여","B","q","q","q","q","Q","q", null, null);
		dao.updateEmp(vo);
	}
	
	@Test @Ignore
	public void deleteEmp() {	
//		dao.deleteEmp(1);
	}
	
	
	
}
