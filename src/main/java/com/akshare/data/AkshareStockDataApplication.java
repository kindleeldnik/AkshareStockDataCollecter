package com.akshare.data;

import com.dtflys.forest.springboot.annotation.ForestScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@ForestScan(basePackages = "com.akshare.data.webdataclient")
public class AkshareStockDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(AkshareStockDataApplication.class, args);
    }

}
