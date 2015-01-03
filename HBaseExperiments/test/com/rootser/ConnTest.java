/**
 * 
 */
package com.rootser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

/**
 * @author john
 *
 */
public class ConnTest {

	@Test
	public void test() throws SQLException, ClassNotFoundException {
		Class.forName("org.apache.phoenix.jdbc.PhoenixDriver");
		Connection conn = DriverManager.getConnection("jdbc:phoenix:192.168.1.55:2181");
		Statement st =  conn.createStatement();
		ResultSet rs = st.executeQuery("select * from friends");
		while (rs.next()){
			System.out.println(rs.getInt("friendId"));
		}
	}

}
