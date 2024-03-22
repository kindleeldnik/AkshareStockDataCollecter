package com.akshare.data.repository;

import com.akshare.data.entity.StockInfoStop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockInfoStopRepository extends JpaRepository<StockInfoStop, String> {

}
