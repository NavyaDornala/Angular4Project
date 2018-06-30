package com.ts.rest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.ts.rest.DAOUtility;
import com.ts.rest.EventReg;
public class EventRegDAO {
	DAOUtility util = new DAOUtility();
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String sql;
	int status;
	public EventReg evententry(EventReg er) {
		sql = "insert into eventReg values(?, ?, ?, ?, ?, ?, ?)";
		try {
			con = util.getConncetion();
		    if(con.isClosed())
				System.out.println("Connection closed");
			ps = con.prepareStatement(sql);
			ps.setString(1, er.getUname());
			ps.setString(2, er.getEvent());
			if(er.isDecoration() == true)
			   ps.setString(3,"yes");
			else
			   ps.setString(3,"no");
			
			if(er.isCatering() == true)
				   ps.setString(4,"yes");
				else
				   ps.setString(4,"no");
			
			if(er.isPhotography() == true)
				   ps.setString(5,"yes");
				else
				   ps.setString(5,"no");
			
			if(er.isVenue() == true)
				   ps.setString(6,"yes");
				else
				   ps.setString(6,"no");
			
			ps.setString(7, er.getDate());
			status = ps.executeUpdate();
			System.out.println(er.isDecoration());
			System.out.println(er.isVenue());
			System.out.println(er.isPhotography());
			System.out.println(er.isCatering());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		if(status>0) {
			System.out.println("Success");
		}	
		else
			System.out.println("not inserted");
		return er;
	}
	
	public List<Event> getAll() {
		Event s;
		List<Event> er = new ArrayList<>();
		sql = "select * from eventReg";
		try {
			con = util.getConncetion();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				s = new Event();
				s.setUname(rs.getString(1));
				s.setEvent(rs.getString(2));
			    s.setDecoration(rs.getString(3));
				s.setCatering(rs.getString(4));
				s.setPhotography(rs.getString(5));
				s.setVenue(rs.getString(6));
				s.setDate(rs.getString(7));
				er.add(s);
				System.out.println(s.getUname());
				System.out.println(s.getDate());
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(er);
		return er;
	}
}