package com.zhiyou.pojo;

import java.util.ArrayList;
import java.util.List;

public class PostWorkingHoursExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostWorkingHoursExample() {
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

        public Criteria andProcessNameIsNull() {
            addCriterion("process_name is null");
            return (Criteria) this;
        }

        public Criteria andProcessNameIsNotNull() {
            addCriterion("process_name is not null");
            return (Criteria) this;
        }

        public Criteria andProcessNameEqualTo(String value) {
            addCriterion("process_name =", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotEqualTo(String value) {
            addCriterion("process_name <>", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameGreaterThan(String value) {
            addCriterion("process_name >", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameGreaterThanOrEqualTo(String value) {
            addCriterion("process_name >=", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLessThan(String value) {
            addCriterion("process_name <", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLessThanOrEqualTo(String value) {
            addCriterion("process_name <=", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameLike(String value) {
            addCriterion("process_name like", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotLike(String value) {
            addCriterion("process_name not like", value, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameIn(List<String> values) {
            addCriterion("process_name in", values, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotIn(List<String> values) {
            addCriterion("process_name not in", values, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameBetween(String value1, String value2) {
            addCriterion("process_name between", value1, value2, "processName");
            return (Criteria) this;
        }

        public Criteria andProcessNameNotBetween(String value1, String value2) {
            addCriterion("process_name not between", value1, value2, "processName");
            return (Criteria) this;
        }

        public Criteria andEquimentNumberIsNull() {
            addCriterion("equiment_number is null");
            return (Criteria) this;
        }

        public Criteria andEquimentNumberIsNotNull() {
            addCriterion("equiment_number is not null");
            return (Criteria) this;
        }

        public Criteria andEquimentNumberEqualTo(String value) {
            addCriterion("equiment_number =", value, "equimentNumber");
            return (Criteria) this;
        }

        public Criteria andEquimentNumberNotEqualTo(String value) {
            addCriterion("equiment_number <>", value, "equimentNumber");
            return (Criteria) this;
        }

        public Criteria andEquimentNumberGreaterThan(String value) {
            addCriterion("equiment_number >", value, "equimentNumber");
            return (Criteria) this;
        }

        public Criteria andEquimentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("equiment_number >=", value, "equimentNumber");
            return (Criteria) this;
        }

        public Criteria andEquimentNumberLessThan(String value) {
            addCriterion("equiment_number <", value, "equimentNumber");
            return (Criteria) this;
        }

        public Criteria andEquimentNumberLessThanOrEqualTo(String value) {
            addCriterion("equiment_number <=", value, "equimentNumber");
            return (Criteria) this;
        }

        public Criteria andEquimentNumberLike(String value) {
            addCriterion("equiment_number like", value, "equimentNumber");
            return (Criteria) this;
        }

        public Criteria andEquimentNumberNotLike(String value) {
            addCriterion("equiment_number not like", value, "equimentNumber");
            return (Criteria) this;
        }

        public Criteria andEquimentNumberIn(List<String> values) {
            addCriterion("equiment_number in", values, "equimentNumber");
            return (Criteria) this;
        }

        public Criteria andEquimentNumberNotIn(List<String> values) {
            addCriterion("equiment_number not in", values, "equimentNumber");
            return (Criteria) this;
        }

        public Criteria andEquimentNumberBetween(String value1, String value2) {
            addCriterion("equiment_number between", value1, value2, "equimentNumber");
            return (Criteria) this;
        }

        public Criteria andEquimentNumberNotBetween(String value1, String value2) {
            addCriterion("equiment_number not between", value1, value2, "equimentNumber");
            return (Criteria) this;
        }

        public Criteria andProcessTimeAvgIsNull() {
            addCriterion("process_time_avg is null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeAvgIsNotNull() {
            addCriterion("process_time_avg is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeAvgEqualTo(Double value) {
            addCriterion("process_time_avg =", value, "processTimeAvg");
            return (Criteria) this;
        }

        public Criteria andProcessTimeAvgNotEqualTo(Double value) {
            addCriterion("process_time_avg <>", value, "processTimeAvg");
            return (Criteria) this;
        }

        public Criteria andProcessTimeAvgGreaterThan(Double value) {
            addCriterion("process_time_avg >", value, "processTimeAvg");
            return (Criteria) this;
        }

        public Criteria andProcessTimeAvgGreaterThanOrEqualTo(Double value) {
            addCriterion("process_time_avg >=", value, "processTimeAvg");
            return (Criteria) this;
        }

        public Criteria andProcessTimeAvgLessThan(Double value) {
            addCriterion("process_time_avg <", value, "processTimeAvg");
            return (Criteria) this;
        }

        public Criteria andProcessTimeAvgLessThanOrEqualTo(Double value) {
            addCriterion("process_time_avg <=", value, "processTimeAvg");
            return (Criteria) this;
        }

        public Criteria andProcessTimeAvgIn(List<Double> values) {
            addCriterion("process_time_avg in", values, "processTimeAvg");
            return (Criteria) this;
        }

        public Criteria andProcessTimeAvgNotIn(List<Double> values) {
            addCriterion("process_time_avg not in", values, "processTimeAvg");
            return (Criteria) this;
        }

        public Criteria andProcessTimeAvgBetween(Double value1, Double value2) {
            addCriterion("process_time_avg between", value1, value2, "processTimeAvg");
            return (Criteria) this;
        }

        public Criteria andProcessTimeAvgNotBetween(Double value1, Double value2) {
            addCriterion("process_time_avg not between", value1, value2, "processTimeAvg");
            return (Criteria) this;
        }

        public Criteria andProcessTimeMaxIsNull() {
            addCriterion("process_time_max is null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeMaxIsNotNull() {
            addCriterion("process_time_max is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeMaxEqualTo(Double value) {
            addCriterion("process_time_max =", value, "processTimeMax");
            return (Criteria) this;
        }

        public Criteria andProcessTimeMaxNotEqualTo(Double value) {
            addCriterion("process_time_max <>", value, "processTimeMax");
            return (Criteria) this;
        }

        public Criteria andProcessTimeMaxGreaterThan(Double value) {
            addCriterion("process_time_max >", value, "processTimeMax");
            return (Criteria) this;
        }

        public Criteria andProcessTimeMaxGreaterThanOrEqualTo(Double value) {
            addCriterion("process_time_max >=", value, "processTimeMax");
            return (Criteria) this;
        }

        public Criteria andProcessTimeMaxLessThan(Double value) {
            addCriterion("process_time_max <", value, "processTimeMax");
            return (Criteria) this;
        }

        public Criteria andProcessTimeMaxLessThanOrEqualTo(Double value) {
            addCriterion("process_time_max <=", value, "processTimeMax");
            return (Criteria) this;
        }

        public Criteria andProcessTimeMaxIn(List<Double> values) {
            addCriterion("process_time_max in", values, "processTimeMax");
            return (Criteria) this;
        }

        public Criteria andProcessTimeMaxNotIn(List<Double> values) {
            addCriterion("process_time_max not in", values, "processTimeMax");
            return (Criteria) this;
        }

        public Criteria andProcessTimeMaxBetween(Double value1, Double value2) {
            addCriterion("process_time_max between", value1, value2, "processTimeMax");
            return (Criteria) this;
        }

        public Criteria andProcessTimeMaxNotBetween(Double value1, Double value2) {
            addCriterion("process_time_max not between", value1, value2, "processTimeMax");
            return (Criteria) this;
        }

        public Criteria andProcessTimeMinIsNull() {
            addCriterion("process_time_min is null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeMinIsNotNull() {
            addCriterion("process_time_min is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeMinEqualTo(Double value) {
            addCriterion("process_time_min =", value, "processTimeMin");
            return (Criteria) this;
        }

        public Criteria andProcessTimeMinNotEqualTo(Double value) {
            addCriterion("process_time_min <>", value, "processTimeMin");
            return (Criteria) this;
        }

        public Criteria andProcessTimeMinGreaterThan(Double value) {
            addCriterion("process_time_min >", value, "processTimeMin");
            return (Criteria) this;
        }

        public Criteria andProcessTimeMinGreaterThanOrEqualTo(Double value) {
            addCriterion("process_time_min >=", value, "processTimeMin");
            return (Criteria) this;
        }

        public Criteria andProcessTimeMinLessThan(Double value) {
            addCriterion("process_time_min <", value, "processTimeMin");
            return (Criteria) this;
        }

        public Criteria andProcessTimeMinLessThanOrEqualTo(Double value) {
            addCriterion("process_time_min <=", value, "processTimeMin");
            return (Criteria) this;
        }

        public Criteria andProcessTimeMinIn(List<Double> values) {
            addCriterion("process_time_min in", values, "processTimeMin");
            return (Criteria) this;
        }

        public Criteria andProcessTimeMinNotIn(List<Double> values) {
            addCriterion("process_time_min not in", values, "processTimeMin");
            return (Criteria) this;
        }

        public Criteria andProcessTimeMinBetween(Double value1, Double value2) {
            addCriterion("process_time_min between", value1, value2, "processTimeMin");
            return (Criteria) this;
        }

        public Criteria andProcessTimeMinNotBetween(Double value1, Double value2) {
            addCriterion("process_time_min not between", value1, value2, "processTimeMin");
            return (Criteria) this;
        }

        public Criteria andProcessTimeStdIsNull() {
            addCriterion("process_time_std is null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeStdIsNotNull() {
            addCriterion("process_time_std is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeStdEqualTo(Double value) {
            addCriterion("process_time_std =", value, "processTimeStd");
            return (Criteria) this;
        }

        public Criteria andProcessTimeStdNotEqualTo(Double value) {
            addCriterion("process_time_std <>", value, "processTimeStd");
            return (Criteria) this;
        }

        public Criteria andProcessTimeStdGreaterThan(Double value) {
            addCriterion("process_time_std >", value, "processTimeStd");
            return (Criteria) this;
        }

        public Criteria andProcessTimeStdGreaterThanOrEqualTo(Double value) {
            addCriterion("process_time_std >=", value, "processTimeStd");
            return (Criteria) this;
        }

        public Criteria andProcessTimeStdLessThan(Double value) {
            addCriterion("process_time_std <", value, "processTimeStd");
            return (Criteria) this;
        }

        public Criteria andProcessTimeStdLessThanOrEqualTo(Double value) {
            addCriterion("process_time_std <=", value, "processTimeStd");
            return (Criteria) this;
        }

        public Criteria andProcessTimeStdIn(List<Double> values) {
            addCriterion("process_time_std in", values, "processTimeStd");
            return (Criteria) this;
        }

        public Criteria andProcessTimeStdNotIn(List<Double> values) {
            addCriterion("process_time_std not in", values, "processTimeStd");
            return (Criteria) this;
        }

        public Criteria andProcessTimeStdBetween(Double value1, Double value2) {
            addCriterion("process_time_std between", value1, value2, "processTimeStd");
            return (Criteria) this;
        }

        public Criteria andProcessTimeStdNotBetween(Double value1, Double value2) {
            addCriterion("process_time_std not between", value1, value2, "processTimeStd");
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