package com.zhiyou.mapper;

import com.zhiyou.pojo.Resource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: http://wangjie
 * @Date: 2019/8/8
 * @Description: com.zhiyou.mapper
 * @version: 1.0
 */
@Repository
public interface MyResourceMapper {
    Resource loopSelectByPremaryKey(Long id);
}
