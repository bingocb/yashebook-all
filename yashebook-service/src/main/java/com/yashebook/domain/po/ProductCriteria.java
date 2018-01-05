package com.yashebook.domain.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
* ProductCriteria 条件查询类.
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-05 10:40:00
*/
public class ProductCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer mysqlOffset;

    protected Integer mysqlLength;

    public ProductCriteria() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCouponsIsNull() {
            addCriterion("coupons is null");
            return (Criteria) this;
        }

        public Criteria andCouponsIsNotNull() {
            addCriterion("coupons is not null");
            return (Criteria) this;
        }

        public Criteria andCouponsEqualTo(String value) {
            addCriterion("coupons =", value, "coupons");
            return (Criteria) this;
        }

        public Criteria andCouponsNotEqualTo(String value) {
            addCriterion("coupons <>", value, "coupons");
            return (Criteria) this;
        }

        public Criteria andCouponsGreaterThan(String value) {
            addCriterion("coupons >", value, "coupons");
            return (Criteria) this;
        }

        public Criteria andCouponsGreaterThanOrEqualTo(String value) {
            addCriterion("coupons >=", value, "coupons");
            return (Criteria) this;
        }

        public Criteria andCouponsLessThan(String value) {
            addCriterion("coupons <", value, "coupons");
            return (Criteria) this;
        }

        public Criteria andCouponsLessThanOrEqualTo(String value) {
            addCriterion("coupons <=", value, "coupons");
            return (Criteria) this;
        }

        public Criteria andCouponsLike(String value) {
            addCriterion("coupons like", value, "coupons");
            return (Criteria) this;
        }

        public Criteria andCouponsNotLike(String value) {
            addCriterion("coupons not like", value, "coupons");
            return (Criteria) this;
        }

        public Criteria andCouponsIn(List<String> values) {
            addCriterion("coupons in", values, "coupons");
            return (Criteria) this;
        }

        public Criteria andCouponsNotIn(List<String> values) {
            addCriterion("coupons not in", values, "coupons");
            return (Criteria) this;
        }

        public Criteria andCouponsBetween(String value1, String value2) {
            addCriterion("coupons between", value1, value2, "coupons");
            return (Criteria) this;
        }

        public Criteria andCouponsNotBetween(String value1, String value2) {
            addCriterion("coupons not between", value1, value2, "coupons");
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

        public Criteria andBasicIdIsNull() {
            addCriterion("basic_id is null");
            return (Criteria) this;
        }

        public Criteria andBasicIdIsNotNull() {
            addCriterion("basic_id is not null");
            return (Criteria) this;
        }

        public Criteria andBasicIdEqualTo(String value) {
            addCriterion("basic_id =", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdNotEqualTo(String value) {
            addCriterion("basic_id <>", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdGreaterThan(String value) {
            addCriterion("basic_id >", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdGreaterThanOrEqualTo(String value) {
            addCriterion("basic_id >=", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdLessThan(String value) {
            addCriterion("basic_id <", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdLessThanOrEqualTo(String value) {
            addCriterion("basic_id <=", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdLike(String value) {
            addCriterion("basic_id like", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdNotLike(String value) {
            addCriterion("basic_id not like", value, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdIn(List<String> values) {
            addCriterion("basic_id in", values, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdNotIn(List<String> values) {
            addCriterion("basic_id not in", values, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdBetween(String value1, String value2) {
            addCriterion("basic_id between", value1, value2, "basicId");
            return (Criteria) this;
        }

        public Criteria andBasicIdNotBetween(String value1, String value2) {
            addCriterion("basic_id not between", value1, value2, "basicId");
            return (Criteria) this;
        }

        public Criteria andCoversIsNull() {
            addCriterion("covers is null");
            return (Criteria) this;
        }

        public Criteria andCoversIsNotNull() {
            addCriterion("covers is not null");
            return (Criteria) this;
        }

        public Criteria andCoversEqualTo(String value) {
            addCriterion("covers =", value, "covers");
            return (Criteria) this;
        }

        public Criteria andCoversNotEqualTo(String value) {
            addCriterion("covers <>", value, "covers");
            return (Criteria) this;
        }

        public Criteria andCoversGreaterThan(String value) {
            addCriterion("covers >", value, "covers");
            return (Criteria) this;
        }

        public Criteria andCoversGreaterThanOrEqualTo(String value) {
            addCriterion("covers >=", value, "covers");
            return (Criteria) this;
        }

        public Criteria andCoversLessThan(String value) {
            addCriterion("covers <", value, "covers");
            return (Criteria) this;
        }

        public Criteria andCoversLessThanOrEqualTo(String value) {
            addCriterion("covers <=", value, "covers");
            return (Criteria) this;
        }

        public Criteria andCoversLike(String value) {
            addCriterion("covers like", value, "covers");
            return (Criteria) this;
        }

        public Criteria andCoversNotLike(String value) {
            addCriterion("covers not like", value, "covers");
            return (Criteria) this;
        }

        public Criteria andCoversIn(List<String> values) {
            addCriterion("covers in", values, "covers");
            return (Criteria) this;
        }

        public Criteria andCoversNotIn(List<String> values) {
            addCriterion("covers not in", values, "covers");
            return (Criteria) this;
        }

        public Criteria andCoversBetween(String value1, String value2) {
            addCriterion("covers between", value1, value2, "covers");
            return (Criteria) this;
        }

        public Criteria andCoversNotBetween(String value1, String value2) {
            addCriterion("covers not between", value1, value2, "covers");
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

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Integer value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Integer value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Integer value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Integer value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Integer> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Integer> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Integer value1, Integer value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNull() {
            addCriterion("discount_price is null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNotNull() {
            addCriterion("discount_price is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceEqualTo(Double value) {
            addCriterion("discount_price =", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotEqualTo(Double value) {
            addCriterion("discount_price <>", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThan(Double value) {
            addCriterion("discount_price >", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("discount_price >=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThan(Double value) {
            addCriterion("discount_price <", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThanOrEqualTo(Double value) {
            addCriterion("discount_price <=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIn(List<Double> values) {
            addCriterion("discount_price in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotIn(List<Double> values) {
            addCriterion("discount_price not in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceBetween(Double value1, Double value2) {
            addCriterion("discount_price between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotBetween(Double value1, Double value2) {
            addCriterion("discount_price not between", value1, value2, "discountPrice");
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

        public Criteria andIsBestIsNull() {
            addCriterion("is_best is null");
            return (Criteria) this;
        }

        public Criteria andIsBestIsNotNull() {
            addCriterion("is_best is not null");
            return (Criteria) this;
        }

        public Criteria andIsBestEqualTo(Integer value) {
            addCriterion("is_best =", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestNotEqualTo(Integer value) {
            addCriterion("is_best <>", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestGreaterThan(Integer value) {
            addCriterion("is_best >", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_best >=", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestLessThan(Integer value) {
            addCriterion("is_best <", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestLessThanOrEqualTo(Integer value) {
            addCriterion("is_best <=", value, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestIn(List<Integer> values) {
            addCriterion("is_best in", values, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestNotIn(List<Integer> values) {
            addCriterion("is_best not in", values, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestBetween(Integer value1, Integer value2) {
            addCriterion("is_best between", value1, value2, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsBestNotBetween(Integer value1, Integer value2) {
            addCriterion("is_best not between", value1, value2, "isBest");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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

        public Criteria andIsHotEqualTo(Integer value) {
            addCriterion("is_hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(Integer value) {
            addCriterion("is_hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(Integer value) {
            addCriterion("is_hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(Integer value) {
            addCriterion("is_hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(Integer value) {
            addCriterion("is_hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<Integer> values) {
            addCriterion("is_hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<Integer> values) {
            addCriterion("is_hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(Integer value1, Integer value2) {
            addCriterion("is_hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(Integer value1, Integer value2) {
            addCriterion("is_hot not between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsRecomIsNull() {
            addCriterion("is_recom is null");
            return (Criteria) this;
        }

        public Criteria andIsRecomIsNotNull() {
            addCriterion("is_recom is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecomEqualTo(Integer value) {
            addCriterion("is_recom =", value, "isRecom");
            return (Criteria) this;
        }

        public Criteria andIsRecomNotEqualTo(Integer value) {
            addCriterion("is_recom <>", value, "isRecom");
            return (Criteria) this;
        }

        public Criteria andIsRecomGreaterThan(Integer value) {
            addCriterion("is_recom >", value, "isRecom");
            return (Criteria) this;
        }

        public Criteria andIsRecomGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_recom >=", value, "isRecom");
            return (Criteria) this;
        }

        public Criteria andIsRecomLessThan(Integer value) {
            addCriterion("is_recom <", value, "isRecom");
            return (Criteria) this;
        }

        public Criteria andIsRecomLessThanOrEqualTo(Integer value) {
            addCriterion("is_recom <=", value, "isRecom");
            return (Criteria) this;
        }

        public Criteria andIsRecomIn(List<Integer> values) {
            addCriterion("is_recom in", values, "isRecom");
            return (Criteria) this;
        }

        public Criteria andIsRecomNotIn(List<Integer> values) {
            addCriterion("is_recom not in", values, "isRecom");
            return (Criteria) this;
        }

        public Criteria andIsRecomBetween(Integer value1, Integer value2) {
            addCriterion("is_recom between", value1, value2, "isRecom");
            return (Criteria) this;
        }

        public Criteria andIsRecomNotBetween(Integer value1, Integer value2) {
            addCriterion("is_recom not between", value1, value2, "isRecom");
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

        public Criteria andIsSaleEqualTo(Integer value) {
            addCriterion("is_sale =", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleNotEqualTo(Integer value) {
            addCriterion("is_sale <>", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleGreaterThan(Integer value) {
            addCriterion("is_sale >", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_sale >=", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleLessThan(Integer value) {
            addCriterion("is_sale <", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleLessThanOrEqualTo(Integer value) {
            addCriterion("is_sale <=", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleIn(List<Integer> values) {
            addCriterion("is_sale in", values, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleNotIn(List<Integer> values) {
            addCriterion("is_sale not in", values, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleBetween(Integer value1, Integer value2) {
            addCriterion("is_sale between", value1, value2, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleNotBetween(Integer value1, Integer value2) {
            addCriterion("is_sale not between", value1, value2, "isSale");
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

        public Criteria andMarketPriceEqualTo(Double value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(Double value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(Double value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(Double value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(Double value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<Double> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<Double> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(Double value1, Double value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(Double value1, Double value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
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

        public Criteria andPressIdIsNull() {
            addCriterion("press_id is null");
            return (Criteria) this;
        }

        public Criteria andPressIdIsNotNull() {
            addCriterion("press_id is not null");
            return (Criteria) this;
        }

        public Criteria andPressIdEqualTo(String value) {
            addCriterion("press_id =", value, "pressId");
            return (Criteria) this;
        }

        public Criteria andPressIdNotEqualTo(String value) {
            addCriterion("press_id <>", value, "pressId");
            return (Criteria) this;
        }

        public Criteria andPressIdGreaterThan(String value) {
            addCriterion("press_id >", value, "pressId");
            return (Criteria) this;
        }

        public Criteria andPressIdGreaterThanOrEqualTo(String value) {
            addCriterion("press_id >=", value, "pressId");
            return (Criteria) this;
        }

        public Criteria andPressIdLessThan(String value) {
            addCriterion("press_id <", value, "pressId");
            return (Criteria) this;
        }

        public Criteria andPressIdLessThanOrEqualTo(String value) {
            addCriterion("press_id <=", value, "pressId");
            return (Criteria) this;
        }

        public Criteria andPressIdLike(String value) {
            addCriterion("press_id like", value, "pressId");
            return (Criteria) this;
        }

        public Criteria andPressIdNotLike(String value) {
            addCriterion("press_id not like", value, "pressId");
            return (Criteria) this;
        }

        public Criteria andPressIdIn(List<String> values) {
            addCriterion("press_id in", values, "pressId");
            return (Criteria) this;
        }

        public Criteria andPressIdNotIn(List<String> values) {
            addCriterion("press_id not in", values, "pressId");
            return (Criteria) this;
        }

        public Criteria andPressIdBetween(String value1, String value2) {
            addCriterion("press_id between", value1, value2, "pressId");
            return (Criteria) this;
        }

        public Criteria andPressIdNotBetween(String value1, String value2) {
            addCriterion("press_id not between", value1, value2, "pressId");
            return (Criteria) this;
        }

        public Criteria andProductDescIsNull() {
            addCriterion("product_desc is null");
            return (Criteria) this;
        }

        public Criteria andProductDescIsNotNull() {
            addCriterion("product_desc is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescEqualTo(String value) {
            addCriterion("product_desc =", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotEqualTo(String value) {
            addCriterion("product_desc <>", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescGreaterThan(String value) {
            addCriterion("product_desc >", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescGreaterThanOrEqualTo(String value) {
            addCriterion("product_desc >=", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLessThan(String value) {
            addCriterion("product_desc <", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLessThanOrEqualTo(String value) {
            addCriterion("product_desc <=", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLike(String value) {
            addCriterion("product_desc like", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotLike(String value) {
            addCriterion("product_desc not like", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescIn(List<String> values) {
            addCriterion("product_desc in", values, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotIn(List<String> values) {
            addCriterion("product_desc not in", values, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescBetween(String value1, String value2) {
            addCriterion("product_desc between", value1, value2, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotBetween(String value1, String value2) {
            addCriterion("product_desc not between", value1, value2, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductSnIsNull() {
            addCriterion("product_sn is null");
            return (Criteria) this;
        }

        public Criteria andProductSnIsNotNull() {
            addCriterion("product_sn is not null");
            return (Criteria) this;
        }

        public Criteria andProductSnEqualTo(String value) {
            addCriterion("product_sn =", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotEqualTo(String value) {
            addCriterion("product_sn <>", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnGreaterThan(String value) {
            addCriterion("product_sn >", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnGreaterThanOrEqualTo(String value) {
            addCriterion("product_sn >=", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnLessThan(String value) {
            addCriterion("product_sn <", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnLessThanOrEqualTo(String value) {
            addCriterion("product_sn <=", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnLike(String value) {
            addCriterion("product_sn like", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotLike(String value) {
            addCriterion("product_sn not like", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnIn(List<String> values) {
            addCriterion("product_sn in", values, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotIn(List<String> values) {
            addCriterion("product_sn not in", values, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnBetween(String value1, String value2) {
            addCriterion("product_sn between", value1, value2, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotBetween(String value1, String value2) {
            addCriterion("product_sn not between", value1, value2, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductTipsIsNull() {
            addCriterion("product_tips is null");
            return (Criteria) this;
        }

        public Criteria andProductTipsIsNotNull() {
            addCriterion("product_tips is not null");
            return (Criteria) this;
        }

        public Criteria andProductTipsEqualTo(String value) {
            addCriterion("product_tips =", value, "productTips");
            return (Criteria) this;
        }

        public Criteria andProductTipsNotEqualTo(String value) {
            addCriterion("product_tips <>", value, "productTips");
            return (Criteria) this;
        }

        public Criteria andProductTipsGreaterThan(String value) {
            addCriterion("product_tips >", value, "productTips");
            return (Criteria) this;
        }

        public Criteria andProductTipsGreaterThanOrEqualTo(String value) {
            addCriterion("product_tips >=", value, "productTips");
            return (Criteria) this;
        }

        public Criteria andProductTipsLessThan(String value) {
            addCriterion("product_tips <", value, "productTips");
            return (Criteria) this;
        }

        public Criteria andProductTipsLessThanOrEqualTo(String value) {
            addCriterion("product_tips <=", value, "productTips");
            return (Criteria) this;
        }

        public Criteria andProductTipsLike(String value) {
            addCriterion("product_tips like", value, "productTips");
            return (Criteria) this;
        }

        public Criteria andProductTipsNotLike(String value) {
            addCriterion("product_tips not like", value, "productTips");
            return (Criteria) this;
        }

        public Criteria andProductTipsIn(List<String> values) {
            addCriterion("product_tips in", values, "productTips");
            return (Criteria) this;
        }

        public Criteria andProductTipsNotIn(List<String> values) {
            addCriterion("product_tips not in", values, "productTips");
            return (Criteria) this;
        }

        public Criteria andProductTipsBetween(String value1, String value2) {
            addCriterion("product_tips between", value1, value2, "productTips");
            return (Criteria) this;
        }

        public Criteria andProductTipsNotBetween(String value1, String value2) {
            addCriterion("product_tips not between", value1, value2, "productTips");
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

        public Criteria andSaleTotalIsNull() {
            addCriterion("sale_total is null");
            return (Criteria) this;
        }

        public Criteria andSaleTotalIsNotNull() {
            addCriterion("sale_total is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTotalEqualTo(Integer value) {
            addCriterion("sale_total =", value, "saleTotal");
            return (Criteria) this;
        }

        public Criteria andSaleTotalNotEqualTo(Integer value) {
            addCriterion("sale_total <>", value, "saleTotal");
            return (Criteria) this;
        }

        public Criteria andSaleTotalGreaterThan(Integer value) {
            addCriterion("sale_total >", value, "saleTotal");
            return (Criteria) this;
        }

        public Criteria andSaleTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_total >=", value, "saleTotal");
            return (Criteria) this;
        }

        public Criteria andSaleTotalLessThan(Integer value) {
            addCriterion("sale_total <", value, "saleTotal");
            return (Criteria) this;
        }

        public Criteria andSaleTotalLessThanOrEqualTo(Integer value) {
            addCriterion("sale_total <=", value, "saleTotal");
            return (Criteria) this;
        }

        public Criteria andSaleTotalIn(List<Integer> values) {
            addCriterion("sale_total in", values, "saleTotal");
            return (Criteria) this;
        }

        public Criteria andSaleTotalNotIn(List<Integer> values) {
            addCriterion("sale_total not in", values, "saleTotal");
            return (Criteria) this;
        }

        public Criteria andSaleTotalBetween(Integer value1, Integer value2) {
            addCriterion("sale_total between", value1, value2, "saleTotal");
            return (Criteria) this;
        }

        public Criteria andSaleTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_total not between", value1, value2, "saleTotal");
            return (Criteria) this;
        }

        public Criteria andSearchKeywordsIsNull() {
            addCriterion("search_keywords is null");
            return (Criteria) this;
        }

        public Criteria andSearchKeywordsIsNotNull() {
            addCriterion("search_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andSearchKeywordsEqualTo(String value) {
            addCriterion("search_keywords =", value, "searchKeywords");
            return (Criteria) this;
        }

        public Criteria andSearchKeywordsNotEqualTo(String value) {
            addCriterion("search_keywords <>", value, "searchKeywords");
            return (Criteria) this;
        }

        public Criteria andSearchKeywordsGreaterThan(String value) {
            addCriterion("search_keywords >", value, "searchKeywords");
            return (Criteria) this;
        }

        public Criteria andSearchKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("search_keywords >=", value, "searchKeywords");
            return (Criteria) this;
        }

        public Criteria andSearchKeywordsLessThan(String value) {
            addCriterion("search_keywords <", value, "searchKeywords");
            return (Criteria) this;
        }

        public Criteria andSearchKeywordsLessThanOrEqualTo(String value) {
            addCriterion("search_keywords <=", value, "searchKeywords");
            return (Criteria) this;
        }

        public Criteria andSearchKeywordsLike(String value) {
            addCriterion("search_keywords like", value, "searchKeywords");
            return (Criteria) this;
        }

        public Criteria andSearchKeywordsNotLike(String value) {
            addCriterion("search_keywords not like", value, "searchKeywords");
            return (Criteria) this;
        }

        public Criteria andSearchKeywordsIn(List<String> values) {
            addCriterion("search_keywords in", values, "searchKeywords");
            return (Criteria) this;
        }

        public Criteria andSearchKeywordsNotIn(List<String> values) {
            addCriterion("search_keywords not in", values, "searchKeywords");
            return (Criteria) this;
        }

        public Criteria andSearchKeywordsBetween(String value1, String value2) {
            addCriterion("search_keywords between", value1, value2, "searchKeywords");
            return (Criteria) this;
        }

        public Criteria andSearchKeywordsNotBetween(String value1, String value2) {
            addCriterion("search_keywords not between", value1, value2, "searchKeywords");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Integer value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Integer value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Integer value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Integer value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Integer value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Integer> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Integer> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Integer value1, Integer value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Integer value1, Integer value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockUnitIsNull() {
            addCriterion("stock_unit is null");
            return (Criteria) this;
        }

        public Criteria andStockUnitIsNotNull() {
            addCriterion("stock_unit is not null");
            return (Criteria) this;
        }

        public Criteria andStockUnitEqualTo(String value) {
            addCriterion("stock_unit =", value, "stockUnit");
            return (Criteria) this;
        }

        public Criteria andStockUnitNotEqualTo(String value) {
            addCriterion("stock_unit <>", value, "stockUnit");
            return (Criteria) this;
        }

        public Criteria andStockUnitGreaterThan(String value) {
            addCriterion("stock_unit >", value, "stockUnit");
            return (Criteria) this;
        }

        public Criteria andStockUnitGreaterThanOrEqualTo(String value) {
            addCriterion("stock_unit >=", value, "stockUnit");
            return (Criteria) this;
        }

        public Criteria andStockUnitLessThan(String value) {
            addCriterion("stock_unit <", value, "stockUnit");
            return (Criteria) this;
        }

        public Criteria andStockUnitLessThanOrEqualTo(String value) {
            addCriterion("stock_unit <=", value, "stockUnit");
            return (Criteria) this;
        }

        public Criteria andStockUnitLike(String value) {
            addCriterion("stock_unit like", value, "stockUnit");
            return (Criteria) this;
        }

        public Criteria andStockUnitNotLike(String value) {
            addCriterion("stock_unit not like", value, "stockUnit");
            return (Criteria) this;
        }

        public Criteria andStockUnitIn(List<String> values) {
            addCriterion("stock_unit in", values, "stockUnit");
            return (Criteria) this;
        }

        public Criteria andStockUnitNotIn(List<String> values) {
            addCriterion("stock_unit not in", values, "stockUnit");
            return (Criteria) this;
        }

        public Criteria andStockUnitBetween(String value1, String value2) {
            addCriterion("stock_unit between", value1, value2, "stockUnit");
            return (Criteria) this;
        }

        public Criteria andStockUnitNotBetween(String value1, String value2) {
            addCriterion("stock_unit not between", value1, value2, "stockUnit");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(String value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(String value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(String value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(String value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(String value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLike(String value) {
            addCriterion("type_id like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotLike(String value) {
            addCriterion("type_id not like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<String> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<String> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(String value1, String value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(String value1, String value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdPathIsNull() {
            addCriterion("type_id_path is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdPathIsNotNull() {
            addCriterion("type_id_path is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdPathEqualTo(String value) {
            addCriterion("type_id_path =", value, "typeIdPath");
            return (Criteria) this;
        }

        public Criteria andTypeIdPathNotEqualTo(String value) {
            addCriterion("type_id_path <>", value, "typeIdPath");
            return (Criteria) this;
        }

        public Criteria andTypeIdPathGreaterThan(String value) {
            addCriterion("type_id_path >", value, "typeIdPath");
            return (Criteria) this;
        }

        public Criteria andTypeIdPathGreaterThanOrEqualTo(String value) {
            addCriterion("type_id_path >=", value, "typeIdPath");
            return (Criteria) this;
        }

        public Criteria andTypeIdPathLessThan(String value) {
            addCriterion("type_id_path <", value, "typeIdPath");
            return (Criteria) this;
        }

        public Criteria andTypeIdPathLessThanOrEqualTo(String value) {
            addCriterion("type_id_path <=", value, "typeIdPath");
            return (Criteria) this;
        }

        public Criteria andTypeIdPathLike(String value) {
            addCriterion("type_id_path like", value, "typeIdPath");
            return (Criteria) this;
        }

        public Criteria andTypeIdPathNotLike(String value) {
            addCriterion("type_id_path not like", value, "typeIdPath");
            return (Criteria) this;
        }

        public Criteria andTypeIdPathIn(List<String> values) {
            addCriterion("type_id_path in", values, "typeIdPath");
            return (Criteria) this;
        }

        public Criteria andTypeIdPathNotIn(List<String> values) {
            addCriterion("type_id_path not in", values, "typeIdPath");
            return (Criteria) this;
        }

        public Criteria andTypeIdPathBetween(String value1, String value2) {
            addCriterion("type_id_path between", value1, value2, "typeIdPath");
            return (Criteria) this;
        }

        public Criteria andTypeIdPathNotBetween(String value1, String value2) {
            addCriterion("type_id_path not between", value1, value2, "typeIdPath");
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