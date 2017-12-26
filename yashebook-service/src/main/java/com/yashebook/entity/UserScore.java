package com.yashebook.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by binchen on 2017/12/26.
 * 用户积分表
 */
@Data
@Entity
@Table(name = "ys_user_score")
public class UserScore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户积分
     */
    private int score;

    /**
     * 用户积分来源 1：购物 2：评价 3：取消订单返回 4：拒收返回
     */
    private int source;

    /**
     * 来源订单编号
     */
    private int sourceSn;

    /**
     * 积分类型 1：收入 2：支出
     */
    private int scoreType;

    /**
     * 描述
     */
    private String remarks;

    /**
     * 创建时间
     */
    private Date createTime;
}
