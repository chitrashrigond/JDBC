package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TotalScam {

	public static void main(String[] args) {

		try (Connection connect = DriverManager.getConnection(JdbcConstant.url, JdbcConstant.username,
				JdbcConstant.password)) {

			Statement st = connect.createStatement();

			ResultSet result = st.executeQuery("SELECT COUNT(*) FROM ScamDetails");

			result.next();
			System.out.println("Table contains " + result.getInt("COUNT(*)") + " rows");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
