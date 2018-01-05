package com.yashebook.domain.po;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
* Book
* table:ys_books
* 
* @author chenbin
* @version v1.0
* @copy pet
*/
public class BookWithBLOBs extends Book implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 促销信息
     */
    private String booksTips;

    /**
     * 图书相册
     */
    private String gallery;

    /**
     * @return 促销信息
     */
    public String getBooksTips() {
        return booksTips;
    }

    /**
     * @param booksTips 
	 *            促销信息
     */
    public void setBooksTips(String booksTips) {
        this.booksTips = booksTips;
    }

    /**
     * @return 图书相册
     */
    public String getGallery() {
        return gallery;
    }

    /**
     * @param gallery 
	 *            图书相册
     */
    public void setGallery(String gallery) {
        this.gallery = gallery;
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
        BookWithBLOBs other = (BookWithBLOBs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBooksSn() == null ? other.getBooksSn() == null : this.getBooksSn().equals(other.getBooksSn()))
            && (this.getProductNo() == null ? other.getProductNo() == null : this.getProductNo().equals(other.getProductNo()))
            && (this.getBooksName() == null ? other.getBooksName() == null : this.getBooksName().equals(other.getBooksName()))
            && (this.getBooksImgs() == null ? other.getBooksImgs() == null : this.getBooksImgs().equals(other.getBooksImgs()))
            && (this.getMarketPrice() == null ? other.getMarketPrice() == null : this.getMarketPrice().equals(other.getMarketPrice()))
            && (this.getShopPrice() == null ? other.getShopPrice() == null : this.getShopPrice().equals(other.getShopPrice()))
            && (this.getBooksStock() == null ? other.getBooksStock() == null : this.getBooksStock().equals(other.getBooksStock()))
            && (this.getWarnStock() == null ? other.getWarnStock() == null : this.getWarnStock().equals(other.getWarnStock()))
            && (this.getBooksUtil() == null ? other.getBooksUtil() == null : this.getBooksUtil().equals(other.getBooksUtil()))
            && (this.getIsSale() == null ? other.getIsSale() == null : this.getIsSale().equals(other.getIsSale()))
            && (this.getIsBest() == null ? other.getIsBest() == null : this.getIsBest().equals(other.getIsBest()))
            && (this.getIsHot() == null ? other.getIsHot() == null : this.getIsHot().equals(other.getIsHot()))
            && (this.getIsNew() == null ? other.getIsNew() == null : this.getIsNew().equals(other.getIsNew()))
            && (this.getIsRecommend() == null ? other.getIsRecommend() == null : this.getIsRecommend().equals(other.getIsRecommend()))
            && (this.getBooksCatsnPath() == null ? other.getBooksCatsnPath() == null : this.getBooksCatsnPath().equals(other.getBooksCatsnPath()))
            && (this.getBooksCatsn() == null ? other.getBooksCatsn() == null : this.getBooksCatsn().equals(other.getBooksCatsn()))
            && (this.getPressSn() == null ? other.getPressSn() == null : this.getPressSn().equals(other.getPressSn()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSaleNum() == null ? other.getSaleNum() == null : this.getSaleNum().equals(other.getSaleNum()))
            && (this.getSaleTime() == null ? other.getSaleTime() == null : this.getSaleTime().equals(other.getSaleTime()))
            && (this.getVisitNum() == null ? other.getVisitNum() == null : this.getVisitNum().equals(other.getVisitNum()))
            && (this.getAppraiseNum() == null ? other.getAppraiseNum() == null : this.getAppraiseNum().equals(other.getAppraiseNum()))
            && (this.getBooksSearchKeywords() == null ? other.getBooksSearchKeywords() == null : this.getBooksSearchKeywords().equals(other.getBooksSearchKeywords()))
            && (this.getIllegalRemarks() == null ? other.getIllegalRemarks() == null : this.getIllegalRemarks().equals(other.getIllegalRemarks()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDeteleFlag() == null ? other.getDeteleFlag() == null : this.getDeteleFlag().equals(other.getDeteleFlag()))
            && (this.getBooksTips() == null ? other.getBooksTips() == null : this.getBooksTips().equals(other.getBooksTips()))
            && (this.getGallery() == null ? other.getGallery() == null : this.getGallery().equals(other.getGallery()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBooksSn() == null) ? 0 : getBooksSn().hashCode());
        result = prime * result + ((getProductNo() == null) ? 0 : getProductNo().hashCode());
        result = prime * result + ((getBooksName() == null) ? 0 : getBooksName().hashCode());
        result = prime * result + ((getBooksImgs() == null) ? 0 : getBooksImgs().hashCode());
        result = prime * result + ((getMarketPrice() == null) ? 0 : getMarketPrice().hashCode());
        result = prime * result + ((getShopPrice() == null) ? 0 : getShopPrice().hashCode());
        result = prime * result + ((getBooksStock() == null) ? 0 : getBooksStock().hashCode());
        result = prime * result + ((getWarnStock() == null) ? 0 : getWarnStock().hashCode());
        result = prime * result + ((getBooksUtil() == null) ? 0 : getBooksUtil().hashCode());
        result = prime * result + ((getIsSale() == null) ? 0 : getIsSale().hashCode());
        result = prime * result + ((getIsBest() == null) ? 0 : getIsBest().hashCode());
        result = prime * result + ((getIsHot() == null) ? 0 : getIsHot().hashCode());
        result = prime * result + ((getIsNew() == null) ? 0 : getIsNew().hashCode());
        result = prime * result + ((getIsRecommend() == null) ? 0 : getIsRecommend().hashCode());
        result = prime * result + ((getBooksCatsnPath() == null) ? 0 : getBooksCatsnPath().hashCode());
        result = prime * result + ((getBooksCatsn() == null) ? 0 : getBooksCatsn().hashCode());
        result = prime * result + ((getPressSn() == null) ? 0 : getPressSn().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSaleNum() == null) ? 0 : getSaleNum().hashCode());
        result = prime * result + ((getSaleTime() == null) ? 0 : getSaleTime().hashCode());
        result = prime * result + ((getVisitNum() == null) ? 0 : getVisitNum().hashCode());
        result = prime * result + ((getAppraiseNum() == null) ? 0 : getAppraiseNum().hashCode());
        result = prime * result + ((getBooksSearchKeywords() == null) ? 0 : getBooksSearchKeywords().hashCode());
        result = prime * result + ((getIllegalRemarks() == null) ? 0 : getIllegalRemarks().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDeteleFlag() == null) ? 0 : getDeteleFlag().hashCode());
        result = prime * result + ((getBooksTips() == null) ? 0 : getBooksTips().hashCode());
        result = prime * result + ((getGallery() == null) ? 0 : getGallery().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}