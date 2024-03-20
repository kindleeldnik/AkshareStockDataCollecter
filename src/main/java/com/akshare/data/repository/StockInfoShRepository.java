package com.akshare.data.repository;

import com.akshare.data.entity.StockInfoSh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockInfoShRepository extends JpaRepository<StockInfoSh,String> {
}
