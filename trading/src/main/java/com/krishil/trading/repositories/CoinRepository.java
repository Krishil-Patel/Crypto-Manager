package com.krishil.trading.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishil.trading.models.Coin;

public interface CoinRepository extends JpaRepository<Coin,String> {
}
