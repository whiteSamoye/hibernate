package cn.samoye.bean;

import java.util.HashSet;
import java.util.Set;

public class Dept {
	private String deptId;
	private String deptName;
	private Set<Emp> emps = new HashSet<Emp>();
	
	
	public Dept() {
		super();
	}
	public Dept(String deptId, String deptName, Set<Emp> emps) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.emps = emps;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Set<Emp> getEmps() {
		return emps;
	}
	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}
	
	
}
