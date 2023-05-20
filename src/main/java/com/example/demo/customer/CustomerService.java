package com.example.demo.customer;

import com.example.demo.exception.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerService {

    private CustomerRepo  customerRepo;
    private static Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    List<Customer> getCustomer() throws NotFoundException {
        LOGGER.info("Entered getCustomer method");
        return customerRepo.getCustomers();
    }
}
