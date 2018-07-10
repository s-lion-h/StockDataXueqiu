package com.slionh.StockDataXueqiu.dao;

import com.slionh.StockDataXueqiu.model.po.Dayline;
import com.slionh.StockDataXueqiu.model.po.DaylineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

public interface DaylineMapper {
    int countByExample(DaylineExample example);

    int deleteByExample(DaylineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dayline record);

    int insertSelective(Dayline record);

    List<Dayline> selectByExample(DaylineExample example);

    Dayline selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dayline record, @Param("example") DaylineExample example);

    int updateByExample(@Param("record") Dayline record, @Param("example") DaylineExample example);

    int updateByPrimaryKeySelective(Dayline record);

    int updateByPrimaryKey(Dayline record);
}