// AllienDao is a Dao object to use jdbc database processing

package com.pcsglobal.web.dao;

import java.sql.*;

import com.pcsglobal.web.model.Allien;

public class AllienDao 
{
	Statement stmt;
	Connection con;
	ResultSet rs;
	
	public Allien getAllien(int aid) throws SQLException
	{
		Allien a = new Allien();
		/* 
		a.setAid(102);
		a.setAname("Satish");
		a.setTech("Java"); 
		*/
		
		try
		{
			String driver =  "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/jsp";
			String username = "root";
			String password = "password";
			String sql = "select * from alien where aid = ?";
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery("select * from alien where aid = " +aid);
			// stmt.setInt(1, aid);
			// rs = stmt.executeQuery();
			
			if (rs.next())
			{
				a.setAid(rs.getInt("aid"));
				a.setAname(rs.getString("aname"));
				a.setTech(rs.getString("tech"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		} 
		finally
		{
			stmt.close();
			rs.close();
			con.close();
		}
			
		return a;
	}
}
