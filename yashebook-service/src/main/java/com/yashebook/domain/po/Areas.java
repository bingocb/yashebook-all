package com.yashebook.domain.po;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
* Areas
* table:ys_areas
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-05 10:40:00
*/
public class Areas implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String areasKey;

    private String areasName;

    private Integer areasSort;

    private Integer areasType;

    private Date createTime;

    private Integer deleteFlag;

    private Integer isShow;

    private Integer parentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreasKey() {
        return areasKey;
    }

    public void setAreasKey(String areasKey) {
        this.areasKey = areasKey;
    }

    public String getAreasName() {
        return areasName;
    }

    public void setAreasName(String areasName) {
        this.areasName = areasName;
    }

    public Integer getAreasSort() {
        return areasSort;
    }

    public void setAreasSort(Integer areasSort) {
        this.areasSort = areasSort;
    }

    public Integer getAreasType() {
        return areasType;
    }

    public void setAreasType(Integer areasType) {
        this.areasType = areasType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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
        Areas other = (Areas) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAreasKey() == null ? other.getAreasKey() == null : this.getAreasKey().equals(other.getAreasKey()))
            && (this.getAreasName() == null ? other.getAreasName() == null : this.getAreasName().equals(other.getAreasName()))
            && (this.getAreasSort() == null ? other.getAreasSort() == null : this.getAreasSort().equals(other.getAreasSort()))
            && (this.getAreasType() == null ? other.getAreasType() == null : this.getAreasType().equals(other.getAreasType()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getIsShow() == null ? other.getIsShow() == null : this.getIsShow().equals(other.getIsShow()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAreasKey() == null) ? 0 : getAreasKey().hashCode());
        result = prime * result + ((getAreasName() == null) ? 0 : getAreasName().hashCode());
        result = prime * result + ((getAreasSort() == null) ? 0 : getAreasSort().hashCode());
        result = prime * result + ((getAreasType() == null) ? 0 : getAreasType().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        result = prime * result + ((getIsShow() == null) ? 0 : getIsShow().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}