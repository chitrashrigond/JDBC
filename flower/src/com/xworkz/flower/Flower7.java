package com.xworkz.flower;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Flower7 {
	public static void main(String[] args) {
	String username = "root";
	String password = "kariya@2021";
	String url = "jdbc:mysql://localhost:3306/jdbc";
	String fqnOfDriverImpl = "com.mysql.cj.jdbc.Driver";

	try {

		Connection connect = DriverManager.getConnection(url, username, password);
		System.out.println(connect);

		String query1 = "insert into flower_table values(7,'Dahlia','red',50,'all',false,30,true,'Dietary fiber',true)";
		Statement st = connect.createStatement();

		st.execute(query1);
		ResultSet result = st.getResultSet();
		Flower1  Rose= null;

		 //System.out.println(Rose);
	} catch (SQLException e) {
		e.printStackTrace();

	}
}
}
