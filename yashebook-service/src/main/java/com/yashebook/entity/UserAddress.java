package com.yashebook.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by binchen on 2017/12/26.
 * 用户地址表
 */
@Data
@Entity
@Table(name = "ys_user_address")
public class UserAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 会员ID
     */
    @Column(nullable = false)
    private String userId;

    /**
     * 收货人姓名
     */
    @Column(nullable = false)
    private String consigneeName;

    /**
     * 收货人手机号
     */
    @Column(nullable = false)
    private String consigneePhone;

    /**
     * 收货区域ID路径（省Id_市Id_县Id 例如:440000_440100_440106_）
     */
    @Column(nullable = false)
    private String areaIdPath;

    /**
     * 收货区域最后一级ID
     */
    @Column(nullable = false)
    private String areaId;

    /**
     * 详细地址
     */
    @Column(nullable = false)
    private String address;

    /**
     * 是否默认地址
     */
    private int isDefault;

    /**
     * 是否删除标识
     */
    private int deleteFlag;

    /**
     * 创建时间
     */
    private Date createTime;
}
