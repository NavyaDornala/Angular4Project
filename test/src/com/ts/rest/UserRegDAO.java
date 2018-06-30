package com.ts.rest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ts.rest.DAOUtility;
import com.ts.rest.UserReg;
public class UserRegDAO {
	DAOUtility util = new DAOUtility();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int status;
	public UserReg userentry(UserReg u) {
		sql = "insert into user values(?, ?, ?, ?, ?)";
		try {
			con = util.getConncetion();
		    if(con.isClosed())
				System.out.println("Connection closed");
			ps = con.prepareStatement(sql);
			ps.setString(1, u.getName());
			ps.setString(2, u.getUname());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getMobile());
			ps.setString(5, u.getPassword());
			status = ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		if(status>0) {
			System.out.println("Success");
		}	
		else
			System.out.println("not inserted");
		return u;
	}
}
