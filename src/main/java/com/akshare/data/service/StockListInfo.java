package com.akshare.data.service;


import com.akshare.data.webdataclient.StockInfoClient;
import jakarta.annotation.Resource;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.stereotype.Component;

@Component
public class StockListInfo {

    @Resource
    private StockInfoClient stockInfoClient;

    public String getStockInfo(){
        return stockInfoClient.getStockList();
    }



    /**
     * 获取A股所有股票列表
     * @return 包含所有股票信息的JSONArray
     */
    public String getAllStockList(){


        return stockInfoClient.getAllStockList();
    }


}
