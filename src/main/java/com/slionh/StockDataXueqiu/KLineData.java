package com.slionh.StockDataXueqiu;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * Create by s lion h on 2018/7/2
 */
public class KLineData {
    private static final String COOKIES="aliyungf_tc=AQAAACrTJl3zKwQA1QTFeNqKlW0lxN2N; xq_a_token=7443762eee8f6a162df9eef231aa080d60705b21; xq_a_token.sig=3dXmfOS3uyMy7b17jgoYQ4gPMMI; xq_r_token=9ca9ab04037f292f4d5b0683b20266c0133bd863; xq_r_token.sig=6hcU3ekqyYuzz6nNFrMGDWyt4aU; u=641530511490635; Hm_lvt_1db88642e346389874251b5a1eded6e3=1530511491; Hm_lpvt_1db88642e346389874251b5a1eded6e3=1530511491; device_id=11a703c9a94f23cbea9347a70a00dd59";
    /**
     * 发送 get请求
     * cookie可能会刷新，如果失败，换成浏览器里的请求头的完整cookie，更新上面
     */
    public static String getDayKLine(String url) {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String content="";
        content = getString(url, httpclient, content);
        return content;
    }
//    List<DataPo>
    public static List<DataPo> getDayKLineObjects(String url) {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        String content="";
        content = getString(url, httpclient, content);
//        JSONObject jsonObject= JSON.parseObject(content);
////        String chartlist=jsonObject.get("chartlist").toString();
////        System.out.println(chartlist);
//
//        JSONArray jsonArray=jsonObject.getJSONArray("chartlist");
//        System.out.println(jsonArray);
//        int length=jsonArray.

        JSONObject jsonObject=new JSONObject(content);
//        System.out.println(jsonObject);
        JSONArray jsonArray=jsonObject.getJSONArray("chartlist");
//        System.out.println(jsonArray);
        int length=jsonArray.length();
        List<DataPo> list=new ArrayList<DataPo>();
        for (int i=0;i<length;i++){
            JSONObject dayK=jsonArray.getJSONObject(i);
            Integer volume=Integer.parseInt(dayK.get("volume").toString());
            Double open=Double.parseDouble(dayK.get("open").toString());
            Double high=Double.parseDouble(dayK.get("high").toString());
            Double close=Double.parseDouble(dayK.get("close").toString());
            Double low=Double.parseDouble(dayK.get("low").toString());
            Double chg=Double.parseDouble(dayK.get("chg").toString());
            Double percent=Double.parseDouble(dayK.get("percent").toString());
            Double turnrate=Double.parseDouble(dayK.get("turnrate").toString());
            Double ma5=Double.parseDouble(dayK.get("ma5").toString());
            Double ma10=Double.parseDouble(dayK.get("ma10").toString());
            Double ma20=Double.parseDouble(dayK.get("ma20").toString());
            Double ma30=Double.parseDouble(dayK.get("ma30").toString());
            Double dif=Double.parseDouble(dayK.get("dif").toString());
            Double dea=Double.parseDouble(dayK.get("dea").toString());
            Double macd=Double.parseDouble(dayK.get("macd").toString());
            Integer lot_volume=Integer.parseInt(dayK.get("lot_volume").toString());
            String timestamp=dayK.get("timestamp").toString();
            String time=dayK.getString("time");
            DataPo dataPo=new DataPo( volume,  open,  high,  close,
                     low,  chg,  percent,  turnrate,
                     ma5,  ma10,  ma20,  ma30,
                     dif,  dea,  macd,
                     lot_volume,  timestamp,  time);
            list.add(dataPo);
        }

//        for (DataPo dataPo:list){
//            System.out.println(dataPo.toString());
//        }
        return list;
    }

    private static String getString(String url, CloseableHttpClient httpclient, String content) {
        try {
            // 创建httpget.
            HttpGet httpget = new HttpGet(url);
            httpget.setHeader("Cookie",COOKIES);
            System.out.println("executing request " + httpget.getURI());
            // 执行get请求.
            CloseableHttpResponse response = httpclient.execute(httpget);
            try {
                // 获取响应实体
                HttpEntity entity = response.getEntity();
                System.out.println("--------------------------------------");
                // 打印响应状态
                System.out.println(response.getStatusLine());
                if (entity != null) {
                    // 打印响应内容长度
                    System.out.println("Response content length: " + entity.getContentLength());
                    content=EntityUtils.toString(entity);
                }
                System.out.println("------------------------------------");
            } finally {
                response.close();
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭连接,释放资源
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return content;
    }
}