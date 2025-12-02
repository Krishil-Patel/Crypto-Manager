package com.krishil.trading.services;

import com.krishil.trading.domains.VerificationType;
import com.krishil.trading.models.ForgotPasswordToken;
import com.krishil.trading.models.User;

public interface ForgotPasswordService {

    ForgotPasswordToken createToken(User user, String id, String otp,
                                    VerificationType verificationType,String sendTo);

    ForgotPasswordToken findById(String id);

    ForgotPasswordToken findByUser(Long userId);

    void deleteToken(ForgotPasswordToken token);

    boolean verifyToken(ForgotPasswordToken token,String otp);
}