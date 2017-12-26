package com.yashebook.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by binchen on 2017/12/26.
 * 关注表
 */
@Data
@Entity
@Table(name = "ys_follows")
public class Follows {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 关注编号
     */
    private String followSn;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 关注类型 0 商品 1 用户
     */
    private int followType;

    /**
     * 关注目标
     */
    private String targetSn;

    /**
     * 创建时间
     */
    private Date createTime;
}
