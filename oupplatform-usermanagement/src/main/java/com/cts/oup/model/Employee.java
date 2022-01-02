package com.cts.oup.model;

public class Employee {

	private Long empId;
	private String empName ;
	private String empDesignation ;
	private String  empGroup ;
	private String emoRole  ;
	public Employee(Long empId, String empName, String empDesignation, String empGroup, String emoRole) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empGroup = empGroup;
		this.emoRole = emoRole;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	public String getEmpGroup() {
		return empGroup;
	}
	public void setEmpGroup(String empGroup) {
		this.empGroup = empGroup;
	}
	public String getEmoRole() {
		return emoRole;
	}
	public void setEmoRole(String emoRole) {
		this.emoRole = emoRole;
	} 
	
	
}
