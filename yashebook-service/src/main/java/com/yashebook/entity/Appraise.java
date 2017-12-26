package com.yashebook.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by binchen on 2017/12/26.
 * 订单评价表
 */
@Data
@Entity
@Table(name = "ys_appraise")
public class Appraise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 点评编号
     */
    private String appraiseSn;

    /**
     * 订单编号
     */
    private String orderSn;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 商品编号
     */
    private String productSn;

    /**
     * 商品评分
     */
    private int productScore;

    /**
     * 服务评分
     */
    private int serviceScore;

    /**
     * 时效评分
     */
    private int timeScore;

    /**
     * 点评内容
     */
    private String content;

    /**
     * 商家回复
     */
    private String reply;

    /**
     * 点评图片
     */
    private String images;

    /**
     * 是否展示
     */
    private int isShow;

    /**
     * 是否删除标识
     */
    private int deleteFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 商家回复时间
     */
    private Date replyTime;
}
