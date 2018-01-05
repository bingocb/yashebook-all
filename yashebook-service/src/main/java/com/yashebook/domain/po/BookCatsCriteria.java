package com.yashebook.domain.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
* BookCatsCriteria 条件查询类.
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-05 10:40:00
*/
public class BookCatsCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer mysqlOffset;

    protected Integer mysqlLength;

    public BookCatsCriteria() {
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

        public Criteria andParentSnIsNull() {
            addCriterion("parent_sn is null");
            return (Criteria) this;
        }

        public Criteria andParentSnIsNotNull() {
            addCriterion("parent_sn is not null");
            return (Criteria) this;
        }

        public Criteria andParentSnEqualTo(String value) {
            addCriterion("parent_sn =", value, "parentSn");
            return (Criteria) this;
        }

        public Criteria andParentSnNotEqualTo(String value) {
            addCriterion("parent_sn <>", value, "parentSn");
            return (Criteria) this;
        }

        public Criteria andParentSnGreaterThan(String value) {
            addCriterion("parent_sn >", value, "parentSn");
            return (Criteria) this;
        }

        public Criteria andParentSnGreaterThanOrEqualTo(String value) {
            addCriterion("parent_sn >=", value, "parentSn");
            return (Criteria) this;
        }

        public Criteria andParentSnLessThan(String value) {
            addCriterion("parent_sn <", value, "parentSn");
            return (Criteria) this;
        }

        public Criteria andParentSnLessThanOrEqualTo(String value) {
            addCriterion("parent_sn <=", value, "parentSn");
            return (Criteria) this;
        }

        public Criteria andParentSnLike(String value) {
            addCriterion("parent_sn like", value, "parentSn");
            return (Criteria) this;
        }

        public Criteria andParentSnNotLike(String value) {
            addCriterion("parent_sn not like", value, "parentSn");
            return (Criteria) this;
        }

        public Criteria andParentSnIn(List<String> values) {
            addCriterion("parent_sn in", values, "parentSn");
            return (Criteria) this;
        }

        public Criteria andParentSnNotIn(List<String> values) {
            addCriterion("parent_sn not in", values, "parentSn");
            return (Criteria) this;
        }

        public Criteria andParentSnBetween(String value1, String value2) {
            addCriterion("parent_sn between", value1, value2, "parentSn");
            return (Criteria) this;
        }

        public Criteria andParentSnNotBetween(String value1, String value2) {
            addCriterion("parent_sn not between", value1, value2, "parentSn");
            return (Criteria) this;
        }

        public Criteria andCatsSnIsNull() {
            addCriterion("cats_sn is null");
            return (Criteria) this;
        }

        public Criteria andCatsSnIsNotNull() {
            addCriterion("cats_sn is not null");
            return (Criteria) this;
        }

        public Criteria andCatsSnEqualTo(String value) {
            addCriterion("cats_sn =", value, "catsSn");
            return (Criteria) this;
        }

        public Criteria andCatsSnNotEqualTo(String value) {
            addCriterion("cats_sn <>", value, "catsSn");
            return (Criteria) this;
        }

        public Criteria andCatsSnGreaterThan(String value) {
            addCriterion("cats_sn >", value, "catsSn");
            return (Criteria) this;
        }

        public Criteria andCatsSnGreaterThanOrEqualTo(String value) {
            addCriterion("cats_sn >=", value, "catsSn");
            return (Criteria) this;
        }

        public Criteria andCatsSnLessThan(String value) {
            addCriterion("cats_sn <", value, "catsSn");
            return (Criteria) this;
        }

        public Criteria andCatsSnLessThanOrEqualTo(String value) {
            addCriterion("cats_sn <=", value, "catsSn");
            return (Criteria) this;
        }

        public Criteria andCatsSnLike(String value) {
            addCriterion("cats_sn like", value, "catsSn");
            return (Criteria) this;
        }

        public Criteria andCatsSnNotLike(String value) {
            addCriterion("cats_sn not like", value, "catsSn");
            return (Criteria) this;
        }

        public Criteria andCatsSnIn(List<String> values) {
            addCriterion("cats_sn in", values, "catsSn");
            return (Criteria) this;
        }

        public Criteria andCatsSnNotIn(List<String> values) {
            addCriterion("cats_sn not in", values, "catsSn");
            return (Criteria) this;
        }

        public Criteria andCatsSnBetween(String value1, String value2) {
            addCriterion("cats_sn between", value1, value2, "catsSn");
            return (Criteria) this;
        }

        public Criteria andCatsSnNotBetween(String value1, String value2) {
            addCriterion("cats_sn not between", value1, value2, "catsSn");
            return (Criteria) this;
        }

        public Criteria andCatsNameIsNull() {
            addCriterion("cats_name is null");
            return (Criteria) this;
        }

        public Criteria andCatsNameIsNotNull() {
            addCriterion("cats_name is not null");
            return (Criteria) this;
        }

        public Criteria andCatsNameEqualTo(String value) {
            addCriterion("cats_name =", value, "catsName");
            return (Criteria) this;
        }

        public Criteria andCatsNameNotEqualTo(String value) {
            addCriterion("cats_name <>", value, "catsName");
            return (Criteria) this;
        }

        public Criteria andCatsNameGreaterThan(String value) {
            addCriterion("cats_name >", value, "catsName");
            return (Criteria) this;
        }

        public Criteria andCatsNameGreaterThanOrEqualTo(String value) {
            addCriterion("cats_name >=", value, "catsName");
            return (Criteria) this;
        }

        public Criteria andCatsNameLessThan(String value) {
            addCriterion("cats_name <", value, "catsName");
            return (Criteria) this;
        }

        public Criteria andCatsNameLessThanOrEqualTo(String value) {
            addCriterion("cats_name <=", value, "catsName");
            return (Criteria) this;
        }

        public Criteria andCatsNameLike(String value) {
            addCriterion("cats_name like", value, "catsName");
            return (Criteria) this;
        }

        public Criteria andCatsNameNotLike(String value) {
            addCriterion("cats_name not like", value, "catsName");
            return (Criteria) this;
        }

        public Criteria andCatsNameIn(List<String> values) {
            addCriterion("cats_name in", values, "catsName");
            return (Criteria) this;
        }

        public Criteria andCatsNameNotIn(List<String> values) {
            addCriterion("cats_name not in", values, "catsName");
            return (Criteria) this;
        }

        public Criteria andCatsNameBetween(String value1, String value2) {
            addCriterion("cats_name between", value1, value2, "catsName");
            return (Criteria) this;
        }

        public Criteria andCatsNameNotBetween(String value1, String value2) {
            addCriterion("cats_name not between", value1, value2, "catsName");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Byte value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Byte value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Byte value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Byte value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Byte value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Byte> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Byte> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Byte value1, Byte value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Byte value1, Byte value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andCatsSortIsNull() {
            addCriterion("cats_sort is null");
            return (Criteria) this;
        }

        public Criteria andCatsSortIsNotNull() {
            addCriterion("cats_sort is not null");
            return (Criteria) this;
        }

        public Criteria andCatsSortEqualTo(Integer value) {
            addCriterion("cats_sort =", value, "catsSort");
            return (Criteria) this;
        }

        public Criteria andCatsSortNotEqualTo(Integer value) {
            addCriterion("cats_sort <>", value, "catsSort");
            return (Criteria) this;
        }

        public Criteria andCatsSortGreaterThan(Integer value) {
            addCriterion("cats_sort >", value, "catsSort");
            return (Criteria) this;
        }

        public Criteria andCatsSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("cats_sort >=", value, "catsSort");
            return (Criteria) this;
        }

        public Criteria andCatsSortLessThan(Integer value) {
            addCriterion("cats_sort <", value, "catsSort");
            return (Criteria) this;
        }

        public Criteria andCatsSortLessThanOrEqualTo(Integer value) {
            addCriterion("cats_sort <=", value, "catsSort");
            return (Criteria) this;
        }

        public Criteria andCatsSortIn(List<Integer> values) {
            addCriterion("cats_sort in", values, "catsSort");
            return (Criteria) this;
        }

        public Criteria andCatsSortNotIn(List<Integer> values) {
            addCriterion("cats_sort not in", values, "catsSort");
            return (Criteria) this;
        }

        public Criteria andCatsSortBetween(Integer value1, Integer value2) {
            addCriterion("cats_sort between", value1, value2, "catsSort");
            return (Criteria) this;
        }

        public Criteria andCatsSortNotBetween(Integer value1, Integer value2) {
            addCriterion("cats_sort not between", value1, value2, "catsSort");
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