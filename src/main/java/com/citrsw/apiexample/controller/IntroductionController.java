package com.citrsw.apiexample.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.citrsw.annatation.ApiClass;
import com.citrsw.annatation.ApiMethod;
import com.citrsw.annatation.ApiParam;
import com.citrsw.apiexample.common.Result;
import com.citrsw.apiexample.entity.User;
import com.citrsw.apiexample.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 写点注释
 *
 * @author Zhenfeng Li
 * @version 1.0
 * @date 2020-10-08 19:14
 */
@ApiClass("入门用法")
@RestController
@Slf4j
public class IntroductionController {
    private final UserService userService;

    public IntroductionController(UserService userService) {
        this.userService = userService;
    }

    @ApiMethod("根据条件分页查询")
    @GetMapping("/user/page")
    public Result<Page<User>> pageAll(User user, Page<User> page) {
        LambdaQueryWrapper<User> wrapper = Wrappers.lambdaQuery();
        return Result.buildQueryOk(userService.page(page, wrapper));
    }

    @ApiMethod("根据条件分页查询")
    @GetMapping("/user/page/all")
    public Result<Page<User>> pageAll(User user, @RequestParam(defaultValue = "1") @ApiParam(description = "当前页", defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") @ApiParam(description = "每页数据条数", defaultValue = "10") Integer pageSize) {
        LambdaQueryWrapper<User> wrapper = Wrappers.lambdaQuery();
        return Result.buildQueryOk(userService.page(new Page<>(page, pageSize), wrapper));
    }
}
