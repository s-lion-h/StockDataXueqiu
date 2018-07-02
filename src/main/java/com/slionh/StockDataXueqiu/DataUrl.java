package com.slionh.StockDataXueqiu;

/*
 * Create by s lion h on 2018/7/2
 */
public class DataUrl {
    /*
    https://xueqiu.com/stock/forchartk/stocklist.json?symbol=SH600011&period=1day&type=before&begin=1478620800000&end=1530500168000&_=1510126200000
    雪球网申请资源
    api申请前必须访问一次雪球网首页https://xueqiu.com
    时间为毫秒级时间戳
    2016-01-01=1451577600000
    2018-06-22=1529596800000
    */

    private String url;
    private String urlHead="https://xueqiu.com/stock/forchartk/stocklist.json?symbol=";
    private String stock;
    private String type="&period=1day&type=before";
    private String begin;
    private String end;

    public DataUrl(String stock, String begin, String end) {
        this.stock = stock;
        this.begin = "&begin="+begin;
        this.end = "&end="+end;
    }

    public String getUrl() {
        return urlHead+stock+type+begin+end;
    }
}
