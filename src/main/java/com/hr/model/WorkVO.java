package com.hr.model;

import java.sql.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;


@Component
public class WorkVO {
	private int id;
	private String name;
	private String department;
	private String staff;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date date;
	private String day;
	private String startTime;
	private String endTime;
	private String workCode;
	private String addTime;
	
	
	
	public WorkVO() {
		super();
	}
	public WorkVO(int id, String name, String department, String staff, String startTime, String endTime, String workCode,
			String addTime) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.staff = staff;
		this.startTime = startTime;
		this.endTime = endTime;
		this.workCode = workCode;
		this.addTime = addTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getStaff() {
		return staff;
	}
	public void setStaff(String staff) {
		this.staff = staff;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getWorkCode() {
		return workCode;
	}
	public void setWorkCode(String workCode) {
		this.workCode = workCode;
	}
	public String getAddTime() {
		return addTime;
	}
	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
