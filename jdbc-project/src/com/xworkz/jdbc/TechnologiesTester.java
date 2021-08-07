package com.xworkz.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TechnologiesTester {


			public static void main(String[] args) {
				
				String username = "root";
				String password = "kariya@2021";
				String url = "jdbc:mysql://localhost:3306/jdbctask";
				String fqnOfDriverImpl = "com.mysql.cj.jdbc.Driver";
				
				Connection connect=null;
				
				try {
					Class.forName(fqnOfDriverImpl);
					 connect= DriverManager.getConnection(url, username, password);
					System.out.println(connect);
					
					
					String query1 = "insert into Technology values(5,'Dope tech',6,'AAA',1995)";
					String query2 = "insert into Technology values(6,'Trion Technology',7,'DDD',1998)";
					String query3 = "insert into Technology values(3,'Hybrid Tech',5,'BBBGI',2001)";
					String query4 = "insert into Technology values(2,'Triple IT',5,'NNN',2003)";
					String query5 = "insert into Technology values(8,'Ovid Technologies',4,'Mark Nelson',1984)";
					Statement st = connect.createStatement();
					st.execute(query1);
					st.execute(query2);
					st.execute(query3);
					st.execute(query4);
					st.execute(query5);
					
				}catch (SQLException e) {
					e.printStackTrace();
				}catch(ClassNotFoundException e) {
					e.printStackTrace();
				}
				finally {
					try {
						connect.close();
					}catch(SQLException e) {
						e.printStackTrace();
					}
				}


	}

}
