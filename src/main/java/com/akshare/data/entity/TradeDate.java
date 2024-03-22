package com.akshare.data.entity;


import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Comment;

@Table(name = "trade_date")
@Data
@Comment("从1990-12-19到2024-12-31之间的股票交易日历数据,")
@Entity
public class TradeDate {

    @Id
    @Comment("交易日期")
    @Column(name = "trade_date")
    @JsonAlias({"trade_date"})
    private String tradeDate;
}
