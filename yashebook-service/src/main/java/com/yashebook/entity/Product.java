package com.yashebook.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by binchen on 2017/12/22.
 * 商品信息表
 */
@Data
@Entity
@Table(name = "ys_product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    /**
     * 商品唯一ID
     */
    private Long id;

    /**
     * 商品编号
     */
    @Column(nullable = false)
    private String productSn;

    /**
     * 商品名
     */
    @Column(nullable = false)
    private String productName;

    /**
     * 市场价
     */
    @Column(nullable = false, scale = 2)
    private double marketPrice;

    /**
     * 折扣价
     */
    @Column(scale = 2)
    private double discountPrice;

    /**
     * 折扣
     */
    private int discount;

    /**
     * 优惠券信息
     */
    private String coupons;

    /**
     * 总库存
     */
    @Column(nullable = false)
    private int stock;

    /**
     * 预警库存
     */
    @Column(nullable = false)
    private int warnStock;

    /**
     * 库存单位
     */
    @Column(nullable = false)
    private String stockUnit;

    /**
     * 促销信息
     */
    private String productTips;

    /**
     * 是否上架
     */
    private int isSale;

    /**
     * 是否精品
     */
    private int isBest;

    /**
     * 是否热销
     */
    private int isHot;

    /**
     * 是否推荐
     */
    private int isRecom;

    /**
     * 所属分类ID路径
     */
    @Column(nullable = false)
    private String typeIdPath;

    /**
     * 最小一级分类ID
     */
    @Column(nullable = false)
    private String typeId;

    /**
     * 商品描述
     */
    private String productDesc;

    /**
     * 状态 0：违规 1：未审核 2：已审核
     */
    @Column(nullable = false)
    private int status;

    /**
     * 销售总量
     */
    private int saleTotal;

    /**
     * 上架时间
     */
    private Date saleTime;

    /**
     * 点击数
     */
    private int visitNum;

    /**
     * 评论数
     */
    private int appraiseNum;

    /**
     * 基本信息表ID
     */
    @Column(nullable = false)
    private String basicId;

    /**
     * 全站搜索关键字
     */
    private String searchKeywords;

    /**
     * 拒绝上架原因
     */
    private String illegalRemarks;

    /**
     * 是否删除标记
     */
    @Column(nullable = false)
    private int isDelete;

    /**
     * 创建时间
     */
    @Column(nullable = false)
    private Date createTime;

    /**
     * 最后修改时间
     */
    private Date modifyTime;
}
