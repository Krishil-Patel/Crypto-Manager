package com.krishil.trading.services;

import com.krishil.trading.models.Coin;
import com.krishil.trading.models.User;
import com.krishil.trading.models.Watchlist;

public interface WatchlistService {

    Watchlist findUserWatchlist(Long userId) throws Exception;

    Watchlist createWatchList(User user);

    Watchlist findById(Long id) throws Exception;

    Coin addItemToWatchlist(Coin coin,User user) throws Exception;
}