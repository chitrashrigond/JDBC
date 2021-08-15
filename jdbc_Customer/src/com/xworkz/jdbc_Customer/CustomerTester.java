package com.xworkz.jdbc_Customer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

import com.xworkz.jdbc_Customer.constants.Education;
import com.xworkz.jdbc_Customer.dao.CustomerDAO;
import com.xworkz.jdbc_Customer.dao.CustomerDAOImpl;
import com.xworkz.jdbc_Customer.dto.CustomerDTO;
import com.xworkz.jdbc_Customer.service.CustomerService;
import com.xworkz.jdbc_Customer.service.CustomerServiceImpl;

public class CustomerTester {

	public static void main(String[] args) {
		Collection<CustomerDTO> collection=new ArrayList<CustomerDTO>();
			
		CustomerDTO dto1=new CustomerDTO(1,"Bhavani","Bhatkal","Murudeshwar","HNo254 Shirli",false,3655,Education.PG);
		CustomerDTO dto2=new CustomerDTO(6,"Sharavati","Mysore","Banglore","HNo34 Mysore",true,36555,Education.SSLC);
		CustomerDTO dto3=new CustomerDTO(2,"Akash","Shirsi","Ankola","HNo639 Badami",false,3655,Education.PUC);
		CustomerDTO dto4=new CustomerDTO(25,"Chandini","Banglore","Hasan","HNo54 Hasan",true,3655,Education.UG);
		CustomerDTO dto5=new CustomerDTO(15,"Jayrm","Udupi","Manglore","HNo4 Kundapur",false,3655,Education.PRIMARY);
		CustomerDAO dao=new CustomerDAOImpl();
		 dao.save(dto5);
		 dao.save(dto2);
		 dao.save(dto3);
		 dao.save(dto4);
		 dao.save(dto1);
		 
		collection.add(dto5);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);

 dao.saveAll(collection);
		 
  Collection<CustomerDTO> cl1=dao.findAll();	
  cl1.forEach(c->System.out.println("findAll "+c));	 
  
	Collection<CustomerDTO> cl=dao.findAllSortByNameDesc();
	cl.forEach(c->System.out.println("findAllSortByNameDesc"+c));
	

	
		CustomerService cs= new CustomerServiceImpl();
		int saved=cs.validateAndSave(dto1);
		System.out.println("555555555"+saved);
		Collection<CustomerDTO> rs = cs.findAll();
		rs.forEach(r -> System.out.println(r.getName()));
		System.out.println(cs.total());                   

		Predicate<CustomerDTO> predicate = new Predicate<CustomerDTO>() {

			@Override
			public boolean test(CustomerDTO obj) {
				return "Bhatkal".equals(obj.getFrom());
			}
			
		};
		
		Optional<CustomerDTO> rsOne =  cs.findOne(predicate);
		
		System.out.println(rsOne.get().getName() + " " + rsOne.get().getId());
		
		Collection<CustomerDTO> rsAll =  cs.findAll(predicate);
		rsAll.forEach(r -> System.out.println(r.getName() + " " + rsOne.get().getId()));  
		
		
		
		Collection<CustomerDTO> rsSort =  cs.findAllSortByNameDesc();
		rsSort.forEach(r -> System.out.println(r.getName() + " " + rsOne.get().getId()));  
		
		
	}

}
