package com.akshare.data.service;


import com.akshare.data.apiservice.StockBasicInfo;
import com.akshare.data.repository.StockInfoSzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockInfoSzService {
    @Autowired
    private StockBasicInfo stockBasicInfo;

    @Autowired
    private StockInfoSzRepository stockInfoSzRepository;


    public void saveAllSzStock(){
        stockInfoSzRepository.saveAll(stockBasicInfo.getAllSzStockList());
    }

}
