package com.yashebook.domain.po;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
* BookCats
* table:ys_books_cats
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-10 11:51:19
*/
public class BookCats implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 自增ID
     */
    private Integer id;

    /**
     * 父编号
     */
    private String parentSn;

    /**
     * 分类编号
     */
    private String catsSn;

    /**
     * 分类名称
     */
    private String catsName;

    /**
     * 是否显示：0隐藏，1显示
     */
    private Byte isShow;

    /**
     * 排序
     */
    private Integer catsSort;

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
     * @return 父编号
     */
    public String getParentSn() {
        return parentSn;
    }

    /**
     * @param parentSn 
	 *            父编号
     */
    public void setParentSn(String parentSn) {
        this.parentSn = parentSn;
    }

    /**
     * @return 分类编号
     */
    public String getCatsSn() {
        return catsSn;
    }

    /**
     * @param catsSn 
	 *            分类编号
     */
    public void setCatsSn(String catsSn) {
        this.catsSn = catsSn;
    }

    /**
     * @return 分类名称
     */
    public String getCatsName() {
        return catsName;
    }

    /**
     * @param catsName 
	 *            分类名称
     */
    public void setCatsName(String catsName) {
        this.catsName = catsName;
    }

    /**
     * @return 是否显示：0隐藏，1显示
     */
    public Byte getIsShow() {
        return isShow;
    }

    /**
     * @param isShow 
	 *            是否显示：0隐藏，1显示
     */
    public void setIsShow(Byte isShow) {
        this.isShow = isShow;
    }

    /**
     * @return 排序
     */
    public Integer getCatsSort() {
        return catsSort;
    }

    /**
     * @param catsSort 
	 *            排序
     */
    public void setCatsSort(Integer catsSort) {
        this.catsSort = catsSort;
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
        BookCats other = (BookCats) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getParentSn() == null ? other.getParentSn() == null : this.getParentSn().equals(other.getParentSn()))
            && (this.getCatsSn() == null ? other.getCatsSn() == null : this.getCatsSn().equals(other.getCatsSn()))
            && (this.getCatsName() == null ? other.getCatsName() == null : this.getCatsName().equals(other.getCatsName()))
            && (this.getIsShow() == null ? other.getIsShow() == null : this.getIsShow().equals(other.getIsShow()))
            && (this.getCatsSort() == null ? other.getCatsSort() == null : this.getCatsSort().equals(other.getCatsSort()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getParentSn() == null) ? 0 : getParentSn().hashCode());
        result = prime * result + ((getCatsSn() == null) ? 0 : getCatsSn().hashCode());
        result = prime * result + ((getCatsName() == null) ? 0 : getCatsName().hashCode());
        result = prime * result + ((getIsShow() == null) ? 0 : getIsShow().hashCode());
        result = prime * result + ((getCatsSort() == null) ? 0 : getCatsSort().hashCode());
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