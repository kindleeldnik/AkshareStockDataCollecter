package com.akshare.data.apiclient;

import com.akshare.data.entity.StockInfoA;
import com.akshare.data.entity.StockInfoSh;
import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.Get;

import java.util.ArrayList;


@BaseRequest(baseURL = "http://192.168.122.180:8888/api/public")
public interface StockBasicInfoApiClient {

    @Get("/stock_zh_a_hist")
    String getStockList();


    /**
     * 获取所有A股市场股票列表
     * @return 包含所有股票信息的 JSON数组
     */
    @Get("/stock_info_a_code_name")
    ArrayList<StockInfoA> getAllStockList();


    /**
     * 获取上交所不同板块股票列表
     * blockType 选择范围：主板A股, 主板B股, 科创板
     * @return 包含板块股票信息的 JSON数组
     */
    @Get("/stock_info_sh_name_code?symbol={0}")
    ArrayList<StockInfoSh> getAllShStockBlockList(String blockType);

}
