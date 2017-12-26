package com.yashebook.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by binchen on 2017/12/24.
 * 图书表
 */
@Data
@Entity
@Table(name = "ys_book")
public class Book {

    /**
     * 唯一ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 图书编号
     */
    @Column(nullable = false)
    private String bookSn;

    /**
     * 图书名
     */
    @Column(nullable = false)
    private String bookName;

    /**
     * 图书版次
     */
    private String bookVersion;

    /**
     * 页数
     */
    private String bookPage;

    /**
     * 字数
     */
    private String bookFonts;

    /**
     * 印刷时间
     */
    private Date printTime;

    /**
     * 开本
     */
    private String bookFolio;

    /**
     * 纸张材质
     */
    private String material;

    /**
     * 包装类型
     */
    private String packType;

    /**
     * 是否套装
     */
    private int isFull;

    /**
     * 国际标准书号ISBN
     */
    private String ISBN;

    /**
     * 图书图集
     */
    private String covers;

    /**
     * 编辑推荐
     */
    private String editorRecommend;

    /**
     * 内容简介
     */
    private String contentIntroduction;

    /**
     * 作者
     */
    private String author;

    /**
     * 作者简介
     */
    private String authorIntroduction;

    /**
     * 出版社名称
     */
    private String pressName;

    /**
     * 出版时间
     */
    private String publishingTime;

    /**
     * 目录
     */
    private String catalog;

    /**
     * 媒体评价
     */
    private String comment;

    /**
     * 内容（在线阅读部分）
     */
    private String content;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后修改时间
     */
    private Date modifyTime;
}
