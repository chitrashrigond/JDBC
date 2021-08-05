package com.xworkz.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;

public class JdbcTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName="root";
		String password="kariya@2021";
		String url="jdbc:mysql://localhost:3306/jdbctask";
		String fqnOfDriverImpl="com.mysql.cj.jdbc.Driver";
		
		try{
			Class.forName(fqnOfDriverImpl);
			
			Connection cn=DriverManager.getConnection(url, userName,password);
			System.out.println(cn);
		}
		catch(SQLException c){
			c.printStackTrace();
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}

}
