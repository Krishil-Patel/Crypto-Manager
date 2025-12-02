package com.krishil.trading.services;

import com.krishil.trading.exceptions.WalletException;
import com.krishil.trading.models.Order;
import com.krishil.trading.models.User;
import com.krishil.trading.models.Wallet;

public interface WalletService {


    Wallet getUserWallet(User user) throws WalletException;

    public Wallet addBalanceToWallet(Wallet wallet, Long money) throws WalletException;

    public Wallet findWalletById(Long id) throws WalletException;

    public Wallet walletToWalletTransfer(User sender,Wallet receiverWallet, Long amount) throws WalletException;

    public Wallet payOrderPayment(Order order, User user) throws WalletException;
}