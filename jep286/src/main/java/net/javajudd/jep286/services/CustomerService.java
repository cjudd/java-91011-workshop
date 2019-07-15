package net.javajudd.jep286.services;

import net.javajudd.jep286.domain.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findAllCustomers();

    List<Customer> findOddCustomers();

}
