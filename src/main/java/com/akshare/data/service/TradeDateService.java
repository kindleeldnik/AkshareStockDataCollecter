package com.akshare.data.service;


import com.akshare.data.apiservice.StockBasicInfo;
import com.akshare.data.repository.TradeDateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TradeDateService {

    @Autowired
    private StockBasicInfo stockBasicInfo;

    @Autowired
    private TradeDateRepository tradeDateRepository;

    public void saveAllTradeDate() {
        stockBasicInfo.getAllTradeDateList().forEach(tradeDate -> {
            tradeDateRepository.save(tradeDate);
        });
    }
}
