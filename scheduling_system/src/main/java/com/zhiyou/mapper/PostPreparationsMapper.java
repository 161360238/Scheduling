package com.zhiyou.mapper;

import com.zhiyou.pojo.PostPreparations;
import com.zhiyou.pojo.PostPreparationsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostPreparationsMapper {
    long countByExample(PostPreparationsExample example);

    int deleteByExample(PostPreparationsExample example);

    int deleteByPrimaryKey(String productNumber);

    int insert(PostPreparations record);

    int insertSelective(PostPreparations record);

    List<PostPreparations> selectByExample(PostPreparationsExample example);

    PostPreparations selectByPrimaryKey(String productNumber);

    int updateByExampleSelective(@Param("record") PostPreparations record, @Param("example") PostPreparationsExample example);

    int updateByExample(@Param("record") PostPreparations record, @Param("example") PostPreparationsExample example);

    int updateByPrimaryKeySelective(PostPreparations record);

    int updateByPrimaryKey(PostPreparations record);
}