package org.springframework.samples.springaop.vo;

import java.io.Serializable;


public class User implements Serializable{

	private static final long serialVersionUID = 1L;

	private int userId;
	private String name;

	public User() {
	}
	
	public User(int userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + "]";
	}

}
