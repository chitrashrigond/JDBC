package com.xworkz.jdbc_Customer.service;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

import com.xworkz.jdbc_Customer.dao.CustomerDAOImpl;
import com.xworkz.jdbc_Customer.dto.CustomerDTO;

public class CustomerServiceImpl implements CustomerService{
	CustomerDAOImpl customerDaoImpl;
	
	public CustomerServiceImpl() {
		customerDaoImpl = new CustomerDAOImpl();
	}

	@Override
	public int validateAndSave(CustomerDTO dto) {
		
		return customerDaoImpl.save(dto);
		
	}

	@Override
	public void validateAndSaveAll(Collection<CustomerDTO> dto) {
		customerDaoImpl.saveAll(dto);
		
	}

	@Override
	public Optional<CustomerDTO> findOne(Predicate<CustomerDTO> predicate) {
		return customerDaoImpl.findOne(predicate);
	}

	@Override
	public Collection<CustomerDTO> findAll() {
		return customerDaoImpl.findAll();
	}

	@Override
	public Collection<CustomerDTO> findAll(Predicate<CustomerDTO> predicate) {
		return customerDaoImpl.findAll(predicate);
	}

	@Override
	public Collection<CustomerDTO> findAllSortByNameDesc() {
		return customerDaoImpl.findAllSortByNameDesc();
	}

	@Override
	public int total() {
		return customerDaoImpl.total();
	}

}
