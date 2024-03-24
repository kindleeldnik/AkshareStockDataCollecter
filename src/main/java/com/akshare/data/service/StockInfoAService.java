package com.akshare.data.service;

import com.akshare.data.apiclient.StockInfoApiClient;
import com.akshare.data.repository.StockInfoARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockInfoAService {

    @Autowired
    private StockInfoARepository stockInfoARepository;

    @Autowired
    private StockInfoApiClient stockInfoApiClient;

    public void saveAllStockInfoA() {
        stockInfoARepository.saveAll(stockInfoApiClient.getAllStockList());
    }
}
