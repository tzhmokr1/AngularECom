package com.kmorath.ecommerce.controller;

import org.springframework.web.bind.annotation.*;

import com.kmorath.ecommerce.dto.Purchase;
import com.kmorath.ecommerce.dto.PurchaseResponse;
import com.kmorath.ecommerce.service.CheckoutService;



@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }
    

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);
        return purchaseResponse;
    }

}









