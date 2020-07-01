package com.hr.model;

import java.sql.Date;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

@Component
public class ManaVO {
	private int id;
	private String name;

	private String staff;
	
	private String groupName;
	private String groupId;
	private String groupSq;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date startDate;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date endDate;
	
	private String groupType;
	private String groupCount;
	
	public ManaVO() {
		super();
	}
	public ManaVO(int id, String groupname, String groupid, String groupsq, Date startDate, Date endDate, String grouptype,
			String groupcount) {
		super();
		this.id = id;
		this.groupName = groupName;
		this.groupId = groupId;
		this.groupSq = groupSq;
		this.startDate = startDate;
		this.endDate = endDate;
		this.groupType = groupType;
		this.groupCount = groupCount;
	}
	public String getStaff() {
		return staff;
	}
	public void setStaff(String staff) {
		this.staff = staff;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupSq() {
		return groupSq;
	}
	public void setGroupSq(String groupSq) {
		this.groupSq = groupSq;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getGroupType() {
		return groupType;
	}
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}
	public String getGroupCount() {
		return groupCount;
	}
	public void setGroupCount(String groupCount) {
		this.groupCount = groupCount;
	}
}
	
	