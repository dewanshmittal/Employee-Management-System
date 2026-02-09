package com.moana.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employees {
	private String ename;
	@Id
	private String eid;
	private String empemail;
	private String password;
	private String task;
	private String position;
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "Employees [ename=" + ename + ", eid=" + eid + ", empemail=" + empemail + ", password=" + password
				+ ", task=" + task + ", position=" + position + "]";
	}
	public Employees(String ename, String eid, String empemail, String password, String task, String position) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.empemail = empemail;
		this.password = password;
		this.task = task;
		this.position = position;
	}
	public Employees() {
		super();
	}
	
	

}
