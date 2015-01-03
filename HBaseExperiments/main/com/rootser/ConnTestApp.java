package com.rootser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnTestApp {
	public static void main(String[] args) throws SQLException{
		Connection conn = DriverManager.getConnection("jdbc:phoenix:delicous:2181");
		Statement st =  conn.createStatement();
		ResultSet rs = st.executeQuery("select * from friends");
		while (rs.next()){
			System.out.println(rs.getInt("friendId"));
		}
	}
}
