package com.yashebook.domain.po;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
* Product
* table:ys_product
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-05 10:40:00
*/
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String coupons;

    private Integer appraiseNum;

    private String basicId;

    private String covers;

    private Date createTime;

    private Integer discount;

    private Double discountPrice;

    private String illegalRemarks;

    private Integer isBest;

    private Integer isDelete;

    private Integer isHot;

    private Integer isRecom;

    private Integer isSale;

    private Double marketPrice;

    private Date modifyTime;

    private String pressId;

    private String productDesc;

    private String productName;

    private String productSn;

    private String productTips;

    private Date saleTime;

    private Integer saleTotal;

    private String searchKeywords;

    private Integer status;

    private Integer stock;

    private String stockUnit;

    private String typeId;

    private String typeIdPath;

    private Integer visitNum;

    private Integer warnStock;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCoupons() {
        return coupons;
    }

    public void setCoupons(String coupons) {
        this.coupons = coupons;
    }

    public Integer getAppraiseNum() {
        return appraiseNum;
    }

    public void setAppraiseNum(Integer appraiseNum) {
        this.appraiseNum = appraiseNum;
    }

    public String getBasicId() {
        return basicId;
    }

    public void setBasicId(String basicId) {
        this.basicId = basicId;
    }

    public String getCovers() {
        return covers;
    }

    public void setCovers(String covers) {
        this.covers = covers;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getIllegalRemarks() {
        return illegalRemarks;
    }

    public void setIllegalRemarks(String illegalRemarks) {
        this.illegalRemarks = illegalRemarks;
    }

    public Integer getIsBest() {
        return isBest;
    }

    public void setIsBest(Integer isBest) {
        this.isBest = isBest;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public Integer getIsRecom() {
        return isRecom;
    }

    public void setIsRecom(Integer isRecom) {
        this.isRecom = isRecom;
    }

    public Integer getIsSale() {
        return isSale;
    }

    public void setIsSale(Integer isSale) {
        this.isSale = isSale;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getPressId() {
        return pressId;
    }

    public void setPressId(String pressId) {
        this.pressId = pressId;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    public String getProductTips() {
        return productTips;
    }

    public void setProductTips(String productTips) {
        this.productTips = productTips;
    }

    public Date getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(Date saleTime) {
        this.saleTime = saleTime;
    }

    public Integer getSaleTotal() {
        return saleTotal;
    }

    public void setSaleTotal(Integer saleTotal) {
        this.saleTotal = saleTotal;
    }

    public String getSearchKeywords() {
        return searchKeywords;
    }

    public void setSearchKeywords(String searchKeywords) {
        this.searchKeywords = searchKeywords;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getStockUnit() {
        return stockUnit;
    }

    public void setStockUnit(String stockUnit) {
        this.stockUnit = stockUnit;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeIdPath() {
        return typeIdPath;
    }

    public void setTypeIdPath(String typeIdPath) {
        this.typeIdPath = typeIdPath;
    }

    public Integer getVisitNum() {
        return visitNum;
    }

    public void setVisitNum(Integer visitNum) {
        this.visitNum = visitNum;
    }

    public Integer getWarnStock() {
        return warnStock;
    }

    public void setWarnStock(Integer warnStock) {
        this.warnStock = warnStock;
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
        Product other = (Product) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCoupons() == null ? other.getCoupons() == null : this.getCoupons().equals(other.getCoupons()))
            && (this.getAppraiseNum() == null ? other.getAppraiseNum() == null : this.getAppraiseNum().equals(other.getAppraiseNum()))
            && (this.getBasicId() == null ? other.getBasicId() == null : this.getBasicId().equals(other.getBasicId()))
            && (this.getCovers() == null ? other.getCovers() == null : this.getCovers().equals(other.getCovers()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getDiscount() == null ? other.getDiscount() == null : this.getDiscount().equals(other.getDiscount()))
            && (this.getDiscountPrice() == null ? other.getDiscountPrice() == null : this.getDiscountPrice().equals(other.getDiscountPrice()))
            && (this.getIllegalRemarks() == null ? other.getIllegalRemarks() == null : this.getIllegalRemarks().equals(other.getIllegalRemarks()))
            && (this.getIsBest() == null ? other.getIsBest() == null : this.getIsBest().equals(other.getIsBest()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()))
            && (this.getIsHot() == null ? other.getIsHot() == null : this.getIsHot().equals(other.getIsHot()))
            && (this.getIsRecom() == null ? other.getIsRecom() == null : this.getIsRecom().equals(other.getIsRecom()))
            && (this.getIsSale() == null ? other.getIsSale() == null : this.getIsSale().equals(other.getIsSale()))
            && (this.getMarketPrice() == null ? other.getMarketPrice() == null : this.getMarketPrice().equals(other.getMarketPrice()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getPressId() == null ? other.getPressId() == null : this.getPressId().equals(other.getPressId()))
            && (this.getProductDesc() == null ? other.getProductDesc() == null : this.getProductDesc().equals(other.getProductDesc()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getProductSn() == null ? other.getProductSn() == null : this.getProductSn().equals(other.getProductSn()))
            && (this.getProductTips() == null ? other.getProductTips() == null : this.getProductTips().equals(other.getProductTips()))
            && (this.getSaleTime() == null ? other.getSaleTime() == null : this.getSaleTime().equals(other.getSaleTime()))
            && (this.getSaleTotal() == null ? other.getSaleTotal() == null : this.getSaleTotal().equals(other.getSaleTotal()))
            && (this.getSearchKeywords() == null ? other.getSearchKeywords() == null : this.getSearchKeywords().equals(other.getSearchKeywords()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getStock() == null ? other.getStock() == null : this.getStock().equals(other.getStock()))
            && (this.getStockUnit() == null ? other.getStockUnit() == null : this.getStockUnit().equals(other.getStockUnit()))
            && (this.getTypeId() == null ? other.getTypeId() == null : this.getTypeId().equals(other.getTypeId()))
            && (this.getTypeIdPath() == null ? other.getTypeIdPath() == null : this.getTypeIdPath().equals(other.getTypeIdPath()))
            && (this.getVisitNum() == null ? other.getVisitNum() == null : this.getVisitNum().equals(other.getVisitNum()))
            && (this.getWarnStock() == null ? other.getWarnStock() == null : this.getWarnStock().equals(other.getWarnStock()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCoupons() == null) ? 0 : getCoupons().hashCode());
        result = prime * result + ((getAppraiseNum() == null) ? 0 : getAppraiseNum().hashCode());
        result = prime * result + ((getBasicId() == null) ? 0 : getBasicId().hashCode());
        result = prime * result + ((getCovers() == null) ? 0 : getCovers().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getDiscount() == null) ? 0 : getDiscount().hashCode());
        result = prime * result + ((getDiscountPrice() == null) ? 0 : getDiscountPrice().hashCode());
        result = prime * result + ((getIllegalRemarks() == null) ? 0 : getIllegalRemarks().hashCode());
        result = prime * result + ((getIsBest() == null) ? 0 : getIsBest().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        result = prime * result + ((getIsHot() == null) ? 0 : getIsHot().hashCode());
        result = prime * result + ((getIsRecom() == null) ? 0 : getIsRecom().hashCode());
        result = prime * result + ((getIsSale() == null) ? 0 : getIsSale().hashCode());
        result = prime * result + ((getMarketPrice() == null) ? 0 : getMarketPrice().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getPressId() == null) ? 0 : getPressId().hashCode());
        result = prime * result + ((getProductDesc() == null) ? 0 : getProductDesc().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getProductSn() == null) ? 0 : getProductSn().hashCode());
        result = prime * result + ((getProductTips() == null) ? 0 : getProductTips().hashCode());
        result = prime * result + ((getSaleTime() == null) ? 0 : getSaleTime().hashCode());
        result = prime * result + ((getSaleTotal() == null) ? 0 : getSaleTotal().hashCode());
        result = prime * result + ((getSearchKeywords() == null) ? 0 : getSearchKeywords().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getStock() == null) ? 0 : getStock().hashCode());
        result = prime * result + ((getStockUnit() == null) ? 0 : getStockUnit().hashCode());
        result = prime * result + ((getTypeId() == null) ? 0 : getTypeId().hashCode());
        result = prime * result + ((getTypeIdPath() == null) ? 0 : getTypeIdPath().hashCode());
        result = prime * result + ((getVisitNum() == null) ? 0 : getVisitNum().hashCode());
        result = prime * result + ((getWarnStock() == null) ? 0 : getWarnStock().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}