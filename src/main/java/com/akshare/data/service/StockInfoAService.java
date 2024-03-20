package com.akshare.data.service;

import com.akshare.data.apiclient.StockBasicInfoApiClient;
import com.akshare.data.repository.StockInfoARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockInfoAService {

    @Autowired
    private StockInfoARepository stockInfoARepository;

    @Autowired
    private StockBasicInfoApiClient stockBasicInfoApiClient;

    public void saveAllStockInfoA() {
        stockInfoARepository.saveAll(stockBasicInfoApiClient.getAllStockList());
    }
}
