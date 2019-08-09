package com.zhiyou.mapper;

import com.zhiyou.pojo.Bom;
import com.zhiyou.pojo.BomExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BomMapper {
    long countByExample(BomExample example);

    int deleteByExample(BomExample example);

    int deleteByPrimaryKey(String productNumber);

    int insert(Bom record);

    int insertSelective(Bom record);

    List<Bom> selectByExample(BomExample example);

    Bom selectByPrimaryKey(String productNumber);

    int updateByExampleSelective(@Param("record") Bom record, @Param("example") BomExample example);

    int updateByExample(@Param("record") Bom record, @Param("example") BomExample example);

    int updateByPrimaryKeySelective(Bom record);

    int updateByPrimaryKey(Bom record);
}