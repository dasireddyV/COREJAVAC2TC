package com.svkp.collections;

public class EmployData{
	String ename;
	int eid;
	int age;
	public EmployData(String ename, int eid, int age) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.age = age;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
