package com.zhiyou.mapper;

import com.zhiyou.pojo.ProductionData;
import com.zhiyou.pojo.ProductionDataExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductionDataMapper {
    long countByExample(ProductionDataExample example);

    int deleteByExample(ProductionDataExample example);

    int deleteByPrimaryKey(String jobNumber);

    int insert(ProductionData record);

    int insertSelective(ProductionData record);

    List<ProductionData> selectByExample(ProductionDataExample example);

    ProductionData selectByPrimaryKey(String jobNumber);

    int updateByExampleSelective(@Param("record") ProductionData record, @Param("example") ProductionDataExample example);

    int updateByExample(@Param("record") ProductionData record, @Param("example") ProductionDataExample example);

    int updateByPrimaryKeySelective(ProductionData record);

    int updateByPrimaryKey(ProductionData record);
}