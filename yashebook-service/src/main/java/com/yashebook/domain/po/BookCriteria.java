package com.yashebook.domain.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
* BookCriteria 条件查询类.
* 
* @author liangc [cc14514@icloud.com]
* @version v1.0
* @copy pet
* @date 2018-01-04 17:12:40
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNull() {
            addCriterion("isbn is null");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNotNull() {
            addCriterion("isbn is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnEqualTo(String value) {
            addCriterion("isbn =", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotEqualTo(String value) {
            addCriterion("isbn <>", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThan(String value) {
            addCriterion("isbn >", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("isbn >=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThan(String value) {
            addCriterion("isbn <", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThanOrEqualTo(String value) {
            addCriterion("isbn <=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLike(String value) {
            addCriterion("isbn like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotLike(String value) {
            addCriterion("isbn not like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnIn(List<String> values) {
            addCriterion("isbn in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotIn(List<String> values) {
            addCriterion("isbn not in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnBetween(String value1, String value2) {
            addCriterion("isbn between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotBetween(String value1, String value2) {
            addCriterion("isbn not between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionIsNull() {
            addCriterion("author_introduction is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionIsNotNull() {
            addCriterion("author_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionEqualTo(String value) {
            addCriterion("author_introduction =", value, "authorIntroduction");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionNotEqualTo(String value) {
            addCriterion("author_introduction <>", value, "authorIntroduction");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionGreaterThan(String value) {
            addCriterion("author_introduction >", value, "authorIntroduction");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("author_introduction >=", value, "authorIntroduction");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionLessThan(String value) {
            addCriterion("author_introduction <", value, "authorIntroduction");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionLessThanOrEqualTo(String value) {
            addCriterion("author_introduction <=", value, "authorIntroduction");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionLike(String value) {
            addCriterion("author_introduction like", value, "authorIntroduction");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionNotLike(String value) {
            addCriterion("author_introduction not like", value, "authorIntroduction");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionIn(List<String> values) {
            addCriterion("author_introduction in", values, "authorIntroduction");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionNotIn(List<String> values) {
            addCriterion("author_introduction not in", values, "authorIntroduction");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionBetween(String value1, String value2) {
            addCriterion("author_introduction between", value1, value2, "authorIntroduction");
            return (Criteria) this;
        }

        public Criteria andAuthorIntroductionNotBetween(String value1, String value2) {
            addCriterion("author_introduction not between", value1, value2, "authorIntroduction");
            return (Criteria) this;
        }

        public Criteria andBookFolioIsNull() {
            addCriterion("book_folio is null");
            return (Criteria) this;
        }

        public Criteria andBookFolioIsNotNull() {
            addCriterion("book_folio is not null");
            return (Criteria) this;
        }

        public Criteria andBookFolioEqualTo(String value) {
            addCriterion("book_folio =", value, "bookFolio");
            return (Criteria) this;
        }

        public Criteria andBookFolioNotEqualTo(String value) {
            addCriterion("book_folio <>", value, "bookFolio");
            return (Criteria) this;
        }

        public Criteria andBookFolioGreaterThan(String value) {
            addCriterion("book_folio >", value, "bookFolio");
            return (Criteria) this;
        }

        public Criteria andBookFolioGreaterThanOrEqualTo(String value) {
            addCriterion("book_folio >=", value, "bookFolio");
            return (Criteria) this;
        }

        public Criteria andBookFolioLessThan(String value) {
            addCriterion("book_folio <", value, "bookFolio");
            return (Criteria) this;
        }

        public Criteria andBookFolioLessThanOrEqualTo(String value) {
            addCriterion("book_folio <=", value, "bookFolio");
            return (Criteria) this;
        }

        public Criteria andBookFolioLike(String value) {
            addCriterion("book_folio like", value, "bookFolio");
            return (Criteria) this;
        }

        public Criteria andBookFolioNotLike(String value) {
            addCriterion("book_folio not like", value, "bookFolio");
            return (Criteria) this;
        }

        public Criteria andBookFolioIn(List<String> values) {
            addCriterion("book_folio in", values, "bookFolio");
            return (Criteria) this;
        }

        public Criteria andBookFolioNotIn(List<String> values) {
            addCriterion("book_folio not in", values, "bookFolio");
            return (Criteria) this;
        }

        public Criteria andBookFolioBetween(String value1, String value2) {
            addCriterion("book_folio between", value1, value2, "bookFolio");
            return (Criteria) this;
        }

        public Criteria andBookFolioNotBetween(String value1, String value2) {
            addCriterion("book_folio not between", value1, value2, "bookFolio");
            return (Criteria) this;
        }

        public Criteria andBookFontsIsNull() {
            addCriterion("book_fonts is null");
            return (Criteria) this;
        }

        public Criteria andBookFontsIsNotNull() {
            addCriterion("book_fonts is not null");
            return (Criteria) this;
        }

        public Criteria andBookFontsEqualTo(String value) {
            addCriterion("book_fonts =", value, "bookFonts");
            return (Criteria) this;
        }

        public Criteria andBookFontsNotEqualTo(String value) {
            addCriterion("book_fonts <>", value, "bookFonts");
            return (Criteria) this;
        }

        public Criteria andBookFontsGreaterThan(String value) {
            addCriterion("book_fonts >", value, "bookFonts");
            return (Criteria) this;
        }

        public Criteria andBookFontsGreaterThanOrEqualTo(String value) {
            addCriterion("book_fonts >=", value, "bookFonts");
            return (Criteria) this;
        }

        public Criteria andBookFontsLessThan(String value) {
            addCriterion("book_fonts <", value, "bookFonts");
            return (Criteria) this;
        }

        public Criteria andBookFontsLessThanOrEqualTo(String value) {
            addCriterion("book_fonts <=", value, "bookFonts");
            return (Criteria) this;
        }

        public Criteria andBookFontsLike(String value) {
            addCriterion("book_fonts like", value, "bookFonts");
            return (Criteria) this;
        }

        public Criteria andBookFontsNotLike(String value) {
            addCriterion("book_fonts not like", value, "bookFonts");
            return (Criteria) this;
        }

        public Criteria andBookFontsIn(List<String> values) {
            addCriterion("book_fonts in", values, "bookFonts");
            return (Criteria) this;
        }

        public Criteria andBookFontsNotIn(List<String> values) {
            addCriterion("book_fonts not in", values, "bookFonts");
            return (Criteria) this;
        }

        public Criteria andBookFontsBetween(String value1, String value2) {
            addCriterion("book_fonts between", value1, value2, "bookFonts");
            return (Criteria) this;
        }

        public Criteria andBookFontsNotBetween(String value1, String value2) {
            addCriterion("book_fonts not between", value1, value2, "bookFonts");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNull() {
            addCriterion("book_name is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("book_name =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("book_name <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("book_name >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("book_name >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("book_name <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("book_name <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("book_name like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("book_name not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("book_name in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("book_name not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("book_name between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("book_name not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookPageIsNull() {
            addCriterion("book_page is null");
            return (Criteria) this;
        }

        public Criteria andBookPageIsNotNull() {
            addCriterion("book_page is not null");
            return (Criteria) this;
        }

        public Criteria andBookPageEqualTo(String value) {
            addCriterion("book_page =", value, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageNotEqualTo(String value) {
            addCriterion("book_page <>", value, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageGreaterThan(String value) {
            addCriterion("book_page >", value, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageGreaterThanOrEqualTo(String value) {
            addCriterion("book_page >=", value, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageLessThan(String value) {
            addCriterion("book_page <", value, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageLessThanOrEqualTo(String value) {
            addCriterion("book_page <=", value, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageLike(String value) {
            addCriterion("book_page like", value, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageNotLike(String value) {
            addCriterion("book_page not like", value, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageIn(List<String> values) {
            addCriterion("book_page in", values, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageNotIn(List<String> values) {
            addCriterion("book_page not in", values, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageBetween(String value1, String value2) {
            addCriterion("book_page between", value1, value2, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageNotBetween(String value1, String value2) {
            addCriterion("book_page not between", value1, value2, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookSnIsNull() {
            addCriterion("book_sn is null");
            return (Criteria) this;
        }

        public Criteria andBookSnIsNotNull() {
            addCriterion("book_sn is not null");
            return (Criteria) this;
        }

        public Criteria andBookSnEqualTo(String value) {
            addCriterion("book_sn =", value, "bookSn");
            return (Criteria) this;
        }

        public Criteria andBookSnNotEqualTo(String value) {
            addCriterion("book_sn <>", value, "bookSn");
            return (Criteria) this;
        }

        public Criteria andBookSnGreaterThan(String value) {
            addCriterion("book_sn >", value, "bookSn");
            return (Criteria) this;
        }

        public Criteria andBookSnGreaterThanOrEqualTo(String value) {
            addCriterion("book_sn >=", value, "bookSn");
            return (Criteria) this;
        }

        public Criteria andBookSnLessThan(String value) {
            addCriterion("book_sn <", value, "bookSn");
            return (Criteria) this;
        }

        public Criteria andBookSnLessThanOrEqualTo(String value) {
            addCriterion("book_sn <=", value, "bookSn");
            return (Criteria) this;
        }

        public Criteria andBookSnLike(String value) {
            addCriterion("book_sn like", value, "bookSn");
            return (Criteria) this;
        }

        public Criteria andBookSnNotLike(String value) {
            addCriterion("book_sn not like", value, "bookSn");
            return (Criteria) this;
        }

        public Criteria andBookSnIn(List<String> values) {
            addCriterion("book_sn in", values, "bookSn");
            return (Criteria) this;
        }

        public Criteria andBookSnNotIn(List<String> values) {
            addCriterion("book_sn not in", values, "bookSn");
            return (Criteria) this;
        }

        public Criteria andBookSnBetween(String value1, String value2) {
            addCriterion("book_sn between", value1, value2, "bookSn");
            return (Criteria) this;
        }

        public Criteria andBookSnNotBetween(String value1, String value2) {
            addCriterion("book_sn not between", value1, value2, "bookSn");
            return (Criteria) this;
        }

        public Criteria andBookVersionIsNull() {
            addCriterion("book_version is null");
            return (Criteria) this;
        }

        public Criteria andBookVersionIsNotNull() {
            addCriterion("book_version is not null");
            return (Criteria) this;
        }

        public Criteria andBookVersionEqualTo(String value) {
            addCriterion("book_version =", value, "bookVersion");
            return (Criteria) this;
        }

        public Criteria andBookVersionNotEqualTo(String value) {
            addCriterion("book_version <>", value, "bookVersion");
            return (Criteria) this;
        }

        public Criteria andBookVersionGreaterThan(String value) {
            addCriterion("book_version >", value, "bookVersion");
            return (Criteria) this;
        }

        public Criteria andBookVersionGreaterThanOrEqualTo(String value) {
            addCriterion("book_version >=", value, "bookVersion");
            return (Criteria) this;
        }

        public Criteria andBookVersionLessThan(String value) {
            addCriterion("book_version <", value, "bookVersion");
            return (Criteria) this;
        }

        public Criteria andBookVersionLessThanOrEqualTo(String value) {
            addCriterion("book_version <=", value, "bookVersion");
            return (Criteria) this;
        }

        public Criteria andBookVersionLike(String value) {
            addCriterion("book_version like", value, "bookVersion");
            return (Criteria) this;
        }

        public Criteria andBookVersionNotLike(String value) {
            addCriterion("book_version not like", value, "bookVersion");
            return (Criteria) this;
        }

        public Criteria andBookVersionIn(List<String> values) {
            addCriterion("book_version in", values, "bookVersion");
            return (Criteria) this;
        }

        public Criteria andBookVersionNotIn(List<String> values) {
            addCriterion("book_version not in", values, "bookVersion");
            return (Criteria) this;
        }

        public Criteria andBookVersionBetween(String value1, String value2) {
            addCriterion("book_version between", value1, value2, "bookVersion");
            return (Criteria) this;
        }

        public Criteria andBookVersionNotBetween(String value1, String value2) {
            addCriterion("book_version not between", value1, value2, "bookVersion");
            return (Criteria) this;
        }

        public Criteria andCatalogIsNull() {
            addCriterion("catalog is null");
            return (Criteria) this;
        }

        public Criteria andCatalogIsNotNull() {
            addCriterion("catalog is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogEqualTo(String value) {
            addCriterion("catalog =", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotEqualTo(String value) {
            addCriterion("catalog <>", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogGreaterThan(String value) {
            addCriterion("catalog >", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("catalog >=", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLessThan(String value) {
            addCriterion("catalog <", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLessThanOrEqualTo(String value) {
            addCriterion("catalog <=", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLike(String value) {
            addCriterion("catalog like", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotLike(String value) {
            addCriterion("catalog not like", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogIn(List<String> values) {
            addCriterion("catalog in", values, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotIn(List<String> values) {
            addCriterion("catalog not in", values, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogBetween(String value1, String value2) {
            addCriterion("catalog between", value1, value2, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotBetween(String value1, String value2) {
            addCriterion("catalog not between", value1, value2, "catalog");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentIntroductionIsNull() {
            addCriterion("content_introduction is null");
            return (Criteria) this;
        }

        public Criteria andContentIntroductionIsNotNull() {
            addCriterion("content_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andContentIntroductionEqualTo(String value) {
            addCriterion("content_introduction =", value, "contentIntroduction");
            return (Criteria) this;
        }

        public Criteria andContentIntroductionNotEqualTo(String value) {
            addCriterion("content_introduction <>", value, "contentIntroduction");
            return (Criteria) this;
        }

        public Criteria andContentIntroductionGreaterThan(String value) {
            addCriterion("content_introduction >", value, "contentIntroduction");
            return (Criteria) this;
        }

        public Criteria andContentIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("content_introduction >=", value, "contentIntroduction");
            return (Criteria) this;
        }

        public Criteria andContentIntroductionLessThan(String value) {
            addCriterion("content_introduction <", value, "contentIntroduction");
            return (Criteria) this;
        }

        public Criteria andContentIntroductionLessThanOrEqualTo(String value) {
            addCriterion("content_introduction <=", value, "contentIntroduction");
            return (Criteria) this;
        }

        public Criteria andContentIntroductionLike(String value) {
            addCriterion("content_introduction like", value, "contentIntroduction");
            return (Criteria) this;
        }

        public Criteria andContentIntroductionNotLike(String value) {
            addCriterion("content_introduction not like", value, "contentIntroduction");
            return (Criteria) this;
        }

        public Criteria andContentIntroductionIn(List<String> values) {
            addCriterion("content_introduction in", values, "contentIntroduction");
            return (Criteria) this;
        }

        public Criteria andContentIntroductionNotIn(List<String> values) {
            addCriterion("content_introduction not in", values, "contentIntroduction");
            return (Criteria) this;
        }

        public Criteria andContentIntroductionBetween(String value1, String value2) {
            addCriterion("content_introduction between", value1, value2, "contentIntroduction");
            return (Criteria) this;
        }

        public Criteria andContentIntroductionNotBetween(String value1, String value2) {
            addCriterion("content_introduction not between", value1, value2, "contentIntroduction");
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

        public Criteria andEditorRecommendIsNull() {
            addCriterion("editor_recommend is null");
            return (Criteria) this;
        }

        public Criteria andEditorRecommendIsNotNull() {
            addCriterion("editor_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andEditorRecommendEqualTo(String value) {
            addCriterion("editor_recommend =", value, "editorRecommend");
            return (Criteria) this;
        }

        public Criteria andEditorRecommendNotEqualTo(String value) {
            addCriterion("editor_recommend <>", value, "editorRecommend");
            return (Criteria) this;
        }

        public Criteria andEditorRecommendGreaterThan(String value) {
            addCriterion("editor_recommend >", value, "editorRecommend");
            return (Criteria) this;
        }

        public Criteria andEditorRecommendGreaterThanOrEqualTo(String value) {
            addCriterion("editor_recommend >=", value, "editorRecommend");
            return (Criteria) this;
        }

        public Criteria andEditorRecommendLessThan(String value) {
            addCriterion("editor_recommend <", value, "editorRecommend");
            return (Criteria) this;
        }

        public Criteria andEditorRecommendLessThanOrEqualTo(String value) {
            addCriterion("editor_recommend <=", value, "editorRecommend");
            return (Criteria) this;
        }

        public Criteria andEditorRecommendLike(String value) {
            addCriterion("editor_recommend like", value, "editorRecommend");
            return (Criteria) this;
        }

        public Criteria andEditorRecommendNotLike(String value) {
            addCriterion("editor_recommend not like", value, "editorRecommend");
            return (Criteria) this;
        }

        public Criteria andEditorRecommendIn(List<String> values) {
            addCriterion("editor_recommend in", values, "editorRecommend");
            return (Criteria) this;
        }

        public Criteria andEditorRecommendNotIn(List<String> values) {
            addCriterion("editor_recommend not in", values, "editorRecommend");
            return (Criteria) this;
        }

        public Criteria andEditorRecommendBetween(String value1, String value2) {
            addCriterion("editor_recommend between", value1, value2, "editorRecommend");
            return (Criteria) this;
        }

        public Criteria andEditorRecommendNotBetween(String value1, String value2) {
            addCriterion("editor_recommend not between", value1, value2, "editorRecommend");
            return (Criteria) this;
        }

        public Criteria andIsFullIsNull() {
            addCriterion("is_full is null");
            return (Criteria) this;
        }

        public Criteria andIsFullIsNotNull() {
            addCriterion("is_full is not null");
            return (Criteria) this;
        }

        public Criteria andIsFullEqualTo(Integer value) {
            addCriterion("is_full =", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullNotEqualTo(Integer value) {
            addCriterion("is_full <>", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullGreaterThan(Integer value) {
            addCriterion("is_full >", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_full >=", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullLessThan(Integer value) {
            addCriterion("is_full <", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullLessThanOrEqualTo(Integer value) {
            addCriterion("is_full <=", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullIn(List<Integer> values) {
            addCriterion("is_full in", values, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullNotIn(List<Integer> values) {
            addCriterion("is_full not in", values, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullBetween(Integer value1, Integer value2) {
            addCriterion("is_full between", value1, value2, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullNotBetween(Integer value1, Integer value2) {
            addCriterion("is_full not between", value1, value2, "isFull");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNull() {
            addCriterion("material is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNotNull() {
            addCriterion("material is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialEqualTo(String value) {
            addCriterion("material =", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotEqualTo(String value) {
            addCriterion("material <>", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThan(String value) {
            addCriterion("material >", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("material >=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThan(String value) {
            addCriterion("material <", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThanOrEqualTo(String value) {
            addCriterion("material <=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLike(String value) {
            addCriterion("material like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotLike(String value) {
            addCriterion("material not like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialIn(List<String> values) {
            addCriterion("material in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotIn(List<String> values) {
            addCriterion("material not in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialBetween(String value1, String value2) {
            addCriterion("material between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotBetween(String value1, String value2) {
            addCriterion("material not between", value1, value2, "material");
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

        public Criteria andPackTypeIsNull() {
            addCriterion("pack_type is null");
            return (Criteria) this;
        }

        public Criteria andPackTypeIsNotNull() {
            addCriterion("pack_type is not null");
            return (Criteria) this;
        }

        public Criteria andPackTypeEqualTo(String value) {
            addCriterion("pack_type =", value, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeNotEqualTo(String value) {
            addCriterion("pack_type <>", value, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeGreaterThan(String value) {
            addCriterion("pack_type >", value, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pack_type >=", value, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeLessThan(String value) {
            addCriterion("pack_type <", value, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeLessThanOrEqualTo(String value) {
            addCriterion("pack_type <=", value, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeLike(String value) {
            addCriterion("pack_type like", value, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeNotLike(String value) {
            addCriterion("pack_type not like", value, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeIn(List<String> values) {
            addCriterion("pack_type in", values, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeNotIn(List<String> values) {
            addCriterion("pack_type not in", values, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeBetween(String value1, String value2) {
            addCriterion("pack_type between", value1, value2, "packType");
            return (Criteria) this;
        }

        public Criteria andPackTypeNotBetween(String value1, String value2) {
            addCriterion("pack_type not between", value1, value2, "packType");
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

        public Criteria andPrintTimeIsNull() {
            addCriterion("print_time is null");
            return (Criteria) this;
        }

        public Criteria andPrintTimeIsNotNull() {
            addCriterion("print_time is not null");
            return (Criteria) this;
        }

        public Criteria andPrintTimeEqualTo(Date value) {
            addCriterion("print_time =", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeNotEqualTo(Date value) {
            addCriterion("print_time <>", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeGreaterThan(Date value) {
            addCriterion("print_time >", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("print_time >=", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeLessThan(Date value) {
            addCriterion("print_time <", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeLessThanOrEqualTo(Date value) {
            addCriterion("print_time <=", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeIn(List<Date> values) {
            addCriterion("print_time in", values, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeNotIn(List<Date> values) {
            addCriterion("print_time not in", values, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeBetween(Date value1, Date value2) {
            addCriterion("print_time between", value1, value2, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeNotBetween(Date value1, Date value2) {
            addCriterion("print_time not between", value1, value2, "printTime");
            return (Criteria) this;
        }

        public Criteria andPublishingTimeIsNull() {
            addCriterion("publishing_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishingTimeIsNotNull() {
            addCriterion("publishing_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishingTimeEqualTo(String value) {
            addCriterion("publishing_time =", value, "publishingTime");
            return (Criteria) this;
        }

        public Criteria andPublishingTimeNotEqualTo(String value) {
            addCriterion("publishing_time <>", value, "publishingTime");
            return (Criteria) this;
        }

        public Criteria andPublishingTimeGreaterThan(String value) {
            addCriterion("publishing_time >", value, "publishingTime");
            return (Criteria) this;
        }

        public Criteria andPublishingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("publishing_time >=", value, "publishingTime");
            return (Criteria) this;
        }

        public Criteria andPublishingTimeLessThan(String value) {
            addCriterion("publishing_time <", value, "publishingTime");
            return (Criteria) this;
        }

        public Criteria andPublishingTimeLessThanOrEqualTo(String value) {
            addCriterion("publishing_time <=", value, "publishingTime");
            return (Criteria) this;
        }

        public Criteria andPublishingTimeLike(String value) {
            addCriterion("publishing_time like", value, "publishingTime");
            return (Criteria) this;
        }

        public Criteria andPublishingTimeNotLike(String value) {
            addCriterion("publishing_time not like", value, "publishingTime");
            return (Criteria) this;
        }

        public Criteria andPublishingTimeIn(List<String> values) {
            addCriterion("publishing_time in", values, "publishingTime");
            return (Criteria) this;
        }

        public Criteria andPublishingTimeNotIn(List<String> values) {
            addCriterion("publishing_time not in", values, "publishingTime");
            return (Criteria) this;
        }

        public Criteria andPublishingTimeBetween(String value1, String value2) {
            addCriterion("publishing_time between", value1, value2, "publishingTime");
            return (Criteria) this;
        }

        public Criteria andPublishingTimeNotBetween(String value1, String value2) {
            addCriterion("publishing_time not between", value1, value2, "publishingTime");
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