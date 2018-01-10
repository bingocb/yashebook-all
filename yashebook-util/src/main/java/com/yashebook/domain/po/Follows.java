package com.yashebook.domain.po;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
* Follows
* table:ys_follows
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-10 11:51:19
*/
public class Follows implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private Date createTime;

    private String followSn;

    private Integer followType;

    private String targetSn;

    private String userId;

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

    public String getFollowSn() {
        return followSn;
    }

    public void setFollowSn(String followSn) {
        this.followSn = followSn;
    }

    public Integer getFollowType() {
        return followType;
    }

    public void setFollowType(Integer followType) {
        this.followType = followType;
    }

    public String getTargetSn() {
        return targetSn;
    }

    public void setTargetSn(String targetSn) {
        this.targetSn = targetSn;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
        Follows other = (Follows) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getFollowSn() == null ? other.getFollowSn() == null : this.getFollowSn().equals(other.getFollowSn()))
            && (this.getFollowType() == null ? other.getFollowType() == null : this.getFollowType().equals(other.getFollowType()))
            && (this.getTargetSn() == null ? other.getTargetSn() == null : this.getTargetSn().equals(other.getTargetSn()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getFollowSn() == null) ? 0 : getFollowSn().hashCode());
        result = prime * result + ((getFollowType() == null) ? 0 : getFollowType().hashCode());
        result = prime * result + ((getTargetSn() == null) ? 0 : getTargetSn().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}