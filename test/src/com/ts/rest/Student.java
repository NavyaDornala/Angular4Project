package com.ts.rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
    private int id;
    private String name;
    private String email;
    private String password;
    private int mobile;
    public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public Student(int id, String name, String email, String password,int mobile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Student() {
	   super();
    }
    public int getId() {
	   return id;
    }
    @XmlElement
    public void setId(int id) {
	   this.id = id;
    }
    public String getName() {
	   return name;
    }
    @XmlElement
     public void setName(String name) {
	    this.name = name;
     }
     @Override
     public String toString() {
      	return "Student [id=" + id + ", name=" + name + "]";
    }
}
