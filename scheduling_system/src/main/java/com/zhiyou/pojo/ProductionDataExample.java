package com.zhiyou.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductionDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductionDataExample() {
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

        public Criteria andJobNumberIsNull() {
            addCriterion("job_number is null");
            return (Criteria) this;
        }

        public Criteria andJobNumberIsNotNull() {
            addCriterion("job_number is not null");
            return (Criteria) this;
        }

        public Criteria andJobNumberEqualTo(String value) {
            addCriterion("job_number =", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotEqualTo(String value) {
            addCriterion("job_number <>", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberGreaterThan(String value) {
            addCriterion("job_number >", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberGreaterThanOrEqualTo(String value) {
            addCriterion("job_number >=", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLessThan(String value) {
            addCriterion("job_number <", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLessThanOrEqualTo(String value) {
            addCriterion("job_number <=", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLike(String value) {
            addCriterion("job_number like", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotLike(String value) {
            addCriterion("job_number not like", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberIn(List<String> values) {
            addCriterion("job_number in", values, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotIn(List<String> values) {
            addCriterion("job_number not in", values, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberBetween(String value1, String value2) {
            addCriterion("job_number between", value1, value2, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotBetween(String value1, String value2) {
            addCriterion("job_number not between", value1, value2, "jobNumber");
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

        public Criteria andReqQuantIsNull() {
            addCriterion("req_quant is null");
            return (Criteria) this;
        }

        public Criteria andReqQuantIsNotNull() {
            addCriterion("req_quant is not null");
            return (Criteria) this;
        }

        public Criteria andReqQuantEqualTo(Integer value) {
            addCriterion("req_quant =", value, "reqQuant");
            return (Criteria) this;
        }

        public Criteria andReqQuantNotEqualTo(Integer value) {
            addCriterion("req_quant <>", value, "reqQuant");
            return (Criteria) this;
        }

        public Criteria andReqQuantGreaterThan(Integer value) {
            addCriterion("req_quant >", value, "reqQuant");
            return (Criteria) this;
        }

        public Criteria andReqQuantGreaterThanOrEqualTo(Integer value) {
            addCriterion("req_quant >=", value, "reqQuant");
            return (Criteria) this;
        }

        public Criteria andReqQuantLessThan(Integer value) {
            addCriterion("req_quant <", value, "reqQuant");
            return (Criteria) this;
        }

        public Criteria andReqQuantLessThanOrEqualTo(Integer value) {
            addCriterion("req_quant <=", value, "reqQuant");
            return (Criteria) this;
        }

        public Criteria andReqQuantIn(List<Integer> values) {
            addCriterion("req_quant in", values, "reqQuant");
            return (Criteria) this;
        }

        public Criteria andReqQuantNotIn(List<Integer> values) {
            addCriterion("req_quant not in", values, "reqQuant");
            return (Criteria) this;
        }

        public Criteria andReqQuantBetween(Integer value1, Integer value2) {
            addCriterion("req_quant between", value1, value2, "reqQuant");
            return (Criteria) this;
        }

        public Criteria andReqQuantNotBetween(Integer value1, Integer value2) {
            addCriterion("req_quant not between", value1, value2, "reqQuant");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIsNull() {
            addCriterion("current_status is null");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIsNotNull() {
            addCriterion("current_status is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusEqualTo(String value) {
            addCriterion("current_status =", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotEqualTo(String value) {
            addCriterion("current_status <>", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThan(String value) {
            addCriterion("current_status >", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("current_status >=", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThan(String value) {
            addCriterion("current_status <", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThanOrEqualTo(String value) {
            addCriterion("current_status <=", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLike(String value) {
            addCriterion("current_status like", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotLike(String value) {
            addCriterion("current_status not like", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIn(List<String> values) {
            addCriterion("current_status in", values, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotIn(List<String> values) {
            addCriterion("current_status not in", values, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusBetween(String value1, String value2) {
            addCriterion("current_status between", value1, value2, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotBetween(String value1, String value2) {
            addCriterion("current_status not between", value1, value2, "currentStatus");
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

        public Criteria andOperationOrderIsNull() {
            addCriterion("operation_order is null");
            return (Criteria) this;
        }

        public Criteria andOperationOrderIsNotNull() {
            addCriterion("operation_order is not null");
            return (Criteria) this;
        }

        public Criteria andOperationOrderEqualTo(Integer value) {
            addCriterion("operation_order =", value, "operationOrder");
            return (Criteria) this;
        }

        public Criteria andOperationOrderNotEqualTo(Integer value) {
            addCriterion("operation_order <>", value, "operationOrder");
            return (Criteria) this;
        }

        public Criteria andOperationOrderGreaterThan(Integer value) {
            addCriterion("operation_order >", value, "operationOrder");
            return (Criteria) this;
        }

        public Criteria andOperationOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("operation_order >=", value, "operationOrder");
            return (Criteria) this;
        }

        public Criteria andOperationOrderLessThan(Integer value) {
            addCriterion("operation_order <", value, "operationOrder");
            return (Criteria) this;
        }

        public Criteria andOperationOrderLessThanOrEqualTo(Integer value) {
            addCriterion("operation_order <=", value, "operationOrder");
            return (Criteria) this;
        }

        public Criteria andOperationOrderIn(List<Integer> values) {
            addCriterion("operation_order in", values, "operationOrder");
            return (Criteria) this;
        }

        public Criteria andOperationOrderNotIn(List<Integer> values) {
            addCriterion("operation_order not in", values, "operationOrder");
            return (Criteria) this;
        }

        public Criteria andOperationOrderBetween(Integer value1, Integer value2) {
            addCriterion("operation_order between", value1, value2, "operationOrder");
            return (Criteria) this;
        }

        public Criteria andOperationOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("operation_order not between", value1, value2, "operationOrder");
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

        public Criteria andEventDateIsNull() {
            addCriterion("event_date is null");
            return (Criteria) this;
        }

        public Criteria andEventDateIsNotNull() {
            addCriterion("event_date is not null");
            return (Criteria) this;
        }

        public Criteria andEventDateEqualTo(Date value) {
            addCriterion("event_date =", value, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateNotEqualTo(Date value) {
            addCriterion("event_date <>", value, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateGreaterThan(Date value) {
            addCriterion("event_date >", value, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateGreaterThanOrEqualTo(Date value) {
            addCriterion("event_date >=", value, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateLessThan(Date value) {
            addCriterion("event_date <", value, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateLessThanOrEqualTo(Date value) {
            addCriterion("event_date <=", value, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateIn(List<Date> values) {
            addCriterion("event_date in", values, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateNotIn(List<Date> values) {
            addCriterion("event_date not in", values, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateBetween(Date value1, Date value2) {
            addCriterion("event_date between", value1, value2, "eventDate");
            return (Criteria) this;
        }

        public Criteria andEventDateNotBetween(Date value1, Date value2) {
            addCriterion("event_date not between", value1, value2, "eventDate");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeIsNull() {
            addCriterion("check_in_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeIsNotNull() {
            addCriterion("check_in_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeEqualTo(Date value) {
            addCriterion("check_in_time =", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeNotEqualTo(Date value) {
            addCriterion("check_in_time <>", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeGreaterThan(Date value) {
            addCriterion("check_in_time >", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("check_in_time >=", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeLessThan(Date value) {
            addCriterion("check_in_time <", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeLessThanOrEqualTo(Date value) {
            addCriterion("check_in_time <=", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeIn(List<Date> values) {
            addCriterion("check_in_time in", values, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeNotIn(List<Date> values) {
            addCriterion("check_in_time not in", values, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeBetween(Date value1, Date value2) {
            addCriterion("check_in_time between", value1, value2, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeNotBetween(Date value1, Date value2) {
            addCriterion("check_in_time not between", value1, value2, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeIsNull() {
            addCriterion("check_out_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeIsNotNull() {
            addCriterion("check_out_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeEqualTo(Date value) {
            addCriterion("check_out_time =", value, "checkOutTime");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeNotEqualTo(Date value) {
            addCriterion("check_out_time <>", value, "checkOutTime");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeGreaterThan(Date value) {
            addCriterion("check_out_time >", value, "checkOutTime");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("check_out_time >=", value, "checkOutTime");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeLessThan(Date value) {
            addCriterion("check_out_time <", value, "checkOutTime");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeLessThanOrEqualTo(Date value) {
            addCriterion("check_out_time <=", value, "checkOutTime");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeIn(List<Date> values) {
            addCriterion("check_out_time in", values, "checkOutTime");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeNotIn(List<Date> values) {
            addCriterion("check_out_time not in", values, "checkOutTime");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeBetween(Date value1, Date value2) {
            addCriterion("check_out_time between", value1, value2, "checkOutTime");
            return (Criteria) this;
        }

        public Criteria andCheckOutTimeNotBetween(Date value1, Date value2) {
            addCriterion("check_out_time not between", value1, value2, "checkOutTime");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(String value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(String value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(String value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(String value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(String value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLike(String value) {
            addCriterion("priority like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotLike(String value) {
            addCriterion("priority not like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<String> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<String> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(String value1, String value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(String value1, String value2) {
            addCriterion("priority not between", value1, value2, "priority");
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