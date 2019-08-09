package com.zhiyou.mapper;

import com.zhiyou.pojo.Roleadmin;
import com.zhiyou.pojo.RoleadminExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleadminMapper {
    long countByExample(RoleadminExample example);

    int deleteByExample(RoleadminExample example);

    int deleteByPrimaryKey(Long imoocId);

    int insert(Roleadmin record);

    int insertSelective(Roleadmin record);

    List<Roleadmin> selectByExample(RoleadminExample example);

    Roleadmin selectByPrimaryKey(Long imoocId);

    int updateByExampleSelective(@Param("record") Roleadmin record, @Param("example") RoleadminExample example);

    int updateByExample(@Param("record") Roleadmin record, @Param("example") RoleadminExample example);

    int updateByPrimaryKeySelective(Roleadmin record);

    int updateByPrimaryKey(Roleadmin record);
}