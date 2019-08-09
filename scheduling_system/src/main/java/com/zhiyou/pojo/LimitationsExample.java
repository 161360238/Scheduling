package com.zhiyou.pojo;

import java.util.ArrayList;
import java.util.List;

public class LimitationsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LimitationsExample() {
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

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andOperationOrderIsNull() {
            addCriterion("Operation_order is null");
            return (Criteria) this;
        }

        public Criteria andOperationOrderIsNotNull() {
            addCriterion("Operation_order is not null");
            return (Criteria) this;
        }

        public Criteria andOperationOrderEqualTo(Integer value) {
            addCriterion("Operation_order =", value, "operationOrder");
            return (Criteria) this;
        }

        public Criteria andOperationOrderNotEqualTo(Integer value) {
            addCriterion("Operation_order <>", value, "operationOrder");
            return (Criteria) this;
        }

        public Criteria andOperationOrderGreaterThan(Integer value) {
            addCriterion("Operation_order >", value, "operationOrder");
            return (Criteria) this;
        }

        public Criteria andOperationOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("Operation_order >=", value, "operationOrder");
            return (Criteria) this;
        }

        public Criteria andOperationOrderLessThan(Integer value) {
            addCriterion("Operation_order <", value, "operationOrder");
            return (Criteria) this;
        }

        public Criteria andOperationOrderLessThanOrEqualTo(Integer value) {
            addCriterion("Operation_order <=", value, "operationOrder");
            return (Criteria) this;
        }

        public Criteria andOperationOrderIn(List<Integer> values) {
            addCriterion("Operation_order in", values, "operationOrder");
            return (Criteria) this;
        }

        public Criteria andOperationOrderNotIn(List<Integer> values) {
            addCriterion("Operation_order not in", values, "operationOrder");
            return (Criteria) this;
        }

        public Criteria andOperationOrderBetween(Integer value1, Integer value2) {
            addCriterion("Operation_order between", value1, value2, "operationOrder");
            return (Criteria) this;
        }

        public Criteria andOperationOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("Operation_order not between", value1, value2, "operationOrder");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberIsNull() {
            addCriterion("equipment_number is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberIsNotNull() {
            addCriterion("equipment_number is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberEqualTo(String value) {
            addCriterion("equipment_number =", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberNotEqualTo(String value) {
            addCriterion("equipment_number <>", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberGreaterThan(String value) {
            addCriterion("equipment_number >", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_number >=", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberLessThan(String value) {
            addCriterion("equipment_number <", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberLessThanOrEqualTo(String value) {
            addCriterion("equipment_number <=", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberLike(String value) {
            addCriterion("equipment_number like", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberNotLike(String value) {
            addCriterion("equipment_number not like", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberIn(List<String> values) {
            addCriterion("equipment_number in", values, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberNotIn(List<String> values) {
            addCriterion("equipment_number not in", values, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberBetween(String value1, String value2) {
            addCriterion("equipment_number between", value1, value2, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberNotBetween(String value1, String value2) {
            addCriterion("equipment_number not between", value1, value2, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNull() {
            addCriterion("capacity is null");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNotNull() {
            addCriterion("capacity is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityEqualTo(Integer value) {
            addCriterion("capacity =", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotEqualTo(Integer value) {
            addCriterion("capacity <>", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThan(Integer value) {
            addCriterion("capacity >", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("capacity >=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThan(Integer value) {
            addCriterion("capacity <", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("capacity <=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityIn(List<Integer> values) {
            addCriterion("capacity in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotIn(List<Integer> values) {
            addCriterion("capacity not in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityBetween(Integer value1, Integer value2) {
            addCriterion("capacity between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("capacity not between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andMinPrdQuantIsNull() {
            addCriterion("min_prd_quant is null");
            return (Criteria) this;
        }

        public Criteria andMinPrdQuantIsNotNull() {
            addCriterion("min_prd_quant is not null");
            return (Criteria) this;
        }

        public Criteria andMinPrdQuantEqualTo(Integer value) {
            addCriterion("min_prd_quant =", value, "minPrdQuant");
            return (Criteria) this;
        }

        public Criteria andMinPrdQuantNotEqualTo(Integer value) {
            addCriterion("min_prd_quant <>", value, "minPrdQuant");
            return (Criteria) this;
        }

        public Criteria andMinPrdQuantGreaterThan(Integer value) {
            addCriterion("min_prd_quant >", value, "minPrdQuant");
            return (Criteria) this;
        }

        public Criteria andMinPrdQuantGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_prd_quant >=", value, "minPrdQuant");
            return (Criteria) this;
        }

        public Criteria andMinPrdQuantLessThan(Integer value) {
            addCriterion("min_prd_quant <", value, "minPrdQuant");
            return (Criteria) this;
        }

        public Criteria andMinPrdQuantLessThanOrEqualTo(Integer value) {
            addCriterion("min_prd_quant <=", value, "minPrdQuant");
            return (Criteria) this;
        }

        public Criteria andMinPrdQuantIn(List<Integer> values) {
            addCriterion("min_prd_quant in", values, "minPrdQuant");
            return (Criteria) this;
        }

        public Criteria andMinPrdQuantNotIn(List<Integer> values) {
            addCriterion("min_prd_quant not in", values, "minPrdQuant");
            return (Criteria) this;
        }

        public Criteria andMinPrdQuantBetween(Integer value1, Integer value2) {
            addCriterion("min_prd_quant between", value1, value2, "minPrdQuant");
            return (Criteria) this;
        }

        public Criteria andMinPrdQuantNotBetween(Integer value1, Integer value2) {
            addCriterion("min_prd_quant not between", value1, value2, "minPrdQuant");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqIsNull() {
            addCriterion("work_force_req is null");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqIsNotNull() {
            addCriterion("work_force_req is not null");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqEqualTo(String value) {
            addCriterion("work_force_req =", value, "workForceReq");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqNotEqualTo(String value) {
            addCriterion("work_force_req <>", value, "workForceReq");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqGreaterThan(String value) {
            addCriterion("work_force_req >", value, "workForceReq");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqGreaterThanOrEqualTo(String value) {
            addCriterion("work_force_req >=", value, "workForceReq");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqLessThan(String value) {
            addCriterion("work_force_req <", value, "workForceReq");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqLessThanOrEqualTo(String value) {
            addCriterion("work_force_req <=", value, "workForceReq");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqLike(String value) {
            addCriterion("work_force_req like", value, "workForceReq");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqNotLike(String value) {
            addCriterion("work_force_req not like", value, "workForceReq");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqIn(List<String> values) {
            addCriterion("work_force_req in", values, "workForceReq");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqNotIn(List<String> values) {
            addCriterion("work_force_req not in", values, "workForceReq");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqBetween(String value1, String value2) {
            addCriterion("work_force_req between", value1, value2, "workForceReq");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqNotBetween(String value1, String value2) {
            addCriterion("work_force_req not between", value1, value2, "workForceReq");
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