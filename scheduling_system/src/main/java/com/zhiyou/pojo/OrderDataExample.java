package com.zhiyou.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDataExample() {
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

        public Criteria andPoNumberIsNull() {
            addCriterion("po_number is null");
            return (Criteria) this;
        }

        public Criteria andPoNumberIsNotNull() {
            addCriterion("po_number is not null");
            return (Criteria) this;
        }

        public Criteria andPoNumberEqualTo(String value) {
            addCriterion("po_number =", value, "poNumber");
            return (Criteria) this;
        }

        public Criteria andPoNumberNotEqualTo(String value) {
            addCriterion("po_number <>", value, "poNumber");
            return (Criteria) this;
        }

        public Criteria andPoNumberGreaterThan(String value) {
            addCriterion("po_number >", value, "poNumber");
            return (Criteria) this;
        }

        public Criteria andPoNumberGreaterThanOrEqualTo(String value) {
            addCriterion("po_number >=", value, "poNumber");
            return (Criteria) this;
        }

        public Criteria andPoNumberLessThan(String value) {
            addCriterion("po_number <", value, "poNumber");
            return (Criteria) this;
        }

        public Criteria andPoNumberLessThanOrEqualTo(String value) {
            addCriterion("po_number <=", value, "poNumber");
            return (Criteria) this;
        }

        public Criteria andPoNumberLike(String value) {
            addCriterion("po_number like", value, "poNumber");
            return (Criteria) this;
        }

        public Criteria andPoNumberNotLike(String value) {
            addCriterion("po_number not like", value, "poNumber");
            return (Criteria) this;
        }

        public Criteria andPoNumberIn(List<String> values) {
            addCriterion("po_number in", values, "poNumber");
            return (Criteria) this;
        }

        public Criteria andPoNumberNotIn(List<String> values) {
            addCriterion("po_number not in", values, "poNumber");
            return (Criteria) this;
        }

        public Criteria andPoNumberBetween(String value1, String value2) {
            addCriterion("po_number between", value1, value2, "poNumber");
            return (Criteria) this;
        }

        public Criteria andPoNumberNotBetween(String value1, String value2) {
            addCriterion("po_number not between", value1, value2, "poNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberIsNull() {
            addCriterion("product_number is null");
            return (Criteria) this;
        }

        public Criteria andProductNumberIsNotNull() {
            addCriterion("product_number is not null");
            return (Criteria) this;
        }

        public Criteria andProductNumberEqualTo(String value) {
            addCriterion("product_number =", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotEqualTo(String value) {
            addCriterion("product_number <>", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberGreaterThan(String value) {
            addCriterion("product_number >", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberGreaterThanOrEqualTo(String value) {
            addCriterion("product_number >=", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberLessThan(String value) {
            addCriterion("product_number <", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberLessThanOrEqualTo(String value) {
            addCriterion("product_number <=", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberLike(String value) {
            addCriterion("product_number like", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotLike(String value) {
            addCriterion("product_number not like", value, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberIn(List<String> values) {
            addCriterion("product_number in", values, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotIn(List<String> values) {
            addCriterion("product_number not in", values, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberBetween(String value1, String value2) {
            addCriterion("product_number between", value1, value2, "productNumber");
            return (Criteria) this;
        }

        public Criteria andProductNumberNotBetween(String value1, String value2) {
            addCriterion("product_number not between", value1, value2, "productNumber");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andTargetDeliveryIsNull() {
            addCriterion("target_delivery is null");
            return (Criteria) this;
        }

        public Criteria andTargetDeliveryIsNotNull() {
            addCriterion("target_delivery is not null");
            return (Criteria) this;
        }

        public Criteria andTargetDeliveryEqualTo(Date value) {
            addCriterion("target_delivery =", value, "targetDelivery");
            return (Criteria) this;
        }

        public Criteria andTargetDeliveryNotEqualTo(Date value) {
            addCriterion("target_delivery <>", value, "targetDelivery");
            return (Criteria) this;
        }

        public Criteria andTargetDeliveryGreaterThan(Date value) {
            addCriterion("target_delivery >", value, "targetDelivery");
            return (Criteria) this;
        }

        public Criteria andTargetDeliveryGreaterThanOrEqualTo(Date value) {
            addCriterion("target_delivery >=", value, "targetDelivery");
            return (Criteria) this;
        }

        public Criteria andTargetDeliveryLessThan(Date value) {
            addCriterion("target_delivery <", value, "targetDelivery");
            return (Criteria) this;
        }

        public Criteria andTargetDeliveryLessThanOrEqualTo(Date value) {
            addCriterion("target_delivery <=", value, "targetDelivery");
            return (Criteria) this;
        }

        public Criteria andTargetDeliveryIn(List<Date> values) {
            addCriterion("target_delivery in", values, "targetDelivery");
            return (Criteria) this;
        }

        public Criteria andTargetDeliveryNotIn(List<Date> values) {
            addCriterion("target_delivery not in", values, "targetDelivery");
            return (Criteria) this;
        }

        public Criteria andTargetDeliveryBetween(Date value1, Date value2) {
            addCriterion("target_delivery between", value1, value2, "targetDelivery");
            return (Criteria) this;
        }

        public Criteria andTargetDeliveryNotBetween(Date value1, Date value2) {
            addCriterion("target_delivery not between", value1, value2, "targetDelivery");
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