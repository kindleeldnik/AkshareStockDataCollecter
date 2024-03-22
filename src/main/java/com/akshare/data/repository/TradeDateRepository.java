package com.akshare.data.repository;

import com.akshare.data.apiservice.StockBasicInfo;
import com.akshare.data.entity.TradeDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeDateRepository extends JpaRepository<TradeDate, String> {


}
