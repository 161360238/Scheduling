package com.zhiyou.mapper;

import com.zhiyou.pojo.PostLaborDemand;
import com.zhiyou.pojo.PostLaborDemandExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostLaborDemandMapper {
    long countByExample(PostLaborDemandExample example);

    int deleteByExample(PostLaborDemandExample example);

    int deleteByPrimaryKey(String processName);

    int insert(PostLaborDemand record);

    int insertSelective(PostLaborDemand record);

    List<PostLaborDemand> selectByExample(PostLaborDemandExample example);

    PostLaborDemand selectByPrimaryKey(String processName);

    int updateByExampleSelective(@Param("record") PostLaborDemand record, @Param("example") PostLaborDemandExample example);

    int updateByExample(@Param("record") PostLaborDemand record, @Param("example") PostLaborDemandExample example);

    int updateByPrimaryKeySelective(PostLaborDemand record);

    int updateByPrimaryKey(PostLaborDemand record);
}