package com.zhiyou.controller;

import com.zhiyou.pojo.Admin;
import com.zhiyou.service.AdminService;
import com.zhiyou.suport.ResultObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: http://wangjie
 * @Date: 2019/8/6
 * @Description: com.zhiyou.controller
 * @version: 1.0
 */
@RestController
@RequestMapping("/admin")
@Api(value = "adminController", tags = "admin管理的接口")
public class AdminController {

    @Autowired
    private AdminService adminService;


    /**
     * 根据id删除管理员用户
     *
     * @param id
     * @return
     */
    @GetMapping("/deleteAdminById.action")
    @ApiOperation(value = "根据id删除管理员用户")
    public ResultObject deleteAdminById(@RequestParam String id) {
        int result = adminService.deleteAdminById(id);
        if (result > 0) {
            return new ResultObject(200, "删除成功");
        } else {
            return new ResultObject(201, "删除失败");
        }
    }


    /**
     * 新增管理员用户
     *
     * @param admin
     * @return
     */
    @PostMapping("/addAdmin.action")
    @ApiOperation(value = "新增管理员用户")
    public ResultObject addAdmin(@RequestBody Admin admin) {
        int result = adminService.addAdmin(admin);
        if (result > 0) {
            return new ResultObject(200, "插入成功");
        } else {
            return new ResultObject(201, "新增失败");
        }
    }

    /**
     * 根据管理员id 查询管理员信息
     *
     * @param id
     * @return
     */
    @GetMapping("/getAdminInfo.action")
    @ApiOperation(value = "根据管理员id单个管理员查询")
    public ResultObject getAdminInfo(@RequestParam String id) {
        Admin admin = adminService.getAdminInfo(id);
        if (admin == null) {
            return new ResultObject(201, "没有查询到信息");
        }
        return new ResultObject(200, admin);
    }

    /**
     * 修改管理员信息
     *
     * @param admin
     * @return
     */
    @PostMapping("/uodateAdminById.action")
    @ApiOperation(value = "修改管理员信息")
    public ResultObject updateAdminById(@RequestBody Admin admin) {
        int result = adminService.updateAdminById(admin);
        if (result > 0) {
            return new ResultObject(200, "更新成功");
        } else {
            return new ResultObject(201, "更新失败");
        }

    }

    /**
     * 分页查询管理员
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
        List<Admin> emps = adminService.getAll();
        // 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
        // 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
        PageInfo pageInfo = new PageInfo(emps, 5);
        return new ResultObject(200, pageInfo);
    }

}
