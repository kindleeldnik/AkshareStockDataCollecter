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

    public void saveBlockStockInfo(){
        ArrayList<String>  blockTypeList = new ArrayList<>();
        blockTypeList.add("主板A股");
        blockTypeList.add("主板B股");
        blockTypeList.add("科创板");

        for (String s : blockTypeList) {
//            System.out.println(stockBasicInfo.getBlockStockList(s));
            stockBasicInfo.getBlockStockList(s).forEach(stockInfoSh -> {
                stockInfoSh.setBlockType(s);
                stockInfoShRepository.save(stockInfoSh);

            });
        }

    }

}
