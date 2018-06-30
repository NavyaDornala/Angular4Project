package com.ts.rest;

public class AdminLogin {
	private int id;
    private String Password;
    public AdminLogin(int id, String password) {
		super();
		this.id = id;
		Password = password;
	}
	public AdminLogin() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
}
