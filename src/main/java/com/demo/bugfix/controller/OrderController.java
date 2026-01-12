package com.demo.bugfix.controller;

import com.demo.bugfix.dto.OrderRequest;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @PostMapping
    public String createOrder(@RequestBody OrderRequest request) {
        if (request.getQuantity() <= 0) {
            throw new RuntimeException("Invalid quantity");
        }
        return "Order created";
    }

//    @PostMapping
//    public String createOrder(@Valid @RequestBody OrderRequest request) {
//        return "Order created successfully";
//    }

}
