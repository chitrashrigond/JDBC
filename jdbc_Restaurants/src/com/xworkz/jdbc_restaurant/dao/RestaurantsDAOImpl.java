package com.xworkz.jdbc_restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import 	java.sql.Statement ;
import com.xworkz.jdbc_restaurant.constant.JdbcConstant;
import com.xworkz.jdbc_restaurant.dto.RestaurantDTO;

public  class RestaurantsDAOImpl implements RestaurantsDAO{

	

	@Override
	public  int save(RestaurantDTO dto) {
		
		System.out.println("saving dto into DB"+dto);
				Connection tempConnection=null;

try (Connection connection=DriverManager.getConnection(JdbcConstant.url,JdbcConstant.username,JdbcConstant.password)){
	tempConnection=connection;
	connection.setAutoCommit(false);
	String query ="insert into restaurant_table values(1,'"+dto.getName()+"','"+dto.getLocation()+"','"+dto.getSpecialFood()+"','"+dto.getSpecialFood()+"','"+dto.getType()+"')";
    Statement statement=connection.createStatement();
	statement.execute(query);
	connection.commit();
}
catch(SQLException e){
	e.printStackTrace();
	try{
		tempConnection.rollback();
	}catch(SQLException e1){
		e1.printStackTrace();
	}
}
		return 0;
	}

	

}
