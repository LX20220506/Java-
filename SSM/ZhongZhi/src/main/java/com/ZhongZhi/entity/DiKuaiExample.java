package com.ZhongZhi.entity;

import java.util.ArrayList;
import java.util.List;

public class DiKuaiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiKuaiExample() {
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

        public Criteria andDkidIsNull() {
            addCriterion("dkid is null");
            return (Criteria) this;
        }

        public Criteria andDkidIsNotNull() {
            addCriterion("dkid is not null");
            return (Criteria) this;
        }

        public Criteria andDkidEqualTo(Integer value) {
            addCriterion("dkid =", value, "dkid");
            return (Criteria) this;
        }

        public Criteria andDkidNotEqualTo(Integer value) {
            addCriterion("dkid <>", value, "dkid");
            return (Criteria) this;
        }

        public Criteria andDkidGreaterThan(Integer value) {
            addCriterion("dkid >", value, "dkid");
            return (Criteria) this;
        }

        public Criteria andDkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dkid >=", value, "dkid");
            return (Criteria) this;
        }

        public Criteria andDkidLessThan(Integer value) {
            addCriterion("dkid <", value, "dkid");
            return (Criteria) this;
        }

        public Criteria andDkidLessThanOrEqualTo(Integer value) {
            addCriterion("dkid <=", value, "dkid");
            return (Criteria) this;
        }

        public Criteria andDkidIn(List<Integer> values) {
            addCriterion("dkid in", values, "dkid");
            return (Criteria) this;
        }

        public Criteria andDkidNotIn(List<Integer> values) {
            addCriterion("dkid not in", values, "dkid");
            return (Criteria) this;
        }

        public Criteria andDkidBetween(Integer value1, Integer value2) {
            addCriterion("dkid between", value1, value2, "dkid");
            return (Criteria) this;
        }

        public Criteria andDkidNotBetween(Integer value1, Integer value2) {
            addCriterion("dkid not between", value1, value2, "dkid");
            return (Criteria) this;
        }

        public Criteria andDkNameIsNull() {
            addCriterion("dk_name is null");
            return (Criteria) this;
        }

        public Criteria andDkNameIsNotNull() {
            addCriterion("dk_name is not null");
            return (Criteria) this;
        }

        public Criteria andDkNameEqualTo(String value) {
            addCriterion("dk_name =", value, "dkName");
            return (Criteria) this;
        }

        public Criteria andDkNameNotEqualTo(String value) {
            addCriterion("dk_name <>", value, "dkName");
            return (Criteria) this;
        }

        public Criteria andDkNameGreaterThan(String value) {
            addCriterion("dk_name >", value, "dkName");
            return (Criteria) this;
        }

        public Criteria andDkNameGreaterThanOrEqualTo(String value) {
            addCriterion("dk_name >=", value, "dkName");
            return (Criteria) this;
        }

        public Criteria andDkNameLessThan(String value) {
            addCriterion("dk_name <", value, "dkName");
            return (Criteria) this;
        }

        public Criteria andDkNameLessThanOrEqualTo(String value) {
            addCriterion("dk_name <=", value, "dkName");
            return (Criteria) this;
        }

        public Criteria andDkNameLike(String value) {
            addCriterion("dk_name like", value, "dkName");
            return (Criteria) this;
        }

        public Criteria andDkNameNotLike(String value) {
            addCriterion("dk_name not like", value, "dkName");
            return (Criteria) this;
        }

        public Criteria andDkNameIn(List<String> values) {
            addCriterion("dk_name in", values, "dkName");
            return (Criteria) this;
        }

        public Criteria andDkNameNotIn(List<String> values) {
            addCriterion("dk_name not in", values, "dkName");
            return (Criteria) this;
        }

        public Criteria andDkNameBetween(String value1, String value2) {
            addCriterion("dk_name between", value1, value2, "dkName");
            return (Criteria) this;
        }

        public Criteria andDkNameNotBetween(String value1, String value2) {
            addCriterion("dk_name not between", value1, value2, "dkName");
            return (Criteria) this;
        }

        public Criteria andDkUidIsNull() {
            addCriterion("dk_uid is null");
            return (Criteria) this;
        }

        public Criteria andDkUidIsNotNull() {
            addCriterion("dk_uid is not null");
            return (Criteria) this;
        }

        public Criteria andDkUidEqualTo(Integer value) {
            addCriterion("dk_uid =", value, "dkUid");
            return (Criteria) this;
        }

        public Criteria andDkUidNotEqualTo(Integer value) {
            addCriterion("dk_uid <>", value, "dkUid");
            return (Criteria) this;
        }

        public Criteria andDkUidGreaterThan(Integer value) {
            addCriterion("dk_uid >", value, "dkUid");
            return (Criteria) this;
        }

        public Criteria andDkUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dk_uid >=", value, "dkUid");
            return (Criteria) this;
        }

        public Criteria andDkUidLessThan(Integer value) {
            addCriterion("dk_uid <", value, "dkUid");
            return (Criteria) this;
        }

        public Criteria andDkUidLessThanOrEqualTo(Integer value) {
            addCriterion("dk_uid <=", value, "dkUid");
            return (Criteria) this;
        }

        public Criteria andDkUidIn(List<Integer> values) {
            addCriterion("dk_uid in", values, "dkUid");
            return (Criteria) this;
        }

        public Criteria andDkUidNotIn(List<Integer> values) {
            addCriterion("dk_uid not in", values, "dkUid");
            return (Criteria) this;
        }

        public Criteria andDkUidBetween(Integer value1, Integer value2) {
            addCriterion("dk_uid between", value1, value2, "dkUid");
            return (Criteria) this;
        }

        public Criteria andDkUidNotBetween(Integer value1, Integer value2) {
            addCriterion("dk_uid not between", value1, value2, "dkUid");
            return (Criteria) this;
        }

        public Criteria andDkWenduIsNull() {
            addCriterion("dk_wendu is null");
            return (Criteria) this;
        }

        public Criteria andDkWenduIsNotNull() {
            addCriterion("dk_wendu is not null");
            return (Criteria) this;
        }

        public Criteria andDkWenduEqualTo(Integer value) {
            addCriterion("dk_wendu =", value, "dkWendu");
            return (Criteria) this;
        }

        public Criteria andDkWenduNotEqualTo(Integer value) {
            addCriterion("dk_wendu <>", value, "dkWendu");
            return (Criteria) this;
        }

        public Criteria andDkWenduGreaterThan(Integer value) {
            addCriterion("dk_wendu >", value, "dkWendu");
            return (Criteria) this;
        }

        public Criteria andDkWenduGreaterThanOrEqualTo(Integer value) {
            addCriterion("dk_wendu >=", value, "dkWendu");
            return (Criteria) this;
        }

        public Criteria andDkWenduLessThan(Integer value) {
            addCriterion("dk_wendu <", value, "dkWendu");
            return (Criteria) this;
        }

        public Criteria andDkWenduLessThanOrEqualTo(Integer value) {
            addCriterion("dk_wendu <=", value, "dkWendu");
            return (Criteria) this;
        }

        public Criteria andDkWenduIn(List<Integer> values) {
            addCriterion("dk_wendu in", values, "dkWendu");
            return (Criteria) this;
        }

        public Criteria andDkWenduNotIn(List<Integer> values) {
            addCriterion("dk_wendu not in", values, "dkWendu");
            return (Criteria) this;
        }

        public Criteria andDkWenduBetween(Integer value1, Integer value2) {
            addCriterion("dk_wendu between", value1, value2, "dkWendu");
            return (Criteria) this;
        }

        public Criteria andDkWenduNotBetween(Integer value1, Integer value2) {
            addCriterion("dk_wendu not between", value1, value2, "dkWendu");
            return (Criteria) this;
        }

        public Criteria andDkShiduIsNull() {
            addCriterion("dk_shidu is null");
            return (Criteria) this;
        }

        public Criteria andDkShiduIsNotNull() {
            addCriterion("dk_shidu is not null");
            return (Criteria) this;
        }

        public Criteria andDkShiduEqualTo(Integer value) {
            addCriterion("dk_shidu =", value, "dkShidu");
            return (Criteria) this;
        }

        public Criteria andDkShiduNotEqualTo(Integer value) {
            addCriterion("dk_shidu <>", value, "dkShidu");
            return (Criteria) this;
        }

        public Criteria andDkShiduGreaterThan(Integer value) {
            addCriterion("dk_shidu >", value, "dkShidu");
            return (Criteria) this;
        }

        public Criteria andDkShiduGreaterThanOrEqualTo(Integer value) {
            addCriterion("dk_shidu >=", value, "dkShidu");
            return (Criteria) this;
        }

        public Criteria andDkShiduLessThan(Integer value) {
            addCriterion("dk_shidu <", value, "dkShidu");
            return (Criteria) this;
        }

        public Criteria andDkShiduLessThanOrEqualTo(Integer value) {
            addCriterion("dk_shidu <=", value, "dkShidu");
            return (Criteria) this;
        }

        public Criteria andDkShiduIn(List<Integer> values) {
            addCriterion("dk_shidu in", values, "dkShidu");
            return (Criteria) this;
        }

        public Criteria andDkShiduNotIn(List<Integer> values) {
            addCriterion("dk_shidu not in", values, "dkShidu");
            return (Criteria) this;
        }

        public Criteria andDkShiduBetween(Integer value1, Integer value2) {
            addCriterion("dk_shidu between", value1, value2, "dkShidu");
            return (Criteria) this;
        }

        public Criteria andDkShiduNotBetween(Integer value1, Integer value2) {
            addCriterion("dk_shidu not between", value1, value2, "dkShidu");
            return (Criteria) this;
        }

        public Criteria andDkPhIsNull() {
            addCriterion("dk_PH is null");
            return (Criteria) this;
        }

        public Criteria andDkPhIsNotNull() {
            addCriterion("dk_PH is not null");
            return (Criteria) this;
        }

        public Criteria andDkPhEqualTo(Integer value) {
            addCriterion("dk_PH =", value, "dkPh");
            return (Criteria) this;
        }

        public Criteria andDkPhNotEqualTo(Integer value) {
            addCriterion("dk_PH <>", value, "dkPh");
            return (Criteria) this;
        }

        public Criteria andDkPhGreaterThan(Integer value) {
            addCriterion("dk_PH >", value, "dkPh");
            return (Criteria) this;
        }

        public Criteria andDkPhGreaterThanOrEqualTo(Integer value) {
            addCriterion("dk_PH >=", value, "dkPh");
            return (Criteria) this;
        }

        public Criteria andDkPhLessThan(Integer value) {
            addCriterion("dk_PH <", value, "dkPh");
            return (Criteria) this;
        }

        public Criteria andDkPhLessThanOrEqualTo(Integer value) {
            addCriterion("dk_PH <=", value, "dkPh");
            return (Criteria) this;
        }

        public Criteria andDkPhIn(List<Integer> values) {
            addCriterion("dk_PH in", values, "dkPh");
            return (Criteria) this;
        }

        public Criteria andDkPhNotIn(List<Integer> values) {
            addCriterion("dk_PH not in", values, "dkPh");
            return (Criteria) this;
        }

        public Criteria andDkPhBetween(Integer value1, Integer value2) {
            addCriterion("dk_PH between", value1, value2, "dkPh");
            return (Criteria) this;
        }

        public Criteria andDkPhNotBetween(Integer value1, Integer value2) {
            addCriterion("dk_PH not between", value1, value2, "dkPh");
            return (Criteria) this;
        }

        public Criteria andDkDanIsNull() {
            addCriterion("dk_dan is null");
            return (Criteria) this;
        }

        public Criteria andDkDanIsNotNull() {
            addCriterion("dk_dan is not null");
            return (Criteria) this;
        }

        public Criteria andDkDanEqualTo(Integer value) {
            addCriterion("dk_dan =", value, "dkDan");
            return (Criteria) this;
        }

        public Criteria andDkDanNotEqualTo(Integer value) {
            addCriterion("dk_dan <>", value, "dkDan");
            return (Criteria) this;
        }

        public Criteria andDkDanGreaterThan(Integer value) {
            addCriterion("dk_dan >", value, "dkDan");
            return (Criteria) this;
        }

        public Criteria andDkDanGreaterThanOrEqualTo(Integer value) {
            addCriterion("dk_dan >=", value, "dkDan");
            return (Criteria) this;
        }

        public Criteria andDkDanLessThan(Integer value) {
            addCriterion("dk_dan <", value, "dkDan");
            return (Criteria) this;
        }

        public Criteria andDkDanLessThanOrEqualTo(Integer value) {
            addCriterion("dk_dan <=", value, "dkDan");
            return (Criteria) this;
        }

        public Criteria andDkDanIn(List<Integer> values) {
            addCriterion("dk_dan in", values, "dkDan");
            return (Criteria) this;
        }

        public Criteria andDkDanNotIn(List<Integer> values) {
            addCriterion("dk_dan not in", values, "dkDan");
            return (Criteria) this;
        }

        public Criteria andDkDanBetween(Integer value1, Integer value2) {
            addCriterion("dk_dan between", value1, value2, "dkDan");
            return (Criteria) this;
        }

        public Criteria andDkDanNotBetween(Integer value1, Integer value2) {
            addCriterion("dk_dan not between", value1, value2, "dkDan");
            return (Criteria) this;
        }

        public Criteria andDkLinIsNull() {
            addCriterion("dk_lin is null");
            return (Criteria) this;
        }

        public Criteria andDkLinIsNotNull() {
            addCriterion("dk_lin is not null");
            return (Criteria) this;
        }

        public Criteria andDkLinEqualTo(Integer value) {
            addCriterion("dk_lin =", value, "dkLin");
            return (Criteria) this;
        }

        public Criteria andDkLinNotEqualTo(Integer value) {
            addCriterion("dk_lin <>", value, "dkLin");
            return (Criteria) this;
        }

        public Criteria andDkLinGreaterThan(Integer value) {
            addCriterion("dk_lin >", value, "dkLin");
            return (Criteria) this;
        }

        public Criteria andDkLinGreaterThanOrEqualTo(Integer value) {
            addCriterion("dk_lin >=", value, "dkLin");
            return (Criteria) this;
        }

        public Criteria andDkLinLessThan(Integer value) {
            addCriterion("dk_lin <", value, "dkLin");
            return (Criteria) this;
        }

        public Criteria andDkLinLessThanOrEqualTo(Integer value) {
            addCriterion("dk_lin <=", value, "dkLin");
            return (Criteria) this;
        }

        public Criteria andDkLinIn(List<Integer> values) {
            addCriterion("dk_lin in", values, "dkLin");
            return (Criteria) this;
        }

        public Criteria andDkLinNotIn(List<Integer> values) {
            addCriterion("dk_lin not in", values, "dkLin");
            return (Criteria) this;
        }

        public Criteria andDkLinBetween(Integer value1, Integer value2) {
            addCriterion("dk_lin between", value1, value2, "dkLin");
            return (Criteria) this;
        }

        public Criteria andDkLinNotBetween(Integer value1, Integer value2) {
            addCriterion("dk_lin not between", value1, value2, "dkLin");
            return (Criteria) this;
        }

        public Criteria andDkXinIsNull() {
            addCriterion("dk_xin is null");
            return (Criteria) this;
        }

        public Criteria andDkXinIsNotNull() {
            addCriterion("dk_xin is not null");
            return (Criteria) this;
        }

        public Criteria andDkXinEqualTo(Integer value) {
            addCriterion("dk_xin =", value, "dkXin");
            return (Criteria) this;
        }

        public Criteria andDkXinNotEqualTo(Integer value) {
            addCriterion("dk_xin <>", value, "dkXin");
            return (Criteria) this;
        }

        public Criteria andDkXinGreaterThan(Integer value) {
            addCriterion("dk_xin >", value, "dkXin");
            return (Criteria) this;
        }

        public Criteria andDkXinGreaterThanOrEqualTo(Integer value) {
            addCriterion("dk_xin >=", value, "dkXin");
            return (Criteria) this;
        }

        public Criteria andDkXinLessThan(Integer value) {
            addCriterion("dk_xin <", value, "dkXin");
            return (Criteria) this;
        }

        public Criteria andDkXinLessThanOrEqualTo(Integer value) {
            addCriterion("dk_xin <=", value, "dkXin");
            return (Criteria) this;
        }

        public Criteria andDkXinIn(List<Integer> values) {
            addCriterion("dk_xin in", values, "dkXin");
            return (Criteria) this;
        }

        public Criteria andDkXinNotIn(List<Integer> values) {
            addCriterion("dk_xin not in", values, "dkXin");
            return (Criteria) this;
        }

        public Criteria andDkXinBetween(Integer value1, Integer value2) {
            addCriterion("dk_xin between", value1, value2, "dkXin");
            return (Criteria) this;
        }

        public Criteria andDkXinNotBetween(Integer value1, Integer value2) {
            addCriterion("dk_xin not between", value1, value2, "dkXin");
            return (Criteria) this;
        }

        public Criteria andDkMianjiIsNull() {
            addCriterion("dk_mianji is null");
            return (Criteria) this;
        }

        public Criteria andDkMianjiIsNotNull() {
            addCriterion("dk_mianji is not null");
            return (Criteria) this;
        }

        public Criteria andDkMianjiEqualTo(Integer value) {
            addCriterion("dk_mianji =", value, "dkMianji");
            return (Criteria) this;
        }

        public Criteria andDkMianjiNotEqualTo(Integer value) {
            addCriterion("dk_mianji <>", value, "dkMianji");
            return (Criteria) this;
        }

        public Criteria andDkMianjiGreaterThan(Integer value) {
            addCriterion("dk_mianji >", value, "dkMianji");
            return (Criteria) this;
        }

        public Criteria andDkMianjiGreaterThanOrEqualTo(Integer value) {
            addCriterion("dk_mianji >=", value, "dkMianji");
            return (Criteria) this;
        }

        public Criteria andDkMianjiLessThan(Integer value) {
            addCriterion("dk_mianji <", value, "dkMianji");
            return (Criteria) this;
        }

        public Criteria andDkMianjiLessThanOrEqualTo(Integer value) {
            addCriterion("dk_mianji <=", value, "dkMianji");
            return (Criteria) this;
        }

        public Criteria andDkMianjiIn(List<Integer> values) {
            addCriterion("dk_mianji in", values, "dkMianji");
            return (Criteria) this;
        }

        public Criteria andDkMianjiNotIn(List<Integer> values) {
            addCriterion("dk_mianji not in", values, "dkMianji");
            return (Criteria) this;
        }

        public Criteria andDkMianjiBetween(Integer value1, Integer value2) {
            addCriterion("dk_mianji between", value1, value2, "dkMianji");
            return (Criteria) this;
        }

        public Criteria andDkMianjiNotBetween(Integer value1, Integer value2) {
            addCriterion("dk_mianji not between", value1, value2, "dkMianji");
            return (Criteria) this;
        }

        public Criteria andDkNianxianIsNull() {
            addCriterion("dk_nianxian is null");
            return (Criteria) this;
        }

        public Criteria andDkNianxianIsNotNull() {
            addCriterion("dk_nianxian is not null");
            return (Criteria) this;
        }

        public Criteria andDkNianxianEqualTo(Integer value) {
            addCriterion("dk_nianxian =", value, "dkNianxian");
            return (Criteria) this;
        }

        public Criteria andDkNianxianNotEqualTo(Integer value) {
            addCriterion("dk_nianxian <>", value, "dkNianxian");
            return (Criteria) this;
        }

        public Criteria andDkNianxianGreaterThan(Integer value) {
            addCriterion("dk_nianxian >", value, "dkNianxian");
            return (Criteria) this;
        }

        public Criteria andDkNianxianGreaterThanOrEqualTo(Integer value) {
            addCriterion("dk_nianxian >=", value, "dkNianxian");
            return (Criteria) this;
        }

        public Criteria andDkNianxianLessThan(Integer value) {
            addCriterion("dk_nianxian <", value, "dkNianxian");
            return (Criteria) this;
        }

        public Criteria andDkNianxianLessThanOrEqualTo(Integer value) {
            addCriterion("dk_nianxian <=", value, "dkNianxian");
            return (Criteria) this;
        }

        public Criteria andDkNianxianIn(List<Integer> values) {
            addCriterion("dk_nianxian in", values, "dkNianxian");
            return (Criteria) this;
        }

        public Criteria andDkNianxianNotIn(List<Integer> values) {
            addCriterion("dk_nianxian not in", values, "dkNianxian");
            return (Criteria) this;
        }

        public Criteria andDkNianxianBetween(Integer value1, Integer value2) {
            addCriterion("dk_nianxian between", value1, value2, "dkNianxian");
            return (Criteria) this;
        }

        public Criteria andDkNianxianNotBetween(Integer value1, Integer value2) {
            addCriterion("dk_nianxian not between", value1, value2, "dkNianxian");
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