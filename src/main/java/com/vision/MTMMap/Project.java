package com.vision.MTMMap;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private int pid;
	private String pname;
	
	@ManyToMany(mappedBy="projects")
	private List<Employeee> employees;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int pid, String pname, List<Employeee> employees) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.employees = employees;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Employeee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employeee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", employees=" + employees + "]";
	}

	
}
