package com.yashebook.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by binchen on 2017/12/26.
 * 基础数据表（缓存到redis）
 */
@Data
@Entity
@Table(name = "ys_datas")
public class Datas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 类型ID
     */
    private int typeId;

    /**
     * 数据名
     */
    private String dataKey;

    /**
     * 数据值
     */
    private String dataValue;

    /**
     * 排序
     */
    private int dataSort;
}
