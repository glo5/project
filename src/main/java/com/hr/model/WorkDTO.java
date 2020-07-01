package com.hr.model;

import java.sql.Date;

public class WorkDTO {
	private Date reqStartDate;
	private Date reqEndDate;
	private String reqDept;
	private String reqStaff;
	
	
	public Date getReqStartDate() {
		return reqStartDate;
	}
	public void setReqStartDate(Date reqStartDate) {
		this.reqStartDate = reqStartDate;
	}
	public Date getReqEndDate() {
		return reqEndDate;
	}
	public void setReqEndDate(Date reqEndDate) {
		this.reqEndDate = reqEndDate;
	}
	public String getReqDept() {
		return reqDept;
	}
	public void setReqDept(String reqDept) {
		this.reqDept = reqDept;
	}
	public String getReqStaff() {
		return reqStaff;
	}
	public void setReqStaff(String reqStaff) {
		this.reqStaff = reqStaff;
	}
	
	
	
	
}
