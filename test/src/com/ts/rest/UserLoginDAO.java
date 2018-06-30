package com.ts.rest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.ts.rest.UserLogin;
import com.ts.rest.DAOUtility;
public class UserLoginDAO {
	DAOUtility util = new DAOUtility();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int status;
	public boolean validate(UserLogin u){  
		boolean status=false; 
		sql = "select * from user where uname = ? and password = ?";
		try{  
			con = util.getConncetion();
			ps = con.prepareStatement(sql);
		    ps.setString(1,u.getUname());  
		    ps.setString(2,u.getPassword());  
		    rs=ps.executeQuery();  
		    status=rs.next();  		    
		}
		catch(Exception e){
			System.out.println(e);
		}  
		return status;  
		}  
}