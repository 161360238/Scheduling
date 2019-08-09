package com.zhiyou.service.impl;

import com.zhiyou.mapper.PostProductionSequenceMapper;
import com.zhiyou.pojo.PostProductionSequence;
import com.zhiyou.pojo.PostProductionSequenceExample;
import com.zhiyou.service.PostProductionSequenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: http://wangjie
 * @Date: 2019/8/7
 * @Description: com.zhiyou.service.impl
 * @version: 1.0
 */
@Service
public class PostProductionSequenceServiceImpl implements PostProductionSequenceService {

    @Autowired
    private PostProductionSequenceMapper postProductionSequenceMapper;


    /**
     * 查询全部(用于分页查询)
     * @return
     */
    @Override
    public List<PostProductionSequence> getAll() {
        PostProductionSequenceExample postProductionSequenceExample = new PostProductionSequenceExample();
        return postProductionSequenceMapper.selectByExample(postProductionSequenceExample);

    }
}
