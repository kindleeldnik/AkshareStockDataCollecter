package com.akshare.data.apiservice;


import com.akshare.data.apiclient.StockInfoApiClient;
import com.akshare.data.entity.StockInfoA;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class StockListInfo {

    @Autowired
    private StockInfoApiClient stockInfoApiClient;

    public String getStockInfo(){
        return stockInfoApiClient.getStockList();
    }



    /**
     * 获取A股所有股票列表
     * @return 包含所有股票信息的JSONArray
     */
    public ArrayList<StockInfoA> getAllStockList(){
        return stockInfoApiClient.getAllStockList();
    }


}
