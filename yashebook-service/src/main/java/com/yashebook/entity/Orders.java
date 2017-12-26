package com.yashebook.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by binchen on 2017/12/26.
 * 订单表
 */
@Data
@Entity
@Table(name = "ys_orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 订单唯一编号
     */
    @Column(nullable = false)
    private String orderSn;

    /**
     * 用户ID
     */
    @Column(nullable = false)
    private String userId;

    /**
     * 订单状态：0待发货 1配送中 2用户确认收货 3用户取消 4用户拒收 5未付款
     */
    private int status;

    /**
     * 订单金额
     */
    private double money;

    /**
     * 收货方式 0送货上门 1自提
     */
    private int deliverType;

    /**
     * 快递费
     */
    private double deliverMoney;

    /**
     * 总金额（包含快递费）
     */
    private double totalMoney;

    /**
     * 真实支付金额（折扣之后）
     */
    private double realTotalMoney;

    /**
     * 支付方式 0 在线支付 1货到付款
     */
    private int payType;

    /**
     * 支付来源：1 苹果支付 2 微信 3支付宝
     */
    private int paySource;

    /**
     * 是否支付
     */
    private int isPay;

    /**
     * 订单积分
     */
    private int score;

    /**
     * 订单备注
     */
    private String remarks;

    /**
     * 订单来源：1WEB 2微信公众号 3安卓APP 4IOSAPP
     */
    private int orderSource;

    /**
     * 取消原因ID
     */
    private int cancelReason;

    /**
     * 拒收原因ID
     */
    private int rejectReason;

    /**
     * 其他原因（取消其他原因，拒收其他原因）
     */
    private String otherReason;

    /**
     * 是否退款
     */
    private int isRefund;

    /**
     * 是否评价
     */
    private int isAppraise;

    /**
     * 快递单编号
     */
    private String expressSn;

    /**
     * 第三方支付交易流水豪
     */
    private String tradeNo;

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
