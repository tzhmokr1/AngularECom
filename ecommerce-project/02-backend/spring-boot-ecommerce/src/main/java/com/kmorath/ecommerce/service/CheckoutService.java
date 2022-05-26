package com.kmorath.ecommerce.service;

import com.kmorath.ecommerce.dto.Purchase;
import com.kmorath.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
