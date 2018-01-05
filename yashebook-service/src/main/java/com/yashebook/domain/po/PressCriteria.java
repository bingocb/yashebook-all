package com.yashebook.domain.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
* PressCriteria 条件查询类.
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-05 10:40:00
*/
public class PressCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer mysqlOffset;

    protected Integer mysqlLength;

    public PressCriteria() {
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

        public Criteria andPressNameIsNull() {
            addCriterion("press_name is null");
            return (Criteria) this;
        }

        public Criteria andPressNameIsNotNull() {
            addCriterion("press_name is not null");
            return (Criteria) this;
        }

        public Criteria andPressNameEqualTo(String value) {
            addCriterion("press_name =", value, "pressName");
            return (Criteria) this;
        }

        public Criteria andPressNameNotEqualTo(String value) {
            addCriterion("press_name <>", value, "pressName");
            return (Criteria) this;
        }

        public Criteria andPressNameGreaterThan(String value) {
            addCriterion("press_name >", value, "pressName");
            return (Criteria) this;
        }

        public Criteria andPressNameGreaterThanOrEqualTo(String value) {
            addCriterion("press_name >=", value, "pressName");
            return (Criteria) this;
        }

        public Criteria andPressNameLessThan(String value) {
            addCriterion("press_name <", value, "pressName");
            return (Criteria) this;
        }

        public Criteria andPressNameLessThanOrEqualTo(String value) {
            addCriterion("press_name <=", value, "pressName");
            return (Criteria) this;
        }

        public Criteria andPressNameLike(String value) {
            addCriterion("press_name like", value, "pressName");
            return (Criteria) this;
        }

        public Criteria andPressNameNotLike(String value) {
            addCriterion("press_name not like", value, "pressName");
            return (Criteria) this;
        }

        public Criteria andPressNameIn(List<String> values) {
            addCriterion("press_name in", values, "pressName");
            return (Criteria) this;
        }

        public Criteria andPressNameNotIn(List<String> values) {
            addCriterion("press_name not in", values, "pressName");
            return (Criteria) this;
        }

        public Criteria andPressNameBetween(String value1, String value2) {
            addCriterion("press_name between", value1, value2, "pressName");
            return (Criteria) this;
        }

        public Criteria andPressNameNotBetween(String value1, String value2) {
            addCriterion("press_name not between", value1, value2, "pressName");
            return (Criteria) this;
        }

        public Criteria andPressImgsIsNull() {
            addCriterion("press_imgs is null");
            return (Criteria) this;
        }

        public Criteria andPressImgsIsNotNull() {
            addCriterion("press_imgs is not null");
            return (Criteria) this;
        }

        public Criteria andPressImgsEqualTo(String value) {
            addCriterion("press_imgs =", value, "pressImgs");
            return (Criteria) this;
        }

        public Criteria andPressImgsNotEqualTo(String value) {
            addCriterion("press_imgs <>", value, "pressImgs");
            return (Criteria) this;
        }

        public Criteria andPressImgsGreaterThan(String value) {
            addCriterion("press_imgs >", value, "pressImgs");
            return (Criteria) this;
        }

        public Criteria andPressImgsGreaterThanOrEqualTo(String value) {
            addCriterion("press_imgs >=", value, "pressImgs");
            return (Criteria) this;
        }

        public Criteria andPressImgsLessThan(String value) {
            addCriterion("press_imgs <", value, "pressImgs");
            return (Criteria) this;
        }

        public Criteria andPressImgsLessThanOrEqualTo(String value) {
            addCriterion("press_imgs <=", value, "pressImgs");
            return (Criteria) this;
        }

        public Criteria andPressImgsLike(String value) {
            addCriterion("press_imgs like", value, "pressImgs");
            return (Criteria) this;
        }

        public Criteria andPressImgsNotLike(String value) {
            addCriterion("press_imgs not like", value, "pressImgs");
            return (Criteria) this;
        }

        public Criteria andPressImgsIn(List<String> values) {
            addCriterion("press_imgs in", values, "pressImgs");
            return (Criteria) this;
        }

        public Criteria andPressImgsNotIn(List<String> values) {
            addCriterion("press_imgs not in", values, "pressImgs");
            return (Criteria) this;
        }

        public Criteria andPressImgsBetween(String value1, String value2) {
            addCriterion("press_imgs between", value1, value2, "pressImgs");
            return (Criteria) this;
        }

        public Criteria andPressImgsNotBetween(String value1, String value2) {
            addCriterion("press_imgs not between", value1, value2, "pressImgs");
            return (Criteria) this;
        }

        public Criteria andPressDescIsNull() {
            addCriterion("press_desc is null");
            return (Criteria) this;
        }

        public Criteria andPressDescIsNotNull() {
            addCriterion("press_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPressDescEqualTo(String value) {
            addCriterion("press_desc =", value, "pressDesc");
            return (Criteria) this;
        }

        public Criteria andPressDescNotEqualTo(String value) {
            addCriterion("press_desc <>", value, "pressDesc");
            return (Criteria) this;
        }

        public Criteria andPressDescGreaterThan(String value) {
            addCriterion("press_desc >", value, "pressDesc");
            return (Criteria) this;
        }

        public Criteria andPressDescGreaterThanOrEqualTo(String value) {
            addCriterion("press_desc >=", value, "pressDesc");
            return (Criteria) this;
        }

        public Criteria andPressDescLessThan(String value) {
            addCriterion("press_desc <", value, "pressDesc");
            return (Criteria) this;
        }

        public Criteria andPressDescLessThanOrEqualTo(String value) {
            addCriterion("press_desc <=", value, "pressDesc");
            return (Criteria) this;
        }

        public Criteria andPressDescLike(String value) {
            addCriterion("press_desc like", value, "pressDesc");
            return (Criteria) this;
        }

        public Criteria andPressDescNotLike(String value) {
            addCriterion("press_desc not like", value, "pressDesc");
            return (Criteria) this;
        }

        public Criteria andPressDescIn(List<String> values) {
            addCriterion("press_desc in", values, "pressDesc");
            return (Criteria) this;
        }

        public Criteria andPressDescNotIn(List<String> values) {
            addCriterion("press_desc not in", values, "pressDesc");
            return (Criteria) this;
        }

        public Criteria andPressDescBetween(String value1, String value2) {
            addCriterion("press_desc between", value1, value2, "pressDesc");
            return (Criteria) this;
        }

        public Criteria andPressDescNotBetween(String value1, String value2) {
            addCriterion("press_desc not between", value1, value2, "pressDesc");
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