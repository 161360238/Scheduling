package com.zhiyou.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourceExample() {
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

        public Criteria andImoocIconIsNull() {
            addCriterion("imooc_icon is null");
            return (Criteria) this;
        }

        public Criteria andImoocIconIsNotNull() {
            addCriterion("imooc_icon is not null");
            return (Criteria) this;
        }

        public Criteria andImoocIconEqualTo(String value) {
            addCriterion("imooc_icon =", value, "imoocIcon");
            return (Criteria) this;
        }

        public Criteria andImoocIconNotEqualTo(String value) {
            addCriterion("imooc_icon <>", value, "imoocIcon");
            return (Criteria) this;
        }

        public Criteria andImoocIconGreaterThan(String value) {
            addCriterion("imooc_icon >", value, "imoocIcon");
            return (Criteria) this;
        }

        public Criteria andImoocIconGreaterThanOrEqualTo(String value) {
            addCriterion("imooc_icon >=", value, "imoocIcon");
            return (Criteria) this;
        }

        public Criteria andImoocIconLessThan(String value) {
            addCriterion("imooc_icon <", value, "imoocIcon");
            return (Criteria) this;
        }

        public Criteria andImoocIconLessThanOrEqualTo(String value) {
            addCriterion("imooc_icon <=", value, "imoocIcon");
            return (Criteria) this;
        }

        public Criteria andImoocIconLike(String value) {
            addCriterion("imooc_icon like", value, "imoocIcon");
            return (Criteria) this;
        }

        public Criteria andImoocIconNotLike(String value) {
            addCriterion("imooc_icon not like", value, "imoocIcon");
            return (Criteria) this;
        }

        public Criteria andImoocIconIn(List<String> values) {
            addCriterion("imooc_icon in", values, "imoocIcon");
            return (Criteria) this;
        }

        public Criteria andImoocIconNotIn(List<String> values) {
            addCriterion("imooc_icon not in", values, "imoocIcon");
            return (Criteria) this;
        }

        public Criteria andImoocIconBetween(String value1, String value2) {
            addCriterion("imooc_icon between", value1, value2, "imoocIcon");
            return (Criteria) this;
        }

        public Criteria andImoocIconNotBetween(String value1, String value2) {
            addCriterion("imooc_icon not between", value1, value2, "imoocIcon");
            return (Criteria) this;
        }

        public Criteria andImoocLinkIsNull() {
            addCriterion("imooc_link is null");
            return (Criteria) this;
        }

        public Criteria andImoocLinkIsNotNull() {
            addCriterion("imooc_link is not null");
            return (Criteria) this;
        }

        public Criteria andImoocLinkEqualTo(String value) {
            addCriterion("imooc_link =", value, "imoocLink");
            return (Criteria) this;
        }

        public Criteria andImoocLinkNotEqualTo(String value) {
            addCriterion("imooc_link <>", value, "imoocLink");
            return (Criteria) this;
        }

        public Criteria andImoocLinkGreaterThan(String value) {
            addCriterion("imooc_link >", value, "imoocLink");
            return (Criteria) this;
        }

        public Criteria andImoocLinkGreaterThanOrEqualTo(String value) {
            addCriterion("imooc_link >=", value, "imoocLink");
            return (Criteria) this;
        }

        public Criteria andImoocLinkLessThan(String value) {
            addCriterion("imooc_link <", value, "imoocLink");
            return (Criteria) this;
        }

        public Criteria andImoocLinkLessThanOrEqualTo(String value) {
            addCriterion("imooc_link <=", value, "imoocLink");
            return (Criteria) this;
        }

        public Criteria andImoocLinkLike(String value) {
            addCriterion("imooc_link like", value, "imoocLink");
            return (Criteria) this;
        }

        public Criteria andImoocLinkNotLike(String value) {
            addCriterion("imooc_link not like", value, "imoocLink");
            return (Criteria) this;
        }

        public Criteria andImoocLinkIn(List<String> values) {
            addCriterion("imooc_link in", values, "imoocLink");
            return (Criteria) this;
        }

        public Criteria andImoocLinkNotIn(List<String> values) {
            addCriterion("imooc_link not in", values, "imoocLink");
            return (Criteria) this;
        }

        public Criteria andImoocLinkBetween(String value1, String value2) {
            addCriterion("imooc_link between", value1, value2, "imoocLink");
            return (Criteria) this;
        }

        public Criteria andImoocLinkNotBetween(String value1, String value2) {
            addCriterion("imooc_link not between", value1, value2, "imoocLink");
            return (Criteria) this;
        }

        public Criteria andImoocNameIsNull() {
            addCriterion("imooc_name is null");
            return (Criteria) this;
        }

        public Criteria andImoocNameIsNotNull() {
            addCriterion("imooc_name is not null");
            return (Criteria) this;
        }

        public Criteria andImoocNameEqualTo(String value) {
            addCriterion("imooc_name =", value, "imoocName");
            return (Criteria) this;
        }

        public Criteria andImoocNameNotEqualTo(String value) {
            addCriterion("imooc_name <>", value, "imoocName");
            return (Criteria) this;
        }

        public Criteria andImoocNameGreaterThan(String value) {
            addCriterion("imooc_name >", value, "imoocName");
            return (Criteria) this;
        }

        public Criteria andImoocNameGreaterThanOrEqualTo(String value) {
            addCriterion("imooc_name >=", value, "imoocName");
            return (Criteria) this;
        }

        public Criteria andImoocNameLessThan(String value) {
            addCriterion("imooc_name <", value, "imoocName");
            return (Criteria) this;
        }

        public Criteria andImoocNameLessThanOrEqualTo(String value) {
            addCriterion("imooc_name <=", value, "imoocName");
            return (Criteria) this;
        }

        public Criteria andImoocNameLike(String value) {
            addCriterion("imooc_name like", value, "imoocName");
            return (Criteria) this;
        }

        public Criteria andImoocNameNotLike(String value) {
            addCriterion("imooc_name not like", value, "imoocName");
            return (Criteria) this;
        }

        public Criteria andImoocNameIn(List<String> values) {
            addCriterion("imooc_name in", values, "imoocName");
            return (Criteria) this;
        }

        public Criteria andImoocNameNotIn(List<String> values) {
            addCriterion("imooc_name not in", values, "imoocName");
            return (Criteria) this;
        }

        public Criteria andImoocNameBetween(String value1, String value2) {
            addCriterion("imooc_name between", value1, value2, "imoocName");
            return (Criteria) this;
        }

        public Criteria andImoocNameNotBetween(String value1, String value2) {
            addCriterion("imooc_name not between", value1, value2, "imoocName");
            return (Criteria) this;
        }

        public Criteria andImoocSortIsNull() {
            addCriterion("imooc_sort is null");
            return (Criteria) this;
        }

        public Criteria andImoocSortIsNotNull() {
            addCriterion("imooc_sort is not null");
            return (Criteria) this;
        }

        public Criteria andImoocSortEqualTo(Integer value) {
            addCriterion("imooc_sort =", value, "imoocSort");
            return (Criteria) this;
        }

        public Criteria andImoocSortNotEqualTo(Integer value) {
            addCriterion("imooc_sort <>", value, "imoocSort");
            return (Criteria) this;
        }

        public Criteria andImoocSortGreaterThan(Integer value) {
            addCriterion("imooc_sort >", value, "imoocSort");
            return (Criteria) this;
        }

        public Criteria andImoocSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("imooc_sort >=", value, "imoocSort");
            return (Criteria) this;
        }

        public Criteria andImoocSortLessThan(Integer value) {
            addCriterion("imooc_sort <", value, "imoocSort");
            return (Criteria) this;
        }

        public Criteria andImoocSortLessThanOrEqualTo(Integer value) {
            addCriterion("imooc_sort <=", value, "imoocSort");
            return (Criteria) this;
        }

        public Criteria andImoocSortIn(List<Integer> values) {
            addCriterion("imooc_sort in", values, "imoocSort");
            return (Criteria) this;
        }

        public Criteria andImoocSortNotIn(List<Integer> values) {
            addCriterion("imooc_sort not in", values, "imoocSort");
            return (Criteria) this;
        }

        public Criteria andImoocSortBetween(Integer value1, Integer value2) {
            addCriterion("imooc_sort between", value1, value2, "imoocSort");
            return (Criteria) this;
        }

        public Criteria andImoocSortNotBetween(Integer value1, Integer value2) {
            addCriterion("imooc_sort not between", value1, value2, "imoocSort");
            return (Criteria) this;
        }

        public Criteria andImoocTypeIsNull() {
            addCriterion("imooc_type is null");
            return (Criteria) this;
        }

        public Criteria andImoocTypeIsNotNull() {
            addCriterion("imooc_type is not null");
            return (Criteria) this;
        }

        public Criteria andImoocTypeEqualTo(String value) {
            addCriterion("imooc_type =", value, "imoocType");
            return (Criteria) this;
        }

        public Criteria andImoocTypeNotEqualTo(String value) {
            addCriterion("imooc_type <>", value, "imoocType");
            return (Criteria) this;
        }

        public Criteria andImoocTypeGreaterThan(String value) {
            addCriterion("imooc_type >", value, "imoocType");
            return (Criteria) this;
        }

        public Criteria andImoocTypeGreaterThanOrEqualTo(String value) {
            addCriterion("imooc_type >=", value, "imoocType");
            return (Criteria) this;
        }

        public Criteria andImoocTypeLessThan(String value) {
            addCriterion("imooc_type <", value, "imoocType");
            return (Criteria) this;
        }

        public Criteria andImoocTypeLessThanOrEqualTo(String value) {
            addCriterion("imooc_type <=", value, "imoocType");
            return (Criteria) this;
        }

        public Criteria andImoocTypeLike(String value) {
            addCriterion("imooc_type like", value, "imoocType");
            return (Criteria) this;
        }

        public Criteria andImoocTypeNotLike(String value) {
            addCriterion("imooc_type not like", value, "imoocType");
            return (Criteria) this;
        }

        public Criteria andImoocTypeIn(List<String> values) {
            addCriterion("imooc_type in", values, "imoocType");
            return (Criteria) this;
        }

        public Criteria andImoocTypeNotIn(List<String> values) {
            addCriterion("imooc_type not in", values, "imoocType");
            return (Criteria) this;
        }

        public Criteria andImoocTypeBetween(String value1, String value2) {
            addCriterion("imooc_type between", value1, value2, "imoocType");
            return (Criteria) this;
        }

        public Criteria andImoocTypeNotBetween(String value1, String value2) {
            addCriterion("imooc_type not between", value1, value2, "imoocType");
            return (Criteria) this;
        }

        public Criteria andImoocParentImoocIdIsNull() {
            addCriterion("imooc_parent_imooc_id is null");
            return (Criteria) this;
        }

        public Criteria andImoocParentImoocIdIsNotNull() {
            addCriterion("imooc_parent_imooc_id is not null");
            return (Criteria) this;
        }

        public Criteria andImoocParentImoocIdEqualTo(Long value) {
            addCriterion("imooc_parent_imooc_id =", value, "imoocParentImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocParentImoocIdNotEqualTo(Long value) {
            addCriterion("imooc_parent_imooc_id <>", value, "imoocParentImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocParentImoocIdGreaterThan(Long value) {
            addCriterion("imooc_parent_imooc_id >", value, "imoocParentImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocParentImoocIdGreaterThanOrEqualTo(Long value) {
            addCriterion("imooc_parent_imooc_id >=", value, "imoocParentImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocParentImoocIdLessThan(Long value) {
            addCriterion("imooc_parent_imooc_id <", value, "imoocParentImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocParentImoocIdLessThanOrEqualTo(Long value) {
            addCriterion("imooc_parent_imooc_id <=", value, "imoocParentImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocParentImoocIdIn(List<Long> values) {
            addCriterion("imooc_parent_imooc_id in", values, "imoocParentImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocParentImoocIdNotIn(List<Long> values) {
            addCriterion("imooc_parent_imooc_id not in", values, "imoocParentImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocParentImoocIdBetween(Long value1, Long value2) {
            addCriterion("imooc_parent_imooc_id between", value1, value2, "imoocParentImoocId");
            return (Criteria) this;
        }

        public Criteria andImoocParentImoocIdNotBetween(Long value1, Long value2) {
            addCriterion("imooc_parent_imooc_id not between", value1, value2, "imoocParentImoocId");
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