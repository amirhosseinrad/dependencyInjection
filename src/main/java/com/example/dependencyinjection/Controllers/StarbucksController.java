package com.example.dependencyinjection.Controllers;

import com.example.dependencyinjection.models.Customer;
import com.example.dependencyinjection.services.StarBucksService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarbucksController {
    private final StarBucksService starBucksService;

    public StarbucksController(StarBucksService starBucksService) {
        this.starBucksService = starBucksService;
    }

    @GetMapping("/deliver")
    public String deliverBox(@RequestParam String name, @RequestParam String address, @RequestParam double amount) {
        Customer customer = new Customer(name, address);
        starBucksService.deliverBox(customer, amount);
        return "Box delivered!";
    }
}
