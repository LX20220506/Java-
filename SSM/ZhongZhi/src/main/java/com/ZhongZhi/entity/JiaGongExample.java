package com.ZhongZhi.entity;

import java.util.ArrayList;
import java.util.List;

public class JiaGongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JiaGongExample() {
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

        public Criteria andJgIdIsNull() {
            addCriterion("jg_id is null");
            return (Criteria) this;
        }

        public Criteria andJgIdIsNotNull() {
            addCriterion("jg_id is not null");
            return (Criteria) this;
        }

        public Criteria andJgIdEqualTo(Integer value) {
            addCriterion("jg_id =", value, "jgId");
            return (Criteria) this;
        }

        public Criteria andJgIdNotEqualTo(Integer value) {
            addCriterion("jg_id <>", value, "jgId");
            return (Criteria) this;
        }

        public Criteria andJgIdGreaterThan(Integer value) {
            addCriterion("jg_id >", value, "jgId");
            return (Criteria) this;
        }

        public Criteria andJgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("jg_id >=", value, "jgId");
            return (Criteria) this;
        }

        public Criteria andJgIdLessThan(Integer value) {
            addCriterion("jg_id <", value, "jgId");
            return (Criteria) this;
        }

        public Criteria andJgIdLessThanOrEqualTo(Integer value) {
            addCriterion("jg_id <=", value, "jgId");
            return (Criteria) this;
        }

        public Criteria andJgIdIn(List<Integer> values) {
            addCriterion("jg_id in", values, "jgId");
            return (Criteria) this;
        }

        public Criteria andJgIdNotIn(List<Integer> values) {
            addCriterion("jg_id not in", values, "jgId");
            return (Criteria) this;
        }

        public Criteria andJgIdBetween(Integer value1, Integer value2) {
            addCriterion("jg_id between", value1, value2, "jgId");
            return (Criteria) this;
        }

        public Criteria andJgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("jg_id not between", value1, value2, "jgId");
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

        public Criteria andYcStateIsNull() {
            addCriterion("yc_state is null");
            return (Criteria) this;
        }

        public Criteria andYcStateIsNotNull() {
            addCriterion("yc_state is not null");
            return (Criteria) this;
        }

        public Criteria andYcStateEqualTo(String value) {
            addCriterion("yc_state =", value, "ycState");
            return (Criteria) this;
        }

        public Criteria andYcStateNotEqualTo(String value) {
            addCriterion("yc_state <>", value, "ycState");
            return (Criteria) this;
        }

        public Criteria andYcStateGreaterThan(String value) {
            addCriterion("yc_state >", value, "ycState");
            return (Criteria) this;
        }

        public Criteria andYcStateGreaterThanOrEqualTo(String value) {
            addCriterion("yc_state >=", value, "ycState");
            return (Criteria) this;
        }

        public Criteria andYcStateLessThan(String value) {
            addCriterion("yc_state <", value, "ycState");
            return (Criteria) this;
        }

        public Criteria andYcStateLessThanOrEqualTo(String value) {
            addCriterion("yc_state <=", value, "ycState");
            return (Criteria) this;
        }

        public Criteria andYcStateLike(String value) {
            addCriterion("yc_state like", value, "ycState");
            return (Criteria) this;
        }

        public Criteria andYcStateNotLike(String value) {
            addCriterion("yc_state not like", value, "ycState");
            return (Criteria) this;
        }

        public Criteria andYcStateIn(List<String> values) {
            addCriterion("yc_state in", values, "ycState");
            return (Criteria) this;
        }

        public Criteria andYcStateNotIn(List<String> values) {
            addCriterion("yc_state not in", values, "ycState");
            return (Criteria) this;
        }

        public Criteria andYcStateBetween(String value1, String value2) {
            addCriterion("yc_state between", value1, value2, "ycState");
            return (Criteria) this;
        }

        public Criteria andYcStateNotBetween(String value1, String value2) {
            addCriterion("yc_state not between", value1, value2, "ycState");
            return (Criteria) this;
        }

        public Criteria andYcNextStepIsNull() {
            addCriterion("yc_next_step is null");
            return (Criteria) this;
        }

        public Criteria andYcNextStepIsNotNull() {
            addCriterion("yc_next_step is not null");
            return (Criteria) this;
        }

        public Criteria andYcNextStepEqualTo(String value) {
            addCriterion("yc_next_step =", value, "ycNextStep");
            return (Criteria) this;
        }

        public Criteria andYcNextStepNotEqualTo(String value) {
            addCriterion("yc_next_step <>", value, "ycNextStep");
            return (Criteria) this;
        }

        public Criteria andYcNextStepGreaterThan(String value) {
            addCriterion("yc_next_step >", value, "ycNextStep");
            return (Criteria) this;
        }

        public Criteria andYcNextStepGreaterThanOrEqualTo(String value) {
            addCriterion("yc_next_step >=", value, "ycNextStep");
            return (Criteria) this;
        }

        public Criteria andYcNextStepLessThan(String value) {
            addCriterion("yc_next_step <", value, "ycNextStep");
            return (Criteria) this;
        }

        public Criteria andYcNextStepLessThanOrEqualTo(String value) {
            addCriterion("yc_next_step <=", value, "ycNextStep");
            return (Criteria) this;
        }

        public Criteria andYcNextStepLike(String value) {
            addCriterion("yc_next_step like", value, "ycNextStep");
            return (Criteria) this;
        }

        public Criteria andYcNextStepNotLike(String value) {
            addCriterion("yc_next_step not like", value, "ycNextStep");
            return (Criteria) this;
        }

        public Criteria andYcNextStepIn(List<String> values) {
            addCriterion("yc_next_step in", values, "ycNextStep");
            return (Criteria) this;
        }

        public Criteria andYcNextStepNotIn(List<String> values) {
            addCriterion("yc_next_step not in", values, "ycNextStep");
            return (Criteria) this;
        }

        public Criteria andYcNextStepBetween(String value1, String value2) {
            addCriterion("yc_next_step between", value1, value2, "ycNextStep");
            return (Criteria) this;
        }

        public Criteria andYcNextStepNotBetween(String value1, String value2) {
            addCriterion("yc_next_step not between", value1, value2, "ycNextStep");
            return (Criteria) this;
        }

        public Criteria andYcRepositoryIsNull() {
            addCriterion("yc_repository is null");
            return (Criteria) this;
        }

        public Criteria andYcRepositoryIsNotNull() {
            addCriterion("yc_repository is not null");
            return (Criteria) this;
        }

        public Criteria andYcRepositoryEqualTo(String value) {
            addCriterion("yc_repository =", value, "ycRepository");
            return (Criteria) this;
        }

        public Criteria andYcRepositoryNotEqualTo(String value) {
            addCriterion("yc_repository <>", value, "ycRepository");
            return (Criteria) this;
        }

        public Criteria andYcRepositoryGreaterThan(String value) {
            addCriterion("yc_repository >", value, "ycRepository");
            return (Criteria) this;
        }

        public Criteria andYcRepositoryGreaterThanOrEqualTo(String value) {
            addCriterion("yc_repository >=", value, "ycRepository");
            return (Criteria) this;
        }

        public Criteria andYcRepositoryLessThan(String value) {
            addCriterion("yc_repository <", value, "ycRepository");
            return (Criteria) this;
        }

        public Criteria andYcRepositoryLessThanOrEqualTo(String value) {
            addCriterion("yc_repository <=", value, "ycRepository");
            return (Criteria) this;
        }

        public Criteria andYcRepositoryLike(String value) {
            addCriterion("yc_repository like", value, "ycRepository");
            return (Criteria) this;
        }

        public Criteria andYcRepositoryNotLike(String value) {
            addCriterion("yc_repository not like", value, "ycRepository");
            return (Criteria) this;
        }

        public Criteria andYcRepositoryIn(List<String> values) {
            addCriterion("yc_repository in", values, "ycRepository");
            return (Criteria) this;
        }

        public Criteria andYcRepositoryNotIn(List<String> values) {
            addCriterion("yc_repository not in", values, "ycRepository");
            return (Criteria) this;
        }

        public Criteria andYcRepositoryBetween(String value1, String value2) {
            addCriterion("yc_repository between", value1, value2, "ycRepository");
            return (Criteria) this;
        }

        public Criteria andYcRepositoryNotBetween(String value1, String value2) {
            addCriterion("yc_repository not between", value1, value2, "ycRepository");
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