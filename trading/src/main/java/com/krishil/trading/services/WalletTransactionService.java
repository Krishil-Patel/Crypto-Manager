package com.krishil.trading.services;

import java.util.List;

import com.krishil.trading.domains.WalletTransactionType;
import com.krishil.trading.models.Wallet;
import com.krishil.trading.models.WalletTransaction;

public interface WalletTransactionService {
    WalletTransaction createTransaction(Wallet wallet,
                                        WalletTransactionType type,
                                        String transferId,
                                        String purpose,
                                        Long amount
    );

    List<WalletTransaction> getTransactions(Wallet wallet, WalletTransactionType type);
}