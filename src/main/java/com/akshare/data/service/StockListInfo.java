package com.akshare.data.service;


import com.akshare.data.webdataclient.StockInfoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.stereotype.Service;

@Service
public class StockListInfo {

    @Autowired
    private StockInfoClient stockInfoClient;

    public JSONArray getStockInfo(){
        JSONArray stockList = stockInfoClient.getStockList();
        return stockList;
    }

}
