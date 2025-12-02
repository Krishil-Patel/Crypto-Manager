package com.krishil.trading.services;

import com.krishil.trading.models.PaymentDetails;
import com.krishil.trading.models.User;

public interface PaymentDetailsService {
    public PaymentDetails addPaymentDetails( String accountNumber,
                                             String accountHolderName,
                                             String ifsc,
                                             String bankName,
                                             User user
    );

    public PaymentDetails getUsersPaymentDetails(User user);
}