package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateYearByName {

	public static void main(String[] args) {
		String username = "root";
		String password = "kariya@2021";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		
		
		try  
		
		(Connection connect = DriverManager.getConnection(url, username, password)){

		String UpdateYearByName = "update ScamI set S_YEAR=2000 where S_NAME='2G SPECTRUM SCAM'";
		Statement st = connect.createStatement();
		st.execute(UpdateYearByName);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}

}
