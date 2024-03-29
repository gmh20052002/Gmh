package com.gmh.wzz.api.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbWzzInfoExample implements Serializable{

	private static final long serialVersionUID = 1L;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:02 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:02 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:02 CST 2015
     */
    protected List<Criteria> oredCriteria;
    
    protected Page page; 

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:02 CST 2015
     */
    public TbWzzInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:02 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:02 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:02 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:02 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:02 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:02 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:02 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:02 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:02 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:02 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:02 CST 2015
     */
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(String value) {
            addCriterion("TYPE_ID =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(String value) {
            addCriterion("TYPE_ID <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(String value) {
            addCriterion("TYPE_ID >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_ID >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(String value) {
            addCriterion("TYPE_ID <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(String value) {
            addCriterion("TYPE_ID <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLike(String value) {
            addCriterion("TYPE_ID like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotLike(String value) {
            addCriterion("TYPE_ID not like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<String> values) {
            addCriterion("TYPE_ID in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<String> values) {
            addCriterion("TYPE_ID not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(String value1, String value2) {
            addCriterion("TYPE_ID between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(String value1, String value2) {
            addCriterion("TYPE_ID not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andInfoTitileIsNull() {
            addCriterion("INFO_TITILE is null");
            return (Criteria) this;
        }

        public Criteria andInfoTitileIsNotNull() {
            addCriterion("INFO_TITILE is not null");
            return (Criteria) this;
        }

        public Criteria andInfoTitileEqualTo(String value) {
            addCriterion("INFO_TITILE =", value, "infoTitile");
            return (Criteria) this;
        }

        public Criteria andInfoTitileNotEqualTo(String value) {
            addCriterion("INFO_TITILE <>", value, "infoTitile");
            return (Criteria) this;
        }

        public Criteria andInfoTitileGreaterThan(String value) {
            addCriterion("INFO_TITILE >", value, "infoTitile");
            return (Criteria) this;
        }

        public Criteria andInfoTitileGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_TITILE >=", value, "infoTitile");
            return (Criteria) this;
        }

        public Criteria andInfoTitileLessThan(String value) {
            addCriterion("INFO_TITILE <", value, "infoTitile");
            return (Criteria) this;
        }

        public Criteria andInfoTitileLessThanOrEqualTo(String value) {
            addCriterion("INFO_TITILE <=", value, "infoTitile");
            return (Criteria) this;
        }

        public Criteria andInfoTitileLike(String value) {
            addCriterion("INFO_TITILE like", value, "infoTitile");
            return (Criteria) this;
        }

        public Criteria andInfoTitileNotLike(String value) {
            addCriterion("INFO_TITILE not like", value, "infoTitile");
            return (Criteria) this;
        }

        public Criteria andInfoTitileIn(List<String> values) {
            addCriterion("INFO_TITILE in", values, "infoTitile");
            return (Criteria) this;
        }

        public Criteria andInfoTitileNotIn(List<String> values) {
            addCriterion("INFO_TITILE not in", values, "infoTitile");
            return (Criteria) this;
        }

        public Criteria andInfoTitileBetween(String value1, String value2) {
            addCriterion("INFO_TITILE between", value1, value2, "infoTitile");
            return (Criteria) this;
        }

        public Criteria andInfoTitileNotBetween(String value1, String value2) {
            addCriterion("INFO_TITILE not between", value1, value2, "infoTitile");
            return (Criteria) this;
        }

        public Criteria andInfoContextIsNull() {
            addCriterion("INFO_CONTEXT is null");
            return (Criteria) this;
        }

        public Criteria andInfoContextIsNotNull() {
            addCriterion("INFO_CONTEXT is not null");
            return (Criteria) this;
        }

        public Criteria andInfoContextEqualTo(String value) {
            addCriterion("INFO_CONTEXT =", value, "infoContext");
            return (Criteria) this;
        }

        public Criteria andInfoContextNotEqualTo(String value) {
            addCriterion("INFO_CONTEXT <>", value, "infoContext");
            return (Criteria) this;
        }

        public Criteria andInfoContextGreaterThan(String value) {
            addCriterion("INFO_CONTEXT >", value, "infoContext");
            return (Criteria) this;
        }

        public Criteria andInfoContextGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_CONTEXT >=", value, "infoContext");
            return (Criteria) this;
        }

        public Criteria andInfoContextLessThan(String value) {
            addCriterion("INFO_CONTEXT <", value, "infoContext");
            return (Criteria) this;
        }

        public Criteria andInfoContextLessThanOrEqualTo(String value) {
            addCriterion("INFO_CONTEXT <=", value, "infoContext");
            return (Criteria) this;
        }

        public Criteria andInfoContextLike(String value) {
            addCriterion("INFO_CONTEXT like", value, "infoContext");
            return (Criteria) this;
        }

        public Criteria andInfoContextNotLike(String value) {
            addCriterion("INFO_CONTEXT not like", value, "infoContext");
            return (Criteria) this;
        }

        public Criteria andInfoContextIn(List<String> values) {
            addCriterion("INFO_CONTEXT in", values, "infoContext");
            return (Criteria) this;
        }

        public Criteria andInfoContextNotIn(List<String> values) {
            addCriterion("INFO_CONTEXT not in", values, "infoContext");
            return (Criteria) this;
        }

        public Criteria andInfoContextBetween(String value1, String value2) {
            addCriterion("INFO_CONTEXT between", value1, value2, "infoContext");
            return (Criteria) this;
        }

        public Criteria andInfoContextNotBetween(String value1, String value2) {
            addCriterion("INFO_CONTEXT not between", value1, value2, "infoContext");
            return (Criteria) this;
        }

        public Criteria andInfoPicIsNull() {
            addCriterion("INFO_PIC is null");
            return (Criteria) this;
        }

        public Criteria andInfoPicIsNotNull() {
            addCriterion("INFO_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andInfoPicEqualTo(String value) {
            addCriterion("INFO_PIC =", value, "infoPic");
            return (Criteria) this;
        }

        public Criteria andInfoPicNotEqualTo(String value) {
            addCriterion("INFO_PIC <>", value, "infoPic");
            return (Criteria) this;
        }

        public Criteria andInfoPicGreaterThan(String value) {
            addCriterion("INFO_PIC >", value, "infoPic");
            return (Criteria) this;
        }

        public Criteria andInfoPicGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_PIC >=", value, "infoPic");
            return (Criteria) this;
        }

        public Criteria andInfoPicLessThan(String value) {
            addCriterion("INFO_PIC <", value, "infoPic");
            return (Criteria) this;
        }

        public Criteria andInfoPicLessThanOrEqualTo(String value) {
            addCriterion("INFO_PIC <=", value, "infoPic");
            return (Criteria) this;
        }

        public Criteria andInfoPicLike(String value) {
            addCriterion("INFO_PIC like", value, "infoPic");
            return (Criteria) this;
        }

        public Criteria andInfoPicNotLike(String value) {
            addCriterion("INFO_PIC not like", value, "infoPic");
            return (Criteria) this;
        }

        public Criteria andInfoPicIn(List<String> values) {
            addCriterion("INFO_PIC in", values, "infoPic");
            return (Criteria) this;
        }

        public Criteria andInfoPicNotIn(List<String> values) {
            addCriterion("INFO_PIC not in", values, "infoPic");
            return (Criteria) this;
        }

        public Criteria andInfoPicBetween(String value1, String value2) {
            addCriterion("INFO_PIC between", value1, value2, "infoPic");
            return (Criteria) this;
        }

        public Criteria andInfoPicNotBetween(String value1, String value2) {
            addCriterion("INFO_PIC not between", value1, value2, "infoPic");
            return (Criteria) this;
        }

        public Criteria andInfoAddressIsNull() {
            addCriterion("INFO_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andInfoAddressIsNotNull() {
            addCriterion("INFO_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andInfoAddressEqualTo(String value) {
            addCriterion("INFO_ADDRESS =", value, "infoAddress");
            return (Criteria) this;
        }

        public Criteria andInfoAddressNotEqualTo(String value) {
            addCriterion("INFO_ADDRESS <>", value, "infoAddress");
            return (Criteria) this;
        }

        public Criteria andInfoAddressGreaterThan(String value) {
            addCriterion("INFO_ADDRESS >", value, "infoAddress");
            return (Criteria) this;
        }

        public Criteria andInfoAddressGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_ADDRESS >=", value, "infoAddress");
            return (Criteria) this;
        }

        public Criteria andInfoAddressLessThan(String value) {
            addCriterion("INFO_ADDRESS <", value, "infoAddress");
            return (Criteria) this;
        }

        public Criteria andInfoAddressLessThanOrEqualTo(String value) {
            addCriterion("INFO_ADDRESS <=", value, "infoAddress");
            return (Criteria) this;
        }

        public Criteria andInfoAddressLike(String value) {
            addCriterion("INFO_ADDRESS like", value, "infoAddress");
            return (Criteria) this;
        }

        public Criteria andInfoAddressNotLike(String value) {
            addCriterion("INFO_ADDRESS not like", value, "infoAddress");
            return (Criteria) this;
        }

        public Criteria andInfoAddressIn(List<String> values) {
            addCriterion("INFO_ADDRESS in", values, "infoAddress");
            return (Criteria) this;
        }

        public Criteria andInfoAddressNotIn(List<String> values) {
            addCriterion("INFO_ADDRESS not in", values, "infoAddress");
            return (Criteria) this;
        }

        public Criteria andInfoAddressBetween(String value1, String value2) {
            addCriterion("INFO_ADDRESS between", value1, value2, "infoAddress");
            return (Criteria) this;
        }

        public Criteria andInfoAddressNotBetween(String value1, String value2) {
            addCriterion("INFO_ADDRESS not between", value1, value2, "infoAddress");
            return (Criteria) this;
        }

        public Criteria andInfoPhoneIsNull() {
            addCriterion("INFO_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andInfoPhoneIsNotNull() {
            addCriterion("INFO_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andInfoPhoneEqualTo(String value) {
            addCriterion("INFO_PHONE =", value, "infoPhone");
            return (Criteria) this;
        }

        public Criteria andInfoPhoneNotEqualTo(String value) {
            addCriterion("INFO_PHONE <>", value, "infoPhone");
            return (Criteria) this;
        }

        public Criteria andInfoPhoneGreaterThan(String value) {
            addCriterion("INFO_PHONE >", value, "infoPhone");
            return (Criteria) this;
        }

        public Criteria andInfoPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_PHONE >=", value, "infoPhone");
            return (Criteria) this;
        }

        public Criteria andInfoPhoneLessThan(String value) {
            addCriterion("INFO_PHONE <", value, "infoPhone");
            return (Criteria) this;
        }

        public Criteria andInfoPhoneLessThanOrEqualTo(String value) {
            addCriterion("INFO_PHONE <=", value, "infoPhone");
            return (Criteria) this;
        }

        public Criteria andInfoPhoneLike(String value) {
            addCriterion("INFO_PHONE like", value, "infoPhone");
            return (Criteria) this;
        }

        public Criteria andInfoPhoneNotLike(String value) {
            addCriterion("INFO_PHONE not like", value, "infoPhone");
            return (Criteria) this;
        }

        public Criteria andInfoPhoneIn(List<String> values) {
            addCriterion("INFO_PHONE in", values, "infoPhone");
            return (Criteria) this;
        }

        public Criteria andInfoPhoneNotIn(List<String> values) {
            addCriterion("INFO_PHONE not in", values, "infoPhone");
            return (Criteria) this;
        }

        public Criteria andInfoPhoneBetween(String value1, String value2) {
            addCriterion("INFO_PHONE between", value1, value2, "infoPhone");
            return (Criteria) this;
        }

        public Criteria andInfoPhoneNotBetween(String value1, String value2) {
            addCriterion("INFO_PHONE not between", value1, value2, "infoPhone");
            return (Criteria) this;
        }

        public Criteria andInfoStatusIsNull() {
            addCriterion("INFO_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andInfoStatusIsNotNull() {
            addCriterion("INFO_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andInfoStatusEqualTo(String value) {
            addCriterion("INFO_STATUS =", value, "infoStatus");
            return (Criteria) this;
        }

        public Criteria andInfoStatusNotEqualTo(String value) {
            addCriterion("INFO_STATUS <>", value, "infoStatus");
            return (Criteria) this;
        }

        public Criteria andInfoStatusGreaterThan(String value) {
            addCriterion("INFO_STATUS >", value, "infoStatus");
            return (Criteria) this;
        }

        public Criteria andInfoStatusGreaterThanOrEqualTo(String value) {
            addCriterion("INFO_STATUS >=", value, "infoStatus");
            return (Criteria) this;
        }

        public Criteria andInfoStatusLessThan(String value) {
            addCriterion("INFO_STATUS <", value, "infoStatus");
            return (Criteria) this;
        }

        public Criteria andInfoStatusLessThanOrEqualTo(String value) {
            addCriterion("INFO_STATUS <=", value, "infoStatus");
            return (Criteria) this;
        }

        public Criteria andInfoStatusLike(String value) {
            addCriterion("INFO_STATUS like", value, "infoStatus");
            return (Criteria) this;
        }

        public Criteria andInfoStatusNotLike(String value) {
            addCriterion("INFO_STATUS not like", value, "infoStatus");
            return (Criteria) this;
        }

        public Criteria andInfoStatusIn(List<String> values) {
            addCriterion("INFO_STATUS in", values, "infoStatus");
            return (Criteria) this;
        }

        public Criteria andInfoStatusNotIn(List<String> values) {
            addCriterion("INFO_STATUS not in", values, "infoStatus");
            return (Criteria) this;
        }

        public Criteria andInfoStatusBetween(String value1, String value2) {
            addCriterion("INFO_STATUS between", value1, value2, "infoStatus");
            return (Criteria) this;
        }

        public Criteria andInfoStatusNotBetween(String value1, String value2) {
            addCriterion("INFO_STATUS not between", value1, value2, "infoStatus");
            return (Criteria) this;
        }

        public Criteria andInfoTimeIsNull() {
            addCriterion("INFO_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInfoTimeIsNotNull() {
            addCriterion("INFO_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInfoTimeEqualTo(Date value) {
            addCriterion("INFO_TIME =", value, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeNotEqualTo(Date value) {
            addCriterion("INFO_TIME <>", value, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeGreaterThan(Date value) {
            addCriterion("INFO_TIME >", value, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("INFO_TIME >=", value, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeLessThan(Date value) {
            addCriterion("INFO_TIME <", value, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeLessThanOrEqualTo(Date value) {
            addCriterion("INFO_TIME <=", value, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeIn(List<Date> values) {
            addCriterion("INFO_TIME in", values, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeNotIn(List<Date> values) {
            addCriterion("INFO_TIME not in", values, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeBetween(Date value1, Date value2) {
            addCriterion("INFO_TIME between", value1, value2, "infoTime");
            return (Criteria) this;
        }

        public Criteria andInfoTimeNotBetween(Date value1, Date value2) {
            addCriterion("INFO_TIME not between", value1, value2, "infoTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_wzz_info
     *
     * @mbggenerated do_not_delete_during_merge Sat Jun 27 09:02:02 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_wzz_info
     *
     * @mbggenerated Sat Jun 27 09:02:02 CST 2015
     */
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