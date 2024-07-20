package com.example.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class PaymentProcessorImpl implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount);
    }
}
