package com.akshare.data.service;


import com.akshare.data.webdataclient.StockInfoClient;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StockListInfo {

    @Resource
    private StockInfoClient stockInfoClient;

    public String getStockInfo(){
        String stockList = stockInfoClient.getStockList();
        return stockList;
    }

}
