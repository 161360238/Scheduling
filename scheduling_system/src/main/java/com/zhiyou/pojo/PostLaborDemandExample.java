package com.zhiyou.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostLaborDemandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostLaborDemandExample() {
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

        public Criteria andWorkForceReqIsNull() {
            addCriterion("work_force_req is null");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqIsNotNull() {
            addCriterion("work_force_req is not null");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqEqualTo(Integer value) {
            addCriterion("work_force_req =", value, "workForceReq");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqNotEqualTo(Integer value) {
            addCriterion("work_force_req <>", value, "workForceReq");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqGreaterThan(Integer value) {
            addCriterion("work_force_req >", value, "workForceReq");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqGreaterThanOrEqualTo(Integer value) {
            addCriterion("work_force_req >=", value, "workForceReq");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqLessThan(Integer value) {
            addCriterion("work_force_req <", value, "workForceReq");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqLessThanOrEqualTo(Integer value) {
            addCriterion("work_force_req <=", value, "workForceReq");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqIn(List<Integer> values) {
            addCriterion("work_force_req in", values, "workForceReq");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqNotIn(List<Integer> values) {
            addCriterion("work_force_req not in", values, "workForceReq");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqBetween(Integer value1, Integer value2) {
            addCriterion("work_force_req between", value1, value2, "workForceReq");
            return (Criteria) this;
        }

        public Criteria andWorkForceReqNotBetween(Integer value1, Integer value2) {
            addCriterion("work_force_req not between", value1, value2, "workForceReq");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andShiftIsNull() {
            addCriterion("shift is null");
            return (Criteria) this;
        }

        public Criteria andShiftIsNotNull() {
            addCriterion("shift is not null");
            return (Criteria) this;
        }

        public Criteria andShiftEqualTo(String value) {
            addCriterion("shift =", value, "shift");
            return (Criteria) this;
        }

        public Criteria andShiftNotEqualTo(String value) {
            addCriterion("shift <>", value, "shift");
            return (Criteria) this;
        }

        public Criteria andShiftGreaterThan(String value) {
            addCriterion("shift >", value, "shift");
            return (Criteria) this;
        }

        public Criteria andShiftGreaterThanOrEqualTo(String value) {
            addCriterion("shift >=", value, "shift");
            return (Criteria) this;
        }

        public Criteria andShiftLessThan(String value) {
            addCriterion("shift <", value, "shift");
            return (Criteria) this;
        }

        public Criteria andShiftLessThanOrEqualTo(String value) {
            addCriterion("shift <=", value, "shift");
            return (Criteria) this;
        }

        public Criteria andShiftLike(String value) {
            addCriterion("shift like", value, "shift");
            return (Criteria) this;
        }

        public Criteria andShiftNotLike(String value) {
            addCriterion("shift not like", value, "shift");
            return (Criteria) this;
        }

        public Criteria andShiftIn(List<String> values) {
            addCriterion("shift in", values, "shift");
            return (Criteria) this;
        }

        public Criteria andShiftNotIn(List<String> values) {
            addCriterion("shift not in", values, "shift");
            return (Criteria) this;
        }

        public Criteria andShiftBetween(String value1, String value2) {
            addCriterion("shift between", value1, value2, "shift");
            return (Criteria) this;
        }

        public Criteria andShiftNotBetween(String value1, String value2) {
            addCriterion("shift not between", value1, value2, "shift");
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