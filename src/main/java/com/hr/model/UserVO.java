package com.hr.model;

import org.springframework.stereotype.Component;

@Component
public class UserVO {
	private String id;
	private int password;
	
	
	
	
	public UserVO() {
		super();
	}
	public UserVO(String id, int password) {
		super();
		this.id = id;
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
}
