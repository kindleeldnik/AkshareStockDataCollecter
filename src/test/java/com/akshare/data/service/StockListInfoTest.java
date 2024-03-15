package com.akshare.data.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class StockListInfoTest {

    @Autowired
    private StockListInfo stockListInfo;

    @Test
    void stockInfoClientTest(){
        System.out.println(stockListInfo.getStockInfo());
    }
}