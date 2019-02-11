package com.aksa.group.aksa.springhibe.repository;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;

import com.aksa.group.aksa.springhibe.entity.Customer;

@ComponentScan
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
