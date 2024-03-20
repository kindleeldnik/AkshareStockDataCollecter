package com.akshare.data.repository;

import com.akshare.data.entity.StockInfoA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockInfoARepository extends JpaRepository<StockInfoA, Integer> {
}
