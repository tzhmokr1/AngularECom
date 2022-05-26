package com.kmorath.ecommerce.dto;

import java.util.Set;

import com.kmorath.ecommerce.dao.Address;
import com.kmorath.ecommerce.dao.Customer;
import com.kmorath.ecommerce.dao.Order;
import com.kmorath.ecommerce.dao.OrderItem;

import lombok.Data;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
