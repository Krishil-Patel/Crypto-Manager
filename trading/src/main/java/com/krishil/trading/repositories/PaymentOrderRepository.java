package com.krishil.trading.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishil.trading.models.PaymentOrder;

public interface PaymentOrderRepository extends JpaRepository<PaymentOrder,Long> {
}