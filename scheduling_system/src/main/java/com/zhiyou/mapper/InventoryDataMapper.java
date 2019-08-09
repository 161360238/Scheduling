package com.zhiyou.mapper;

import com.zhiyou.pojo.InventoryData;
import com.zhiyou.pojo.InventoryDataExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryDataMapper {
    long countByExample(InventoryDataExample example);

    int deleteByExample(InventoryDataExample example);

    int deleteByPrimaryKey(String inverntoryNumber);

    int insert(InventoryData record);

    int insertSelective(InventoryData record);

    List<InventoryData> selectByExample(InventoryDataExample example);

    InventoryData selectByPrimaryKey(String inverntoryNumber);

    int updateByExampleSelective(@Param("record") InventoryData record, @Param("example") InventoryDataExample example);

    int updateByExample(@Param("record") InventoryData record, @Param("example") InventoryDataExample example);

    int updateByPrimaryKeySelective(InventoryData record);

    int updateByPrimaryKey(InventoryData record);
}