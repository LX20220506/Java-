package com.ZhongZhi.entity;

import java.util.ArrayList;
import java.util.List;

public class ZhongZhiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZhongZhiExample() {
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

        public Criteria andZidIsNull() {
            addCriterion("zid is null");
            return (Criteria) this;
        }

        public Criteria andZidIsNotNull() {
            addCriterion("zid is not null");
            return (Criteria) this;
        }

        public Criteria andZidEqualTo(Integer value) {
            addCriterion("zid =", value, "zid");
            return (Criteria) this;
        }

        public Criteria andZidNotEqualTo(Integer value) {
            addCriterion("zid <>", value, "zid");
            return (Criteria) this;
        }

        public Criteria andZidGreaterThan(Integer value) {
            addCriterion("zid >", value, "zid");
            return (Criteria) this;
        }

        public Criteria andZidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zid >=", value, "zid");
            return (Criteria) this;
        }

        public Criteria andZidLessThan(Integer value) {
            addCriterion("zid <", value, "zid");
            return (Criteria) this;
        }

        public Criteria andZidLessThanOrEqualTo(Integer value) {
            addCriterion("zid <=", value, "zid");
            return (Criteria) this;
        }

        public Criteria andZidIn(List<Integer> values) {
            addCriterion("zid in", values, "zid");
            return (Criteria) this;
        }

        public Criteria andZidNotIn(List<Integer> values) {
            addCriterion("zid not in", values, "zid");
            return (Criteria) this;
        }

        public Criteria andZidBetween(Integer value1, Integer value2) {
            addCriterion("zid between", value1, value2, "zid");
            return (Criteria) this;
        }

        public Criteria andZidNotBetween(Integer value1, Integer value2) {
            addCriterion("zid not between", value1, value2, "zid");
            return (Criteria) this;
        }

        public Criteria andZzNameIsNull() {
            addCriterion("zz_name is null");
            return (Criteria) this;
        }

        public Criteria andZzNameIsNotNull() {
            addCriterion("zz_name is not null");
            return (Criteria) this;
        }

        public Criteria andZzNameEqualTo(String value) {
            addCriterion("zz_name =", value, "zzName");
            return (Criteria) this;
        }

        public Criteria andZzNameNotEqualTo(String value) {
            addCriterion("zz_name <>", value, "zzName");
            return (Criteria) this;
        }

        public Criteria andZzNameGreaterThan(String value) {
            addCriterion("zz_name >", value, "zzName");
            return (Criteria) this;
        }

        public Criteria andZzNameGreaterThanOrEqualTo(String value) {
            addCriterion("zz_name >=", value, "zzName");
            return (Criteria) this;
        }

        public Criteria andZzNameLessThan(String value) {
            addCriterion("zz_name <", value, "zzName");
            return (Criteria) this;
        }

        public Criteria andZzNameLessThanOrEqualTo(String value) {
            addCriterion("zz_name <=", value, "zzName");
            return (Criteria) this;
        }

        public Criteria andZzNameLike(String value) {
            addCriterion("zz_name like", value, "zzName");
            return (Criteria) this;
        }

        public Criteria andZzNameNotLike(String value) {
            addCriterion("zz_name not like", value, "zzName");
            return (Criteria) this;
        }

        public Criteria andZzNameIn(List<String> values) {
            addCriterion("zz_name in", values, "zzName");
            return (Criteria) this;
        }

        public Criteria andZzNameNotIn(List<String> values) {
            addCriterion("zz_name not in", values, "zzName");
            return (Criteria) this;
        }

        public Criteria andZzNameBetween(String value1, String value2) {
            addCriterion("zz_name between", value1, value2, "zzName");
            return (Criteria) this;
        }

        public Criteria andZzNameNotBetween(String value1, String value2) {
            addCriterion("zz_name not between", value1, value2, "zzName");
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

        public Criteria andZuoWuIsNull() {
            addCriterion("zuo_wu is null");
            return (Criteria) this;
        }

        public Criteria andZuoWuIsNotNull() {
            addCriterion("zuo_wu is not null");
            return (Criteria) this;
        }

        public Criteria andZuoWuEqualTo(String value) {
            addCriterion("zuo_wu =", value, "zuoWu");
            return (Criteria) this;
        }

        public Criteria andZuoWuNotEqualTo(String value) {
            addCriterion("zuo_wu <>", value, "zuoWu");
            return (Criteria) this;
        }

        public Criteria andZuoWuGreaterThan(String value) {
            addCriterion("zuo_wu >", value, "zuoWu");
            return (Criteria) this;
        }

        public Criteria andZuoWuGreaterThanOrEqualTo(String value) {
            addCriterion("zuo_wu >=", value, "zuoWu");
            return (Criteria) this;
        }

        public Criteria andZuoWuLessThan(String value) {
            addCriterion("zuo_wu <", value, "zuoWu");
            return (Criteria) this;
        }

        public Criteria andZuoWuLessThanOrEqualTo(String value) {
            addCriterion("zuo_wu <=", value, "zuoWu");
            return (Criteria) this;
        }

        public Criteria andZuoWuLike(String value) {
            addCriterion("zuo_wu like", value, "zuoWu");
            return (Criteria) this;
        }

        public Criteria andZuoWuNotLike(String value) {
            addCriterion("zuo_wu not like", value, "zuoWu");
            return (Criteria) this;
        }

        public Criteria andZuoWuIn(List<String> values) {
            addCriterion("zuo_wu in", values, "zuoWu");
            return (Criteria) this;
        }

        public Criteria andZuoWuNotIn(List<String> values) {
            addCriterion("zuo_wu not in", values, "zuoWu");
            return (Criteria) this;
        }

        public Criteria andZuoWuBetween(String value1, String value2) {
            addCriterion("zuo_wu between", value1, value2, "zuoWu");
            return (Criteria) this;
        }

        public Criteria andZuoWuNotBetween(String value1, String value2) {
            addCriterion("zuo_wu not between", value1, value2, "zuoWu");
            return (Criteria) this;
        }

        public Criteria andHuanJinIsNull() {
            addCriterion("huan_jin is null");
            return (Criteria) this;
        }

        public Criteria andHuanJinIsNotNull() {
            addCriterion("huan_jin is not null");
            return (Criteria) this;
        }

        public Criteria andHuanJinEqualTo(String value) {
            addCriterion("huan_jin =", value, "huanJin");
            return (Criteria) this;
        }

        public Criteria andHuanJinNotEqualTo(String value) {
            addCriterion("huan_jin <>", value, "huanJin");
            return (Criteria) this;
        }

        public Criteria andHuanJinGreaterThan(String value) {
            addCriterion("huan_jin >", value, "huanJin");
            return (Criteria) this;
        }

        public Criteria andHuanJinGreaterThanOrEqualTo(String value) {
            addCriterion("huan_jin >=", value, "huanJin");
            return (Criteria) this;
        }

        public Criteria andHuanJinLessThan(String value) {
            addCriterion("huan_jin <", value, "huanJin");
            return (Criteria) this;
        }

        public Criteria andHuanJinLessThanOrEqualTo(String value) {
            addCriterion("huan_jin <=", value, "huanJin");
            return (Criteria) this;
        }

        public Criteria andHuanJinLike(String value) {
            addCriterion("huan_jin like", value, "huanJin");
            return (Criteria) this;
        }

        public Criteria andHuanJinNotLike(String value) {
            addCriterion("huan_jin not like", value, "huanJin");
            return (Criteria) this;
        }

        public Criteria andHuanJinIn(List<String> values) {
            addCriterion("huan_jin in", values, "huanJin");
            return (Criteria) this;
        }

        public Criteria andHuanJinNotIn(List<String> values) {
            addCriterion("huan_jin not in", values, "huanJin");
            return (Criteria) this;
        }

        public Criteria andHuanJinBetween(String value1, String value2) {
            addCriterion("huan_jin between", value1, value2, "huanJin");
            return (Criteria) this;
        }

        public Criteria andHuanJinNotBetween(String value1, String value2) {
            addCriterion("huan_jin not between", value1, value2, "huanJin");
            return (Criteria) this;
        }

        public Criteria andShiJianIsNull() {
            addCriterion("shi_jian is null");
            return (Criteria) this;
        }

        public Criteria andShiJianIsNotNull() {
            addCriterion("shi_jian is not null");
            return (Criteria) this;
        }

        public Criteria andShiJianEqualTo(String value) {
            addCriterion("shi_jian =", value, "shiJian");
            return (Criteria) this;
        }

        public Criteria andShiJianNotEqualTo(String value) {
            addCriterion("shi_jian <>", value, "shiJian");
            return (Criteria) this;
        }

        public Criteria andShiJianGreaterThan(String value) {
            addCriterion("shi_jian >", value, "shiJian");
            return (Criteria) this;
        }

        public Criteria andShiJianGreaterThanOrEqualTo(String value) {
            addCriterion("shi_jian >=", value, "shiJian");
            return (Criteria) this;
        }

        public Criteria andShiJianLessThan(String value) {
            addCriterion("shi_jian <", value, "shiJian");
            return (Criteria) this;
        }

        public Criteria andShiJianLessThanOrEqualTo(String value) {
            addCriterion("shi_jian <=", value, "shiJian");
            return (Criteria) this;
        }

        public Criteria andShiJianLike(String value) {
            addCriterion("shi_jian like", value, "shiJian");
            return (Criteria) this;
        }

        public Criteria andShiJianNotLike(String value) {
            addCriterion("shi_jian not like", value, "shiJian");
            return (Criteria) this;
        }

        public Criteria andShiJianIn(List<String> values) {
            addCriterion("shi_jian in", values, "shiJian");
            return (Criteria) this;
        }

        public Criteria andShiJianNotIn(List<String> values) {
            addCriterion("shi_jian not in", values, "shiJian");
            return (Criteria) this;
        }

        public Criteria andShiJianBetween(String value1, String value2) {
            addCriterion("shi_jian between", value1, value2, "shiJian");
            return (Criteria) this;
        }

        public Criteria andShiJianNotBetween(String value1, String value2) {
            addCriterion("shi_jian not between", value1, value2, "shiJian");
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

        public Criteria andMianJiEqualTo(String value) {
            addCriterion("mian_ji =", value, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiNotEqualTo(String value) {
            addCriterion("mian_ji <>", value, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiGreaterThan(String value) {
            addCriterion("mian_ji >", value, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiGreaterThanOrEqualTo(String value) {
            addCriterion("mian_ji >=", value, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiLessThan(String value) {
            addCriterion("mian_ji <", value, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiLessThanOrEqualTo(String value) {
            addCriterion("mian_ji <=", value, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiLike(String value) {
            addCriterion("mian_ji like", value, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiNotLike(String value) {
            addCriterion("mian_ji not like", value, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiIn(List<String> values) {
            addCriterion("mian_ji in", values, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiNotIn(List<String> values) {
            addCriterion("mian_ji not in", values, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiBetween(String value1, String value2) {
            addCriterion("mian_ji between", value1, value2, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiNotBetween(String value1, String value2) {
            addCriterion("mian_ji not between", value1, value2, "mianJi");
            return (Criteria) this;
        }

        public Criteria andYuJiJinEIsNull() {
            addCriterion("yu_ji_jin_e is null");
            return (Criteria) this;
        }

        public Criteria andYuJiJinEIsNotNull() {
            addCriterion("yu_ji_jin_e is not null");
            return (Criteria) this;
        }

        public Criteria andYuJiJinEEqualTo(String value) {
            addCriterion("yu_ji_jin_e =", value, "yuJiJinE");
            return (Criteria) this;
        }

        public Criteria andYuJiJinENotEqualTo(String value) {
            addCriterion("yu_ji_jin_e <>", value, "yuJiJinE");
            return (Criteria) this;
        }

        public Criteria andYuJiJinEGreaterThan(String value) {
            addCriterion("yu_ji_jin_e >", value, "yuJiJinE");
            return (Criteria) this;
        }

        public Criteria andYuJiJinEGreaterThanOrEqualTo(String value) {
            addCriterion("yu_ji_jin_e >=", value, "yuJiJinE");
            return (Criteria) this;
        }

        public Criteria andYuJiJinELessThan(String value) {
            addCriterion("yu_ji_jin_e <", value, "yuJiJinE");
            return (Criteria) this;
        }

        public Criteria andYuJiJinELessThanOrEqualTo(String value) {
            addCriterion("yu_ji_jin_e <=", value, "yuJiJinE");
            return (Criteria) this;
        }

        public Criteria andYuJiJinELike(String value) {
            addCriterion("yu_ji_jin_e like", value, "yuJiJinE");
            return (Criteria) this;
        }

        public Criteria andYuJiJinENotLike(String value) {
            addCriterion("yu_ji_jin_e not like", value, "yuJiJinE");
            return (Criteria) this;
        }

        public Criteria andYuJiJinEIn(List<String> values) {
            addCriterion("yu_ji_jin_e in", values, "yuJiJinE");
            return (Criteria) this;
        }

        public Criteria andYuJiJinENotIn(List<String> values) {
            addCriterion("yu_ji_jin_e not in", values, "yuJiJinE");
            return (Criteria) this;
        }

        public Criteria andYuJiJinEBetween(String value1, String value2) {
            addCriterion("yu_ji_jin_e between", value1, value2, "yuJiJinE");
            return (Criteria) this;
        }

        public Criteria andYuJiJinENotBetween(String value1, String value2) {
            addCriterion("yu_ji_jin_e not between", value1, value2, "yuJiJinE");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andBeiZhuIsNull() {
            addCriterion("bei_zhu is null");
            return (Criteria) this;
        }

        public Criteria andBeiZhuIsNotNull() {
            addCriterion("bei_zhu is not null");
            return (Criteria) this;
        }

        public Criteria andBeiZhuEqualTo(String value) {
            addCriterion("bei_zhu =", value, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuNotEqualTo(String value) {
            addCriterion("bei_zhu <>", value, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuGreaterThan(String value) {
            addCriterion("bei_zhu >", value, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuGreaterThanOrEqualTo(String value) {
            addCriterion("bei_zhu >=", value, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuLessThan(String value) {
            addCriterion("bei_zhu <", value, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuLessThanOrEqualTo(String value) {
            addCriterion("bei_zhu <=", value, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuLike(String value) {
            addCriterion("bei_zhu like", value, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuNotLike(String value) {
            addCriterion("bei_zhu not like", value, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuIn(List<String> values) {
            addCriterion("bei_zhu in", values, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuNotIn(List<String> values) {
            addCriterion("bei_zhu not in", values, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuBetween(String value1, String value2) {
            addCriterion("bei_zhu between", value1, value2, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuNotBetween(String value1, String value2) {
            addCriterion("bei_zhu not between", value1, value2, "beiZhu");
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