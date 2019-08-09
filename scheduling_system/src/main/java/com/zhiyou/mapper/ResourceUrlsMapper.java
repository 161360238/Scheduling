package com.zhiyou.mapper;

import com.zhiyou.pojo.ResourceUrls;
import com.zhiyou.pojo.ResourceUrlsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceUrlsMapper {
    long countByExample(ResourceUrlsExample example);

    int deleteByExample(ResourceUrlsExample example);

    int insert(ResourceUrls record);

    int insertSelective(ResourceUrls record);

    List<ResourceUrls> selectByExample(ResourceUrlsExample example);

    int updateByExampleSelective(@Param("record") ResourceUrls record, @Param("example") ResourceUrlsExample example);

    int updateByExample(@Param("record") ResourceUrls record, @Param("example") ResourceUrlsExample example);
}