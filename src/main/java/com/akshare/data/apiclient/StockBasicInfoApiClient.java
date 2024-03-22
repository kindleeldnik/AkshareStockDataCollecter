package com.akshare.data.apiclient;

import com.akshare.data.entity.*;
import com.dtflys.forest.annotation.BaseRequest;
import com.dtflys.forest.annotation.Get;

import java.util.ArrayList;


@BaseRequest(baseURL = "http://192.168.98.50:8888/api/public")
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
     * @return 包含上交所板块股票信息的 JSON数组
     */
    @Get("/stock_info_sh_name_code?symbol={0}")
    ArrayList<StockInfoSh> getAllShStockBlockList(String blockType);


    /**
     * 获取深证证券交易所股票代码和股票简称数据
     * @param stockType 股票类型，选择范围为："A股列表", "B股列表", "CDR列表", "AB股列表"
     * @return 深证证券交易所股票代码和简称数据
     */
    @Get("/stock_info_sz_name_code?symbol={0}")
    ArrayList<StockInfoSz> getAllSzStockList(String stockType);

    /**
     * 获取北京证券交易所股票代码和股票简称数据
     * @return 北京证券交易所股票代码和简称数据
     */
    @Get("/stock_info_bj_name_code")
    ArrayList<StockInfoBz> getAllBzStockList();


    /**
     * 获取所有两网及退市股票列表
     * @return 包含所有两网及退市股票数据
     */
    @Get("/stock_staq_net_stop")
    ArrayList<StockInfoStop> getAllStopStockList();


}
