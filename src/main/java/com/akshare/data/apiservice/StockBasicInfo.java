package com.akshare.data.apiservice;


import com.akshare.data.apiclient.StockInfoApiClient;
import com.akshare.data.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class StockBasicInfo {

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


    /**
     * 获取上交所指定板块的股票列表信息
     * @param blockType 板块类型，上交所包含的板块信息在yml配置文件里，
     * @return  包含指定板块所有股票信息的JSONArray
     */
    public ArrayList<StockInfoSh> getBlockStockList(String blockType) {
        return stockInfoApiClient.getAllShStockBlockList(blockType);
    }


    /**
     * 获取深证证券交易所股票代码和股票简称数据
     * @return 深交所所有A股信息的JSONArray
     */
    public ArrayList<StockInfoSz> getAllSzStockList() {
        return stockInfoApiClient.getAllSzStockList("A股列表");
    }


    /**
     * 获取所有北证所股票列表
     * @return 包含StockInfoBz对象的ArrayList
     */
    public ArrayList<StockInfoBz> getAllBzStockList() {
        return stockInfoApiClient.getAllBzStockList();
    }



    /**
     * 获取所有两网及退市股票列表。
     * <p>
     * 该方法通过调用stockBasicInfoApiClient的getAllStopStockList方法，从股票基本信息API客户端获取所有停盘股票的列表。
     * 这个列表包含了所有两网及退市股票的信息。
     *
     * @return ArrayList<StockInfoStop> - 返回一个包含所有两网及退市票信息的ArrayList。
     */
    public ArrayList<StockInfoStop> getAllStopStockList() {
        return stockInfoApiClient.getAllStopStockList();
    }


    /**
     * 获取所有交易日历信息
     * @return ArrayList<TradeDate> - 返回一个包含所有交易日历信息的ArrayList。
     */
    public ArrayList<TradeDate> getAllTradeDateList() {
        return stockInfoApiClient.getAllTradeDateList();
    }

}
