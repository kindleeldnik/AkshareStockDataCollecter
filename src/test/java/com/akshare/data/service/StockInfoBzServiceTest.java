package com.akshare.data.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StockInfoBzServiceTest {

    @Autowired
    private StockInfoBzService stockInfoBzService;
    @Test
    void saveAllStockInfo() {
        stockInfoBzService.saveAllStockInfo();
    }
}