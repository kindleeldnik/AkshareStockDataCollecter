package com.akshare.data.repository;

import com.akshare.data.entity.StockInfoSz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockInfoSzRepository extends JpaRepository<StockInfoSz, String> {
}
