package com.xworkz.jdbc_Customer.service;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.xworkz.jdbc_Customer.dao.CustomerDAOImpl;
import com.xworkz.jdbc_Customer.dto.CustomerDTO;

public class CustomerServiceImpl implements CustomerService {
	CustomerDAOImpl customerDaoImpl;

	public CustomerServiceImpl() {
		customerDaoImpl = new CustomerDAOImpl();
	}

	boolean validation = true;

	private void validation(CustomerDTO dto) {

		if (dto.getName().length() < 2) {
			validation = false;
		}
		if (dto.getAddress().isEmpty()) {
			validation = false;
		}
		if (dto.getFrom().length() < 3) {
			validation = false;
		}

	}

	@Override
	public int validateAndSave(CustomerDTO dto) {
		validation(dto);
		if (validation == true) {
			return customerDaoImpl.save(dto);
		}

		return 0;

	}

	@Override
	public void validateAndSaveAll(Collection<CustomerDTO> dto) {
		dto.stream().forEach(c -> validation((c)));

		if (validation == true) {

		}

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
