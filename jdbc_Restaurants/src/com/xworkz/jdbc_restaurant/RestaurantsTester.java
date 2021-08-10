package com.xworkz.jdbc_restaurant;

import com.xworkz.jdbc_restaurant.constant.RestaurantType;
import com.xworkz.jdbc_restaurant.dto.RestaurantDTO;
import com.xworkz.jdbc_restaurant.dao.RestaurantsDAO;
import com.xworkz.jdbc_restaurant.dao.RestaurantsDAOImpl;
public class RestaurantsTester {

	public static void main(String[] args) {
		RestaurantDTO dto=new RestaurantDTO("Vaibhav","Bhatkal","Biriyani",true,RestaurantType.FAMILY);
 RestaurantsDAO dao=new RestaurantsDAOImpl();
 dao.save(dto);
	}

}
