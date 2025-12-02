package com.krishil.trading.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishil.trading.models.TwoFactorOTP;

public interface TwoFactorOtpRepository extends JpaRepository<TwoFactorOTP,String> {

    TwoFactorOTP findByUserId(Long userId);
}
