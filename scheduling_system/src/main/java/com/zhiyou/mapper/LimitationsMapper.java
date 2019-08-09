package com.zhiyou.mapper;

import com.zhiyou.pojo.Limitations;
import com.zhiyou.pojo.LimitationsExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LimitationsMapper {
    long countByExample(LimitationsExample example);

    int deleteByExample(LimitationsExample example);

    int deleteByPrimaryKey(String productNumber);

    int insert(Limitations record);

    int insertSelective(Limitations record);

    List<Limitations> selectByExample(LimitationsExample example);

    Limitations selectByPrimaryKey(String productNumber);

    int updateByExampleSelective(@Param("record") Limitations record, @Param("example") LimitationsExample example);

    int updateByExample(@Param("record") Limitations record, @Param("example") LimitationsExample example);

    int updateByPrimaryKeySelective(Limitations record);

    int updateByPrimaryKey(Limitations record);
}