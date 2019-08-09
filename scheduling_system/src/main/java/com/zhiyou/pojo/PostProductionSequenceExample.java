package com.zhiyou.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostProductionSequenceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostProductionSequenceExample() {
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

        public Criteria andPrdStartDateIsNull() {
            addCriterion("prd_start_date is null");
            return (Criteria) this;
        }

        public Criteria andPrdStartDateIsNotNull() {
            addCriterion("prd_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andPrdStartDateEqualTo(Date value) {
            addCriterion("prd_start_date =", value, "prdStartDate");
            return (Criteria) this;
        }

        public Criteria andPrdStartDateNotEqualTo(Date value) {
            addCriterion("prd_start_date <>", value, "prdStartDate");
            return (Criteria) this;
        }

        public Criteria andPrdStartDateGreaterThan(Date value) {
            addCriterion("prd_start_date >", value, "prdStartDate");
            return (Criteria) this;
        }

        public Criteria andPrdStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("prd_start_date >=", value, "prdStartDate");
            return (Criteria) this;
        }

        public Criteria andPrdStartDateLessThan(Date value) {
            addCriterion("prd_start_date <", value, "prdStartDate");
            return (Criteria) this;
        }

        public Criteria andPrdStartDateLessThanOrEqualTo(Date value) {
            addCriterion("prd_start_date <=", value, "prdStartDate");
            return (Criteria) this;
        }

        public Criteria andPrdStartDateIn(List<Date> values) {
            addCriterion("prd_start_date in", values, "prdStartDate");
            return (Criteria) this;
        }

        public Criteria andPrdStartDateNotIn(List<Date> values) {
            addCriterion("prd_start_date not in", values, "prdStartDate");
            return (Criteria) this;
        }

        public Criteria andPrdStartDateBetween(Date value1, Date value2) {
            addCriterion("prd_start_date between", value1, value2, "prdStartDate");
            return (Criteria) this;
        }

        public Criteria andPrdStartDateNotBetween(Date value1, Date value2) {
            addCriterion("prd_start_date not between", value1, value2, "prdStartDate");
            return (Criteria) this;
        }

        public Criteria andEstFinishDateIsNull() {
            addCriterion("est_finish_date is null");
            return (Criteria) this;
        }

        public Criteria andEstFinishDateIsNotNull() {
            addCriterion("est_finish_date is not null");
            return (Criteria) this;
        }

        public Criteria andEstFinishDateEqualTo(Date value) {
            addCriterion("est_finish_date =", value, "estFinishDate");
            return (Criteria) this;
        }

        public Criteria andEstFinishDateNotEqualTo(Date value) {
            addCriterion("est_finish_date <>", value, "estFinishDate");
            return (Criteria) this;
        }

        public Criteria andEstFinishDateGreaterThan(Date value) {
            addCriterion("est_finish_date >", value, "estFinishDate");
            return (Criteria) this;
        }

        public Criteria andEstFinishDateGreaterThanOrEqualTo(Date value) {
            addCriterion("est_finish_date >=", value, "estFinishDate");
            return (Criteria) this;
        }

        public Criteria andEstFinishDateLessThan(Date value) {
            addCriterion("est_finish_date <", value, "estFinishDate");
            return (Criteria) this;
        }

        public Criteria andEstFinishDateLessThanOrEqualTo(Date value) {
            addCriterion("est_finish_date <=", value, "estFinishDate");
            return (Criteria) this;
        }

        public Criteria andEstFinishDateIn(List<Date> values) {
            addCriterion("est_finish_date in", values, "estFinishDate");
            return (Criteria) this;
        }

        public Criteria andEstFinishDateNotIn(List<Date> values) {
            addCriterion("est_finish_date not in", values, "estFinishDate");
            return (Criteria) this;
        }

        public Criteria andEstFinishDateBetween(Date value1, Date value2) {
            addCriterion("est_finish_date between", value1, value2, "estFinishDate");
            return (Criteria) this;
        }

        public Criteria andEstFinishDateNotBetween(Date value1, Date value2) {
            addCriterion("est_finish_date not between", value1, value2, "estFinishDate");
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

        public Criteria andPrdQuantIsNull() {
            addCriterion("prd_quant is null");
            return (Criteria) this;
        }

        public Criteria andPrdQuantIsNotNull() {
            addCriterion("prd_quant is not null");
            return (Criteria) this;
        }

        public Criteria andPrdQuantEqualTo(Integer value) {
            addCriterion("prd_quant =", value, "prdQuant");
            return (Criteria) this;
        }

        public Criteria andPrdQuantNotEqualTo(Integer value) {
            addCriterion("prd_quant <>", value, "prdQuant");
            return (Criteria) this;
        }

        public Criteria andPrdQuantGreaterThan(Integer value) {
            addCriterion("prd_quant >", value, "prdQuant");
            return (Criteria) this;
        }

        public Criteria andPrdQuantGreaterThanOrEqualTo(Integer value) {
            addCriterion("prd_quant >=", value, "prdQuant");
            return (Criteria) this;
        }

        public Criteria andPrdQuantLessThan(Integer value) {
            addCriterion("prd_quant <", value, "prdQuant");
            return (Criteria) this;
        }

        public Criteria andPrdQuantLessThanOrEqualTo(Integer value) {
            addCriterion("prd_quant <=", value, "prdQuant");
            return (Criteria) this;
        }

        public Criteria andPrdQuantIn(List<Integer> values) {
            addCriterion("prd_quant in", values, "prdQuant");
            return (Criteria) this;
        }

        public Criteria andPrdQuantNotIn(List<Integer> values) {
            addCriterion("prd_quant not in", values, "prdQuant");
            return (Criteria) this;
        }

        public Criteria andPrdQuantBetween(Integer value1, Integer value2) {
            addCriterion("prd_quant between", value1, value2, "prdQuant");
            return (Criteria) this;
        }

        public Criteria andPrdQuantNotBetween(Integer value1, Integer value2) {
            addCriterion("prd_quant not between", value1, value2, "prdQuant");
            return (Criteria) this;
        }

        public Criteria andCycleTimeIsNull() {
            addCriterion("cycle_time is null");
            return (Criteria) this;
        }

        public Criteria andCycleTimeIsNotNull() {
            addCriterion("cycle_time is not null");
            return (Criteria) this;
        }

        public Criteria andCycleTimeEqualTo(Date value) {
            addCriterion("cycle_time =", value, "cycleTime");
            return (Criteria) this;
        }

        public Criteria andCycleTimeNotEqualTo(Date value) {
            addCriterion("cycle_time <>", value, "cycleTime");
            return (Criteria) this;
        }

        public Criteria andCycleTimeGreaterThan(Date value) {
            addCriterion("cycle_time >", value, "cycleTime");
            return (Criteria) this;
        }

        public Criteria andCycleTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cycle_time >=", value, "cycleTime");
            return (Criteria) this;
        }

        public Criteria andCycleTimeLessThan(Date value) {
            addCriterion("cycle_time <", value, "cycleTime");
            return (Criteria) this;
        }

        public Criteria andCycleTimeLessThanOrEqualTo(Date value) {
            addCriterion("cycle_time <=", value, "cycleTime");
            return (Criteria) this;
        }

        public Criteria andCycleTimeIn(List<Date> values) {
            addCriterion("cycle_time in", values, "cycleTime");
            return (Criteria) this;
        }

        public Criteria andCycleTimeNotIn(List<Date> values) {
            addCriterion("cycle_time not in", values, "cycleTime");
            return (Criteria) this;
        }

        public Criteria andCycleTimeBetween(Date value1, Date value2) {
            addCriterion("cycle_time between", value1, value2, "cycleTime");
            return (Criteria) this;
        }

        public Criteria andCycleTimeNotBetween(Date value1, Date value2) {
            addCriterion("cycle_time not between", value1, value2, "cycleTime");
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