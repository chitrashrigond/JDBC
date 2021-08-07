package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateAmountById {

	public static void main(String[] args) {
		String username = "root";
		String password = "kariya@2021";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		
		
		try  
		
		(Connection connect = DriverManager.getConnection(url, username, password)){

		String UpdateAmountById = "update ScamI set S_AMOUNT=136274 where S_ID='13'";
		Statement st = connect.createStatement();
		st.execute(UpdateAmountById);
	} catch (SQLException e) {
		e.printStackTrace();
	}

	}

}
