package com.zhiyou.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhiyou.pojo.PostProductionSequence;
import com.zhiyou.service.PostProductionSequenceService;
import com.zhiyou.suport.ResultObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: http://wangjie
 * @Date: 2019/8/7
 * @Description: com.zhiyou.controller
 * @version: 1.0
 */
@RestController
@RequestMapping("/sequence")
@Api(value = "SequenceController", tags = "排程结果查询接口")
public class SequenceController {

    @Autowired
    private PostProductionSequenceService postProductionSequenceService;

    /**
     * 分页查询排程
     *
     * @param page     页码
     * @param pageSize 每页大小
     * @return
     */
    @GetMapping("/getAdminByPage.action")
    @ApiOperation(value = "分页查询管理员信息")
    public ResultObject getAdminByPage(@RequestParam(value = "page", defaultValue = "1") Integer page,
                                       @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize) {
        // 引入PageHelper分页插件
        // 在查询之前只需要调用，传入页码，以及每页的大小
        PageHelper.startPage(page, pageSize);
        // startPage后面紧跟的这个查询就是一个分页查询
        List<PostProductionSequence> emps = postProductionSequenceService.getAll();
        // 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        // 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
        PageInfo pageInfo = new PageInfo(emps, 5);
        return new ResultObject(200, pageInfo);
    }
}
