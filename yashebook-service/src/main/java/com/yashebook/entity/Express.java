package com.yashebook.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by binchen on 2017/12/26.
 * 快递单表
 */
@Data
@Entity
@Table(name = "ys_express")
public class Express {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 快递单号（系统内部单号）
     */
    private String expressSn;

    /**
     * 快递公司名
     */
    private String expressCompanyName;

    /**
     * 快递单号（快递公司单号）
     */
    private String expressNum;

    /**
     * 发货时间
     */
    private Date deliveryTime;

    /**
     * 收货时间
     */
    private Date receiveTime;

    /**
     * 收货人姓名
     */
    private String consigneeName;

    /**
     * 收货人电话
     */
    private String consigneePhone;

    /**
     * 收货人地址
     */
    private String consigneeAddress;

    /**
     * 是否删除标识
     */
    private int deleteFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后修改时间
     */
    private Date modifyTime;
}
