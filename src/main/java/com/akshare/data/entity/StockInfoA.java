package com.akshare.data.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

@Data
@Entity
@Table(name = "stock_info_a_code_name")
@Comment("股票列表-A股")
public class StockInfoA {


    @Id
    @Column(name = "code", unique = true)
    @Comment("股票代码")
    public String code;

    @Comment("股票名称")
    @Column(name = "name")
    public String name;


}
