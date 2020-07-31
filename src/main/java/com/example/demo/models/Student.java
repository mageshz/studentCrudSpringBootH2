package com.example.demo.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Student {

	@Id
	private  Integer id;
	private String name;
	private String department;
	private String updatedBy;
	
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date updateOn;
	
	public Student() {
		
	}

	public Student(Integer id, String name, String department, String updatedBy, Date updateOn) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.updatedBy = updatedBy;
		this.updateOn = updateOn;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdateOn() {
		return updateOn;
	}

	public void setUpdateOn(Date updateOn) {
		this.updateOn = updateOn;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + ", updatedBy=" + updatedBy
				+ ", updateOn=" + updateOn + "]";
	}
	
}
