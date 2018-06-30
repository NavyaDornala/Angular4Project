package com.ts.rest;

public class UserReg {
    private String name;
    private String uname;
    private String email;
    private String mobile;
    private String password;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserReg(String name, String uname, String email,String mobile,String password) {
		super();
		this.name = name;
		this.uname = uname;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}
	public UserReg() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
