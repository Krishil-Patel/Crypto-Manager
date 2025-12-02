package com.krishil.trading.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishil.trading.models.Wallet;

public interface WalletRepository extends JpaRepository<Wallet,Long> {
    public Wallet findByUserId(Long userId);
}