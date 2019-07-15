package net.javajudd.jep286.services;

import net.javajudd.jep286.domain.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

//LAB - JEP286: replace explicit variables with var

@Service
public class CustomerServiceImpl implements CustomerService {

    private static final List<Customer> allCustomers = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            Customer customer = new Customer(i, format("Customer: %d", i));
            allCustomers.add(customer);
        }
    }

    @Override
    public List<Customer> findAllCustomers() {
        return allCustomers;
    }

    @Override
    public List<Customer> findOddCustomers() {
        List<Customer> customers = new ArrayList<>();

        for (Customer customer: allCustomers) {
            customers.add(customer);
        }

        return customers;
    }

}
