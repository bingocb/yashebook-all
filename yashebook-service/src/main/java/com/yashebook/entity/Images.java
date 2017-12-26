package com.yashebook.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by binchen on 2017/12/26.
 * 图片记录表
 */
@Data
@Entity
@Table(name = "ys_images")
public class Images {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 图片编号
     */
    private String imgSn;

    /**
     * 图片地址
     */
    private String imgPath;

    /**
     * 图片来源 1平台 2用户
     */
    private int imgSource;

    /**
     * 图片来源表ID
     */
    private String dataId;

    /**
     * 图片来源表
     */
    private String dataTable;

    /**
     * 是否使用
     */
    private int isUsed;

    /**
     * 图片大小（byte）
     */
    private int imgSize;

    /**
     * 上传用户ID
     */
    private String ownId;

    /**
     * 是否删除标识
     */
    private int deleteFlag;

    /**
     * 创建时间
     */
    private Date createTime;
}
