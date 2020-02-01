package com.lc.loggingdemo;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ContainerBean {
	private String name;
	private String lastName;
	private String gender;
	
	
	public ContainerBean(String name, String lastName, String gender) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	 public String toString() {
		   return ToStringBuilder.reflectionToString(this);
		 }

}
