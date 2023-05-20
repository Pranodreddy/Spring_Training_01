package com.example.demo.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Component
public class CustomerRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        // Need to connect to Database
        return Arrays.asList(
                new Customer(1,"repository","Passwrd111")
        );
    }
}
