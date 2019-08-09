package com.zhiyou.controller;

import com.zhiyou.pojo.Resource;
import com.zhiyou.pojo.Role;
import com.zhiyou.service.RoleadminService;
import com.zhiyou.suport.ResultObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: http://wangjie
 * @Date: 2019/8/8
 * @Description: com.zhiyou.controller
 * @version: 1.0
 */
@Controller
@RequestMapping("/authority")
@Api(value = "AuthorityController", tags = "认证与授权相关的controller")
public class AuthorityController {

    @Autowired
    private RoleadminService roleadminService;

    @PostMapping("/login.action")
    @ApiOperation(value = "用户登录")
    public ModelAndView login(String username, String password, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("username", username);
        request.setAttribute("password", password);
        request.setAttribute(View.RESPONSE_STATUS_ATTRIBUTE, HttpStatus.TEMPORARY_REDIRECT);
        return new ModelAndView("redirect:/authentication/form?username=" + username + "&password=" + password);
    }


    @PostMapping("/setRoleForAdmin.action")
    @ResponseBody
    @ApiOperation(value = "为用户新增角色，包含删除")
    public ResultObject setRoleForAdmin(@RequestParam List<Integer> roleIds, @RequestParam Integer adminId) {
        int result = roleadminService.setRoleForAdmin(roleIds, adminId);
        if (result > 0) {
            return new ResultObject(200, "角色设置成功");
        } else {
            return new ResultObject(201, "没有数据可更新，用户已经拥有相关角色");
        }
    }

    @PostMapping("/setResourceForRole.action")
    @ResponseBody
    @ApiOperation(value = "为角色新增权限，包含删除")
    public ResultObject setResourceForRole(@RequestParam List<Integer> resourceIds, @RequestParam Integer roleId) {
        int result = roleadminService.setResourceForRole(resourceIds, roleId);
        if (result > 0) {
            return new ResultObject(200, "角色设置成功");
        } else {
            return new ResultObject(201, "没有数据可更新，角色已经拥有相关权限");
        }
    }

    /**
     * 根据用户 查询用户拥有角色
     *
     * @param adminId
     * @return
     */
    @GetMapping("/selectRoleByAdmin.action")
    @ResponseBody
    @ApiOperation(value = "根据用户，查看用户拥有角色")
    public ResultObject selectRoleByAdmin(Integer adminId) {
        List<Role> roles = roleadminService.selectRoleByAdmin(adminId);
        if (roles != null && roles.size() > 0) {
            return new ResultObject(200, roles);
        } else {
            return new ResultObject(201, "没有查询到角色信息");
        }
    }

    /**
     * 根据用户 查询用户拥有角色
     *
     * @param roleId
     * @return
     */
    @GetMapping("/selectResourceByRole.action")
    @ResponseBody
    @ApiOperation(value = "根据角色，查看角色拥有权限")
    public ResultObject selectResourceByRole(Integer roleId) {
        List<Resource> Resources = roleadminService.selectResourceByRole(roleId);
        if (Resources != null && Resources.size() > 0) {
            return new ResultObject(200, Resources);
        } else {
            return new ResultObject(201, "没有查询到权限信息");
        }
    }

    /**
     * 根据管理员用户id，返回管理员可操作的树形菜单列表
     *
     * @param adminId
     * @return
     */
    @GetMapping("/getTree.action")
    @ResponseBody
    @ApiOperation(value = "根据管理员用户id，返回管理员可操作的树形菜单列表")
    public ResultObject getTree(Integer adminId) {
        List<Resource> resources = roleadminService.getTree(adminId);
        return new ResultObject(200, resources);
    }

}
