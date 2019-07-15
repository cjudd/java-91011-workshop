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
        ModelAndView mav = new ModelAndView("customer/index");
        List<Customer> allCustomers = customerService.findAllCustomers();
        mav.addObject("customers", allCustomers);
        return mav;
    }

}