package com.yashebook.domain.po;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
* Images
* table:ys_images
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-10 11:51:19
*/
public class Images implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private Date createTime;

    private String dataId;

    private String dataTable;

    private Integer deleteFlag;

    private String imgPath;

    private Integer imgSize;

    private String imgSn;

    private Integer imgSource;

    private Integer isUsed;

    private String ownId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getDataTable() {
        return dataTable;
    }

    public void setDataTable(String dataTable) {
        this.dataTable = dataTable;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Integer getImgSize() {
        return imgSize;
    }

    public void setImgSize(Integer imgSize) {
        this.imgSize = imgSize;
    }

    public String getImgSn() {
        return imgSn;
    }

    public void setImgSn(String imgSn) {
        this.imgSn = imgSn;
    }

    public Integer getImgSource() {
        return imgSource;
    }

    public void setImgSource(Integer imgSource) {
        this.imgSource = imgSource;
    }

    public Integer getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Integer isUsed) {
        this.isUsed = isUsed;
    }

    public String getOwnId() {
        return ownId;
    }

    public void setOwnId(String ownId) {
        this.ownId = ownId;
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
        Images other = (Images) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getDataId() == null ? other.getDataId() == null : this.getDataId().equals(other.getDataId()))
            && (this.getDataTable() == null ? other.getDataTable() == null : this.getDataTable().equals(other.getDataTable()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getImgPath() == null ? other.getImgPath() == null : this.getImgPath().equals(other.getImgPath()))
            && (this.getImgSize() == null ? other.getImgSize() == null : this.getImgSize().equals(other.getImgSize()))
            && (this.getImgSn() == null ? other.getImgSn() == null : this.getImgSn().equals(other.getImgSn()))
            && (this.getImgSource() == null ? other.getImgSource() == null : this.getImgSource().equals(other.getImgSource()))
            && (this.getIsUsed() == null ? other.getIsUsed() == null : this.getIsUsed().equals(other.getIsUsed()))
            && (this.getOwnId() == null ? other.getOwnId() == null : this.getOwnId().equals(other.getOwnId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getDataId() == null) ? 0 : getDataId().hashCode());
        result = prime * result + ((getDataTable() == null) ? 0 : getDataTable().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        result = prime * result + ((getImgPath() == null) ? 0 : getImgPath().hashCode());
        result = prime * result + ((getImgSize() == null) ? 0 : getImgSize().hashCode());
        result = prime * result + ((getImgSn() == null) ? 0 : getImgSn().hashCode());
        result = prime * result + ((getImgSource() == null) ? 0 : getImgSource().hashCode());
        result = prime * result + ((getIsUsed() == null) ? 0 : getIsUsed().hashCode());
        result = prime * result + ((getOwnId() == null) ? 0 : getOwnId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}