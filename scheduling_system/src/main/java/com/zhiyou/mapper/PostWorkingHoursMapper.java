package com.zhiyou.mapper;

import com.zhiyou.pojo.PostWorkingHours;
import com.zhiyou.pojo.PostWorkingHoursExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostWorkingHoursMapper {
    long countByExample(PostWorkingHoursExample example);

    int deleteByExample(PostWorkingHoursExample example);

    int deleteByPrimaryKey(String productNumber);

    int insert(PostWorkingHours record);

    int insertSelective(PostWorkingHours record);

    List<PostWorkingHours> selectByExample(PostWorkingHoursExample example);

    PostWorkingHours selectByPrimaryKey(String productNumber);

    int updateByExampleSelective(@Param("record") PostWorkingHours record, @Param("example") PostWorkingHoursExample example);

    int updateByExample(@Param("record") PostWorkingHours record, @Param("example") PostWorkingHoursExample example);

    int updateByPrimaryKeySelective(PostWorkingHours record);

    int updateByPrimaryKey(PostWorkingHours record);
}