package com.zhiyou.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andImoocIdIsNull() {
            addCriterion("imooc_id is null");
            return (Criteria) this;
        }

        public Criteria andImoocIdIsNotNull() {
            addCriterion("imooc_id is not null");
            return (Criteria) this;
        }

        public Criteria andImoocIdEqualTo(Long value) {
            addCriterion("imooc_id =", value, "imoocId");
            return (Criteria) this;
        }

        public Criteria andImoocIdNotEqualTo(Long value) {
            addCriterion("imooc_id <>", value, "imoocId");
            return (Criteria) this;
        }

        public Criteria andImoocIdGreaterThan(Long value) {
            addCriterion("imooc_id >", value, "imoocId");
            return (Criteria) this;
        }

        public Criteria andImoocIdGreaterThanOrEqualTo(Long value) {
            addCriterion("imooc_id >=", value, "imoocId");
            return (Criteria) this;
        }

        public Criteria andImoocIdLessThan(Long value) {
            addCriterion("imooc_id <", value, "imoocId");
            return (Criteria) this;
        }

        public Criteria andImoocIdLessThanOrEqualTo(Long value) {
            addCriterion("imooc_id <=", value, "imoocId");
            return (Criteria) this;
        }

        public Criteria andImoocIdIn(List<Long> values) {
            addCriterion("imooc_id in", values, "imoocId");
            return (Criteria) this;
        }

        public Criteria andImoocIdNotIn(List<Long> values) {
            addCriterion("imooc_id not in", values, "imoocId");
            return (Criteria) this;
        }

        public Criteria andImoocIdBetween(Long value1, Long value2) {
            addCriterion("imooc_id between", value1, value2, "imoocId");
            return (Criteria) this;
        }

        public Criteria andImoocIdNotBetween(Long value1, Long value2) {
            addCriterion("imooc_id not between", value1, value2, "imoocId");
            return (Criteria) this;
        }

        public Criteria andImoocCreatedtimeIsNull() {
            addCriterion("imooc_createdtime is null");
            return (Criteria) this;
        }

        public Criteria andImoocCreatedtimeIsNotNull() {
            addCriterion("imooc_createdtime is not null");
            return (Criteria) this;
        }

        public Criteria andImoocCreatedtimeEqualTo(Date value) {
            addCriterion("imooc_createdtime =", value, "imoocCreatedtime");
            return (Criteria) this;
        }

        public Criteria andImoocCreatedtimeNotEqualTo(Date value) {
            addCriterion("imooc_createdtime <>", value, "imoocCreatedtime");
            return (Criteria) this;
        }

        public Criteria andImoocCreatedtimeGreaterThan(Date value) {
            addCriterion("imooc_createdtime >", value, "imoocCreatedtime");
            return (Criteria) this;
        }

        public Criteria andImoocCreatedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("imooc_createdtime >=", value, "imoocCreatedtime");
            return (Criteria) this;
        }

        public Criteria andImoocCreatedtimeLessThan(Date value) {
            addCriterion("imooc_createdtime <", value, "imoocCreatedtime");
            return (Criteria) this;
        }

        public Criteria andImoocCreatedtimeLessThanOrEqualTo(Date value) {
            addCriterion("imooc_createdtime <=", value, "imoocCreatedtime");
            return (Criteria) this;
        }

        public Criteria andImoocCreatedtimeIn(List<Date> values) {
            addCriterion("imooc_createdtime in", values, "imoocCreatedtime");
            return (Criteria) this;
        }

        public Criteria andImoocCreatedtimeNotIn(List<Date> values) {
            addCriterion("imooc_createdtime not in", values, "imoocCreatedtime");
            return (Criteria) this;
        }

        public Criteria andImoocCreatedtimeBetween(Date value1, Date value2) {
            addCriterion("imooc_createdtime between", value1, value2, "imoocCreatedtime");
            return (Criteria) this;
        }

        public Criteria andImoocCreatedtimeNotBetween(Date value1, Date value2) {
            addCriterion("imooc_createdtime not between", value1, value2, "imoocCreatedtime");
            return (Criteria) this;
        }

        public Criteria andImoocPasswordIsNull() {
            addCriterion("imooc_password is null");
            return (Criteria) this;
        }

        public Criteria andImoocPasswordIsNotNull() {
            addCriterion("imooc_password is not null");
            return (Criteria) this;
        }

        public Criteria andImoocPasswordEqualTo(String value) {
            addCriterion("imooc_password =", value, "imoocPassword");
            return (Criteria) this;
        }

        public Criteria andImoocPasswordNotEqualTo(String value) {
            addCriterion("imooc_password <>", value, "imoocPassword");
            return (Criteria) this;
        }

        public Criteria andImoocPasswordGreaterThan(String value) {
            addCriterion("imooc_password >", value, "imoocPassword");
            return (Criteria) this;
        }

        public Criteria andImoocPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("imooc_password >=", value, "imoocPassword");
            return (Criteria) this;
        }

        public Criteria andImoocPasswordLessThan(String value) {
            addCriterion("imooc_password <", value, "imoocPassword");
            return (Criteria) this;
        }

        public Criteria andImoocPasswordLessThanOrEqualTo(String value) {
            addCriterion("imooc_password <=", value, "imoocPassword");
            return (Criteria) this;
        }

        public Criteria andImoocPasswordLike(String value) {
            addCriterion("imooc_password like", value, "imoocPassword");
            return (Criteria) this;
        }

        public Criteria andImoocPasswordNotLike(String value) {
            addCriterion("imooc_password not like", value, "imoocPassword");
            return (Criteria) this;
        }

        public Criteria andImoocPasswordIn(List<String> values) {
            addCriterion("imooc_password in", values, "imoocPassword");
            return (Criteria) this;
        }

        public Criteria andImoocPasswordNotIn(List<String> values) {
            addCriterion("imooc_password not in", values, "imoocPassword");
            return (Criteria) this;
        }

        public Criteria andImoocPasswordBetween(String value1, String value2) {
            addCriterion("imooc_password between", value1, value2, "imoocPassword");
            return (Criteria) this;
        }

        public Criteria andImoocPasswordNotBetween(String value1, String value2) {
            addCriterion("imooc_password not between", value1, value2, "imoocPassword");
            return (Criteria) this;
        }

        public Criteria andImoocUsernameIsNull() {
            addCriterion("imooc_username is null");
            return (Criteria) this;
        }

        public Criteria andImoocUsernameIsNotNull() {
            addCriterion("imooc_username is not null");
            return (Criteria) this;
        }

        public Criteria andImoocUsernameEqualTo(String value) {
            addCriterion("imooc_username =", value, "imoocUsername");
            return (Criteria) this;
        }

        public Criteria andImoocUsernameNotEqualTo(String value) {
            addCriterion("imooc_username <>", value, "imoocUsername");
            return (Criteria) this;
        }

        public Criteria andImoocUsernameGreaterThan(String value) {
            addCriterion("imooc_username >", value, "imoocUsername");
            return (Criteria) this;
        }

        public Criteria andImoocUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("imooc_username >=", value, "imoocUsername");
            return (Criteria) this;
        }

        public Criteria andImoocUsernameLessThan(String value) {
            addCriterion("imooc_username <", value, "imoocUsername");
            return (Criteria) this;
        }

        public Criteria andImoocUsernameLessThanOrEqualTo(String value) {
            addCriterion("imooc_username <=", value, "imoocUsername");
            return (Criteria) this;
        }

        public Criteria andImoocUsernameLike(String value) {
            addCriterion("imooc_username like", value, "imoocUsername");
            return (Criteria) this;
        }

        public Criteria andImoocUsernameNotLike(String value) {
            addCriterion("imooc_username not like", value, "imoocUsername");
            return (Criteria) this;
        }

        public Criteria andImoocUsernameIn(List<String> values) {
            addCriterion("imooc_username in", values, "imoocUsername");
            return (Criteria) this;
        }

        public Criteria andImoocUsernameNotIn(List<String> values) {
            addCriterion("imooc_username not in", values, "imoocUsername");
            return (Criteria) this;
        }

        public Criteria andImoocUsernameBetween(String value1, String value2) {
            addCriterion("imooc_username between", value1, value2, "imoocUsername");
            return (Criteria) this;
        }

        public Criteria andImoocUsernameNotBetween(String value1, String value2) {
            addCriterion("imooc_username not between", value1, value2, "imoocUsername");
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