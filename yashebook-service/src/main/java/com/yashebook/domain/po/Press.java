package com.yashebook.domain.po;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
* Press
* table:ys_press
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-05 10:40:00
*/
public class Press implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 自增ID
     */
    private Integer id;

    /**
     * 出版社编号
     */
    private String pressSn;

    /**
     * 出版社名称
     */
    private String pressName;

    /**
     * 出版社图标地址
     */
    private String pressImgs;

    /**
     * 出版社简介
     */
    private String pressDesc;

    /**
     * 是否删除标识：-1删除，1有效
     */
    private Byte deleteFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最近修改时间
     */
    private Date modifyTime;

    /**
     * @return 自增ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id 
	 *            自增ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return 出版社编号
     */
    public String getPressSn() {
        return pressSn;
    }

    /**
     * @param pressSn 
	 *            出版社编号
     */
    public void setPressSn(String pressSn) {
        this.pressSn = pressSn;
    }

    /**
     * @return 出版社名称
     */
    public String getPressName() {
        return pressName;
    }

    /**
     * @param pressName 
	 *            出版社名称
     */
    public void setPressName(String pressName) {
        this.pressName = pressName;
    }

    /**
     * @return 出版社图标地址
     */
    public String getPressImgs() {
        return pressImgs;
    }

    /**
     * @param pressImgs 
	 *            出版社图标地址
     */
    public void setPressImgs(String pressImgs) {
        this.pressImgs = pressImgs;
    }

    /**
     * @return 出版社简介
     */
    public String getPressDesc() {
        return pressDesc;
    }

    /**
     * @param pressDesc 
	 *            出版社简介
     */
    public void setPressDesc(String pressDesc) {
        this.pressDesc = pressDesc;
    }

    /**
     * @return 是否删除标识：-1删除，1有效
     */
    public Byte getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * @param deleteFlag 
	 *            是否删除标识：-1删除，1有效
     */
    public void setDeleteFlag(Byte deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * @return 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime 
	 *            创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return 最近修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * @param modifyTime 
	 *            最近修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Press other = (Press) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPressSn() == null ? other.getPressSn() == null : this.getPressSn().equals(other.getPressSn()))
            && (this.getPressName() == null ? other.getPressName() == null : this.getPressName().equals(other.getPressName()))
            && (this.getPressImgs() == null ? other.getPressImgs() == null : this.getPressImgs().equals(other.getPressImgs()))
            && (this.getPressDesc() == null ? other.getPressDesc() == null : this.getPressDesc().equals(other.getPressDesc()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPressSn() == null) ? 0 : getPressSn().hashCode());
        result = prime * result + ((getPressName() == null) ? 0 : getPressName().hashCode());
        result = prime * result + ((getPressImgs() == null) ? 0 : getPressImgs().hashCode());
        result = prime * result + ((getPressDesc() == null) ? 0 : getPressDesc().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}