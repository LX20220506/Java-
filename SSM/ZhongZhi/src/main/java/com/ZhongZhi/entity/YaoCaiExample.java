package com.ZhongZhi.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class YaoCaiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YaoCaiExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andYidIsNull() {
            addCriterion("yid is null");
            return (Criteria) this;
        }

        public Criteria andYidIsNotNull() {
            addCriterion("yid is not null");
            return (Criteria) this;
        }

        public Criteria andYidEqualTo(Integer value) {
            addCriterion("yid =", value, "yid");
            return (Criteria) this;
        }

        public Criteria andYidNotEqualTo(Integer value) {
            addCriterion("yid <>", value, "yid");
            return (Criteria) this;
        }

        public Criteria andYidGreaterThan(Integer value) {
            addCriterion("yid >", value, "yid");
            return (Criteria) this;
        }

        public Criteria andYidGreaterThanOrEqualTo(Integer value) {
            addCriterion("yid >=", value, "yid");
            return (Criteria) this;
        }

        public Criteria andYidLessThan(Integer value) {
            addCriterion("yid <", value, "yid");
            return (Criteria) this;
        }

        public Criteria andYidLessThanOrEqualTo(Integer value) {
            addCriterion("yid <=", value, "yid");
            return (Criteria) this;
        }

        public Criteria andYidIn(List<Integer> values) {
            addCriterion("yid in", values, "yid");
            return (Criteria) this;
        }

        public Criteria andYidNotIn(List<Integer> values) {
            addCriterion("yid not in", values, "yid");
            return (Criteria) this;
        }

        public Criteria andYidBetween(Integer value1, Integer value2) {
            addCriterion("yid between", value1, value2, "yid");
            return (Criteria) this;
        }

        public Criteria andYidNotBetween(Integer value1, Integer value2) {
            addCriterion("yid not between", value1, value2, "yid");
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

        public Criteria andRiQiIsNull() {
            addCriterion("ri_qi is null");
            return (Criteria) this;
        }

        public Criteria andRiQiIsNotNull() {
            addCriterion("ri_qi is not null");
            return (Criteria) this;
        }

        public Criteria andRiQiEqualTo(Date value) {
            addCriterionForJDBCDate("ri_qi =", value, "riQi");
            return (Criteria) this;
        }

        public Criteria andRiQiNotEqualTo(Date value) {
            addCriterionForJDBCDate("ri_qi <>", value, "riQi");
            return (Criteria) this;
        }

        public Criteria andRiQiGreaterThan(Date value) {
            addCriterionForJDBCDate("ri_qi >", value, "riQi");
            return (Criteria) this;
        }

        public Criteria andRiQiGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ri_qi >=", value, "riQi");
            return (Criteria) this;
        }

        public Criteria andRiQiLessThan(Date value) {
            addCriterionForJDBCDate("ri_qi <", value, "riQi");
            return (Criteria) this;
        }

        public Criteria andRiQiLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ri_qi <=", value, "riQi");
            return (Criteria) this;
        }

        public Criteria andRiQiIn(List<Date> values) {
            addCriterionForJDBCDate("ri_qi in", values, "riQi");
            return (Criteria) this;
        }

        public Criteria andRiQiNotIn(List<Date> values) {
            addCriterionForJDBCDate("ri_qi not in", values, "riQi");
            return (Criteria) this;
        }

        public Criteria andRiQiBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ri_qi between", value1, value2, "riQi");
            return (Criteria) this;
        }

        public Criteria andRiQiNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ri_qi not between", value1, value2, "riQi");
            return (Criteria) this;
        }

        public Criteria andShengZhangQingKuangIsNull() {
            addCriterion("sheng_zhang_qing_kuang is null");
            return (Criteria) this;
        }

        public Criteria andShengZhangQingKuangIsNotNull() {
            addCriterion("sheng_zhang_qing_kuang is not null");
            return (Criteria) this;
        }

        public Criteria andShengZhangQingKuangEqualTo(String value) {
            addCriterion("sheng_zhang_qing_kuang =", value, "shengZhangQingKuang");
            return (Criteria) this;
        }

        public Criteria andShengZhangQingKuangNotEqualTo(String value) {
            addCriterion("sheng_zhang_qing_kuang <>", value, "shengZhangQingKuang");
            return (Criteria) this;
        }

        public Criteria andShengZhangQingKuangGreaterThan(String value) {
            addCriterion("sheng_zhang_qing_kuang >", value, "shengZhangQingKuang");
            return (Criteria) this;
        }

        public Criteria andShengZhangQingKuangGreaterThanOrEqualTo(String value) {
            addCriterion("sheng_zhang_qing_kuang >=", value, "shengZhangQingKuang");
            return (Criteria) this;
        }

        public Criteria andShengZhangQingKuangLessThan(String value) {
            addCriterion("sheng_zhang_qing_kuang <", value, "shengZhangQingKuang");
            return (Criteria) this;
        }

        public Criteria andShengZhangQingKuangLessThanOrEqualTo(String value) {
            addCriterion("sheng_zhang_qing_kuang <=", value, "shengZhangQingKuang");
            return (Criteria) this;
        }

        public Criteria andShengZhangQingKuangLike(String value) {
            addCriterion("sheng_zhang_qing_kuang like", value, "shengZhangQingKuang");
            return (Criteria) this;
        }

        public Criteria andShengZhangQingKuangNotLike(String value) {
            addCriterion("sheng_zhang_qing_kuang not like", value, "shengZhangQingKuang");
            return (Criteria) this;
        }

        public Criteria andShengZhangQingKuangIn(List<String> values) {
            addCriterion("sheng_zhang_qing_kuang in", values, "shengZhangQingKuang");
            return (Criteria) this;
        }

        public Criteria andShengZhangQingKuangNotIn(List<String> values) {
            addCriterion("sheng_zhang_qing_kuang not in", values, "shengZhangQingKuang");
            return (Criteria) this;
        }

        public Criteria andShengZhangQingKuangBetween(String value1, String value2) {
            addCriterion("sheng_zhang_qing_kuang between", value1, value2, "shengZhangQingKuang");
            return (Criteria) this;
        }

        public Criteria andShengZhangQingKuangNotBetween(String value1, String value2) {
            addCriterion("sheng_zhang_qing_kuang not between", value1, value2, "shengZhangQingKuang");
            return (Criteria) this;
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

        public Criteria andMianJiIsNull() {
            addCriterion("mian_ji is null");
            return (Criteria) this;
        }

        public Criteria andMianJiIsNotNull() {
            addCriterion("mian_ji is not null");
            return (Criteria) this;
        }

        public Criteria andMianJiEqualTo(Integer value) {
            addCriterion("mian_ji =", value, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiNotEqualTo(Integer value) {
            addCriterion("mian_ji <>", value, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiGreaterThan(Integer value) {
            addCriterion("mian_ji >", value, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiGreaterThanOrEqualTo(Integer value) {
            addCriterion("mian_ji >=", value, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiLessThan(Integer value) {
            addCriterion("mian_ji <", value, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiLessThanOrEqualTo(Integer value) {
            addCriterion("mian_ji <=", value, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiIn(List<Integer> values) {
            addCriterion("mian_ji in", values, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiNotIn(List<Integer> values) {
            addCriterion("mian_ji not in", values, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiBetween(Integer value1, Integer value2) {
            addCriterion("mian_ji between", value1, value2, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiNotBetween(Integer value1, Integer value2) {
            addCriterion("mian_ji not between", value1, value2, "mianJi");
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