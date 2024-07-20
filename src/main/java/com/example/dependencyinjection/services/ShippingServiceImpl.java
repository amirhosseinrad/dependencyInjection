package com.example.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingServiceImpl implements ShippingService
{
    @Override
    public void shipBox(String address) {
        System.out.println("Shipping box to " + address);
    }
}
