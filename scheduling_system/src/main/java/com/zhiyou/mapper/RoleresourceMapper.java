package com.zhiyou.mapper;

import com.zhiyou.pojo.Roleresource;
import com.zhiyou.pojo.RoleresourceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleresourceMapper {
    long countByExample(RoleresourceExample example);

    int deleteByExample(RoleresourceExample example);

    int deleteByPrimaryKey(Long imoocId);

    int insert(Roleresource record);

    int insertSelective(Roleresource record);

    List<Roleresource> selectByExample(RoleresourceExample example);

    Roleresource selectByPrimaryKey(Long imoocId);

    int updateByExampleSelective(@Param("record") Roleresource record, @Param("example") RoleresourceExample example);

    int updateByExample(@Param("record") Roleresource record, @Param("example") RoleresourceExample example);

    int updateByPrimaryKeySelective(Roleresource record);

    int updateByPrimaryKey(Roleresource record);
}