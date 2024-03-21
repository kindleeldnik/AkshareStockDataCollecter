package com.akshare.data.apiservice;


import com.akshare.data.apiclient.StockBasicInfoApiClient;
import com.akshare.data.entity.StockInfoA;
import com.akshare.data.entity.StockInfoBz;
import com.akshare.data.entity.StockInfoSz;
import com.akshare.data.entity.StockInfoSh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class StockBasicInfo {

    @Autowired
    private StockBasicInfoApiClient stockBasicInfoApiClient;

    public String getStockInfo(){
        return stockBasicInfoApiClient.getStockList();
    }



    /**
     * 获取A股所有股票列表
     * @return 包含所有股票信息的JSONArray
     */
    public ArrayList<StockInfoA> getAllStockList(){
        return stockBasicInfoApiClient.getAllStockList();
    }


    /**
     * 获取上交所指定板块的股票列表信息
     * @param blockType 板块类型，上交所包含的板块信息在yml配置文件里，
     * @return  包含指定板块所有股票信息的JSONArray
     */
    public ArrayList<StockInfoSh> getBlockStockList(String blockType) {
        return stockBasicInfoApiClient.getAllShStockBlockList(blockType);
    }


    /**
     * 获取深证证券交易所股票代码和股票简称数据
     * @return 深交所所有A股信息的JSONArray
     */
    public ArrayList<StockInfoSz> getAllSzStockList() {
        return stockBasicInfoApiClient.getAllSzStockList("A股列表");
    }


    /**
     * 获取所有北证所股票列表
     * @return 包含StockInfoBz对象的ArrayList
     */
    public ArrayList<StockInfoBz> getAllBzStockList() {
        return stockBasicInfoApiClient.getAllBzStockList();
    }

}
