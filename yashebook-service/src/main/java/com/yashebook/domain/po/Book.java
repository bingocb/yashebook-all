package com.yashebook.domain.po;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
* Book
* table:ys_books
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-05 10:40:00
*/
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 自增ID
     */
    private Integer id;

    /**
     * 图书编号
     */
    private String booksSn;

    /**
     * 商品号
     */
    private String productNo;

    /**
     * 图书名
     */
    private String booksName;

    /**
     * 图书封面地址
     */
    private String booksImgs;

    /**
     * 市场价
     */
    private Integer marketPrice;

    /**
     * 门店价
     */
    private Integer shopPrice;

    /**
     * 图书总库存
     */
    private Integer booksStock;

    /**
     * 预警库存
     */
    private Integer warnStock;

    /**
     * 单位：本、套、箱
     */
    private String booksUtil;

    /**
     * 是否上架：0不上架，1上架
     */
    private Byte isSale;

    /**
     * 是否精品：0否，1是
     */
    private Byte isBest;

    /**
     * 是否热销：0否，1是
     */
    private Byte isHot;

    /**
     * 是否新品：0否，1是
     */
    private Byte isNew;

    /**
     * 是否推荐：0否，1是
     */
    private Byte isRecommend;

    /**
     * 图书三级分类编号路径
     */
    private String booksCatsnPath;

    /**
     * 图书末端分类编号
     */
    private String booksCatsn;

    /**
     * 出版社编号
     */
    private String pressSn;

    /**
     * 状态：-1违规，0未审核，1已审核
     */
    private Byte status;

    /**
     * 销售量
     */
    private Integer saleNum;

    /**
     * 上架时间
     */
    private Date saleTime;

    /**
     * 访问量
     */
    private Integer visitNum;

    /**
     * 评价数量
     */
    private Integer appraiseNum;

    /**
     * 图书搜索关键字，搜索系统使用
     */
    private String booksSearchKeywords;

    /**
     * 状态说明，一般用于审核流程中各阶段说明
     */
    private String illegalRemarks;

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

    private Integer deteleFlag;

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
     * @return 图书编号
     */
    public String getBooksSn() {
        return booksSn;
    }

    /**
     * @param booksSn 
	 *            图书编号
     */
    public void setBooksSn(String booksSn) {
        this.booksSn = booksSn;
    }

    /**
     * @return 商品号
     */
    public String getProductNo() {
        return productNo;
    }

    /**
     * @param productNo 
	 *            商品号
     */
    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    /**
     * @return 图书名
     */
    public String getBooksName() {
        return booksName;
    }

    /**
     * @param booksName 
	 *            图书名
     */
    public void setBooksName(String booksName) {
        this.booksName = booksName;
    }

    /**
     * @return 图书封面地址
     */
    public String getBooksImgs() {
        return booksImgs;
    }

    /**
     * @param booksImgs 
	 *            图书封面地址
     */
    public void setBooksImgs(String booksImgs) {
        this.booksImgs = booksImgs;
    }

    /**
     * @return 市场价
     */
    public Integer getMarketPrice() {
        return marketPrice;
    }

    /**
     * @param marketPrice 
	 *            市场价
     */
    public void setMarketPrice(Integer marketPrice) {
        this.marketPrice = marketPrice;
    }

    /**
     * @return 门店价
     */
    public Integer getShopPrice() {
        return shopPrice;
    }

    /**
     * @param shopPrice 
	 *            门店价
     */
    public void setShopPrice(Integer shopPrice) {
        this.shopPrice = shopPrice;
    }

    /**
     * @return 图书总库存
     */
    public Integer getBooksStock() {
        return booksStock;
    }

    /**
     * @param booksStock 
	 *            图书总库存
     */
    public void setBooksStock(Integer booksStock) {
        this.booksStock = booksStock;
    }

    /**
     * @return 预警库存
     */
    public Integer getWarnStock() {
        return warnStock;
    }

    /**
     * @param warnStock 
	 *            预警库存
     */
    public void setWarnStock(Integer warnStock) {
        this.warnStock = warnStock;
    }

    /**
     * @return 单位：本、套、箱
     */
    public String getBooksUtil() {
        return booksUtil;
    }

    /**
     * @param booksUtil 
	 *            单位：本、套、箱
     */
    public void setBooksUtil(String booksUtil) {
        this.booksUtil = booksUtil;
    }

    /**
     * @return 是否上架：0不上架，1上架
     */
    public Byte getIsSale() {
        return isSale;
    }

    /**
     * @param isSale 
	 *            是否上架：0不上架，1上架
     */
    public void setIsSale(Byte isSale) {
        this.isSale = isSale;
    }

    /**
     * @return 是否精品：0否，1是
     */
    public Byte getIsBest() {
        return isBest;
    }

    /**
     * @param isBest 
	 *            是否精品：0否，1是
     */
    public void setIsBest(Byte isBest) {
        this.isBest = isBest;
    }

    /**
     * @return 是否热销：0否，1是
     */
    public Byte getIsHot() {
        return isHot;
    }

    /**
     * @param isHot 
	 *            是否热销：0否，1是
     */
    public void setIsHot(Byte isHot) {
        this.isHot = isHot;
    }

    /**
     * @return 是否新品：0否，1是
     */
    public Byte getIsNew() {
        return isNew;
    }

    /**
     * @param isNew 
	 *            是否新品：0否，1是
     */
    public void setIsNew(Byte isNew) {
        this.isNew = isNew;
    }

    /**
     * @return 是否推荐：0否，1是
     */
    public Byte getIsRecommend() {
        return isRecommend;
    }

    /**
     * @param isRecommend 
	 *            是否推荐：0否，1是
     */
    public void setIsRecommend(Byte isRecommend) {
        this.isRecommend = isRecommend;
    }

    /**
     * @return 图书三级分类编号路径
     */
    public String getBooksCatsnPath() {
        return booksCatsnPath;
    }

    /**
     * @param booksCatsnPath 
	 *            图书三级分类编号路径
     */
    public void setBooksCatsnPath(String booksCatsnPath) {
        this.booksCatsnPath = booksCatsnPath;
    }

    /**
     * @return 图书末端分类编号
     */
    public String getBooksCatsn() {
        return booksCatsn;
    }

    /**
     * @param booksCatsn 
	 *            图书末端分类编号
     */
    public void setBooksCatsn(String booksCatsn) {
        this.booksCatsn = booksCatsn;
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
     * @return 状态：-1违规，0未审核，1已审核
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * @param status 
	 *            状态：-1违规，0未审核，1已审核
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * @return 销售量
     */
    public Integer getSaleNum() {
        return saleNum;
    }

    /**
     * @param saleNum 
	 *            销售量
     */
    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    /**
     * @return 上架时间
     */
    public Date getSaleTime() {
        return saleTime;
    }

    /**
     * @param saleTime 
	 *            上架时间
     */
    public void setSaleTime(Date saleTime) {
        this.saleTime = saleTime;
    }

    /**
     * @return 访问量
     */
    public Integer getVisitNum() {
        return visitNum;
    }

    /**
     * @param visitNum 
	 *            访问量
     */
    public void setVisitNum(Integer visitNum) {
        this.visitNum = visitNum;
    }

    /**
     * @return 评价数量
     */
    public Integer getAppraiseNum() {
        return appraiseNum;
    }

    /**
     * @param appraiseNum 
	 *            评价数量
     */
    public void setAppraiseNum(Integer appraiseNum) {
        this.appraiseNum = appraiseNum;
    }

    /**
     * @return 图书搜索关键字，搜索系统使用
     */
    public String getBooksSearchKeywords() {
        return booksSearchKeywords;
    }

    /**
     * @param booksSearchKeywords 
	 *            图书搜索关键字，搜索系统使用
     */
    public void setBooksSearchKeywords(String booksSearchKeywords) {
        this.booksSearchKeywords = booksSearchKeywords;
    }

    /**
     * @return 状态说明，一般用于审核流程中各阶段说明
     */
    public String getIllegalRemarks() {
        return illegalRemarks;
    }

    /**
     * @param illegalRemarks 
	 *            状态说明，一般用于审核流程中各阶段说明
     */
    public void setIllegalRemarks(String illegalRemarks) {
        this.illegalRemarks = illegalRemarks;
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

    public Integer getDeteleFlag() {
        return deteleFlag;
    }

    public void setDeteleFlag(Integer deteleFlag) {
        this.deteleFlag = deteleFlag;
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
        Book other = (Book) that;
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
            && (this.getDeteleFlag() == null ? other.getDeteleFlag() == null : this.getDeteleFlag().equals(other.getDeteleFlag()));
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
        return result;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}