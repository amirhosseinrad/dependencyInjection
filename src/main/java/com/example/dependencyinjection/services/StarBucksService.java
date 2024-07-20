package com.example.dependencyinjection.services;

import com.example.dependencyinjection.models.Customer;
import org.springframework.stereotype.Service;

@Service
public class StarBucksService {
    private final PaymentProcessor paymentProcessor;
    private final ShippingService shippingService;

    public StarBucksService(PaymentProcessor paymentProcessor, ShippingService shippingService) {
        this.paymentProcessor = paymentProcessor;
        this.shippingService = shippingService;
    }

    public void deliverBox(Customer customer, double amount) {
        paymentProcessor.processPayment(amount);
        shippingService.shipBox(customer.getAddress());
        System.out.println("Delivered StarBox to " + customer.getName());
    }
}
