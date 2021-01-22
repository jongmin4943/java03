package org.comstudy21.ch06HW;

import java.util.*;
public class UserInfo {
	String id;
	String password;
	String name;
	int age;
	String emailAddress;
	
	public UserInfo() {}
	
	
	public UserInfo(String id, String password, String name, int age,
			String emailAddress) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.emailAddress = emailAddress;
	}


	@Override
	public String toString() {
		return String.format("ID : %s\nPassword : %s\nName : %s\nAge : %d\nE-mail Address : %s",id,password,name,age,emailAddress);
	}
	
}
