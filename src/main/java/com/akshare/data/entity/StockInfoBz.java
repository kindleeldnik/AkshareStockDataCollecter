package com.akshare.data.entity;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Comment;

@Table(name = "stock_info_bz")
@Data
@Comment("北交所股票信息")
@Entity
public class StockInfoBz {

    @Id
    @Comment("证券代码")
    @Column(name = "code")
    @JsonAlias({"证券代码"})
    private String code;

    @Comment("证券简称")
    @Column(name = "name")
    @JsonAlias({"证券简称"})
    private String name;

    @Comment("总股本")
    @Column(name = "total_capital")
    @JsonAlias({"总股本"})
    private String totalCapital;

    @Comment("流通股本")
    @Column(name = "negotiable_capital")
    @JsonAlias({"流通股本"})
    private String negotiableCapital;

    @Comment("上市日期")
    @Column(name = "launch_date")
    @JsonAlias({"上市日期"})
    private String launchDate;

    @Comment("所属行业")
    @Column(name = "industry")
    @JsonAlias({"所属行业"})
    private String industry;

    @Comment("地区")
    @Column(name = "area")
    @JsonAlias({"地区"})
    private String area;

    @Comment("报告日期")
    @Column(name = "report_date")
    @JsonAlias({"报告日期"})
    private String reportDate;

}
