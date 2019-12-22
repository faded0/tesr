package com.atguigu.bean;

public class User {
	private String name;
	private String address;

	public User(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + "]";
	}

}
