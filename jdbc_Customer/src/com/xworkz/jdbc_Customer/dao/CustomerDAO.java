package com.xworkz.jdbc_Customer.dao;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Predicate;

import com.xworkz.jdbc_Customer.dto.CustomerDTO;

public interface CustomerDAO {
int save(CustomerDTO dto);
void saveAll(Collection<CustomerDTO>collection);
Optional<CustomerDTO>findOne(Predicate<CustomerDTO> predicate);
Collection<CustomerDTO> findAll(Predicate<CustomerDTO> predicate);
Collection<CustomerDTO>findAll();
Collection<CustomerDTO>findAllSortByNameDesc();
int total();



}
