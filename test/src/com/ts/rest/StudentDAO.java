package com.ts.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ts.rest.Student;
import com.ts.rest.DAOUtility;
public class StudentDAO {
	
	DAOUtility util = new DAOUtility();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int status;
	
	public Student save(Student s) {
		sql = "insert into student values(?, ?, ?, ?, ?)";
		try {
			con = util.getConncetion();
			ps = con.prepareStatement(sql);
			ps.setInt(1, s.getId());
			ps.setString(2, s.getName());
			ps.setString(3, s.getEmail());
			ps.setString(4, s.getPassword());
			ps.setInt(5, s.getMobile());
			status = ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		if(status>0) {
			System.out.println("Success");
		}	
		return s;
	}
	
	public List<Student> getAll() {
		Student s;
		List<Student> stu = new ArrayList<>();
		sql = "select * from student";
		try {
			con = util.getConncetion();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				s = new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				System.out.println(s);
				stu.add(s);
				System.out.println(s.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(stu);
		return stu;
	}

	public Student getStudent(int id) {
		Student s = new Student();
		sql = "select * from student where id = ?";
		try {
			con = util.getConncetion();
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}

	public Student update(Student s) {
		sql = "update student set name = ? where id = ?";
		try {
			con = util.getConncetion();
			ps = con.prepareStatement(sql);
			ps.setInt(1, s.getId());
			ps.setString(2, s.getName());
			status = ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
		if(status>0) {
			System.out.println("Success");
		}
		else
			System.out.println("Failed to update");
		return s;
	}

	public Student delete(int id) {
		Student s = getStudent(id);
		sql = "delete student where id = ?";
		try {
			con = util.getConncetion();
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			status = ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		if(status>0) {
			System.out.println("Success");
		}		
		return s;
	}

	public Student getPerson(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
