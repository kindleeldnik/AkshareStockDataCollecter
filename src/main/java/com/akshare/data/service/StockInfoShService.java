package com.akshare.data.service;

import com.akshare.data.apiservice.StockBasicInfo;
import com.akshare.data.repository.StockInfoShRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StockInfoShService {

    @Autowired
    private StockInfoShRepository stockInfoShRepository;

    @Autowired
    private StockBasicInfo stockBasicInfo;

    @Value("${sse.block-type}")
    private ArrayList<String> blockTypeList;

    public void saveBlockStockInfo(){
        System.out.println(blockTypeList);
//        for (String s : blockTypeList) {
//            stockInfoShRepository.saveAll(stockBasicInfo.getBlockStockList(s));
//        }
    }

}
