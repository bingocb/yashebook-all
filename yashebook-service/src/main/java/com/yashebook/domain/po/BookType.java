package com.yashebook.domain.po;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
* BookType
* table:ys_book_type
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-05 10:40:00
*/
public class BookType implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private Integer isHot;

    private String parentTypeSn;

    private String typeName;

    private String typeSn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public String getParentTypeSn() {
        return parentTypeSn;
    }

    public void setParentTypeSn(String parentTypeSn) {
        this.parentTypeSn = parentTypeSn;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeSn() {
        return typeSn;
    }

    public void setTypeSn(String typeSn) {
        this.typeSn = typeSn;
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
        BookType other = (BookType) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIsHot() == null ? other.getIsHot() == null : this.getIsHot().equals(other.getIsHot()))
            && (this.getParentTypeSn() == null ? other.getParentTypeSn() == null : this.getParentTypeSn().equals(other.getParentTypeSn()))
            && (this.getTypeName() == null ? other.getTypeName() == null : this.getTypeName().equals(other.getTypeName()))
            && (this.getTypeSn() == null ? other.getTypeSn() == null : this.getTypeSn().equals(other.getTypeSn()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIsHot() == null) ? 0 : getIsHot().hashCode());
        result = prime * result + ((getParentTypeSn() == null) ? 0 : getParentTypeSn().hashCode());
        result = prime * result + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        result = prime * result + ((getTypeSn() == null) ? 0 : getTypeSn().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}