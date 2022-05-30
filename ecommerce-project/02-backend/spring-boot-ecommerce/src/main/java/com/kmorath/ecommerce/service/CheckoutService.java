package com.kmorath.ecommerce.service;

import com.kmorath.ecommerce.dto.PaymentInfo;
import com.kmorath.ecommerce.dto.Purchase;
import com.kmorath.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
