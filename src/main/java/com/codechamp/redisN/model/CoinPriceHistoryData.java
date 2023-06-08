package com.codechamp.redisN.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class CoinPriceHistoryData {
    private String change;
    private List<CoinPriceHistoryExchangeRate> history = new ArrayList<>();
}
