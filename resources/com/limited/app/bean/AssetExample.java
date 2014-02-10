package com.limited.app.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class AssetExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 10:47:46 EST 2011
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 10:47:46 EST 2011
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 10:47:46 EST 2011
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 10:47:46 EST 2011
     */
    public AssetExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 10:47:46 EST 2011
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 10:47:46 EST 2011
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 10:47:46 EST 2011
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 10:47:46 EST 2011
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 10:47:46 EST 2011
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 10:47:46 EST 2011
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 10:47:46 EST 2011
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 10:47:46 EST 2011
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 10:47:46 EST 2011
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 10:47:46 EST 2011
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 10:47:46 EST 2011
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTickerIsNull() {
            addCriterion("ticker is null");
            return (Criteria) this;
        }

        public Criteria andTickerIsNotNull() {
            addCriterion("ticker is not null");
            return (Criteria) this;
        }

        public Criteria andTickerEqualTo(String value) {
            addCriterion("ticker =", value, "ticker");
            return (Criteria) this;
        }

        public Criteria andTickerNotEqualTo(String value) {
            addCriterion("ticker <>", value, "ticker");
            return (Criteria) this;
        }

        public Criteria andTickerGreaterThan(String value) {
            addCriterion("ticker >", value, "ticker");
            return (Criteria) this;
        }

        public Criteria andTickerGreaterThanOrEqualTo(String value) {
            addCriterion("ticker >=", value, "ticker");
            return (Criteria) this;
        }

        public Criteria andTickerLessThan(String value) {
            addCriterion("ticker <", value, "ticker");
            return (Criteria) this;
        }

        public Criteria andTickerLessThanOrEqualTo(String value) {
            addCriterion("ticker <=", value, "ticker");
            return (Criteria) this;
        }

        public Criteria andTickerLike(String value) {
            addCriterion("ticker like", value, "ticker");
            return (Criteria) this;
        }

        public Criteria andTickerNotLike(String value) {
            addCriterion("ticker not like", value, "ticker");
            return (Criteria) this;
        }

        public Criteria andTickerIn(List<String> values) {
            addCriterion("ticker in", values, "ticker");
            return (Criteria) this;
        }

        public Criteria andTickerNotIn(List<String> values) {
            addCriterion("ticker not in", values, "ticker");
            return (Criteria) this;
        }

        public Criteria andTickerBetween(String value1, String value2) {
            addCriterion("ticker between", value1, value2, "ticker");
            return (Criteria) this;
        }

        public Criteria andTickerNotBetween(String value1, String value2) {
            addCriterion("ticker not between", value1, value2, "ticker");
            return (Criteria) this;
        }

        public Criteria andAssetnameIsNull() {
            addCriterion("assetname is null");
            return (Criteria) this;
        }

        public Criteria andAssetnameIsNotNull() {
            addCriterion("assetname is not null");
            return (Criteria) this;
        }

        public Criteria andAssetnameEqualTo(String value) {
            addCriterion("assetname =", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameNotEqualTo(String value) {
            addCriterion("assetname <>", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameGreaterThan(String value) {
            addCriterion("assetname >", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameGreaterThanOrEqualTo(String value) {
            addCriterion("assetname >=", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameLessThan(String value) {
            addCriterion("assetname <", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameLessThanOrEqualTo(String value) {
            addCriterion("assetname <=", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameLike(String value) {
            addCriterion("assetname like", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameNotLike(String value) {
            addCriterion("assetname not like", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameIn(List<String> values) {
            addCriterion("assetname in", values, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameNotIn(List<String> values) {
            addCriterion("assetname not in", values, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameBetween(String value1, String value2) {
            addCriterion("assetname between", value1, value2, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameNotBetween(String value1, String value2) {
            addCriterion("assetname not between", value1, value2, "assetname");
            return (Criteria) this;
        }

        public Criteria andHeldatIsNull() {
            addCriterion("heldat is null");
            return (Criteria) this;
        }

        public Criteria andHeldatIsNotNull() {
            addCriterion("heldat is not null");
            return (Criteria) this;
        }

        public Criteria andHeldatEqualTo(Integer value) {
            addCriterion("heldat =", value, "heldat");
            return (Criteria) this;
        }

        public Criteria andHeldatNotEqualTo(Integer value) {
            addCriterion("heldat <>", value, "heldat");
            return (Criteria) this;
        }

        public Criteria andHeldatGreaterThan(Integer value) {
            addCriterion("heldat >", value, "heldat");
            return (Criteria) this;
        }

        public Criteria andHeldatGreaterThanOrEqualTo(Integer value) {
            addCriterion("heldat >=", value, "heldat");
            return (Criteria) this;
        }

        public Criteria andHeldatLessThan(Integer value) {
            addCriterion("heldat <", value, "heldat");
            return (Criteria) this;
        }

        public Criteria andHeldatLessThanOrEqualTo(Integer value) {
            addCriterion("heldat <=", value, "heldat");
            return (Criteria) this;
        }

        public Criteria andHeldatIn(List<Integer> values) {
            addCriterion("heldat in", values, "heldat");
            return (Criteria) this;
        }

        public Criteria andHeldatNotIn(List<Integer> values) {
            addCriterion("heldat not in", values, "heldat");
            return (Criteria) this;
        }

        public Criteria andHeldatBetween(Integer value1, Integer value2) {
            addCriterion("heldat between", value1, value2, "heldat");
            return (Criteria) this;
        }

        public Criteria andHeldatNotBetween(Integer value1, Integer value2) {
            addCriterion("heldat not between", value1, value2, "heldat");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIsNull() {
            addCriterion("benchmark is null");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIsNotNull() {
            addCriterion("benchmark is not null");
            return (Criteria) this;
        }

        public Criteria andBenchmarkEqualTo(String value) {
            addCriterion("benchmark =", value, "benchmark");
            return (Criteria) this;
        }

        public Criteria andBenchmarkNotEqualTo(String value) {
            addCriterion("benchmark <>", value, "benchmark");
            return (Criteria) this;
        }

        public Criteria andBenchmarkGreaterThan(String value) {
            addCriterion("benchmark >", value, "benchmark");
            return (Criteria) this;
        }

        public Criteria andBenchmarkGreaterThanOrEqualTo(String value) {
            addCriterion("benchmark >=", value, "benchmark");
            return (Criteria) this;
        }

        public Criteria andBenchmarkLessThan(String value) {
            addCriterion("benchmark <", value, "benchmark");
            return (Criteria) this;
        }

        public Criteria andBenchmarkLessThanOrEqualTo(String value) {
            addCriterion("benchmark <=", value, "benchmark");
            return (Criteria) this;
        }

        public Criteria andBenchmarkLike(String value) {
            addCriterion("benchmark like", value, "benchmark");
            return (Criteria) this;
        }

        public Criteria andBenchmarkNotLike(String value) {
            addCriterion("benchmark not like", value, "benchmark");
            return (Criteria) this;
        }

        public Criteria andBenchmarkIn(List<String> values) {
            addCriterion("benchmark in", values, "benchmark");
            return (Criteria) this;
        }

        public Criteria andBenchmarkNotIn(List<String> values) {
            addCriterion("benchmark not in", values, "benchmark");
            return (Criteria) this;
        }

        public Criteria andBenchmarkBetween(String value1, String value2) {
            addCriterion("benchmark between", value1, value2, "benchmark");
            return (Criteria) this;
        }

        public Criteria andBenchmarkNotBetween(String value1, String value2) {
            addCriterion("benchmark not between", value1, value2, "benchmark");
            return (Criteria) this;
        }

        public Criteria andTemplateidIsNull() {
            addCriterion("templateid is null");
            return (Criteria) this;
        }

        public Criteria andTemplateidIsNotNull() {
            addCriterion("templateid is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateidEqualTo(Integer value) {
            addCriterion("templateid =", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidNotEqualTo(Integer value) {
            addCriterion("templateid <>", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidGreaterThan(Integer value) {
            addCriterion("templateid >", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("templateid >=", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidLessThan(Integer value) {
            addCriterion("templateid <", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidLessThanOrEqualTo(Integer value) {
            addCriterion("templateid <=", value, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidIn(List<Integer> values) {
            addCriterion("templateid in", values, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidNotIn(List<Integer> values) {
            addCriterion("templateid not in", values, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidBetween(Integer value1, Integer value2) {
            addCriterion("templateid between", value1, value2, "templateid");
            return (Criteria) this;
        }

        public Criteria andTemplateidNotBetween(Integer value1, Integer value2) {
            addCriterion("templateid not between", value1, value2, "templateid");
            return (Criteria) this;
        }

        public Criteria andBetaIsNull() {
            addCriterion("beta is null");
            return (Criteria) this;
        }

        public Criteria andBetaIsNotNull() {
            addCriterion("beta is not null");
            return (Criteria) this;
        }

        public Criteria andBetaEqualTo(BigDecimal value) {
            addCriterion("beta =", value, "beta");
            return (Criteria) this;
        }

        public Criteria andBetaNotEqualTo(BigDecimal value) {
            addCriterion("beta <>", value, "beta");
            return (Criteria) this;
        }

        public Criteria andBetaGreaterThan(BigDecimal value) {
            addCriterion("beta >", value, "beta");
            return (Criteria) this;
        }

        public Criteria andBetaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("beta >=", value, "beta");
            return (Criteria) this;
        }

        public Criteria andBetaLessThan(BigDecimal value) {
            addCriterion("beta <", value, "beta");
            return (Criteria) this;
        }

        public Criteria andBetaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("beta <=", value, "beta");
            return (Criteria) this;
        }

        public Criteria andBetaIn(List<BigDecimal> values) {
            addCriterion("beta in", values, "beta");
            return (Criteria) this;
        }

        public Criteria andBetaNotIn(List<BigDecimal> values) {
            addCriterion("beta not in", values, "beta");
            return (Criteria) this;
        }

        public Criteria andBetaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("beta between", value1, value2, "beta");
            return (Criteria) this;
        }

        public Criteria andBetaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("beta not between", value1, value2, "beta");
            return (Criteria) this;
        }

        public Criteria andRsqIsNull() {
            addCriterion("rsq is null");
            return (Criteria) this;
        }

        public Criteria andRsqIsNotNull() {
            addCriterion("rsq is not null");
            return (Criteria) this;
        }

        public Criteria andRsqEqualTo(BigDecimal value) {
            addCriterion("rsq =", value, "rsq");
            return (Criteria) this;
        }

        public Criteria andRsqNotEqualTo(BigDecimal value) {
            addCriterion("rsq <>", value, "rsq");
            return (Criteria) this;
        }

        public Criteria andRsqGreaterThan(BigDecimal value) {
            addCriterion("rsq >", value, "rsq");
            return (Criteria) this;
        }

        public Criteria andRsqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rsq >=", value, "rsq");
            return (Criteria) this;
        }

        public Criteria andRsqLessThan(BigDecimal value) {
            addCriterion("rsq <", value, "rsq");
            return (Criteria) this;
        }

        public Criteria andRsqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rsq <=", value, "rsq");
            return (Criteria) this;
        }

        public Criteria andRsqIn(List<BigDecimal> values) {
            addCriterion("rsq in", values, "rsq");
            return (Criteria) this;
        }

        public Criteria andRsqNotIn(List<BigDecimal> values) {
            addCriterion("rsq not in", values, "rsq");
            return (Criteria) this;
        }

        public Criteria andRsqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rsq between", value1, value2, "rsq");
            return (Criteria) this;
        }

        public Criteria andRsqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rsq not between", value1, value2, "rsq");
            return (Criteria) this;
        }

        public Criteria andStddevIsNull() {
            addCriterion("stddev is null");
            return (Criteria) this;
        }

        public Criteria andStddevIsNotNull() {
            addCriterion("stddev is not null");
            return (Criteria) this;
        }

        public Criteria andStddevEqualTo(BigDecimal value) {
            addCriterion("stddev =", value, "stddev");
            return (Criteria) this;
        }

        public Criteria andStddevNotEqualTo(BigDecimal value) {
            addCriterion("stddev <>", value, "stddev");
            return (Criteria) this;
        }

        public Criteria andStddevGreaterThan(BigDecimal value) {
            addCriterion("stddev >", value, "stddev");
            return (Criteria) this;
        }

        public Criteria andStddevGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("stddev >=", value, "stddev");
            return (Criteria) this;
        }

        public Criteria andStddevLessThan(BigDecimal value) {
            addCriterion("stddev <", value, "stddev");
            return (Criteria) this;
        }

        public Criteria andStddevLessThanOrEqualTo(BigDecimal value) {
            addCriterion("stddev <=", value, "stddev");
            return (Criteria) this;
        }

        public Criteria andStddevIn(List<BigDecimal> values) {
            addCriterion("stddev in", values, "stddev");
            return (Criteria) this;
        }

        public Criteria andStddevNotIn(List<BigDecimal> values) {
            addCriterion("stddev not in", values, "stddev");
            return (Criteria) this;
        }

        public Criteria andStddevBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stddev between", value1, value2, "stddev");
            return (Criteria) this;
        }

        public Criteria andStddevNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("stddev not between", value1, value2, "stddev");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table asset
     *
     * @mbggenerated do_not_delete_during_merge Mon Feb 28 10:47:46 EST 2011
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table asset
     *
     * @mbggenerated Mon Feb 28 10:47:46 EST 2011
     */
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