package com.krishil.trading.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishil.trading.models.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}