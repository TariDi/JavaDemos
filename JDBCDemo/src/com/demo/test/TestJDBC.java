package com.demo.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TestJDBC {
	
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void displayTable( PreparedStatement pst) {
		try {
			ResultSet rs = pst.executeQuery();
			rs.beforeFirst();
			System.out.println("ID\tName\tCity\tDate");
			while(rs.next()){
				if(rs.getDate(4)==null)
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
				else
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+sdf.format(rs.getDate(4)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Connection conn = DBUtil.getMyConnection();
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");  
		
		String url = "jdbc:mysql://localhost:3306/tdawg";
		conn = DriverManager.getConnection(url, "root", "root");
		if(conn!=null) {
			System.out.println("Connection done.");
			
			Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
			PreparedStatement displayAll = conn.prepareStatement("select * from user");
			//ResultSet rs = st.executeQuery("select * from user2 where city='Pune'");
			
			//displayTable(displayAll);
				
			PreparedStatement pst = conn.prepareStatement("insert into user values(?,?,?,?,?)");
			int id = sc.nextInt();
			pst.setInt(1, id);
			String name = sc.next();
			pst.setString(2, name);
			String city = sc.next();
			pst.setString(3, city);
			String date = sc.next();
			
			java.util.Date date1 = null;
			try {
				date1 = sdf.parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			java.sql.Date sqlDate = new java.sql.Date(date1.getTime());
			pst.setDate(4, sqlDate);
			
			File file = new File("BOUNDARYFILL2");
			FileInputStream fis = new FileInputStream(file);
			pst.setBinaryStream(5, fis, (int)file.length());
			
			int n = pst.executeUpdate();
			
			 //n==0? System.out.println("unsuccessful"):System.out.println("successful");
			
			if(n>0) {
				System.out.println("Insertion successful");
				displayTable(displayAll);
			}
			else {
				System.out.println("Insertion unsuccessful");
			}
			
			ResultSet rs = st.executeQuery("select photo from user where id=16");
			rs.next();
			InputStream in= rs.getBinaryStream(1);
			OutputStream f = new FileOutputStream(new File("test"));
			
			int c = 0;
			if(in!=null) {
				while((c = in.read()) > -1) {
					f.write(c);
				}
			}
			
			/*st.executeUpdate("delete from user2 where 'ccc' in(name)");
			System.out.println("After deletion:");
			displayTable(displayAll);
			
			st.executeUpdate("update user2 set city='Mumbai' where id=13");
			System.out.println("After update");
			displayTable(displayAll);*/
		}
		else {
			System.out.println("Database not available.");
		}
		
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
