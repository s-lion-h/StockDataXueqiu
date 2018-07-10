package com.slionh.StockDataXueqiu.demo;

import com.slionh.StockDataXueqiu.DataPo;
import com.slionh.StockDataXueqiu.DataUrl;
import com.slionh.StockDataXueqiu.KLineData;

import java.util.List;

/*
 * Create by s lion h on 2018/7/2
 */
public class DataDemo {
    public static void main(String[] args) {
        DataUrl dataUrl=new DataUrl("SH600011","1451577600000","1529596800000");
        String url=dataUrl.getUrl();

//        System.out.println(KLineData.getDayKLine(url));

        List<DataPo> list=KLineData.getDayKLineObjects(url,"SH600011");
        for (DataPo dataPo:list){
            System.out.println(dataPo.toString());
        }
    }
}
