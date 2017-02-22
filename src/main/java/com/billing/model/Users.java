package com.billing.model;

import java.util.Map;
import java.util.Set;

public class Users
{
	private int id;
	private String username;
	private String password;
	private Set item;
	
	//User Name Getter
	public String getUsername() 
	{
		return username;
	}
	
	//User Name Setter
	public void setUsername(String username) 
	{
		this.username = username;
	}

	//Password Getter
	public String getPassword() 
	{
		return password;
	}

	//Password Setter
	public void setPassword(String password) {
		this.password = password;
	}
	
	//ID Getter
	public int getId() {
		return id;
	}
	//ID Setter
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() 
	{
		return this.username;
	}

	public Set getItem() {
		return item;
	}

	public void setItem(Set item) {
		this.item = item;
	}

	

	



	
}
