package com.akshare.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Comment;

@Entity
@Data
@Comment("上海证券交易所股票代码和简称数据")
@Table(name = "stock_info_sh")
public class StockInfoSh {
    @Id
    @Column(name = "code", unique = true)
    @Comment("股票代码")
    public String code;

    @Column(name = "name")
    @Comment("证券简称")
    public String name;

    @Column(name = "full_name")
    @Comment("证券全称")
    public String fullName;

    @Column(name = "launch_date")
    @Comment("上市日期")
    public String launchDate;

}
