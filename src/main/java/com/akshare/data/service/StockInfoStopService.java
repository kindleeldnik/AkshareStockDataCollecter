package com.akshare.data.service;

import com.akshare.data.apiservice.StockBasicInfo;
import com.akshare.data.repository.StockInfoStopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StockInfoStopService {

    @Autowired
    private StockBasicInfo stockBasicInfo;

    @Autowired
    private StockInfoStopRepository stockInfoStopRepository;


    public void saveAllStopStockList() {
        stockInfoStopRepository.saveAll(stockBasicInfo.getAllStopStockList());
    }
}
