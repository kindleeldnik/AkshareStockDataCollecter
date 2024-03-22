package com.akshare.data.entity;

import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Comment;

@Entity
@Table(name = "stock_info_stop")
@Comment("东方财富网-行情中心-沪深个股-两网及退市信息")
@Data
public class StockInfoStop {

    @Column(name = "序号")
    @Comment("序号")
    @JsonAlias("序号")
    public String sequence;

    @Id
    @Column(name = "code")
    @Comment("股票代码")
    @JsonAlias("代码")
    public String code;

    @Column(name = "名称")
    @Comment("股票名称")
    @JsonAlias("名称")
    public String name;
}
