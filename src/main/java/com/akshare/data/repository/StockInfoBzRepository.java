package com.akshare.data.repository;

import com.akshare.data.entity.StockInfoBz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockInfoBzRepository extends JpaRepository<StockInfoBz, String> {
}
