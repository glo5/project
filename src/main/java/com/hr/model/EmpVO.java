package com.hr.model;

import java.sql.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Component
public class EmpVO {
	private int id;
	private String name;
	private String number;
	private String gender;
	private String blodType;
	private String department;
	private String staff;
	private String officePhone;
	private String phone;
	private String email;
	private String webAddress;
	
	private String job_type;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date startDate;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date lastDate;
	private String longDate;
	
	
	
	public EmpVO() {
		super();
	}
	public EmpVO(int id,String department) {
		super();
		this.id = id;
		this.department = department;
	}
	public EmpVO( String name, String number, String gender, String blodType, String department, String staff,
			String officePhone, String phone, String email, String job_type) {
		super();
		this.name = name;
		this.number = number;
		this.gender = gender;
		this.blodType = blodType;
		this.department = department;
		this.staff = staff;
		this.officePhone = officePhone;
		this.phone = phone;
		this.email = email;
		this.job_type = job_type;
	

	}
	public EmpVO( String name, String number, String gender, String blodType, String department, String staff,
			String officePhone, String phone, String email, String job_type, Date startDate, Date lastDate) {
		super();
		this.name = name;
		this.number = number;
		this.gender = gender;
		this.blodType = blodType;
		this.department = department;
		this.staff = staff;
		this.officePhone = officePhone;
		this.phone = phone;
		this.email = email;
		this.job_type = job_type;
		this.startDate = startDate;
		this.lastDate = lastDate;
	}
	public EmpVO(int id, String name, String number, String gender, String blodType, String department, String staff,
			String officePhone, String phone, String email, String job_type, Date startDate, Date lastDate) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.gender = gender;
		this.blodType = blodType;
		this.department = department;
		this.staff = staff;
		this.officePhone = officePhone;
		this.phone = phone;
		this.email = email;
		this.job_type = job_type;
		this.startDate = startDate;
		this.lastDate = lastDate;
	}
	public EmpVO(int id, String name, String number, String gender, String blodType, String department, String staff,
			String officePhone, String phone, String email, String job_type, Date startDate, Date lastDate,
			String longDate) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.gender = gender;
		this.blodType = blodType;
		this.department = department;
		this.staff = staff;
		this.officePhone = officePhone;
		this.phone = phone;
		this.email = email;
		this.job_type = job_type;
		this.startDate = startDate;
		this.lastDate = lastDate;
		this.longDate = longDate;
	}
	public  int getId() {
		return id;
	}
	public  void setId(int id) {
		this.id = id;
	}
	public  String getName() {
		return name;
	}
	public  void setName(String name) {
		this.name = name;
	}
	public  String getNumber() {
		return number;
	}
	public  void setNumber(String number) {
		this.number = number;
	}
	public  String getGender() {
		return gender;
	}
	public  void setGender(String gender) {
		this.gender = gender;
	}
	public  String getBlodType() {
		return blodType;
	}
	public  void setBlodType(String blodType) {
		this.blodType = blodType;
	}
	public  String getDepartment() {
		return department;
	}
	public  void setDepartment(String department) {
		this.department = department;
	}
	public  String getStaff() {
		return staff;
	}
	public  void setStaff(String staff) {
		this.staff = staff;
	}
	public  String getOfficePhone() {
		return officePhone;
	}
	public  void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}
	public  String getPhone() {
		return phone;
	}
	public  void setPhone(String phone) {
		this.phone = phone;
	}
	public  String getEmail() {
		return email;
	}
	public  void setEmail(String email) {
		this.email = email;
	}
	public  String getJobType() {
		return job_type;
	}
	public  void setJobType(String job_type) {
		this.job_type = job_type;
	}
	public  Date getStartDate() {
		return startDate;
	}
	public  void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public  Date getLastDate() {
		return lastDate;
	}
	public  void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}
	public  String getLongDate() {
		return longDate;
	}
	public  void setLongDate(String longDate) {
		this.longDate = longDate;
	}
	
	public String getWebAddress() {
		return webAddress;
	}
	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}
	public String getJob_type() {
		return job_type;
	}
	public void setJob_type(String job_type) {
		this.job_type = job_type;
	}
	@Override
	public String toString() {
		return "EmpVO [id=" + id + ", name=" + name + ", number=" + number + ", gender=" + gender + ", blodType="
				+ blodType + ", department=" + department + ", staff=" + staff + ", officePhone=" + officePhone
				+ ", phone=" + phone + ", email=" + email + ", job_type=" + job_type + ", startDate=" + startDate
				+ ", lastDate=" + lastDate + ", longDate=" + longDate + "]";
	}
	
	
}
