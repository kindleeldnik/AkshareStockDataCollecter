package com.akshare.data.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StockListInfoTest {

    @Autowired
    private StockListInfo stockListInfo;


    @Test
    void getStockInfo() {
        System.out.println(stockListInfo.getStockInfo());
    }
}