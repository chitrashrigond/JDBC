package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateAllByNameId {

	public static void main(String[] args) {
		String username = "root";
		String password = "kariya@2021";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		
		
		try  
		
		(Connection connect = DriverManager.getConnection(url, username, password)){

		String UpdateAllByNameId = "update ScamI set S_YEAR=1986,S_AMOUNT=38600,S_LOCATION='KOLKATTA' where S_NAME='TELGI SCAM'AND S_ID=100";
		Statement st = connect.createStatement();
		st.execute(UpdateAllByNameId);
	} catch (SQLException e) {
		e.printStackTrace();
	}

	}

}
