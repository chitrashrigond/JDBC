package com.xworkz.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;

import java.sql.Connection;

public class DeleteByID {

	public static void main(String[] args) {
		
		String username = "root";
		String password = "kariya@2021";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		
		try (Connection connect = DriverManager.getConnection(url, username, password)) {

			String deleteScamById = "delete from scamI where S_ID=1";
			Statement st = connect. createStatement();
			st.execute(deleteScamById);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
