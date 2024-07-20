package com.example.dependencyinjection.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@Data
public class Customer {
    private String name;
    private String address;
}
