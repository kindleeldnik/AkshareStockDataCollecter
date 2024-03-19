package com.akshare.data.webdataclient;

import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.http.ForestRequest;
import org.springframework.boot.configurationprocessor.json.JSONArray;


public interface StockInfoClient {

    @Get("http://192.168.122.180:8888/api/public/stock_zh_a_hist")
    String getStockList();


    /**
     * 获取所有A股市场股票列表的方法
     * @return 包含所有股票信息的 JSON数组
     */
    @Get("http://192.168.122.180:8888/api/public/stock_info_a_code_name")
    String getAllStockList();


}
