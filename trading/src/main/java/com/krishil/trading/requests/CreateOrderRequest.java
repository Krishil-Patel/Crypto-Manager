package com.krishil.trading.requests;

import lombok.Data;

import com.krishil.trading.domains.OrderType;

@Data
public class CreateOrderRequest {
    private String coinId;
    private double quantity;
    private OrderType orderType;
}