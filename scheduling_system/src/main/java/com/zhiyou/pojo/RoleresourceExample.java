package com.zhiyou.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoleresourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleresourceExample() {
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

        public Criteria andImoocResourceImoocIdIsNull() {
            addCriterion("imooc_resource_imooc_id is null");
            return (Criteria) this;
        }

        public Criteria andImoocResourceImoocIdIsNotNull() {
            addCriterion("imooc_resource_imooc_id is not null");
            return (Criteria) this;
        }

        public Criteria andImoocResourceImoocIdEqualTo(Long value) {
            addCriterion("imooc_resource_imooc_id =", value, "imoocResourceImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocResourceImoocIdNotEqualTo(Long value) {
            addCriterion("imooc_resource_imooc_id <>", value, "imoocResourceImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocResourceImoocIdGreaterThan(Long value) {
            addCriterion("imooc_resource_imooc_id >", value, "imoocResourceImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocResourceImoocIdGreaterThanOrEqualTo(Long value) {
            addCriterion("imooc_resource_imooc_id >=", value, "imoocResourceImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocResourceImoocIdLessThan(Long value) {
            addCriterion("imooc_resource_imooc_id <", value, "imoocResourceImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocResourceImoocIdLessThanOrEqualTo(Long value) {
            addCriterion("imooc_resource_imooc_id <=", value, "imoocResourceImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocResourceImoocIdIn(List<Long> values) {
            addCriterion("imooc_resource_imooc_id in", values, "imoocResourceImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocResourceImoocIdNotIn(List<Long> values) {
            addCriterion("imooc_resource_imooc_id not in", values, "imoocResourceImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocResourceImoocIdBetween(Long value1, Long value2) {
            addCriterion("imooc_resource_imooc_id between", value1, value2, "imoocResourceImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocResourceImoocIdNotBetween(Long value1, Long value2) {
            addCriterion("imooc_resource_imooc_id not between", value1, value2, "imoocResourceImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocRoleImoocIdIsNull() {
            addCriterion("imooc_role_imooc_id is null");
            return (Criteria) this;
        }

        public Criteria andImoocRoleImoocIdIsNotNull() {
            addCriterion("imooc_role_imooc_id is not null");
            return (Criteria) this;
        }

        public Criteria andImoocRoleImoocIdEqualTo(Long value) {
            addCriterion("imooc_role_imooc_id =", value, "imoocRoleImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocRoleImoocIdNotEqualTo(Long value) {
            addCriterion("imooc_role_imooc_id <>", value, "imoocRoleImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocRoleImoocIdGreaterThan(Long value) {
            addCriterion("imooc_role_imooc_id >", value, "imoocRoleImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocRoleImoocIdGreaterThanOrEqualTo(Long value) {
            addCriterion("imooc_role_imooc_id >=", value, "imoocRoleImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocRoleImoocIdLessThan(Long value) {
            addCriterion("imooc_role_imooc_id <", value, "imoocRoleImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocRoleImoocIdLessThanOrEqualTo(Long value) {
            addCriterion("imooc_role_imooc_id <=", value, "imoocRoleImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocRoleImoocIdIn(List<Long> values) {
            addCriterion("imooc_role_imooc_id in", values, "imoocRoleImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocRoleImoocIdNotIn(List<Long> values) {
            addCriterion("imooc_role_imooc_id not in", values, "imoocRoleImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocRoleImoocIdBetween(Long value1, Long value2) {
            addCriterion("imooc_role_imooc_id between", value1, value2, "imoocRoleImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocRoleImoocIdNotBetween(Long value1, Long value2) {
            addCriterion("imooc_role_imooc_id not between", value1, value2, "imoocRoleImoocId");
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