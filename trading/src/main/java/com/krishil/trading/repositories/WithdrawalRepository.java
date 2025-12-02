package com.krishil.trading.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.krishil.trading.models.Withdrawal;

import java.util.List;

public interface WithdrawalRepository extends JpaRepository<Withdrawal,Long> {
    List<Withdrawal> findByUserId(Long userId);
}