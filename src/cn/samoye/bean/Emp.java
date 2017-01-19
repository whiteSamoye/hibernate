package cn.samoye.bean;

import java.io.Serializable;

public class Emp implements Serializable{
	private String empId;
	private String empName;
	private Dept dept;
	
	public Emp(String empId, String empName, Dept dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
	}
	public Emp() {
		super();
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
}
