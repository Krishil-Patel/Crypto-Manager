package com.krishil.trading.services;

import java.util.List;

import com.krishil.trading.domains.OrderType;
import com.krishil.trading.models.Coin;
import com.krishil.trading.models.Order;
import com.krishil.trading.models.OrderItem;
import com.krishil.trading.models.User;

public interface OrderService {

    Order createOrder(User user, OrderItem orderItem, OrderType orderType);

    Order getOrderById(Long orderId);

    List<Order> getAllOrdersForUser(Long userId, String orderType,String assetSymbol);

    void cancelOrder(Long orderId);

    Order processOrder(Coin coin, double quantity, OrderType orderType, User user) throws Exception;
}