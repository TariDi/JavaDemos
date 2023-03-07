package com.demo.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableDemo {

	public static void main(String[] args) {
		Connection conn = DBUtil.getMyConnection();
		//conn.setAutoCommit(false);
		try {
			/*CallableStatement cst = conn.prepareCall("{call count_by_dept(?,?)}");
			cst.setInt(1, 3);
			int cnt =0;
			cst.registerOutParameter(2, java.sql.Types.INTEGER,cnt);
			cst.execute();
			cnt = cst.getInt(2);
			System.out.println("Count: "+cnt);*/
			
			CallableStatement cst = conn.prepareCall("{call get_emp_name(?,?)}");
			cst.setInt(1, 15002);
			String empName= null;
			cst.registerOutParameter(2, java.sql.Types.VARCHAR, empName);
			cst.execute();
			empName = cst.getString(2);
			System.out.println("Employee name: "+empName);
			
			//conn.commit();	-can't use this because auto-commit is set to true
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
