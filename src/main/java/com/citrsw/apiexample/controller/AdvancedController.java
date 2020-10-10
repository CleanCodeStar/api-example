package com.citrsw.apiexample.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.citrsw.annatation.*;
import com.citrsw.apiexample.common.Result;
import com.citrsw.apiexample.entity.User;
import com.citrsw.apiexample.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * 写点注释
 *
 * @author Zhenfeng Li
 * @version 1.0
 * @date 2020-10-02 13:37
 */
@RestController
@Slf4j
@ApiClass(value = "高级用法")
public class AdvancedController {
    private final UserService userService;

    public AdvancedController(UserService userService) {
        this.userService = userService;
    }

    @ApiMethod("保存")
    @PostMapping("/user")
    @ApiParamModelProperty(name = "username", description = "账号", required = true)
    @ApiParamModelProperty(name = "phone", description = "固定电话号码", required = true)
    public Result<Boolean> save(@RequestBody User user, HttpSession session) {
        boolean save = userService.save(user);
        return Result.buildSaveOk(save);
    }

    @ApiMethod("入参为Map<String,Object>类型")
    @GetMapping("/map/object")
    @ApiMapParam({
            @ApiParam(name = "age", description = "年龄", type = "int", required = true),
            @ApiParam(name = "sex", description = "性别", type = "int", required = true)
    })
    public Map<String, Object> mapObject(Map<String, Object> param) {
        Integer age = (Integer) param.get("age");
        Integer sex = (Integer) param.get("sex");
        return param;
    }

    @ApiMethod("入参为Map<String,  Map<String,Object>>类型")
    @GetMapping("/user/map/map/object")
    @ApiMapParam({
            @ApiParam(name = "info.level", description = "用户等级", type = "int", required = true),
            @ApiParam(name = "info.integral", description = "用户积分", type = "int", required = true),
            @ApiParam(name = "username.", description = "用户名", type = "string", required = true)
    })
    public Map<String, Map<String, Object>> userMapObject(Map<String, Map<String, Object>> param) {
        return param;
    }

    @ApiMethod("根据条件分页查询")
    @GetMapping("/return/user/page/all")
    @ApiReturnModelProperty(name = "data.records.username", description = "账号")
    @ApiReturnModelProperty(name = "data.records.phone", description = "固定电话号码")
    public Result<Page<User>> pageAll(User user, Page<User> page) {
        LambdaQueryWrapper<User> wrapper = Wrappers.lambdaQuery();
        return Result.buildQueryOk(userService.page(page, wrapper));
    }
    @ApiMethod("出参为Map<String,Object>类型")
    @GetMapping("/map/list/student")
    @ApiMapReturn({
            @ApiReturn(name = "username", type = "string", description = "用户名"),
            @ApiReturn(name = "password", type = "string", description = "密码")
    })
    public Map<String, List<String>> mapListStudent() {
        return null;
    }
    @ApiMethod("响应为List<Map<String, Map<String,Object>>>类型")
    @GetMapping("/list/map/map/object")
    @ApiMapReturn({
            @ApiReturn(name = "info.level", description = "用户等级", type = "int"),
            @ApiReturn(name = "info.integral", description = "用户积分", type = "int"),
            @ApiReturn(name = "username.", description = "用户名", type = "int")
    })
    public List<Map<String, Map<String,Object>>> mapObject() {
        return null;
    }
}
