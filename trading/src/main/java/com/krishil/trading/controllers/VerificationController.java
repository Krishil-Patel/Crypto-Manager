package com.krishil.trading.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.krishil.trading.services.UserService;
import com.krishil.trading.services.VerificationService;

@RestController
public class VerificationController {
    @SuppressWarnings("unused")
    private final VerificationService verificationService;
    @SuppressWarnings("unused")
    private final UserService userService;

    public VerificationController(VerificationService verificationService, UserService userService) {
        this.verificationService = verificationService;
        this.userService = userService;
    }
}