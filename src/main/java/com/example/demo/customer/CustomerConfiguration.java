package com.example.demo.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CustomerConfiguration {

    @Value("${app.useFakeCustomerRepo:false}")
    private Boolean useFakeCustomerRepo;

    @Bean
    CustomerRepo customerRepo() {
        System.out.println("Inside useFakeCustomerRepo " + useFakeCustomerRepo);
        return useFakeCustomerRepo ? new CustomerFakeRepository() : new CustomerRepository();
    }
}
