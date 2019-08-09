package com.zhiyou.mapper;

import com.zhiyou.pojo.PostProductionSequence;
import com.zhiyou.pojo.PostProductionSequenceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostProductionSequenceMapper {
    long countByExample(PostProductionSequenceExample example);

    int deleteByExample(PostProductionSequenceExample example);

    int deleteByPrimaryKey(String jobNumber);

    int insert(PostProductionSequence record);

    int insertSelective(PostProductionSequence record);

    List<PostProductionSequence> selectByExample(PostProductionSequenceExample example);

    PostProductionSequence selectByPrimaryKey(String jobNumber);

    int updateByExampleSelective(@Param("record") PostProductionSequence record, @Param("example") PostProductionSequenceExample example);

    int updateByExample(@Param("record") PostProductionSequence record, @Param("example") PostProductionSequenceExample example);

    int updateByPrimaryKeySelective(PostProductionSequence record);

    int updateByPrimaryKey(PostProductionSequence record);
}