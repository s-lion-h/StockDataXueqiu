package com.slionh.StockDataXueqiu.demo;

import com.slionh.StockDataXueqiu.dao.DaylineMapper;
import com.slionh.StockDataXueqiu.model.po.Dayline;
import com.slionh.StockDataXueqiu.model.po.DaylineExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/*
 * Create by s lion h on 2018/7/2
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class DaoDemo {
    @Resource
    private DaylineMapper daylineMapper;

    @Test
    public void dd(){
        DaylineExample daylineExample=new DaylineExample();
        List<Dayline> dayline=daylineMapper.selectByExample(daylineExample);
        System.out.println(dayline);
    }

}
