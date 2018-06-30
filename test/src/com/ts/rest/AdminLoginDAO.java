package com.ts.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.ts.rest.AdminLogin;
import com.ts.rest.DAOUtility;
public class AdminLoginDAO {
	DAOUtility util = new DAOUtility();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int status;
	public boolean validate(AdminLogin l){  
		boolean status=false; 
		sql = "select * from admin where id = ? and password = ?";
		try{  
			con = util.getConncetion();
			ps = con.prepareStatement(sql);
		    ps.setInt(1,l.getId());  
		    ps.setString(2,l.getPassword());  
		    rs=ps.executeQuery();  
		    status=rs.next();  
		    
		}
		catch(Exception e){
			System.out.println(e);
		}  
		return status;  
		}  
}
