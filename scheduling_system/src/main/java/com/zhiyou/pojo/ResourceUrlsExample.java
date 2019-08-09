package com.zhiyou.pojo;

import java.util.ArrayList;
import java.util.List;

public class ResourceUrlsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourceUrlsExample() {
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

        public Criteria andImoocUrlsIsNull() {
            addCriterion("imooc_urls is null");
            return (Criteria) this;
        }

        public Criteria andImoocUrlsIsNotNull() {
            addCriterion("imooc_urls is not null");
            return (Criteria) this;
        }

        public Criteria andImoocUrlsEqualTo(String value) {
            addCriterion("imooc_urls =", value, "imoocUrls");
            return (Criteria) this;
        }

        public Criteria andImoocUrlsNotEqualTo(String value) {
            addCriterion("imooc_urls <>", value, "imoocUrls");
            return (Criteria) this;
        }

        public Criteria andImoocUrlsGreaterThan(String value) {
            addCriterion("imooc_urls >", value, "imoocUrls");
            return (Criteria) this;
        }

        public Criteria andImoocUrlsGreaterThanOrEqualTo(String value) {
            addCriterion("imooc_urls >=", value, "imoocUrls");
            return (Criteria) this;
        }

        public Criteria andImoocUrlsLessThan(String value) {
            addCriterion("imooc_urls <", value, "imoocUrls");
            return (Criteria) this;
        }

        public Criteria andImoocUrlsLessThanOrEqualTo(String value) {
            addCriterion("imooc_urls <=", value, "imoocUrls");
            return (Criteria) this;
        }

        public Criteria andImoocUrlsLike(String value) {
            addCriterion("imooc_urls like", value, "imoocUrls");
            return (Criteria) this;
        }

        public Criteria andImoocUrlsNotLike(String value) {
            addCriterion("imooc_urls not like", value, "imoocUrls");
            return (Criteria) this;
        }

        public Criteria andImoocUrlsIn(List<String> values) {
            addCriterion("imooc_urls in", values, "imoocUrls");
            return (Criteria) this;
        }

        public Criteria andImoocUrlsNotIn(List<String> values) {
            addCriterion("imooc_urls not in", values, "imoocUrls");
            return (Criteria) this;
        }

        public Criteria andImoocUrlsBetween(String value1, String value2) {
            addCriterion("imooc_urls between", value1, value2, "imoocUrls");
            return (Criteria) this;
        }

        public Criteria andImoocUrlsNotBetween(String value1, String value2) {
            addCriterion("imooc_urls not between", value1, value2, "imoocUrls");
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