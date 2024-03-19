package com.akshare.data.webdataclient;

import com.dtflys.forest.annotation.Get;


public interface StockInfoClient {

    @Get("http://192.168.122.180:8888/api/public/stock_zh_a_hist")
    String getStockList();


}
