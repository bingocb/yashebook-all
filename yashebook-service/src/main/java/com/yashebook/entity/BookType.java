package com.yashebook.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by binchen on 2017/12/24.
 * 图书种类表
 */
@Data
@Entity
@Table(name = "ys_book_type")
public class BookType {

    /**
     * 唯一ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 类型编号
     */
    @Column(nullable = false)
    private String typeSn;

    /**
     * 类型名称
     */
    @Column(nullable = false)
    private String typeName;

    /**
     * 父类型编号，一级类型的父类型是root
     */
    @Column(nullable = false)
    private String parentTypeSn;

    /**
     * 是否热门
     */
    private int isHot;
}
