package com.example.demo.customer;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1, "One","Password123"),
                new Customer(2, "Second","Password456")
        );
    }
}
