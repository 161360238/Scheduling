package com.zhiyou.pojo;

import java.util.ArrayList;
import java.util.List;

public class InventoryDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InventoryDataExample() {
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

        public Criteria andInverntoryNumberIsNull() {
            addCriterion("inverntory_number is null");
            return (Criteria) this;
        }

        public Criteria andInverntoryNumberIsNotNull() {
            addCriterion("inverntory_number is not null");
            return (Criteria) this;
        }

        public Criteria andInverntoryNumberEqualTo(String value) {
            addCriterion("inverntory_number =", value, "inverntoryNumber");
            return (Criteria) this;
        }

        public Criteria andInverntoryNumberNotEqualTo(String value) {
            addCriterion("inverntory_number <>", value, "inverntoryNumber");
            return (Criteria) this;
        }

        public Criteria andInverntoryNumberGreaterThan(String value) {
            addCriterion("inverntory_number >", value, "inverntoryNumber");
            return (Criteria) this;
        }

        public Criteria andInverntoryNumberGreaterThanOrEqualTo(String value) {
            addCriterion("inverntory_number >=", value, "inverntoryNumber");
            return (Criteria) this;
        }

        public Criteria andInverntoryNumberLessThan(String value) {
            addCriterion("inverntory_number <", value, "inverntoryNumber");
            return (Criteria) this;
        }

        public Criteria andInverntoryNumberLessThanOrEqualTo(String value) {
            addCriterion("inverntory_number <=", value, "inverntoryNumber");
            return (Criteria) this;
        }

        public Criteria andInverntoryNumberLike(String value) {
            addCriterion("inverntory_number like", value, "inverntoryNumber");
            return (Criteria) this;
        }

        public Criteria andInverntoryNumberNotLike(String value) {
            addCriterion("inverntory_number not like", value, "inverntoryNumber");
            return (Criteria) this;
        }

        public Criteria andInverntoryNumberIn(List<String> values) {
            addCriterion("inverntory_number in", values, "inverntoryNumber");
            return (Criteria) this;
        }

        public Criteria andInverntoryNumberNotIn(List<String> values) {
            addCriterion("inverntory_number not in", values, "inverntoryNumber");
            return (Criteria) this;
        }

        public Criteria andInverntoryNumberBetween(String value1, String value2) {
            addCriterion("inverntory_number between", value1, value2, "inverntoryNumber");
            return (Criteria) this;
        }

        public Criteria andInverntoryNumberNotBetween(String value1, String value2) {
            addCriterion("inverntory_number not between", value1, value2, "inverntoryNumber");
            return (Criteria) this;
        }

        public Criteria andInventoryNameIsNull() {
            addCriterion("inventory-name is null");
            return (Criteria) this;
        }

        public Criteria andInventoryNameIsNotNull() {
            addCriterion("inventory-name is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryNameEqualTo(String value) {
            addCriterion("inventory-name =", value, "inventoryName");
            return (Criteria) this;
        }

        public Criteria andInventoryNameNotEqualTo(String value) {
            addCriterion("inventory-name <>", value, "inventoryName");
            return (Criteria) this;
        }

        public Criteria andInventoryNameGreaterThan(String value) {
            addCriterion("inventory-name >", value, "inventoryName");
            return (Criteria) this;
        }

        public Criteria andInventoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("inventory-name >=", value, "inventoryName");
            return (Criteria) this;
        }

        public Criteria andInventoryNameLessThan(String value) {
            addCriterion("inventory-name <", value, "inventoryName");
            return (Criteria) this;
        }

        public Criteria andInventoryNameLessThanOrEqualTo(String value) {
            addCriterion("inventory-name <=", value, "inventoryName");
            return (Criteria) this;
        }

        public Criteria andInventoryNameLike(String value) {
            addCriterion("inventory-name like", value, "inventoryName");
            return (Criteria) this;
        }

        public Criteria andInventoryNameNotLike(String value) {
            addCriterion("inventory-name not like", value, "inventoryName");
            return (Criteria) this;
        }

        public Criteria andInventoryNameIn(List<String> values) {
            addCriterion("inventory-name in", values, "inventoryName");
            return (Criteria) this;
        }

        public Criteria andInventoryNameNotIn(List<String> values) {
            addCriterion("inventory-name not in", values, "inventoryName");
            return (Criteria) this;
        }

        public Criteria andInventoryNameBetween(String value1, String value2) {
            addCriterion("inventory-name between", value1, value2, "inventoryName");
            return (Criteria) this;
        }

        public Criteria andInventoryNameNotBetween(String value1, String value2) {
            addCriterion("inventory-name not between", value1, value2, "inventoryName");
            return (Criteria) this;
        }

        public Criteria andLotNumberIsNull() {
            addCriterion("lot_number is null");
            return (Criteria) this;
        }

        public Criteria andLotNumberIsNotNull() {
            addCriterion("lot_number is not null");
            return (Criteria) this;
        }

        public Criteria andLotNumberEqualTo(String value) {
            addCriterion("lot_number =", value, "lotNumber");
            return (Criteria) this;
        }

        public Criteria andLotNumberNotEqualTo(String value) {
            addCriterion("lot_number <>", value, "lotNumber");
            return (Criteria) this;
        }

        public Criteria andLotNumberGreaterThan(String value) {
            addCriterion("lot_number >", value, "lotNumber");
            return (Criteria) this;
        }

        public Criteria andLotNumberGreaterThanOrEqualTo(String value) {
            addCriterion("lot_number >=", value, "lotNumber");
            return (Criteria) this;
        }

        public Criteria andLotNumberLessThan(String value) {
            addCriterion("lot_number <", value, "lotNumber");
            return (Criteria) this;
        }

        public Criteria andLotNumberLessThanOrEqualTo(String value) {
            addCriterion("lot_number <=", value, "lotNumber");
            return (Criteria) this;
        }

        public Criteria andLotNumberLike(String value) {
            addCriterion("lot_number like", value, "lotNumber");
            return (Criteria) this;
        }

        public Criteria andLotNumberNotLike(String value) {
            addCriterion("lot_number not like", value, "lotNumber");
            return (Criteria) this;
        }

        public Criteria andLotNumberIn(List<String> values) {
            addCriterion("lot_number in", values, "lotNumber");
            return (Criteria) this;
        }

        public Criteria andLotNumberNotIn(List<String> values) {
            addCriterion("lot_number not in", values, "lotNumber");
            return (Criteria) this;
        }

        public Criteria andLotNumberBetween(String value1, String value2) {
            addCriterion("lot_number between", value1, value2, "lotNumber");
            return (Criteria) this;
        }

        public Criteria andLotNumberNotBetween(String value1, String value2) {
            addCriterion("lot_number not between", value1, value2, "lotNumber");
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

        public Criteria andMaterialDescriptionIsNull() {
            addCriterion("material_description is null");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionIsNotNull() {
            addCriterion("material_description is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionEqualTo(String value) {
            addCriterion("material_description =", value, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionNotEqualTo(String value) {
            addCriterion("material_description <>", value, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionGreaterThan(String value) {
            addCriterion("material_description >", value, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("material_description >=", value, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionLessThan(String value) {
            addCriterion("material_description <", value, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionLessThanOrEqualTo(String value) {
            addCriterion("material_description <=", value, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionLike(String value) {
            addCriterion("material_description like", value, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionNotLike(String value) {
            addCriterion("material_description not like", value, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionIn(List<String> values) {
            addCriterion("material_description in", values, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionNotIn(List<String> values) {
            addCriterion("material_description not in", values, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionBetween(String value1, String value2) {
            addCriterion("material_description between", value1, value2, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialDescriptionNotBetween(String value1, String value2) {
            addCriterion("material_description not between", value1, value2, "materialDescription");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryIsNull() {
            addCriterion("material_category is null");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryIsNotNull() {
            addCriterion("material_category is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryEqualTo(String value) {
            addCriterion("material_category =", value, "materialCategory");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryNotEqualTo(String value) {
            addCriterion("material_category <>", value, "materialCategory");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryGreaterThan(String value) {
            addCriterion("material_category >", value, "materialCategory");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("material_category >=", value, "materialCategory");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryLessThan(String value) {
            addCriterion("material_category <", value, "materialCategory");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryLessThanOrEqualTo(String value) {
            addCriterion("material_category <=", value, "materialCategory");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryLike(String value) {
            addCriterion("material_category like", value, "materialCategory");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryNotLike(String value) {
            addCriterion("material_category not like", value, "materialCategory");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryIn(List<String> values) {
            addCriterion("material_category in", values, "materialCategory");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryNotIn(List<String> values) {
            addCriterion("material_category not in", values, "materialCategory");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryBetween(String value1, String value2) {
            addCriterion("material_category between", value1, value2, "materialCategory");
            return (Criteria) this;
        }

        public Criteria andMaterialCategoryNotBetween(String value1, String value2) {
            addCriterion("material_category not between", value1, value2, "materialCategory");
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