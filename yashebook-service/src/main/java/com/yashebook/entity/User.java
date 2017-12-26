package com.yashebook.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by binchen on 2017/12/26.
 * 系统用户表
 */
@Data
@Entity
@Table(name = "ys_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 用户id
     */
    @Column(nullable = false)
    private String userId;

    /**
     * 登陆名
     */
    private String loginName;

    /**
     * 登陆密码
     */
    private String loginPwd;

    /**
     * 支付密码
     */
    private String payPwd;

    /**
     * 用户类型 0：普通用户 1：会员
     */
    private int userType;

    /**
     * 用户性别
     */
    private int userSex;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户真实姓名
     */
    private String trueName;

    /**
     * 用户生日
     */
    private String birthday;

    /**
     * 用户头像
     */
    private String headImg;

    /**
     * 用户QQ
     */
    private String qq;

    /**
     * 用户微信OPEN_ID
     */
    private String openId;

    /**
     * 用户手机号码
     */
    private String phone;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户当前积分
     */
    private int currentScore;

    /**
     * 用户总积分 与用户等级有关
     */
    private int totalScore;

    /**
     * 最后登陆IP
     */
    private String lastIp;

    /**
     * 最后登陆时间
     */
    private Date lastTime;

    /**
     * 用户来源：0系统用户 1QQ用户 2微信用户
     */
    private int userSource;

    /**
     * 用户钱包编号
     */
    private String userMoneySn;

    /**
     * 用户状态 0 禁用 1 启用
     */
    private int userStatus;

    /**
     * 用户信息是否删除标识
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
