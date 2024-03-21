package com.akshare.data.service;

import com.akshare.data.apiservice.StockBasicInfo;
import com.akshare.data.repository.StockInfoBzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockInfoBzService {
    @Autowired
    private StockBasicInfo stockBasicInfo;

    @Autowired
    private StockInfoBzRepository stockInfoBzRepository;

    /**
     *
     */
    public void saveAllStockInfo() {
        stockInfoBzRepository.saveAll(stockBasicInfo.getAllBzStockList());
    }

}
