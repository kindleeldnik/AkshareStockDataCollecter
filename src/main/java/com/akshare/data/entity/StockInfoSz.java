package com.akshare.data.entity;


import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Comment;

@Entity
@Data
@Table(name = "stock_info_sz")
@Comment("深证证券交易所股票代码和股票简称数据")
public class StockInfoSz {

    @Column(name = "block_name")
    @Comment("所属板块")
    @JsonAlias({"板块"})
    public String blockName;

    @Id
    @Column(name = "code")
    @Comment("A股代码")
    @JsonAlias({"A股代码"})
    public String code;

    @Column(name = "name")
    @Comment("A股简称")
    @JsonAlias({"A股简称"})
    public String name;

    @Column(name = "launch_date")
    @Comment("A股上市日期")
    @JsonAlias({"A股上市日期"})
    public String launchDate;

    @Column(name = "total_capital")
    @Comment("A股总股本")
    @JsonAlias({"A股总股本"})
    public String totalCapital;

    @Column(name = "negotiable_capital")
    @Comment("A股流通股本")
    @JsonAlias({"A股流通股本"})
    public String negotiableCapital;

    @Column(name = "industry")
    @Comment("所属行业")
    @JsonAlias({"所属行业"})
    public String industry;

}
