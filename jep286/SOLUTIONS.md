# JEP 286 Lab Solutions


Customer
 
```java
package net.javajudd.jep286.domain;

import java.util.Objects;

//LAB - JEP286: replace explicit variables with var

public class Customer {

    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        // here
        var customer = (Customer) o;
        return id == customer.id &&
                Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
```

CustomerServiceImpl

```java
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
        // here
        for (var i = 0; i < 10; i++) {
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

        // here
        for (var customer: allCustomers) {
            customers.add(customer);
        }

        return customers;
    }

}
```

CustomerController

```java
package net.javajudd.jep286.controllers;

import net.javajudd.jep286.domain.Customer;
import net.javajudd.jep286.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//LAB - JEP286: replace explicit variables with var

@Controller
@RequestMapping("/")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping({"", "/", "index"})
    public ModelAndView index() {
        // here
        var mav = new ModelAndView("customer/index");
        // here
        var allCustomers = customerService.findAllCustomers();
        mav.addObject("customers", allCustomers);
        return mav;
    }

}
```