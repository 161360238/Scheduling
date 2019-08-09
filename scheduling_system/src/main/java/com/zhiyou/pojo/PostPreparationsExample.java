package com.zhiyou.pojo;

import java.util.ArrayList;
import java.util.List;

public class PostPreparationsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostPreparationsExample() {
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

        public Criteria andRawMaterialNumberIsNull() {
            addCriterion("raw_material_number is null");
            return (Criteria) this;
        }

        public Criteria andRawMaterialNumberIsNotNull() {
            addCriterion("raw_material_number is not null");
            return (Criteria) this;
        }

        public Criteria andRawMaterialNumberEqualTo(String value) {
            addCriterion("raw_material_number =", value, "rawMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andRawMaterialNumberNotEqualTo(String value) {
            addCriterion("raw_material_number <>", value, "rawMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andRawMaterialNumberGreaterThan(String value) {
            addCriterion("raw_material_number >", value, "rawMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andRawMaterialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("raw_material_number >=", value, "rawMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andRawMaterialNumberLessThan(String value) {
            addCriterion("raw_material_number <", value, "rawMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andRawMaterialNumberLessThanOrEqualTo(String value) {
            addCriterion("raw_material_number <=", value, "rawMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andRawMaterialNumberLike(String value) {
            addCriterion("raw_material_number like", value, "rawMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andRawMaterialNumberNotLike(String value) {
            addCriterion("raw_material_number not like", value, "rawMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andRawMaterialNumberIn(List<String> values) {
            addCriterion("raw_material_number in", values, "rawMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andRawMaterialNumberNotIn(List<String> values) {
            addCriterion("raw_material_number not in", values, "rawMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andRawMaterialNumberBetween(String value1, String value2) {
            addCriterion("raw_material_number between", value1, value2, "rawMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andRawMaterialNumberNotBetween(String value1, String value2) {
            addCriterion("raw_material_number not between", value1, value2, "rawMaterialNumber");
            return (Criteria) this;
        }

        public Criteria andReqRmQuantityIsNull() {
            addCriterion("req_rm_quantity is null");
            return (Criteria) this;
        }

        public Criteria andReqRmQuantityIsNotNull() {
            addCriterion("req_rm_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andReqRmQuantityEqualTo(Integer value) {
            addCriterion("req_rm_quantity =", value, "reqRmQuantity");
            return (Criteria) this;
        }

        public Criteria andReqRmQuantityNotEqualTo(Integer value) {
            addCriterion("req_rm_quantity <>", value, "reqRmQuantity");
            return (Criteria) this;
        }

        public Criteria andReqRmQuantityGreaterThan(Integer value) {
            addCriterion("req_rm_quantity >", value, "reqRmQuantity");
            return (Criteria) this;
        }

        public Criteria andReqRmQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("req_rm_quantity >=", value, "reqRmQuantity");
            return (Criteria) this;
        }

        public Criteria andReqRmQuantityLessThan(Integer value) {
            addCriterion("req_rm_quantity <", value, "reqRmQuantity");
            return (Criteria) this;
        }

        public Criteria andReqRmQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("req_rm_quantity <=", value, "reqRmQuantity");
            return (Criteria) this;
        }

        public Criteria andReqRmQuantityIn(List<Integer> values) {
            addCriterion("req_rm_quantity in", values, "reqRmQuantity");
            return (Criteria) this;
        }

        public Criteria andReqRmQuantityNotIn(List<Integer> values) {
            addCriterion("req_rm_quantity not in", values, "reqRmQuantity");
            return (Criteria) this;
        }

        public Criteria andReqRmQuantityBetween(Integer value1, Integer value2) {
            addCriterion("req_rm_quantity between", value1, value2, "reqRmQuantity");
            return (Criteria) this;
        }

        public Criteria andReqRmQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("req_rm_quantity not between", value1, value2, "reqRmQuantity");
            return (Criteria) this;
        }

        public Criteria andRawMaterialQuantityIsNull() {
            addCriterion("raw_material_quantity is null");
            return (Criteria) this;
        }

        public Criteria andRawMaterialQuantityIsNotNull() {
            addCriterion("raw_material_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andRawMaterialQuantityEqualTo(Integer value) {
            addCriterion("raw_material_quantity =", value, "rawMaterialQuantity");
            return (Criteria) this;
        }

        public Criteria andRawMaterialQuantityNotEqualTo(Integer value) {
            addCriterion("raw_material_quantity <>", value, "rawMaterialQuantity");
            return (Criteria) this;
        }

        public Criteria andRawMaterialQuantityGreaterThan(Integer value) {
            addCriterion("raw_material_quantity >", value, "rawMaterialQuantity");
            return (Criteria) this;
        }

        public Criteria andRawMaterialQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("raw_material_quantity >=", value, "rawMaterialQuantity");
            return (Criteria) this;
        }

        public Criteria andRawMaterialQuantityLessThan(Integer value) {
            addCriterion("raw_material_quantity <", value, "rawMaterialQuantity");
            return (Criteria) this;
        }

        public Criteria andRawMaterialQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("raw_material_quantity <=", value, "rawMaterialQuantity");
            return (Criteria) this;
        }

        public Criteria andRawMaterialQuantityIn(List<Integer> values) {
            addCriterion("raw_material_quantity in", values, "rawMaterialQuantity");
            return (Criteria) this;
        }

        public Criteria andRawMaterialQuantityNotIn(List<Integer> values) {
            addCriterion("raw_material_quantity not in", values, "rawMaterialQuantity");
            return (Criteria) this;
        }

        public Criteria andRawMaterialQuantityBetween(Integer value1, Integer value2) {
            addCriterion("raw_material_quantity between", value1, value2, "rawMaterialQuantity");
            return (Criteria) this;
        }

        public Criteria andRawMaterialQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("raw_material_quantity not between", value1, value2, "rawMaterialQuantity");
            return (Criteria) this;
        }

        public Criteria andRemainInventoryIsNull() {
            addCriterion("remain_inventory is null");
            return (Criteria) this;
        }

        public Criteria andRemainInventoryIsNotNull() {
            addCriterion("remain_inventory is not null");
            return (Criteria) this;
        }

        public Criteria andRemainInventoryEqualTo(Integer value) {
            addCriterion("remain_inventory =", value, "remainInventory");
            return (Criteria) this;
        }

        public Criteria andRemainInventoryNotEqualTo(Integer value) {
            addCriterion("remain_inventory <>", value, "remainInventory");
            return (Criteria) this;
        }

        public Criteria andRemainInventoryGreaterThan(Integer value) {
            addCriterion("remain_inventory >", value, "remainInventory");
            return (Criteria) this;
        }

        public Criteria andRemainInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("remain_inventory >=", value, "remainInventory");
            return (Criteria) this;
        }

        public Criteria andRemainInventoryLessThan(Integer value) {
            addCriterion("remain_inventory <", value, "remainInventory");
            return (Criteria) this;
        }

        public Criteria andRemainInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("remain_inventory <=", value, "remainInventory");
            return (Criteria) this;
        }

        public Criteria andRemainInventoryIn(List<Integer> values) {
            addCriterion("remain_inventory in", values, "remainInventory");
            return (Criteria) this;
        }

        public Criteria andRemainInventoryNotIn(List<Integer> values) {
            addCriterion("remain_inventory not in", values, "remainInventory");
            return (Criteria) this;
        }

        public Criteria andRemainInventoryBetween(Integer value1, Integer value2) {
            addCriterion("remain_inventory between", value1, value2, "remainInventory");
            return (Criteria) this;
        }

        public Criteria andRemainInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("remain_inventory not between", value1, value2, "remainInventory");
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