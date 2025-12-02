package com.krishil.trading.services;

import com.krishil.trading.models.CoinDTO;
import com.krishil.trading.responses.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}