package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBUtil {
	private static Connection conn = null;
	
	public static Connection getMyConnection() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tdawg", "root", "root");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	

}
