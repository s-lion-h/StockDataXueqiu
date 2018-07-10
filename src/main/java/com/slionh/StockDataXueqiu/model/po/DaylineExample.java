package com.slionh.StockDataXueqiu.model.po;

import java.util.ArrayList;
import java.util.List;

public class DaylineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DaylineExample() {
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

        public Criteria andStockidIsNull() {
            addCriterion("stockId is null");
            return (Criteria) this;
        }

        public Criteria andStockidIsNotNull() {
            addCriterion("stockId is not null");
            return (Criteria) this;
        }

        public Criteria andStockidEqualTo(String value) {
            addCriterion("stockId =", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidNotEqualTo(String value) {
            addCriterion("stockId <>", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidGreaterThan(String value) {
            addCriterion("stockId >", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidGreaterThanOrEqualTo(String value) {
            addCriterion("stockId >=", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidLessThan(String value) {
            addCriterion("stockId <", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidLessThanOrEqualTo(String value) {
            addCriterion("stockId <=", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidLike(String value) {
            addCriterion("stockId like", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidNotLike(String value) {
            addCriterion("stockId not like", value, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidIn(List<String> values) {
            addCriterion("stockId in", values, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidNotIn(List<String> values) {
            addCriterion("stockId not in", values, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidBetween(String value1, String value2) {
            addCriterion("stockId between", value1, value2, "stockid");
            return (Criteria) this;
        }

        public Criteria andStockidNotBetween(String value1, String value2) {
            addCriterion("stockId not between", value1, value2, "stockid");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(Integer value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Integer value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Integer value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Integer value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Integer> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Integer> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Integer value1, Integer value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andOpenIsNull() {
            addCriterion("open is null");
            return (Criteria) this;
        }

        public Criteria andOpenIsNotNull() {
            addCriterion("open is not null");
            return (Criteria) this;
        }

        public Criteria andOpenEqualTo(Double value) {
            addCriterion("open =", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotEqualTo(Double value) {
            addCriterion("open <>", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThan(Double value) {
            addCriterion("open >", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThanOrEqualTo(Double value) {
            addCriterion("open >=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThan(Double value) {
            addCriterion("open <", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThanOrEqualTo(Double value) {
            addCriterion("open <=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenIn(List<Double> values) {
            addCriterion("open in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotIn(List<Double> values) {
            addCriterion("open not in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenBetween(Double value1, Double value2) {
            addCriterion("open between", value1, value2, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotBetween(Double value1, Double value2) {
            addCriterion("open not between", value1, value2, "open");
            return (Criteria) this;
        }

        public Criteria andHighIsNull() {
            addCriterion("high is null");
            return (Criteria) this;
        }

        public Criteria andHighIsNotNull() {
            addCriterion("high is not null");
            return (Criteria) this;
        }

        public Criteria andHighEqualTo(Double value) {
            addCriterion("high =", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotEqualTo(Double value) {
            addCriterion("high <>", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighGreaterThan(Double value) {
            addCriterion("high >", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighGreaterThanOrEqualTo(Double value) {
            addCriterion("high >=", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLessThan(Double value) {
            addCriterion("high <", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLessThanOrEqualTo(Double value) {
            addCriterion("high <=", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighIn(List<Double> values) {
            addCriterion("high in", values, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotIn(List<Double> values) {
            addCriterion("high not in", values, "high");
            return (Criteria) this;
        }

        public Criteria andHighBetween(Double value1, Double value2) {
            addCriterion("high between", value1, value2, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotBetween(Double value1, Double value2) {
            addCriterion("high not between", value1, value2, "high");
            return (Criteria) this;
        }

        public Criteria andCloseIsNull() {
            addCriterion("close is null");
            return (Criteria) this;
        }

        public Criteria andCloseIsNotNull() {
            addCriterion("close is not null");
            return (Criteria) this;
        }

        public Criteria andCloseEqualTo(Double value) {
            addCriterion("close =", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotEqualTo(Double value) {
            addCriterion("close <>", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseGreaterThan(Double value) {
            addCriterion("close >", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseGreaterThanOrEqualTo(Double value) {
            addCriterion("close >=", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseLessThan(Double value) {
            addCriterion("close <", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseLessThanOrEqualTo(Double value) {
            addCriterion("close <=", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseIn(List<Double> values) {
            addCriterion("close in", values, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotIn(List<Double> values) {
            addCriterion("close not in", values, "close");
            return (Criteria) this;
        }

        public Criteria andCloseBetween(Double value1, Double value2) {
            addCriterion("close between", value1, value2, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotBetween(Double value1, Double value2) {
            addCriterion("close not between", value1, value2, "close");
            return (Criteria) this;
        }

        public Criteria andLowIsNull() {
            addCriterion("low is null");
            return (Criteria) this;
        }

        public Criteria andLowIsNotNull() {
            addCriterion("low is not null");
            return (Criteria) this;
        }

        public Criteria andLowEqualTo(Double value) {
            addCriterion("low =", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotEqualTo(Double value) {
            addCriterion("low <>", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowGreaterThan(Double value) {
            addCriterion("low >", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowGreaterThanOrEqualTo(Double value) {
            addCriterion("low >=", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowLessThan(Double value) {
            addCriterion("low <", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowLessThanOrEqualTo(Double value) {
            addCriterion("low <=", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowIn(List<Double> values) {
            addCriterion("low in", values, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotIn(List<Double> values) {
            addCriterion("low not in", values, "low");
            return (Criteria) this;
        }

        public Criteria andLowBetween(Double value1, Double value2) {
            addCriterion("low between", value1, value2, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotBetween(Double value1, Double value2) {
            addCriterion("low not between", value1, value2, "low");
            return (Criteria) this;
        }

        public Criteria andChgIsNull() {
            addCriterion("chg is null");
            return (Criteria) this;
        }

        public Criteria andChgIsNotNull() {
            addCriterion("chg is not null");
            return (Criteria) this;
        }

        public Criteria andChgEqualTo(Double value) {
            addCriterion("chg =", value, "chg");
            return (Criteria) this;
        }

        public Criteria andChgNotEqualTo(Double value) {
            addCriterion("chg <>", value, "chg");
            return (Criteria) this;
        }

        public Criteria andChgGreaterThan(Double value) {
            addCriterion("chg >", value, "chg");
            return (Criteria) this;
        }

        public Criteria andChgGreaterThanOrEqualTo(Double value) {
            addCriterion("chg >=", value, "chg");
            return (Criteria) this;
        }

        public Criteria andChgLessThan(Double value) {
            addCriterion("chg <", value, "chg");
            return (Criteria) this;
        }

        public Criteria andChgLessThanOrEqualTo(Double value) {
            addCriterion("chg <=", value, "chg");
            return (Criteria) this;
        }

        public Criteria andChgIn(List<Double> values) {
            addCriterion("chg in", values, "chg");
            return (Criteria) this;
        }

        public Criteria andChgNotIn(List<Double> values) {
            addCriterion("chg not in", values, "chg");
            return (Criteria) this;
        }

        public Criteria andChgBetween(Double value1, Double value2) {
            addCriterion("chg between", value1, value2, "chg");
            return (Criteria) this;
        }

        public Criteria andChgNotBetween(Double value1, Double value2) {
            addCriterion("chg not between", value1, value2, "chg");
            return (Criteria) this;
        }

        public Criteria andPercentIsNull() {
            addCriterion("percent is null");
            return (Criteria) this;
        }

        public Criteria andPercentIsNotNull() {
            addCriterion("percent is not null");
            return (Criteria) this;
        }

        public Criteria andPercentEqualTo(Double value) {
            addCriterion("percent =", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotEqualTo(Double value) {
            addCriterion("percent <>", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentGreaterThan(Double value) {
            addCriterion("percent >", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentGreaterThanOrEqualTo(Double value) {
            addCriterion("percent >=", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentLessThan(Double value) {
            addCriterion("percent <", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentLessThanOrEqualTo(Double value) {
            addCriterion("percent <=", value, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentIn(List<Double> values) {
            addCriterion("percent in", values, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotIn(List<Double> values) {
            addCriterion("percent not in", values, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentBetween(Double value1, Double value2) {
            addCriterion("percent between", value1, value2, "percent");
            return (Criteria) this;
        }

        public Criteria andPercentNotBetween(Double value1, Double value2) {
            addCriterion("percent not between", value1, value2, "percent");
            return (Criteria) this;
        }

        public Criteria andTurnrateIsNull() {
            addCriterion("turnrate is null");
            return (Criteria) this;
        }

        public Criteria andTurnrateIsNotNull() {
            addCriterion("turnrate is not null");
            return (Criteria) this;
        }

        public Criteria andTurnrateEqualTo(Double value) {
            addCriterion("turnrate =", value, "turnrate");
            return (Criteria) this;
        }

        public Criteria andTurnrateNotEqualTo(Double value) {
            addCriterion("turnrate <>", value, "turnrate");
            return (Criteria) this;
        }

        public Criteria andTurnrateGreaterThan(Double value) {
            addCriterion("turnrate >", value, "turnrate");
            return (Criteria) this;
        }

        public Criteria andTurnrateGreaterThanOrEqualTo(Double value) {
            addCriterion("turnrate >=", value, "turnrate");
            return (Criteria) this;
        }

        public Criteria andTurnrateLessThan(Double value) {
            addCriterion("turnrate <", value, "turnrate");
            return (Criteria) this;
        }

        public Criteria andTurnrateLessThanOrEqualTo(Double value) {
            addCriterion("turnrate <=", value, "turnrate");
            return (Criteria) this;
        }

        public Criteria andTurnrateIn(List<Double> values) {
            addCriterion("turnrate in", values, "turnrate");
            return (Criteria) this;
        }

        public Criteria andTurnrateNotIn(List<Double> values) {
            addCriterion("turnrate not in", values, "turnrate");
            return (Criteria) this;
        }

        public Criteria andTurnrateBetween(Double value1, Double value2) {
            addCriterion("turnrate between", value1, value2, "turnrate");
            return (Criteria) this;
        }

        public Criteria andTurnrateNotBetween(Double value1, Double value2) {
            addCriterion("turnrate not between", value1, value2, "turnrate");
            return (Criteria) this;
        }

        public Criteria andMa5IsNull() {
            addCriterion("ma5 is null");
            return (Criteria) this;
        }

        public Criteria andMa5IsNotNull() {
            addCriterion("ma5 is not null");
            return (Criteria) this;
        }

        public Criteria andMa5EqualTo(Double value) {
            addCriterion("ma5 =", value, "ma5");
            return (Criteria) this;
        }

        public Criteria andMa5NotEqualTo(Double value) {
            addCriterion("ma5 <>", value, "ma5");
            return (Criteria) this;
        }

        public Criteria andMa5GreaterThan(Double value) {
            addCriterion("ma5 >", value, "ma5");
            return (Criteria) this;
        }

        public Criteria andMa5GreaterThanOrEqualTo(Double value) {
            addCriterion("ma5 >=", value, "ma5");
            return (Criteria) this;
        }

        public Criteria andMa5LessThan(Double value) {
            addCriterion("ma5 <", value, "ma5");
            return (Criteria) this;
        }

        public Criteria andMa5LessThanOrEqualTo(Double value) {
            addCriterion("ma5 <=", value, "ma5");
            return (Criteria) this;
        }

        public Criteria andMa5In(List<Double> values) {
            addCriterion("ma5 in", values, "ma5");
            return (Criteria) this;
        }

        public Criteria andMa5NotIn(List<Double> values) {
            addCriterion("ma5 not in", values, "ma5");
            return (Criteria) this;
        }

        public Criteria andMa5Between(Double value1, Double value2) {
            addCriterion("ma5 between", value1, value2, "ma5");
            return (Criteria) this;
        }

        public Criteria andMa5NotBetween(Double value1, Double value2) {
            addCriterion("ma5 not between", value1, value2, "ma5");
            return (Criteria) this;
        }

        public Criteria andMa10IsNull() {
            addCriterion("ma10 is null");
            return (Criteria) this;
        }

        public Criteria andMa10IsNotNull() {
            addCriterion("ma10 is not null");
            return (Criteria) this;
        }

        public Criteria andMa10EqualTo(Double value) {
            addCriterion("ma10 =", value, "ma10");
            return (Criteria) this;
        }

        public Criteria andMa10NotEqualTo(Double value) {
            addCriterion("ma10 <>", value, "ma10");
            return (Criteria) this;
        }

        public Criteria andMa10GreaterThan(Double value) {
            addCriterion("ma10 >", value, "ma10");
            return (Criteria) this;
        }

        public Criteria andMa10GreaterThanOrEqualTo(Double value) {
            addCriterion("ma10 >=", value, "ma10");
            return (Criteria) this;
        }

        public Criteria andMa10LessThan(Double value) {
            addCriterion("ma10 <", value, "ma10");
            return (Criteria) this;
        }

        public Criteria andMa10LessThanOrEqualTo(Double value) {
            addCriterion("ma10 <=", value, "ma10");
            return (Criteria) this;
        }

        public Criteria andMa10In(List<Double> values) {
            addCriterion("ma10 in", values, "ma10");
            return (Criteria) this;
        }

        public Criteria andMa10NotIn(List<Double> values) {
            addCriterion("ma10 not in", values, "ma10");
            return (Criteria) this;
        }

        public Criteria andMa10Between(Double value1, Double value2) {
            addCriterion("ma10 between", value1, value2, "ma10");
            return (Criteria) this;
        }

        public Criteria andMa10NotBetween(Double value1, Double value2) {
            addCriterion("ma10 not between", value1, value2, "ma10");
            return (Criteria) this;
        }

        public Criteria andMa20IsNull() {
            addCriterion("ma20 is null");
            return (Criteria) this;
        }

        public Criteria andMa20IsNotNull() {
            addCriterion("ma20 is not null");
            return (Criteria) this;
        }

        public Criteria andMa20EqualTo(Double value) {
            addCriterion("ma20 =", value, "ma20");
            return (Criteria) this;
        }

        public Criteria andMa20NotEqualTo(Double value) {
            addCriterion("ma20 <>", value, "ma20");
            return (Criteria) this;
        }

        public Criteria andMa20GreaterThan(Double value) {
            addCriterion("ma20 >", value, "ma20");
            return (Criteria) this;
        }

        public Criteria andMa20GreaterThanOrEqualTo(Double value) {
            addCriterion("ma20 >=", value, "ma20");
            return (Criteria) this;
        }

        public Criteria andMa20LessThan(Double value) {
            addCriterion("ma20 <", value, "ma20");
            return (Criteria) this;
        }

        public Criteria andMa20LessThanOrEqualTo(Double value) {
            addCriterion("ma20 <=", value, "ma20");
            return (Criteria) this;
        }

        public Criteria andMa20In(List<Double> values) {
            addCriterion("ma20 in", values, "ma20");
            return (Criteria) this;
        }

        public Criteria andMa20NotIn(List<Double> values) {
            addCriterion("ma20 not in", values, "ma20");
            return (Criteria) this;
        }

        public Criteria andMa20Between(Double value1, Double value2) {
            addCriterion("ma20 between", value1, value2, "ma20");
            return (Criteria) this;
        }

        public Criteria andMa20NotBetween(Double value1, Double value2) {
            addCriterion("ma20 not between", value1, value2, "ma20");
            return (Criteria) this;
        }

        public Criteria andMa30IsNull() {
            addCriterion("ma30 is null");
            return (Criteria) this;
        }

        public Criteria andMa30IsNotNull() {
            addCriterion("ma30 is not null");
            return (Criteria) this;
        }

        public Criteria andMa30EqualTo(Double value) {
            addCriterion("ma30 =", value, "ma30");
            return (Criteria) this;
        }

        public Criteria andMa30NotEqualTo(Double value) {
            addCriterion("ma30 <>", value, "ma30");
            return (Criteria) this;
        }

        public Criteria andMa30GreaterThan(Double value) {
            addCriterion("ma30 >", value, "ma30");
            return (Criteria) this;
        }

        public Criteria andMa30GreaterThanOrEqualTo(Double value) {
            addCriterion("ma30 >=", value, "ma30");
            return (Criteria) this;
        }

        public Criteria andMa30LessThan(Double value) {
            addCriterion("ma30 <", value, "ma30");
            return (Criteria) this;
        }

        public Criteria andMa30LessThanOrEqualTo(Double value) {
            addCriterion("ma30 <=", value, "ma30");
            return (Criteria) this;
        }

        public Criteria andMa30In(List<Double> values) {
            addCriterion("ma30 in", values, "ma30");
            return (Criteria) this;
        }

        public Criteria andMa30NotIn(List<Double> values) {
            addCriterion("ma30 not in", values, "ma30");
            return (Criteria) this;
        }

        public Criteria andMa30Between(Double value1, Double value2) {
            addCriterion("ma30 between", value1, value2, "ma30");
            return (Criteria) this;
        }

        public Criteria andMa30NotBetween(Double value1, Double value2) {
            addCriterion("ma30 not between", value1, value2, "ma30");
            return (Criteria) this;
        }

        public Criteria andDifIsNull() {
            addCriterion("dif is null");
            return (Criteria) this;
        }

        public Criteria andDifIsNotNull() {
            addCriterion("dif is not null");
            return (Criteria) this;
        }

        public Criteria andDifEqualTo(Double value) {
            addCriterion("dif =", value, "dif");
            return (Criteria) this;
        }

        public Criteria andDifNotEqualTo(Double value) {
            addCriterion("dif <>", value, "dif");
            return (Criteria) this;
        }

        public Criteria andDifGreaterThan(Double value) {
            addCriterion("dif >", value, "dif");
            return (Criteria) this;
        }

        public Criteria andDifGreaterThanOrEqualTo(Double value) {
            addCriterion("dif >=", value, "dif");
            return (Criteria) this;
        }

        public Criteria andDifLessThan(Double value) {
            addCriterion("dif <", value, "dif");
            return (Criteria) this;
        }

        public Criteria andDifLessThanOrEqualTo(Double value) {
            addCriterion("dif <=", value, "dif");
            return (Criteria) this;
        }

        public Criteria andDifIn(List<Double> values) {
            addCriterion("dif in", values, "dif");
            return (Criteria) this;
        }

        public Criteria andDifNotIn(List<Double> values) {
            addCriterion("dif not in", values, "dif");
            return (Criteria) this;
        }

        public Criteria andDifBetween(Double value1, Double value2) {
            addCriterion("dif between", value1, value2, "dif");
            return (Criteria) this;
        }

        public Criteria andDifNotBetween(Double value1, Double value2) {
            addCriterion("dif not between", value1, value2, "dif");
            return (Criteria) this;
        }

        public Criteria andDeaIsNull() {
            addCriterion("dea is null");
            return (Criteria) this;
        }

        public Criteria andDeaIsNotNull() {
            addCriterion("dea is not null");
            return (Criteria) this;
        }

        public Criteria andDeaEqualTo(Double value) {
            addCriterion("dea =", value, "dea");
            return (Criteria) this;
        }

        public Criteria andDeaNotEqualTo(Double value) {
            addCriterion("dea <>", value, "dea");
            return (Criteria) this;
        }

        public Criteria andDeaGreaterThan(Double value) {
            addCriterion("dea >", value, "dea");
            return (Criteria) this;
        }

        public Criteria andDeaGreaterThanOrEqualTo(Double value) {
            addCriterion("dea >=", value, "dea");
            return (Criteria) this;
        }

        public Criteria andDeaLessThan(Double value) {
            addCriterion("dea <", value, "dea");
            return (Criteria) this;
        }

        public Criteria andDeaLessThanOrEqualTo(Double value) {
            addCriterion("dea <=", value, "dea");
            return (Criteria) this;
        }

        public Criteria andDeaIn(List<Double> values) {
            addCriterion("dea in", values, "dea");
            return (Criteria) this;
        }

        public Criteria andDeaNotIn(List<Double> values) {
            addCriterion("dea not in", values, "dea");
            return (Criteria) this;
        }

        public Criteria andDeaBetween(Double value1, Double value2) {
            addCriterion("dea between", value1, value2, "dea");
            return (Criteria) this;
        }

        public Criteria andDeaNotBetween(Double value1, Double value2) {
            addCriterion("dea not between", value1, value2, "dea");
            return (Criteria) this;
        }

        public Criteria andMacdIsNull() {
            addCriterion("macd is null");
            return (Criteria) this;
        }

        public Criteria andMacdIsNotNull() {
            addCriterion("macd is not null");
            return (Criteria) this;
        }

        public Criteria andMacdEqualTo(Double value) {
            addCriterion("macd =", value, "macd");
            return (Criteria) this;
        }

        public Criteria andMacdNotEqualTo(Double value) {
            addCriterion("macd <>", value, "macd");
            return (Criteria) this;
        }

        public Criteria andMacdGreaterThan(Double value) {
            addCriterion("macd >", value, "macd");
            return (Criteria) this;
        }

        public Criteria andMacdGreaterThanOrEqualTo(Double value) {
            addCriterion("macd >=", value, "macd");
            return (Criteria) this;
        }

        public Criteria andMacdLessThan(Double value) {
            addCriterion("macd <", value, "macd");
            return (Criteria) this;
        }

        public Criteria andMacdLessThanOrEqualTo(Double value) {
            addCriterion("macd <=", value, "macd");
            return (Criteria) this;
        }

        public Criteria andMacdIn(List<Double> values) {
            addCriterion("macd in", values, "macd");
            return (Criteria) this;
        }

        public Criteria andMacdNotIn(List<Double> values) {
            addCriterion("macd not in", values, "macd");
            return (Criteria) this;
        }

        public Criteria andMacdBetween(Double value1, Double value2) {
            addCriterion("macd between", value1, value2, "macd");
            return (Criteria) this;
        }

        public Criteria andMacdNotBetween(Double value1, Double value2) {
            addCriterion("macd not between", value1, value2, "macd");
            return (Criteria) this;
        }

        public Criteria andLotVolumeIsNull() {
            addCriterion("lot_volume is null");
            return (Criteria) this;
        }

        public Criteria andLotVolumeIsNotNull() {
            addCriterion("lot_volume is not null");
            return (Criteria) this;
        }

        public Criteria andLotVolumeEqualTo(Integer value) {
            addCriterion("lot_volume =", value, "lotVolume");
            return (Criteria) this;
        }

        public Criteria andLotVolumeNotEqualTo(Integer value) {
            addCriterion("lot_volume <>", value, "lotVolume");
            return (Criteria) this;
        }

        public Criteria andLotVolumeGreaterThan(Integer value) {
            addCriterion("lot_volume >", value, "lotVolume");
            return (Criteria) this;
        }

        public Criteria andLotVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lot_volume >=", value, "lotVolume");
            return (Criteria) this;
        }

        public Criteria andLotVolumeLessThan(Integer value) {
            addCriterion("lot_volume <", value, "lotVolume");
            return (Criteria) this;
        }

        public Criteria andLotVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("lot_volume <=", value, "lotVolume");
            return (Criteria) this;
        }

        public Criteria andLotVolumeIn(List<Integer> values) {
            addCriterion("lot_volume in", values, "lotVolume");
            return (Criteria) this;
        }

        public Criteria andLotVolumeNotIn(List<Integer> values) {
            addCriterion("lot_volume not in", values, "lotVolume");
            return (Criteria) this;
        }

        public Criteria andLotVolumeBetween(Integer value1, Integer value2) {
            addCriterion("lot_volume between", value1, value2, "lotVolume");
            return (Criteria) this;
        }

        public Criteria andLotVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("lot_volume not between", value1, value2, "lotVolume");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNull() {
            addCriterion("timestamp is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(String value) {
            addCriterion("timestamp =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(String value) {
            addCriterion("timestamp <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(String value) {
            addCriterion("timestamp >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(String value) {
            addCriterion("timestamp >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(String value) {
            addCriterion("timestamp <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(String value) {
            addCriterion("timestamp <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLike(String value) {
            addCriterion("timestamp like", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotLike(String value) {
            addCriterion("timestamp not like", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<String> values) {
            addCriterion("timestamp in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<String> values) {
            addCriterion("timestamp not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(String value1, String value2) {
            addCriterion("timestamp between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(String value1, String value2) {
            addCriterion("timestamp not between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
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