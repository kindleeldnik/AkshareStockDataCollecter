package com.akshare.data.apiservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StockListInfoTest {

    @Autowired
    private StockListInfo stockListInfo;


    @Test
    void getStockInfo() {
        System.out.println(stockListInfo.getStockInfo());
    }


    @Test
    void getAllStockList() {
        System.out.println(stockListInfo.getAllStockList());
    }
}