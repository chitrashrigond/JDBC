package com.xworkz.jdbc_Customer.service;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

import com.xworkz.jdbc_Customer.dto.CustomerDTO;

public interface CustomerService {
	int validateAndSave(CustomerDTO dto);

	void validateAndSaveAll(Collection<CustomerDTO> dto);

	Optional<CustomerDTO> findOne(Predicate<CustomerDTO> predicate);

	Collection<CustomerDTO> findAll();

	Collection<CustomerDTO> findAll(Predicate<CustomerDTO> predicate);

	Collection<CustomerDTO> findAllSortByNameDesc();

	int total();

}
