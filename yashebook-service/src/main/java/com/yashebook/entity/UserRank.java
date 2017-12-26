package com.yashebook.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by binchen on 2017/12/26.
 * 用户等级表
 */
@Data
@Entity
@Table(name = "ys_user_rank")
public class UserRank {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 等级名称
     */
    @Column(nullable = false)
    private String rankName;

    /**
     * 等级所需积分数
     */
    private int rankScore;

    /**
     * 等级折扣
     */
    private double rebate;

    /**
     * 等级图标
     */
    private String rankImage;

    /**
     * 是否删除标识
     */
    private int deleteFlag;

    /**
     * 创建时间
     */
    private Date createTime;

}
