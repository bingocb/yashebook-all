package com.yashebook.domain.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
* ImagesCriteria 条件查询类.
* 
* @author chenbin
* @version v1.0
* @copy pet
* @date 2018-01-10 11:51:19
*/
public class ImagesCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer mysqlOffset;

    protected Integer mysqlLength;

    public ImagesCriteria() {
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

        public Criteria andDataIdIsNull() {
            addCriterion("data_id is null");
            return (Criteria) this;
        }

        public Criteria andDataIdIsNotNull() {
            addCriterion("data_id is not null");
            return (Criteria) this;
        }

        public Criteria andDataIdEqualTo(String value) {
            addCriterion("data_id =", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotEqualTo(String value) {
            addCriterion("data_id <>", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThan(String value) {
            addCriterion("data_id >", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThanOrEqualTo(String value) {
            addCriterion("data_id >=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThan(String value) {
            addCriterion("data_id <", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThanOrEqualTo(String value) {
            addCriterion("data_id <=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLike(String value) {
            addCriterion("data_id like", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotLike(String value) {
            addCriterion("data_id not like", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdIn(List<String> values) {
            addCriterion("data_id in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotIn(List<String> values) {
            addCriterion("data_id not in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdBetween(String value1, String value2) {
            addCriterion("data_id between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotBetween(String value1, String value2) {
            addCriterion("data_id not between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataTableIsNull() {
            addCriterion("data_table is null");
            return (Criteria) this;
        }

        public Criteria andDataTableIsNotNull() {
            addCriterion("data_table is not null");
            return (Criteria) this;
        }

        public Criteria andDataTableEqualTo(String value) {
            addCriterion("data_table =", value, "dataTable");
            return (Criteria) this;
        }

        public Criteria andDataTableNotEqualTo(String value) {
            addCriterion("data_table <>", value, "dataTable");
            return (Criteria) this;
        }

        public Criteria andDataTableGreaterThan(String value) {
            addCriterion("data_table >", value, "dataTable");
            return (Criteria) this;
        }

        public Criteria andDataTableGreaterThanOrEqualTo(String value) {
            addCriterion("data_table >=", value, "dataTable");
            return (Criteria) this;
        }

        public Criteria andDataTableLessThan(String value) {
            addCriterion("data_table <", value, "dataTable");
            return (Criteria) this;
        }

        public Criteria andDataTableLessThanOrEqualTo(String value) {
            addCriterion("data_table <=", value, "dataTable");
            return (Criteria) this;
        }

        public Criteria andDataTableLike(String value) {
            addCriterion("data_table like", value, "dataTable");
            return (Criteria) this;
        }

        public Criteria andDataTableNotLike(String value) {
            addCriterion("data_table not like", value, "dataTable");
            return (Criteria) this;
        }

        public Criteria andDataTableIn(List<String> values) {
            addCriterion("data_table in", values, "dataTable");
            return (Criteria) this;
        }

        public Criteria andDataTableNotIn(List<String> values) {
            addCriterion("data_table not in", values, "dataTable");
            return (Criteria) this;
        }

        public Criteria andDataTableBetween(String value1, String value2) {
            addCriterion("data_table between", value1, value2, "dataTable");
            return (Criteria) this;
        }

        public Criteria andDataTableNotBetween(String value1, String value2) {
            addCriterion("data_table not between", value1, value2, "dataTable");
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

        public Criteria andDeleteFlagEqualTo(Integer value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Integer value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Integer value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Integer value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Integer value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Integer> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Integer> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Integer value1, Integer value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andImgPathIsNull() {
            addCriterion("img_path is null");
            return (Criteria) this;
        }

        public Criteria andImgPathIsNotNull() {
            addCriterion("img_path is not null");
            return (Criteria) this;
        }

        public Criteria andImgPathEqualTo(String value) {
            addCriterion("img_path =", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathNotEqualTo(String value) {
            addCriterion("img_path <>", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathGreaterThan(String value) {
            addCriterion("img_path >", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathGreaterThanOrEqualTo(String value) {
            addCriterion("img_path >=", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathLessThan(String value) {
            addCriterion("img_path <", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathLessThanOrEqualTo(String value) {
            addCriterion("img_path <=", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathLike(String value) {
            addCriterion("img_path like", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathNotLike(String value) {
            addCriterion("img_path not like", value, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathIn(List<String> values) {
            addCriterion("img_path in", values, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathNotIn(List<String> values) {
            addCriterion("img_path not in", values, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathBetween(String value1, String value2) {
            addCriterion("img_path between", value1, value2, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgPathNotBetween(String value1, String value2) {
            addCriterion("img_path not between", value1, value2, "imgPath");
            return (Criteria) this;
        }

        public Criteria andImgSizeIsNull() {
            addCriterion("img_size is null");
            return (Criteria) this;
        }

        public Criteria andImgSizeIsNotNull() {
            addCriterion("img_size is not null");
            return (Criteria) this;
        }

        public Criteria andImgSizeEqualTo(Integer value) {
            addCriterion("img_size =", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeNotEqualTo(Integer value) {
            addCriterion("img_size <>", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeGreaterThan(Integer value) {
            addCriterion("img_size >", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("img_size >=", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeLessThan(Integer value) {
            addCriterion("img_size <", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeLessThanOrEqualTo(Integer value) {
            addCriterion("img_size <=", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeIn(List<Integer> values) {
            addCriterion("img_size in", values, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeNotIn(List<Integer> values) {
            addCriterion("img_size not in", values, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeBetween(Integer value1, Integer value2) {
            addCriterion("img_size between", value1, value2, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("img_size not between", value1, value2, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSnIsNull() {
            addCriterion("img_sn is null");
            return (Criteria) this;
        }

        public Criteria andImgSnIsNotNull() {
            addCriterion("img_sn is not null");
            return (Criteria) this;
        }

        public Criteria andImgSnEqualTo(String value) {
            addCriterion("img_sn =", value, "imgSn");
            return (Criteria) this;
        }

        public Criteria andImgSnNotEqualTo(String value) {
            addCriterion("img_sn <>", value, "imgSn");
            return (Criteria) this;
        }

        public Criteria andImgSnGreaterThan(String value) {
            addCriterion("img_sn >", value, "imgSn");
            return (Criteria) this;
        }

        public Criteria andImgSnGreaterThanOrEqualTo(String value) {
            addCriterion("img_sn >=", value, "imgSn");
            return (Criteria) this;
        }

        public Criteria andImgSnLessThan(String value) {
            addCriterion("img_sn <", value, "imgSn");
            return (Criteria) this;
        }

        public Criteria andImgSnLessThanOrEqualTo(String value) {
            addCriterion("img_sn <=", value, "imgSn");
            return (Criteria) this;
        }

        public Criteria andImgSnLike(String value) {
            addCriterion("img_sn like", value, "imgSn");
            return (Criteria) this;
        }

        public Criteria andImgSnNotLike(String value) {
            addCriterion("img_sn not like", value, "imgSn");
            return (Criteria) this;
        }

        public Criteria andImgSnIn(List<String> values) {
            addCriterion("img_sn in", values, "imgSn");
            return (Criteria) this;
        }

        public Criteria andImgSnNotIn(List<String> values) {
            addCriterion("img_sn not in", values, "imgSn");
            return (Criteria) this;
        }

        public Criteria andImgSnBetween(String value1, String value2) {
            addCriterion("img_sn between", value1, value2, "imgSn");
            return (Criteria) this;
        }

        public Criteria andImgSnNotBetween(String value1, String value2) {
            addCriterion("img_sn not between", value1, value2, "imgSn");
            return (Criteria) this;
        }

        public Criteria andImgSourceIsNull() {
            addCriterion("img_source is null");
            return (Criteria) this;
        }

        public Criteria andImgSourceIsNotNull() {
            addCriterion("img_source is not null");
            return (Criteria) this;
        }

        public Criteria andImgSourceEqualTo(Integer value) {
            addCriterion("img_source =", value, "imgSource");
            return (Criteria) this;
        }

        public Criteria andImgSourceNotEqualTo(Integer value) {
            addCriterion("img_source <>", value, "imgSource");
            return (Criteria) this;
        }

        public Criteria andImgSourceGreaterThan(Integer value) {
            addCriterion("img_source >", value, "imgSource");
            return (Criteria) this;
        }

        public Criteria andImgSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("img_source >=", value, "imgSource");
            return (Criteria) this;
        }

        public Criteria andImgSourceLessThan(Integer value) {
            addCriterion("img_source <", value, "imgSource");
            return (Criteria) this;
        }

        public Criteria andImgSourceLessThanOrEqualTo(Integer value) {
            addCriterion("img_source <=", value, "imgSource");
            return (Criteria) this;
        }

        public Criteria andImgSourceIn(List<Integer> values) {
            addCriterion("img_source in", values, "imgSource");
            return (Criteria) this;
        }

        public Criteria andImgSourceNotIn(List<Integer> values) {
            addCriterion("img_source not in", values, "imgSource");
            return (Criteria) this;
        }

        public Criteria andImgSourceBetween(Integer value1, Integer value2) {
            addCriterion("img_source between", value1, value2, "imgSource");
            return (Criteria) this;
        }

        public Criteria andImgSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("img_source not between", value1, value2, "imgSource");
            return (Criteria) this;
        }

        public Criteria andIsUsedIsNull() {
            addCriterion("is_used is null");
            return (Criteria) this;
        }

        public Criteria andIsUsedIsNotNull() {
            addCriterion("is_used is not null");
            return (Criteria) this;
        }

        public Criteria andIsUsedEqualTo(Integer value) {
            addCriterion("is_used =", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotEqualTo(Integer value) {
            addCriterion("is_used <>", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedGreaterThan(Integer value) {
            addCriterion("is_used >", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_used >=", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedLessThan(Integer value) {
            addCriterion("is_used <", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedLessThanOrEqualTo(Integer value) {
            addCriterion("is_used <=", value, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedIn(List<Integer> values) {
            addCriterion("is_used in", values, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotIn(List<Integer> values) {
            addCriterion("is_used not in", values, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedBetween(Integer value1, Integer value2) {
            addCriterion("is_used between", value1, value2, "isUsed");
            return (Criteria) this;
        }

        public Criteria andIsUsedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_used not between", value1, value2, "isUsed");
            return (Criteria) this;
        }

        public Criteria andOwnIdIsNull() {
            addCriterion("own_id is null");
            return (Criteria) this;
        }

        public Criteria andOwnIdIsNotNull() {
            addCriterion("own_id is not null");
            return (Criteria) this;
        }

        public Criteria andOwnIdEqualTo(String value) {
            addCriterion("own_id =", value, "ownId");
            return (Criteria) this;
        }

        public Criteria andOwnIdNotEqualTo(String value) {
            addCriterion("own_id <>", value, "ownId");
            return (Criteria) this;
        }

        public Criteria andOwnIdGreaterThan(String value) {
            addCriterion("own_id >", value, "ownId");
            return (Criteria) this;
        }

        public Criteria andOwnIdGreaterThanOrEqualTo(String value) {
            addCriterion("own_id >=", value, "ownId");
            return (Criteria) this;
        }

        public Criteria andOwnIdLessThan(String value) {
            addCriterion("own_id <", value, "ownId");
            return (Criteria) this;
        }

        public Criteria andOwnIdLessThanOrEqualTo(String value) {
            addCriterion("own_id <=", value, "ownId");
            return (Criteria) this;
        }

        public Criteria andOwnIdLike(String value) {
            addCriterion("own_id like", value, "ownId");
            return (Criteria) this;
        }

        public Criteria andOwnIdNotLike(String value) {
            addCriterion("own_id not like", value, "ownId");
            return (Criteria) this;
        }

        public Criteria andOwnIdIn(List<String> values) {
            addCriterion("own_id in", values, "ownId");
            return (Criteria) this;
        }

        public Criteria andOwnIdNotIn(List<String> values) {
            addCriterion("own_id not in", values, "ownId");
            return (Criteria) this;
        }

        public Criteria andOwnIdBetween(String value1, String value2) {
            addCriterion("own_id between", value1, value2, "ownId");
            return (Criteria) this;
        }

        public Criteria andOwnIdNotBetween(String value1, String value2) {
            addCriterion("own_id not between", value1, value2, "ownId");
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