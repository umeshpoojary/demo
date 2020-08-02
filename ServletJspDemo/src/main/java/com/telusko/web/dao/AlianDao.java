package com.telusko.web.dao;

import com.telusko.web.model.Alian;
import java.sql.*;

public class AlianDao {
	
	public Alian getAlian(int aid){
		
		Alian a = new Alian();
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/telusko","root","password");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from alian where aid ="+aid);
			 if(rs.next()){
				 a.setAid(rs.getInt("aid"));
				 a.setName(rs.getString("name"));
				 a.setTech(rs.getString("tech"));
				 
			 }
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return a;
		
	}

}
