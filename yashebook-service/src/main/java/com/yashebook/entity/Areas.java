package com.yashebook.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by binchen on 2017/12/26.
 * 区域表
 */
@Data
@Entity
@Table(name = "ys_areas")
public class Areas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     * 父ID
     */
    private Integer parentId;

    /**
     * 地区名称
     */
    private String areasName;

    /**
     * 是否显示
     */
    private int isShow;

    /**
     * 地区类型 1省 2市 3县区
     */
    private int areasType;

    /**
     * 地区首字母
     */
    private String areasKey;

    /**
     * 排序
     */
    private int areasSort;

    /**
     * 是否删除标识
     */
    private int deleteFlag;

    /**
     * 创建时间
     */
    private Date createTime;
}
