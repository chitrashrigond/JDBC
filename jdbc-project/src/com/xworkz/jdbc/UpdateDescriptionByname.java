package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDescriptionByname {

	public static void main(String[] args) {
	
		String username = "root";
		String password = "kariya@2021";
		String url = "jdbc:mysql://localhost:3306/jdbc";
		
		
		try  
		
		(Connection connect = DriverManager.getConnection(url, username, password)){

		String UpdateDescriptionByname = "update ScamI set A_DESCRIPTION='In 1991, an arrest linked to militants in Kashmir led to a raid on hawala brokers, revealing evidence of large-scale payments to national politicians.[2] On 25 March 1991' where S_NAME='HAWLA SCANDAL'";
		Statement st = connect.createStatement();
		st.execute(UpdateDescriptionByname);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}

}
