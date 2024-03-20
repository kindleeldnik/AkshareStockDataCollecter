package com.akshare.data.apiservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StockBasicInfoTest {

    @Autowired
    private StockBasicInfo stockBasicInfo;


    @Test
    void getStockInfo() {
        System.out.println(stockBasicInfo.getStockInfo());
    }


    @Test
    void getAllStockList() {
        System.out.println(stockBasicInfo.getAllStockList());
    }
}