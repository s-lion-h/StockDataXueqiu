<code>此服务基于雪球网<br/>
测试：如xueqiu.com退市，则无法提供服务

## Maven

添加仓库

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

添加依赖

```xml
<dependency>
    <groupId>com.github.s-lion-h</groupId>
    <artifactId>StockDataXueqiu</artifactId>
    <version>-SNAPSHOT</version>
</dependency>
```

##生成雪球url
    DataUrl dataUrl=new DataUrl("SH600011","1451577600000","1529596800000");
    String url=dataUrl.getUrl();
    
##With  Data/POJO     
    //data
    KLineData.getDayKLine(url);
    //pojo
    KLineData.getDayKLineObjects(url);

##result
####指定时间段的日K
DataPo{volume=8971548, open=6.53, high=6.61, close=6.57, low=6.43, chg=0.05, percent=0.77, turnrate=0.09, ma5=6.56, ma10=6.642, ma20=6.725, ma30=6.598, dif=0.02, dea=0.07, macd=-0.09, lot_volume=89715, timestamp='1528992000000', time='Fri Jun 15 00:00:00 +0800 2018'}