package com.example.demo.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;

public class Customer {

    private final int id;
    @NotBlank(message = "Name is mandatory")
    private final String name;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private final String password;

    public Customer(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
