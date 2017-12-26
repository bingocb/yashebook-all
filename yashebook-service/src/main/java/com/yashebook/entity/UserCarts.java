package com.yashebook.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by binchen on 2017/12/26.
 * 用户购物车表
 */
@Data
@Entity
@Table(name = "ys_user_carts")
public class UserCarts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 用户ID
     */
    @Column(nullable = false)
    private String userId;

    /**
     * 商品编号
     */
    @Column(nullable = false)
    private String productSn;

    /**
     * 加入购物车数量
     */
    @Column(nullable = false)
    private String num;
}
