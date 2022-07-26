package com.ZhongZhi.entity;

import java.util.ArrayList;
import java.util.List;

public class JiaGeJianKongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JiaGeJianKongExample() {
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

        public Criteria andYcjdIdIsNull() {
            addCriterion("ycjd_id is null");
            return (Criteria) this;
        }

        public Criteria andYcjdIdIsNotNull() {
            addCriterion("ycjd_id is not null");
            return (Criteria) this;
        }

        public Criteria andYcjdIdEqualTo(Integer value) {
            addCriterion("ycjd_id =", value, "ycjdId");
            return (Criteria) this;
        }

        public Criteria andYcjdIdNotEqualTo(Integer value) {
            addCriterion("ycjd_id <>", value, "ycjdId");
            return (Criteria) this;
        }

        public Criteria andYcjdIdGreaterThan(Integer value) {
            addCriterion("ycjd_id >", value, "ycjdId");
            return (Criteria) this;
        }

        public Criteria andYcjdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ycjd_id >=", value, "ycjdId");
            return (Criteria) this;
        }

        public Criteria andYcjdIdLessThan(Integer value) {
            addCriterion("ycjd_id <", value, "ycjdId");
            return (Criteria) this;
        }

        public Criteria andYcjdIdLessThanOrEqualTo(Integer value) {
            addCriterion("ycjd_id <=", value, "ycjdId");
            return (Criteria) this;
        }

        public Criteria andYcjdIdIn(List<Integer> values) {
            addCriterion("ycjd_id in", values, "ycjdId");
            return (Criteria) this;
        }

        public Criteria andYcjdIdNotIn(List<Integer> values) {
            addCriterion("ycjd_id not in", values, "ycjdId");
            return (Criteria) this;
        }

        public Criteria andYcjdIdBetween(Integer value1, Integer value2) {
            addCriterion("ycjd_id between", value1, value2, "ycjdId");
            return (Criteria) this;
        }

        public Criteria andYcjdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ycjd_id not between", value1, value2, "ycjdId");
            return (Criteria) this;
        }

        public Criteria andYcNameIsNull() {
            addCriterion("yc_name is null");
            return (Criteria) this;
        }

        public Criteria andYcNameIsNotNull() {
            addCriterion("yc_name is not null");
            return (Criteria) this;
        }

        public Criteria andYcNameEqualTo(String value) {
            addCriterion("yc_name =", value, "ycName");
            return (Criteria) this;
        }

        public Criteria andYcNameNotEqualTo(String value) {
            addCriterion("yc_name <>", value, "ycName");
            return (Criteria) this;
        }

        public Criteria andYcNameGreaterThan(String value) {
            addCriterion("yc_name >", value, "ycName");
            return (Criteria) this;
        }

        public Criteria andYcNameGreaterThanOrEqualTo(String value) {
            addCriterion("yc_name >=", value, "ycName");
            return (Criteria) this;
        }

        public Criteria andYcNameLessThan(String value) {
            addCriterion("yc_name <", value, "ycName");
            return (Criteria) this;
        }

        public Criteria andYcNameLessThanOrEqualTo(String value) {
            addCriterion("yc_name <=", value, "ycName");
            return (Criteria) this;
        }

        public Criteria andYcNameLike(String value) {
            addCriterion("yc_name like", value, "ycName");
            return (Criteria) this;
        }

        public Criteria andYcNameNotLike(String value) {
            addCriterion("yc_name not like", value, "ycName");
            return (Criteria) this;
        }

        public Criteria andYcNameIn(List<String> values) {
            addCriterion("yc_name in", values, "ycName");
            return (Criteria) this;
        }

        public Criteria andYcNameNotIn(List<String> values) {
            addCriterion("yc_name not in", values, "ycName");
            return (Criteria) this;
        }

        public Criteria andYcNameBetween(String value1, String value2) {
            addCriterion("yc_name between", value1, value2, "ycName");
            return (Criteria) this;
        }

        public Criteria andYcNameNotBetween(String value1, String value2) {
            addCriterion("yc_name not between", value1, value2, "ycName");
            return (Criteria) this;
        }

        public Criteria andYcAgeIsNull() {
            addCriterion("yc_age is null");
            return (Criteria) this;
        }

        public Criteria andYcAgeIsNotNull() {
            addCriterion("yc_age is not null");
            return (Criteria) this;
        }

        public Criteria andYcAgeEqualTo(Integer value) {
            addCriterion("yc_age =", value, "ycAge");
            return (Criteria) this;
        }

        public Criteria andYcAgeNotEqualTo(Integer value) {
            addCriterion("yc_age <>", value, "ycAge");
            return (Criteria) this;
        }

        public Criteria andYcAgeGreaterThan(Integer value) {
            addCriterion("yc_age >", value, "ycAge");
            return (Criteria) this;
        }

        public Criteria andYcAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("yc_age >=", value, "ycAge");
            return (Criteria) this;
        }

        public Criteria andYcAgeLessThan(Integer value) {
            addCriterion("yc_age <", value, "ycAge");
            return (Criteria) this;
        }

        public Criteria andYcAgeLessThanOrEqualTo(Integer value) {
            addCriterion("yc_age <=", value, "ycAge");
            return (Criteria) this;
        }

        public Criteria andYcAgeIn(List<Integer> values) {
            addCriterion("yc_age in", values, "ycAge");
            return (Criteria) this;
        }

        public Criteria andYcAgeNotIn(List<Integer> values) {
            addCriterion("yc_age not in", values, "ycAge");
            return (Criteria) this;
        }

        public Criteria andYcAgeBetween(Integer value1, Integer value2) {
            addCriterion("yc_age between", value1, value2, "ycAge");
            return (Criteria) this;
        }

        public Criteria andYcAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("yc_age not between", value1, value2, "ycAge");
            return (Criteria) this;
        }

        public Criteria andYcYjgPriceIsNull() {
            addCriterion("yc_yjg_price is null");
            return (Criteria) this;
        }

        public Criteria andYcYjgPriceIsNotNull() {
            addCriterion("yc_yjg_price is not null");
            return (Criteria) this;
        }

        public Criteria andYcYjgPriceEqualTo(Integer value) {
            addCriterion("yc_yjg_price =", value, "ycYjgPrice");
            return (Criteria) this;
        }

        public Criteria andYcYjgPriceNotEqualTo(Integer value) {
            addCriterion("yc_yjg_price <>", value, "ycYjgPrice");
            return (Criteria) this;
        }

        public Criteria andYcYjgPriceGreaterThan(Integer value) {
            addCriterion("yc_yjg_price >", value, "ycYjgPrice");
            return (Criteria) this;
        }

        public Criteria andYcYjgPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("yc_yjg_price >=", value, "ycYjgPrice");
            return (Criteria) this;
        }

        public Criteria andYcYjgPriceLessThan(Integer value) {
            addCriterion("yc_yjg_price <", value, "ycYjgPrice");
            return (Criteria) this;
        }

        public Criteria andYcYjgPriceLessThanOrEqualTo(Integer value) {
            addCriterion("yc_yjg_price <=", value, "ycYjgPrice");
            return (Criteria) this;
        }

        public Criteria andYcYjgPriceIn(List<Integer> values) {
            addCriterion("yc_yjg_price in", values, "ycYjgPrice");
            return (Criteria) this;
        }

        public Criteria andYcYjgPriceNotIn(List<Integer> values) {
            addCriterion("yc_yjg_price not in", values, "ycYjgPrice");
            return (Criteria) this;
        }

        public Criteria andYcYjgPriceBetween(Integer value1, Integer value2) {
            addCriterion("yc_yjg_price between", value1, value2, "ycYjgPrice");
            return (Criteria) this;
        }

        public Criteria andYcYjgPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("yc_yjg_price not between", value1, value2, "ycYjgPrice");
            return (Criteria) this;
        }

        public Criteria andYcWjgPriceIsNull() {
            addCriterion("yc_wjg_price is null");
            return (Criteria) this;
        }

        public Criteria andYcWjgPriceIsNotNull() {
            addCriterion("yc_wjg_price is not null");
            return (Criteria) this;
        }

        public Criteria andYcWjgPriceEqualTo(Integer value) {
            addCriterion("yc_wjg_price =", value, "ycWjgPrice");
            return (Criteria) this;
        }

        public Criteria andYcWjgPriceNotEqualTo(Integer value) {
            addCriterion("yc_wjg_price <>", value, "ycWjgPrice");
            return (Criteria) this;
        }

        public Criteria andYcWjgPriceGreaterThan(Integer value) {
            addCriterion("yc_wjg_price >", value, "ycWjgPrice");
            return (Criteria) this;
        }

        public Criteria andYcWjgPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("yc_wjg_price >=", value, "ycWjgPrice");
            return (Criteria) this;
        }

        public Criteria andYcWjgPriceLessThan(Integer value) {
            addCriterion("yc_wjg_price <", value, "ycWjgPrice");
            return (Criteria) this;
        }

        public Criteria andYcWjgPriceLessThanOrEqualTo(Integer value) {
            addCriterion("yc_wjg_price <=", value, "ycWjgPrice");
            return (Criteria) this;
        }

        public Criteria andYcWjgPriceIn(List<Integer> values) {
            addCriterion("yc_wjg_price in", values, "ycWjgPrice");
            return (Criteria) this;
        }

        public Criteria andYcWjgPriceNotIn(List<Integer> values) {
            addCriterion("yc_wjg_price not in", values, "ycWjgPrice");
            return (Criteria) this;
        }

        public Criteria andYcWjgPriceBetween(Integer value1, Integer value2) {
            addCriterion("yc_wjg_price between", value1, value2, "ycWjgPrice");
            return (Criteria) this;
        }

        public Criteria andYcWjgPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("yc_wjg_price not between", value1, value2, "ycWjgPrice");
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