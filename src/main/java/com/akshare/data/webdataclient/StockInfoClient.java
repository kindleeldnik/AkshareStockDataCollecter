package com.akshare.data.webdataclient;

import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.GetRequest;
import com.dtflys.forest.annotation.Request;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.stereotype.Service;


public interface StockInfoClient {

    @Get("http://192.168.98.50:8888/api/public/stock_info_sh_name_code")
    JSONArray getStockList();

}
