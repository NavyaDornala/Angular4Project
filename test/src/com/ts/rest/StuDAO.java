package com.ts.rest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/StudentDAO")
public class StuDAO extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
	public boolean addUser(Student student) {
		int id = student.getId();
		String name = student.getName();
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/Register", "root","navya490");
			String query = "insert into student values(?, ?)";
			ps = connection.prepareStatement(query);
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.executeUpdate();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
		}
    return false;
    }
	public boolean deleteUser(Student student) {
		int id = student.getId();
		String name = student.getName();
		Connection connection = null;
		Statement statement = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/Register", "root","navya490");
		    String sql = "DELETE FROM student WHERE id = ? ";
		  //  String sql1 = "update student set name = ?  where id = ?";
		    ps = connection.prepareStatement(sql);
		  //  ps.setInt(1,id);
		   // ps.setString(2,name);
		    ps.executeUpdate(sql);
			return true;
		} catch(Exception e) {
			e.printStackTrace();
		}
    return false;
}
	
    public StuDAO() {
        super();
        // TODO Auto-generated constructor stub
    }
}


