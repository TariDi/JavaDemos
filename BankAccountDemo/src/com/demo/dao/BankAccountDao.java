package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

import com.demo.model.Account;

public class BankAccountDao {
	
	private static Connection conn;
	private static Statement query;
	static {
		conn = DBUtil.getConnection();	//connection with sql established
		try {
			query = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void addAccount(Set<Account> accounts) {
		try {
			PreparedStatement add = conn.prepareStatement("insert into AccountInfo values(?,?,?,?,?,?,?,?)");
			//a.setQueryValues(add);	//failed attempt to make inserting values into prepared stmt faster
			
			for(Account a : accounts) {
				//following statements insert appr. values into prepared stmt
				//inconvenient since it involves several calls to getter methods 
				add.setString(1, a.getAccntId());
				add.setString(2, a.getPinNo());
				add.setString(3, a.getfName());
				add.setString(4, a.getlName());
				add.setString(5, a.getMobileNo());
				add.setString(6, a.getEmailId());
				add.setDate(7, new java.sql.Date(a.getDob().getTime()));
				add.setDouble(8, a.getBalance());
				int n=add.executeUpdate();
				if(n>0) {
					
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void saveData(Set<Account> accounts) {
		for(Account temp : accounts) {
			
		}
	}

}
