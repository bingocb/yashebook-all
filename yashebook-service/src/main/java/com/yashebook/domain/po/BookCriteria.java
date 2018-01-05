package com.yashebook.domain.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
* BookCriteria 条件查询类.
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-05 10:40:00
*/
public class BookCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer mysqlOffset;

    protected Integer mysqlLength;

    public BookCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * @param mysqlOffset 
	 *            指定返回记录行的偏移量<br>
	 *            mysqlOffset= 5,mysqlLength=10;  // 检索记录行 6-15
     */
    public void setMysqlOffset(int mysqlOffset) {
        this.mysqlOffset=mysqlOffset;
    }

    /**
     * @param mysqlLength 
	 *            指定返回记录行的最大数目<br>
	 *            mysqlOffset= 5,mysqlLength=10;  // 检索记录行 6-15
     */
    public Integer getMysqlOffset() {
        return mysqlOffset;
    }

    /**
     * @param mysqlOffset 
	 *            指定返回记录行的偏移量<br>
	 *            mysqlOffset= 5,mysqlLength=10;  // 检索记录行 6-15
     */
    public void setMysqlLength(int mysqlLength) {
        this.mysqlLength=mysqlLength;
    }

    /**
     * @param mysqlLength 
	 *            指定返回记录行的最大数目<br>
	 *            mysqlOffset= 5,mysqlLength=10;  // 检索记录行 6-15
     */
    public Integer getMysqlLength() {
        return mysqlLength;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBooksSnIsNull() {
            addCriterion("books_sn is null");
            return (Criteria) this;
        }

        public Criteria andBooksSnIsNotNull() {
            addCriterion("books_sn is not null");
            return (Criteria) this;
        }

        public Criteria andBooksSnEqualTo(String value) {
            addCriterion("books_sn =", value, "booksSn");
            return (Criteria) this;
        }

        public Criteria andBooksSnNotEqualTo(String value) {
            addCriterion("books_sn <>", value, "booksSn");
            return (Criteria) this;
        }

        public Criteria andBooksSnGreaterThan(String value) {
            addCriterion("books_sn >", value, "booksSn");
            return (Criteria) this;
        }

        public Criteria andBooksSnGreaterThanOrEqualTo(String value) {
            addCriterion("books_sn >=", value, "booksSn");
            return (Criteria) this;
        }

        public Criteria andBooksSnLessThan(String value) {
            addCriterion("books_sn <", value, "booksSn");
            return (Criteria) this;
        }

        public Criteria andBooksSnLessThanOrEqualTo(String value) {
            addCriterion("books_sn <=", value, "booksSn");
            return (Criteria) this;
        }

        public Criteria andBooksSnLike(String value) {
            addCriterion("books_sn like", value, "booksSn");
            return (Criteria) this;
        }

        public Criteria andBooksSnNotLike(String value) {
            addCriterion("books_sn not like", value, "booksSn");
            return (Criteria) this;
        }

        public Criteria andBooksSnIn(List<String> values) {
            addCriterion("books_sn in", values, "booksSn");
            return (Criteria) this;
        }

        public Criteria andBooksSnNotIn(List<String> values) {
            addCriterion("books_sn not in", values, "booksSn");
            return (Criteria) this;
        }

        public Criteria andBooksSnBetween(String value1, String value2) {
            addCriterion("books_sn between", value1, value2, "booksSn");
            return (Criteria) this;
        }

        public Criteria andBooksSnNotBetween(String value1, String value2) {
            addCriterion("books_sn not between", value1, value2, "booksSn");
            return (Criteria) this;
        }

        public Criteria andProductNoIsNull() {
            addCriterion("product_no is null");
            return (Criteria) this;
        }

        public Criteria andProductNoIsNotNull() {
            addCriterion("product_no is not null");
            return (Criteria) this;
        }

        public Criteria andProductNoEqualTo(String value) {
            addCriterion("product_no =", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotEqualTo(String value) {
            addCriterion("product_no <>", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThan(String value) {
            addCriterion("product_no >", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThanOrEqualTo(String value) {
            addCriterion("product_no >=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThan(String value) {
            addCriterion("product_no <", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThanOrEqualTo(String value) {
            addCriterion("product_no <=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLike(String value) {
            addCriterion("product_no like", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotLike(String value) {
            addCriterion("product_no not like", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoIn(List<String> values) {
            addCriterion("product_no in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotIn(List<String> values) {
            addCriterion("product_no not in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoBetween(String value1, String value2) {
            addCriterion("product_no between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotBetween(String value1, String value2) {
            addCriterion("product_no not between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andBooksNameIsNull() {
            addCriterion("books_name is null");
            return (Criteria) this;
        }

        public Criteria andBooksNameIsNotNull() {
            addCriterion("books_name is not null");
            return (Criteria) this;
        }

        public Criteria andBooksNameEqualTo(String value) {
            addCriterion("books_name =", value, "booksName");
            return (Criteria) this;
        }

        public Criteria andBooksNameNotEqualTo(String value) {
            addCriterion("books_name <>", value, "booksName");
            return (Criteria) this;
        }

        public Criteria andBooksNameGreaterThan(String value) {
            addCriterion("books_name >", value, "booksName");
            return (Criteria) this;
        }

        public Criteria andBooksNameGreaterThanOrEqualTo(String value) {
            addCriterion("books_name >=", value, "booksName");
            return (Criteria) this;
        }

        public Criteria andBooksNameLessThan(String value) {
            addCriterion("books_name <", value, "booksName");
            return (Criteria) this;
        }

        public Criteria andBooksNameLessThanOrEqualTo(String value) {
            addCriterion("books_name <=", value, "booksName");
            return (Criteria) this;
        }

        public Criteria andBooksNameLike(String value) {
            addCriterion("books_name like", value, "booksName");
            return (Criteria) this;
        }

        public Criteria andBooksNameNotLike(String value) {
            addCriterion("books_name not like", value, "booksName");
            return (Criteria) this;
        }

        public Criteria andBooksNameIn(List<String> values) {
            addCriterion("books_name in", values, "booksName");
            return (Criteria) this;
        }

        public Criteria andBooksNameNotIn(List<String> values) {
            addCriterion("books_name not in", values, "booksName");
            return (Criteria) this;
        }

        public Criteria andBooksNameBetween(String value1, String value2) {
            addCriterion("books_name between", value1, value2, "booksName");
            return (Criteria) this;
        }

        public Criteria andBooksNameNotBetween(String value1, String value2) {
            addCriterion("books_name not between", value1, value2, "booksName");
            return (Criteria) this;
        }

        public Criteria andBooksImgsIsNull() {
            addCriterion("books_imgs is null");
            return (Criteria) this;
        }

        public Criteria andBooksImgsIsNotNull() {
            addCriterion("books_imgs is not null");
            return (Criteria) this;
        }

        public Criteria andBooksImgsEqualTo(String value) {
            addCriterion("books_imgs =", value, "booksImgs");
            return (Criteria) this;
        }

        public Criteria andBooksImgsNotEqualTo(String value) {
            addCriterion("books_imgs <>", value, "booksImgs");
            return (Criteria) this;
        }

        public Criteria andBooksImgsGreaterThan(String value) {
            addCriterion("books_imgs >", value, "booksImgs");
            return (Criteria) this;
        }

        public Criteria andBooksImgsGreaterThanOrEqualTo(String value) {
            addCriterion("books_imgs >=", value, "booksImgs");
            return (Criteria) this;
        }

        public Criteria andBooksImgsLessThan(String value) {
            addCriterion("books_imgs <", value, "booksImgs");
            return (Criteria) this;
        }

        public Criteria andBooksImgsLessThanOrEqualTo(String value) {
            addCriterion("books_imgs <=", value, "booksImgs");
            return (Criteria) this;
        }

        public Criteria andBooksImgsLike(String value) {
            addCriterion("books_imgs like", value, "booksImgs");
            return (Criteria) this;
        }

        public Criteria andBooksImgsNotLike(String value) {
            addCriterion("books_imgs not like", value, "booksImgs");
            return (Criteria) this;
        }

        public Criteria andBooksImgsIn(List<String> values) {
            addCriterion("books_imgs in", values, "booksImgs");
            return (Criteria) this;
        }

        public Criteria andBooksImgsNotIn(List<String> values) {
            addCriterion("books_imgs not in", values, "booksImgs");
            return (Criteria) this;
        }

        public Criteria andBooksImgsBetween(String value1, String value2) {
            addCriterion("books_imgs between", value1, value2, "booksImgs");
            return (Criteria) this;
        }

        public Criteria andBooksImgsNotBetween(String value1, String value2) {
            addCriterion("books_imgs not between", value1, value2, "booksImgs");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(Integer value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(Integer value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(Integer value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(Integer value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(Integer value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<Integer> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<Integer> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(Integer value1, Integer value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceIsNull() {
            addCriterion("shop_price is null");
            return (Criteria) this;
        }

        public Criteria andShopPriceIsNotNull() {
            addCriterion("shop_price is not null");
            return (Criteria) this;
        }

        public Criteria andShopPriceEqualTo(Integer value) {
            addCriterion("shop_price =", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotEqualTo(Integer value) {
            addCriterion("shop_price <>", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceGreaterThan(Integer value) {
            addCriterion("shop_price >", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_price >=", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceLessThan(Integer value) {
            addCriterion("shop_price <", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceLessThanOrEqualTo(Integer value) {
            addCriterion("shop_price <=", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceIn(List<Integer> values) {
            addCriterion("shop_price in", values, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotIn(List<Integer> values) {
            addCriterion("shop_price not in", values, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceBetween(Integer value1, Integer value2) {
            addCriterion("shop_price between", value1, value2, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_price not between", value1, value2, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andBooksStockIsNull() {
            addCriterion("books_stock is null");
            return (Criteria) this;
        }

        public Criteria andBooksStockIsNotNull() {
            addCriterion("books_stock is not null");
            return (Criteria) this;
        }

        public Criteria andBooksStockEqualTo(Integer value) {
            addCriterion("books_stock =", value, "booksStock");
            return (Criteria) this;
        }

        public Criteria andBooksStockNotEqualTo(Integer value) {
            addCriterion("books_stock <>", value, "booksStock");
            return (Criteria) this;
        }

        public Criteria andBooksStockGreaterThan(Integer value) {
            addCriterion("books_stock >", value, "booksStock");
            return (Criteria) this;
        }

        public Criteria andBooksStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("books_stock >=", value, "booksStock");
            return (Criteria) this;
        }

        public Criteria andBooksStockLessThan(Integer value) {
            addCriterion("books_stock <", value, "booksStock");
            return (Criteria) this;
        }

        public Criteria andBooksStockLessThanOrEqualTo(Integer value) {
            addCriterion("books_stock <=", value, "booksStock");
            return (Criteria) this;
        }

        public Criteria andBooksStockIn(List<Integer> values) {
            addCriterion("books_stock in", values, "booksStock");
            return (Criteria) this;
        }

        public Criteria andBooksStockNotIn(List<Integer> values) {
            addCriterion("books_stock not in", values, "booksStock");
            return (Criteria) this;
        }

        public Criteria andBooksStockBetween(Integer value1, Integer value2) {
            addCriterion("books_stock between", value1, value2, "booksStock");
            return (Criteria) this;
        }

        public Criteria andBooksStockNotBetween(Integer value1, Integer value2) {
            addCriterion("books_stock not between", value1, value2, "booksStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockIsNull() {
            addCriterion("warn_stock is null");
            return (Criteria) this;
        }

        public Criteria andWarnStockIsNotNull() {
            addCriterion("warn_stock is not null");
            return (Criteria) this;
        }

        public Criteria andWarnStockEqualTo(Integer value) {
            addCriterion("warn_stock =", value, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockNotEqualTo(Integer value) {
            addCriterion("warn_stock <>", value, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockGreaterThan(Integer value) {
            addCriterion("warn_stock >", value, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("warn_stock >=", value, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockLessThan(Integer value) {
            addCriterion("warn_stock <", value, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockLessThanOrEqualTo(Integer value) {
            addCriterion("warn_stock <=", value, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockIn(List<Integer> values) {
            addCriterion("warn_stock in", values, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockNotIn(List<Integer> values) {
            addCriterion("warn_stock not in", values, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockBetween(Integer value1, Integer value2) {
            addCriterion("warn_stock between", value1, value2, "warnStock");
            return (Criteria) this;
        }

        public Criteria andWarnStockNotBetween(Integer value1, Integer value2) {
            addCriterion("warn_stock not between", value1, value2, "warnStock");
            return (Criteria) this;
        }

        public Criteria andBooksUtilIsNull() {
            addCriterion("books_util is null");
            return (Criteria) this;
        }

        public Criteria andBooksUtilIsNotNull() {
            addCriterion("books_util is not null");
            return (Criteria) this;
        }

        public Criteria andBooksUtilEqualTo(String value) {
            addCriterion("books_util =", value, "booksUtil");
            return (Criteria) this;
        }

        public Criteria andBooksUtilNotEqualTo(String value) {
            addCriterion("books_util <>", value, "booksUtil");
            return (Criteria) this;
        }

        public Criteria andBooksUtilGreaterThan(String value) {
            addCriterion("books_util >", value, "booksUtil");
            return (Criteria) this;
        }

        public Criteria andBooksUtilGreaterThanOrEqualTo(String value) {
            addCriterion("books_util >=", value, "booksUtil");
            return (Criteria) this;
        }

        public Criteria andBooksUtilLessThan(String value) {
            addCriterion("books_util <", value, "booksUtil");
            return (Criteria) this;
        }

        public Criteria andBooksUtilLessThanOrEqualTo(String value) {
            addCriterion("books_util <=", value, "booksUtil");
            return (Criteria) this;
        }

        public Criteria andBooksUtilLike(String value) {
            addCriterion("books_util like", value, "booksUtil");
            return (Criteria) this;
        }

        public Criteria andBooksUtilNotLike(String value) {
            addCriterion("books_util not like", value, "booksUtil");
            return (Criteria) this;
        }

        public Criteria andBooksUtilIn(List<String> values) {
            addCriterion("books_util in", values, "booksUtil");
            return (Criteria) this;
        }

        public Criteria andBooksUtilNotIn(List<String> values) {
            addCriterion("books_util not in", values, "booksUtil");
            return (Criteria) this;
        }

        public Criteria andBooksUtilBetween(String value1, String value2) {
            addCriterion("books_util between", value1, value2, "booksUtil");
            return (Criteria) this;
        }

        public Criteria andBooksUtilNotBetween(String value1, String value2) {
            addCriterion("books_util not between", value1, value2, "booksUtil");
            return (Criteria) this;
        }

        public Criteria andIsSaleIsNull() {
            addCriterion("is_sale is null");
            return (Criteria) this;
        }

        public Criteria andIsSaleIsNotNull() {
            addCriterion("is_sale is not null");
            return (Criteria) this;
        }

        public Criteria andIsSaleEqualTo(Byte value) {
            addCriterion("is_sale =", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleNotEqualTo(Byte value) {
            addCriterion("is_sale <>", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleGreaterThan(Byte value) {
            addCriterion("is_sale >", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_sale >=", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleLessThan(Byte value) {
            addCriterion("is_sale <", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleLessThanOrEqualTo(Byte value) {
            addCriterion("is_sale <=", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleIn(List<Byte> values) {
            addCriterion("is_sale in", values, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleNotIn(List<Byte> values) {
            addCriterion("is_sale not in", values, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleBetween(Byte value1, Byte value2) {
            addCriterion("is_sale between", value1, value2, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleNotBetween(Byte value1, Byte value2) {
            addCriterion("is_sale not between", value1, value2, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsBestIsNull() {
            addCriterion("is_best is null");
            return (Criteria) this;
        }

        public Criteria andIsBestIsNotNull() {
            addCriterion("is_best is not null");
            return (Criteria) this;
        }

        public Criteria andIsBestEqualTo(Byte value) {
            addCriterion("is_best =", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestNotEqualTo(Byte value) {
            addCriterion("is_best <>", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestGreaterThan(Byte value) {
            addCriterion("is_best >", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_best >=", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestLessThan(Byte value) {
            addCriterion("is_best <", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestLessThanOrEqualTo(Byte value) {
            addCriterion("is_best <=", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestIn(List<Byte> values) {
            addCriterion("is_best in", values, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestNotIn(List<Byte> values) {
            addCriterion("is_best not in", values, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestBetween(Byte value1, Byte value2) {
            addCriterion("is_best between", value1, value2, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestNotBetween(Byte value1, Byte value2) {
            addCriterion("is_best not between", value1, value2, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(Byte value) {
            addCriterion("is_hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(Byte value) {
            addCriterion("is_hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(Byte value) {
            addCriterion("is_hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(Byte value) {
            addCriterion("is_hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(Byte value) {
            addCriterion("is_hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<Byte> values) {
            addCriterion("is_hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<Byte> values) {
            addCriterion("is_hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(Byte value1, Byte value2) {
            addCriterion("is_hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(Byte value1, Byte value2) {
            addCriterion("is_hot not between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNull() {
            addCriterion("is_new is null");
            return (Criteria) this;
        }

        public Criteria andIsNewIsNotNull() {
            addCriterion("is_new is not null");
            return (Criteria) this;
        }

        public Criteria andIsNewEqualTo(Byte value) {
            addCriterion("is_new =", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotEqualTo(Byte value) {
            addCriterion("is_new <>", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThan(Byte value) {
            addCriterion("is_new >", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_new >=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThan(Byte value) {
            addCriterion("is_new <", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewLessThanOrEqualTo(Byte value) {
            addCriterion("is_new <=", value, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewIn(List<Byte> values) {
            addCriterion("is_new in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotIn(List<Byte> values) {
            addCriterion("is_new not in", values, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewBetween(Byte value1, Byte value2) {
            addCriterion("is_new between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsNewNotBetween(Byte value1, Byte value2) {
            addCriterion("is_new not between", value1, value2, "isNew");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNull() {
            addCriterion("is_recommend is null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNotNull() {
            addCriterion("is_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendEqualTo(Byte value) {
            addCriterion("is_recommend =", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotEqualTo(Byte value) {
            addCriterion("is_recommend <>", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThan(Byte value) {
            addCriterion("is_recommend >", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_recommend >=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThan(Byte value) {
            addCriterion("is_recommend <", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThanOrEqualTo(Byte value) {
            addCriterion("is_recommend <=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIn(List<Byte> values) {
            addCriterion("is_recommend in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotIn(List<Byte> values) {
            addCriterion("is_recommend not in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendBetween(Byte value1, Byte value2) {
            addCriterion("is_recommend between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotBetween(Byte value1, Byte value2) {
            addCriterion("is_recommend not between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnPathIsNull() {
            addCriterion("books_catsn_path is null");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnPathIsNotNull() {
            addCriterion("books_catsn_path is not null");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnPathEqualTo(String value) {
            addCriterion("books_catsn_path =", value, "booksCatsnPath");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnPathNotEqualTo(String value) {
            addCriterion("books_catsn_path <>", value, "booksCatsnPath");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnPathGreaterThan(String value) {
            addCriterion("books_catsn_path >", value, "booksCatsnPath");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnPathGreaterThanOrEqualTo(String value) {
            addCriterion("books_catsn_path >=", value, "booksCatsnPath");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnPathLessThan(String value) {
            addCriterion("books_catsn_path <", value, "booksCatsnPath");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnPathLessThanOrEqualTo(String value) {
            addCriterion("books_catsn_path <=", value, "booksCatsnPath");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnPathLike(String value) {
            addCriterion("books_catsn_path like", value, "booksCatsnPath");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnPathNotLike(String value) {
            addCriterion("books_catsn_path not like", value, "booksCatsnPath");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnPathIn(List<String> values) {
            addCriterion("books_catsn_path in", values, "booksCatsnPath");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnPathNotIn(List<String> values) {
            addCriterion("books_catsn_path not in", values, "booksCatsnPath");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnPathBetween(String value1, String value2) {
            addCriterion("books_catsn_path between", value1, value2, "booksCatsnPath");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnPathNotBetween(String value1, String value2) {
            addCriterion("books_catsn_path not between", value1, value2, "booksCatsnPath");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnIsNull() {
            addCriterion("books_catsn is null");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnIsNotNull() {
            addCriterion("books_catsn is not null");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnEqualTo(String value) {
            addCriterion("books_catsn =", value, "booksCatsn");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnNotEqualTo(String value) {
            addCriterion("books_catsn <>", value, "booksCatsn");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnGreaterThan(String value) {
            addCriterion("books_catsn >", value, "booksCatsn");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnGreaterThanOrEqualTo(String value) {
            addCriterion("books_catsn >=", value, "booksCatsn");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnLessThan(String value) {
            addCriterion("books_catsn <", value, "booksCatsn");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnLessThanOrEqualTo(String value) {
            addCriterion("books_catsn <=", value, "booksCatsn");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnLike(String value) {
            addCriterion("books_catsn like", value, "booksCatsn");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnNotLike(String value) {
            addCriterion("books_catsn not like", value, "booksCatsn");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnIn(List<String> values) {
            addCriterion("books_catsn in", values, "booksCatsn");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnNotIn(List<String> values) {
            addCriterion("books_catsn not in", values, "booksCatsn");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnBetween(String value1, String value2) {
            addCriterion("books_catsn between", value1, value2, "booksCatsn");
            return (Criteria) this;
        }

        public Criteria andBooksCatsnNotBetween(String value1, String value2) {
            addCriterion("books_catsn not between", value1, value2, "booksCatsn");
            return (Criteria) this;
        }

        public Criteria andPressSnIsNull() {
            addCriterion("press_sn is null");
            return (Criteria) this;
        }

        public Criteria andPressSnIsNotNull() {
            addCriterion("press_sn is not null");
            return (Criteria) this;
        }

        public Criteria andPressSnEqualTo(String value) {
            addCriterion("press_sn =", value, "pressSn");
            return (Criteria) this;
        }

        public Criteria andPressSnNotEqualTo(String value) {
            addCriterion("press_sn <>", value, "pressSn");
            return (Criteria) this;
        }

        public Criteria andPressSnGreaterThan(String value) {
            addCriterion("press_sn >", value, "pressSn");
            return (Criteria) this;
        }

        public Criteria andPressSnGreaterThanOrEqualTo(String value) {
            addCriterion("press_sn >=", value, "pressSn");
            return (Criteria) this;
        }

        public Criteria andPressSnLessThan(String value) {
            addCriterion("press_sn <", value, "pressSn");
            return (Criteria) this;
        }

        public Criteria andPressSnLessThanOrEqualTo(String value) {
            addCriterion("press_sn <=", value, "pressSn");
            return (Criteria) this;
        }

        public Criteria andPressSnLike(String value) {
            addCriterion("press_sn like", value, "pressSn");
            return (Criteria) this;
        }

        public Criteria andPressSnNotLike(String value) {
            addCriterion("press_sn not like", value, "pressSn");
            return (Criteria) this;
        }

        public Criteria andPressSnIn(List<String> values) {
            addCriterion("press_sn in", values, "pressSn");
            return (Criteria) this;
        }

        public Criteria andPressSnNotIn(List<String> values) {
            addCriterion("press_sn not in", values, "pressSn");
            return (Criteria) this;
        }

        public Criteria andPressSnBetween(String value1, String value2) {
            addCriterion("press_sn between", value1, value2, "pressSn");
            return (Criteria) this;
        }

        public Criteria andPressSnNotBetween(String value1, String value2) {
            addCriterion("press_sn not between", value1, value2, "pressSn");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSaleNumIsNull() {
            addCriterion("sale_num is null");
            return (Criteria) this;
        }

        public Criteria andSaleNumIsNotNull() {
            addCriterion("sale_num is not null");
            return (Criteria) this;
        }

        public Criteria andSaleNumEqualTo(Integer value) {
            addCriterion("sale_num =", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotEqualTo(Integer value) {
            addCriterion("sale_num <>", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumGreaterThan(Integer value) {
            addCriterion("sale_num >", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_num >=", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumLessThan(Integer value) {
            addCriterion("sale_num <", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumLessThanOrEqualTo(Integer value) {
            addCriterion("sale_num <=", value, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumIn(List<Integer> values) {
            addCriterion("sale_num in", values, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotIn(List<Integer> values) {
            addCriterion("sale_num not in", values, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumBetween(Integer value1, Integer value2) {
            addCriterion("sale_num between", value1, value2, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_num not between", value1, value2, "saleNum");
            return (Criteria) this;
        }

        public Criteria andSaleTimeIsNull() {
            addCriterion("sale_time is null");
            return (Criteria) this;
        }

        public Criteria andSaleTimeIsNotNull() {
            addCriterion("sale_time is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTimeEqualTo(Date value) {
            addCriterion("sale_time =", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeNotEqualTo(Date value) {
            addCriterion("sale_time <>", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeGreaterThan(Date value) {
            addCriterion("sale_time >", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sale_time >=", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeLessThan(Date value) {
            addCriterion("sale_time <", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeLessThanOrEqualTo(Date value) {
            addCriterion("sale_time <=", value, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeIn(List<Date> values) {
            addCriterion("sale_time in", values, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeNotIn(List<Date> values) {
            addCriterion("sale_time not in", values, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeBetween(Date value1, Date value2) {
            addCriterion("sale_time between", value1, value2, "saleTime");
            return (Criteria) this;
        }

        public Criteria andSaleTimeNotBetween(Date value1, Date value2) {
            addCriterion("sale_time not between", value1, value2, "saleTime");
            return (Criteria) this;
        }

        public Criteria andVisitNumIsNull() {
            addCriterion("visit_num is null");
            return (Criteria) this;
        }

        public Criteria andVisitNumIsNotNull() {
            addCriterion("visit_num is not null");
            return (Criteria) this;
        }

        public Criteria andVisitNumEqualTo(Integer value) {
            addCriterion("visit_num =", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumNotEqualTo(Integer value) {
            addCriterion("visit_num <>", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumGreaterThan(Integer value) {
            addCriterion("visit_num >", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("visit_num >=", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumLessThan(Integer value) {
            addCriterion("visit_num <", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumLessThanOrEqualTo(Integer value) {
            addCriterion("visit_num <=", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumIn(List<Integer> values) {
            addCriterion("visit_num in", values, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumNotIn(List<Integer> values) {
            addCriterion("visit_num not in", values, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumBetween(Integer value1, Integer value2) {
            addCriterion("visit_num between", value1, value2, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumNotBetween(Integer value1, Integer value2) {
            addCriterion("visit_num not between", value1, value2, "visitNum");
            return (Criteria) this;
        }

        public Criteria andAppraiseNumIsNull() {
            addCriterion("appraise_num is null");
            return (Criteria) this;
        }

        public Criteria andAppraiseNumIsNotNull() {
            addCriterion("appraise_num is not null");
            return (Criteria) this;
        }

        public Criteria andAppraiseNumEqualTo(Integer value) {
            addCriterion("appraise_num =", value, "appraiseNum");
            return (Criteria) this;
        }

        public Criteria andAppraiseNumNotEqualTo(Integer value) {
            addCriterion("appraise_num <>", value, "appraiseNum");
            return (Criteria) this;
        }

        public Criteria andAppraiseNumGreaterThan(Integer value) {
            addCriterion("appraise_num >", value, "appraiseNum");
            return (Criteria) this;
        }

        public Criteria andAppraiseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("appraise_num >=", value, "appraiseNum");
            return (Criteria) this;
        }

        public Criteria andAppraiseNumLessThan(Integer value) {
            addCriterion("appraise_num <", value, "appraiseNum");
            return (Criteria) this;
        }

        public Criteria andAppraiseNumLessThanOrEqualTo(Integer value) {
            addCriterion("appraise_num <=", value, "appraiseNum");
            return (Criteria) this;
        }

        public Criteria andAppraiseNumIn(List<Integer> values) {
            addCriterion("appraise_num in", values, "appraiseNum");
            return (Criteria) this;
        }

        public Criteria andAppraiseNumNotIn(List<Integer> values) {
            addCriterion("appraise_num not in", values, "appraiseNum");
            return (Criteria) this;
        }

        public Criteria andAppraiseNumBetween(Integer value1, Integer value2) {
            addCriterion("appraise_num between", value1, value2, "appraiseNum");
            return (Criteria) this;
        }

        public Criteria andAppraiseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("appraise_num not between", value1, value2, "appraiseNum");
            return (Criteria) this;
        }

        public Criteria andBooksSearchKeywordsIsNull() {
            addCriterion("books_search_keywords is null");
            return (Criteria) this;
        }

        public Criteria andBooksSearchKeywordsIsNotNull() {
            addCriterion("books_search_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andBooksSearchKeywordsEqualTo(String value) {
            addCriterion("books_search_keywords =", value, "booksSearchKeywords");
            return (Criteria) this;
        }

        public Criteria andBooksSearchKeywordsNotEqualTo(String value) {
            addCriterion("books_search_keywords <>", value, "booksSearchKeywords");
            return (Criteria) this;
        }

        public Criteria andBooksSearchKeywordsGreaterThan(String value) {
            addCriterion("books_search_keywords >", value, "booksSearchKeywords");
            return (Criteria) this;
        }

        public Criteria andBooksSearchKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("books_search_keywords >=", value, "booksSearchKeywords");
            return (Criteria) this;
        }

        public Criteria andBooksSearchKeywordsLessThan(String value) {
            addCriterion("books_search_keywords <", value, "booksSearchKeywords");
            return (Criteria) this;
        }

        public Criteria andBooksSearchKeywordsLessThanOrEqualTo(String value) {
            addCriterion("books_search_keywords <=", value, "booksSearchKeywords");
            return (Criteria) this;
        }

        public Criteria andBooksSearchKeywordsLike(String value) {
            addCriterion("books_search_keywords like", value, "booksSearchKeywords");
            return (Criteria) this;
        }

        public Criteria andBooksSearchKeywordsNotLike(String value) {
            addCriterion("books_search_keywords not like", value, "booksSearchKeywords");
            return (Criteria) this;
        }

        public Criteria andBooksSearchKeywordsIn(List<String> values) {
            addCriterion("books_search_keywords in", values, "booksSearchKeywords");
            return (Criteria) this;
        }

        public Criteria andBooksSearchKeywordsNotIn(List<String> values) {
            addCriterion("books_search_keywords not in", values, "booksSearchKeywords");
            return (Criteria) this;
        }

        public Criteria andBooksSearchKeywordsBetween(String value1, String value2) {
            addCriterion("books_search_keywords between", value1, value2, "booksSearchKeywords");
            return (Criteria) this;
        }

        public Criteria andBooksSearchKeywordsNotBetween(String value1, String value2) {
            addCriterion("books_search_keywords not between", value1, value2, "booksSearchKeywords");
            return (Criteria) this;
        }

        public Criteria andIllegalRemarksIsNull() {
            addCriterion("illegal_remarks is null");
            return (Criteria) this;
        }

        public Criteria andIllegalRemarksIsNotNull() {
            addCriterion("illegal_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andIllegalRemarksEqualTo(String value) {
            addCriterion("illegal_remarks =", value, "illegalRemarks");
            return (Criteria) this;
        }

        public Criteria andIllegalRemarksNotEqualTo(String value) {
            addCriterion("illegal_remarks <>", value, "illegalRemarks");
            return (Criteria) this;
        }

        public Criteria andIllegalRemarksGreaterThan(String value) {
            addCriterion("illegal_remarks >", value, "illegalRemarks");
            return (Criteria) this;
        }

        public Criteria andIllegalRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("illegal_remarks >=", value, "illegalRemarks");
            return (Criteria) this;
        }

        public Criteria andIllegalRemarksLessThan(String value) {
            addCriterion("illegal_remarks <", value, "illegalRemarks");
            return (Criteria) this;
        }

        public Criteria andIllegalRemarksLessThanOrEqualTo(String value) {
            addCriterion("illegal_remarks <=", value, "illegalRemarks");
            return (Criteria) this;
        }

        public Criteria andIllegalRemarksLike(String value) {
            addCriterion("illegal_remarks like", value, "illegalRemarks");
            return (Criteria) this;
        }

        public Criteria andIllegalRemarksNotLike(String value) {
            addCriterion("illegal_remarks not like", value, "illegalRemarks");
            return (Criteria) this;
        }

        public Criteria andIllegalRemarksIn(List<String> values) {
            addCriterion("illegal_remarks in", values, "illegalRemarks");
            return (Criteria) this;
        }

        public Criteria andIllegalRemarksNotIn(List<String> values) {
            addCriterion("illegal_remarks not in", values, "illegalRemarks");
            return (Criteria) this;
        }

        public Criteria andIllegalRemarksBetween(String value1, String value2) {
            addCriterion("illegal_remarks between", value1, value2, "illegalRemarks");
            return (Criteria) this;
        }

        public Criteria andIllegalRemarksNotBetween(String value1, String value2) {
            addCriterion("illegal_remarks not between", value1, value2, "illegalRemarks");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Byte value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Byte value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Byte value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Byte value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Byte value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Byte> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Byte> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Byte value1, Byte value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andDeteleFlagIsNull() {
            addCriterion("detele_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeteleFlagIsNotNull() {
            addCriterion("detele_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeteleFlagEqualTo(Integer value) {
            addCriterion("detele_flag =", value, "deteleFlag");
            return (Criteria) this;
        }

        public Criteria andDeteleFlagNotEqualTo(Integer value) {
            addCriterion("detele_flag <>", value, "deteleFlag");
            return (Criteria) this;
        }

        public Criteria andDeteleFlagGreaterThan(Integer value) {
            addCriterion("detele_flag >", value, "deteleFlag");
            return (Criteria) this;
        }

        public Criteria andDeteleFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("detele_flag >=", value, "deteleFlag");
            return (Criteria) this;
        }

        public Criteria andDeteleFlagLessThan(Integer value) {
            addCriterion("detele_flag <", value, "deteleFlag");
            return (Criteria) this;
        }

        public Criteria andDeteleFlagLessThanOrEqualTo(Integer value) {
            addCriterion("detele_flag <=", value, "deteleFlag");
            return (Criteria) this;
        }

        public Criteria andDeteleFlagIn(List<Integer> values) {
            addCriterion("detele_flag in", values, "deteleFlag");
            return (Criteria) this;
        }

        public Criteria andDeteleFlagNotIn(List<Integer> values) {
            addCriterion("detele_flag not in", values, "deteleFlag");
            return (Criteria) this;
        }

        public Criteria andDeteleFlagBetween(Integer value1, Integer value2) {
            addCriterion("detele_flag between", value1, value2, "deteleFlag");
            return (Criteria) this;
        }

        public Criteria andDeteleFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("detele_flag not between", value1, value2, "deteleFlag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}