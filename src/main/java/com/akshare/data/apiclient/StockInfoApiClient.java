package com.akshare.data.apiclient;

import com.akshare.data.entity.StockInfoA;
import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.Get;
import org.springframework.boot.configurationprocessor.json.JSONArray;

import java.util.ArrayList;


@BaseRequest(baseURL = "http://192.168.98.50:8888/api/public")
public interface StockInfoApiClient {

    @Get("/stock_zh_a_hist")
    String getStockList();


    /**
     * 获取所有A股市场股票列表
     * @return 包含所有股票信息的 JSON数组
     */
    @Get("/stock_info_a_code_name")
    ArrayList<StockInfoA> getAllStockList();

}
