package com.slionh.StockDataXueqiu;

/*
 * Create by s lion h on 2018/7/2
 */
public class DataPo {
    private Integer volume;
    private Double open;
    private Double high;
    private Double close;
    private Double low;
    private Double chg;
    private Double percent;
    private Double turnrate;
    private Double ma5;
    private Double ma10;
    private Double ma20;
    private Double ma30;
    private Double dif;
    private Double dea;
    private Double macd;
    private Integer lot_volume;
    private String timestamp;
    private String time;

    public DataPo(Integer volume, Double open, Double high, Double close,
                  Double low, Double chg, Double percent, Double turnrate,
                  Double ma5, Double ma10, Double ma20, Double ma30,
                  Double dif, Double dea, Double macd,
                  Integer lot_volume, String timestamp, String time) {
        this.volume = volume;
        this.open = open;
        this.high = high;
        this.close = close;
        this.low = low;
        this.chg = chg;
        this.percent = percent;
        this.turnrate = turnrate;
        this.ma5 = ma5;
        this.ma10 = ma10;
        this.ma20 = ma20;
        this.ma30 = ma30;
        this.dif = dif;
        this.dea = dea;
        this.macd = macd;
        this.lot_volume = lot_volume;
        this.timestamp = timestamp;
        this.time = time;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Double getOpen() {
        return open;
    }

    public void setOpen(Double open) {
        this.open = open;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getClose() {
        return close;
    }

    public void setClose(Double close) {
        this.close = close;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getChg() {
        return chg;
    }

    public void setChg(Double chg) {
        this.chg = chg;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public Double getTurnrate() {
        return turnrate;
    }

    public void setTurnrate(Double turnrate) {
        this.turnrate = turnrate;
    }

    public Double getMa5() {
        return ma5;
    }

    public void setMa5(Double ma5) {
        this.ma5 = ma5;
    }

    public Double getMa10() {
        return ma10;
    }

    public void setMa10(Double ma10) {
        this.ma10 = ma10;
    }

    public Double getMa20() {
        return ma20;
    }

    public void setMa20(Double ma20) {
        this.ma20 = ma20;
    }

    public Double getMa30() {
        return ma30;
    }

    public void setMa30(Double ma30) {
        this.ma30 = ma30;
    }

    public Double getDif() {
        return dif;
    }

    public void setDif(Double dif) {
        this.dif = dif;
    }

    public Double getDea() {
        return dea;
    }

    public void setDea(Double dea) {
        this.dea = dea;
    }

    public Double getMacd() {
        return macd;
    }

    public void setMacd(Double macd) {
        this.macd = macd;
    }

    public Integer getLot_volume() {
        return lot_volume;
    }

    public void setLot_volume(Integer lot_volume) {
        this.lot_volume = lot_volume;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "DataPo{" +
                "volume=" + volume +
                ", open=" + open +
                ", high=" + high +
                ", close=" + close +
                ", low=" + low +
                ", chg=" + chg +
                ", percent=" + percent +
                ", turnrate=" + turnrate +
                ", ma5=" + ma5 +
                ", ma10=" + ma10 +
                ", ma20=" + ma20 +
                ", ma30=" + ma30 +
                ", dif=" + dif +
                ", dea=" + dea +
                ", macd=" + macd +
                ", lot_volume=" + lot_volume +
                ", timestamp='" + timestamp + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
