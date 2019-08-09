package com.zhiyou.mapper;

import com.zhiyou.pojo.OrderData;
import com.zhiyou.pojo.OrderDataExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDataMapper {
    long countByExample(OrderDataExample example);

    int deleteByExample(OrderDataExample example);

    int deleteByPrimaryKey(String poNumber);

    int insert(OrderData record);

    int insertSelective(OrderData record);

    List<OrderData> selectByExample(OrderDataExample example);

    OrderData selectByPrimaryKey(String poNumber);

    int updateByExampleSelective(@Param("record") OrderData record, @Param("example") OrderDataExample example);

    int updateByExample(@Param("record") OrderData record, @Param("example") OrderDataExample example);

    int updateByPrimaryKeySelective(OrderData record);

    int updateByPrimaryKey(OrderData record);
}