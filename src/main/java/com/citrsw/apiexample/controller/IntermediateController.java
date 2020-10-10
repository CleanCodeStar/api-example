package com.citrsw.apiexample.controller;

import com.citrsw.annatation.*;
import com.citrsw.apiexample.entity.Student;
import com.citrsw.apiexample.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 写点注释
 *
 * @author Zhenfeng Li
 * @version 1.0
 * @date 2020-10-02 16:15
 */
@RestController
@Slf4j
@ApiClass(value = "中级用法")
public class IntermediateController {

    private final StudentService studentService;

    public IntermediateController(StudentService studentService) {
        this.studentService = studentService;
    }

    @ApiMethod("保存学生信息")
    @PostMapping("/student")
    @ApiBasicReturn(description = "保存结果")
    public Boolean saveStudent(@RequestBody Student student) {
        return studentService.save(student);
    }

    @ApiMethod("入参Student类仅显示指定属性")
    @GetMapping("/appoint/student")
    @ApiAppointParam(require = {"age", "sex"}, nonRequire = {"name"})
    public Student countNumByClazzId(Student student) {
        return student;
    }

    @ApiMethod("增加状态码/覆盖全局状态码")
    @GetMapping("/add/code")
    @ApiCode(name = "code", value = "200", description = "用户保存成功")
    @ApiCode(name = "code", value = "300", description = "用户保存失败")
    @ApiCode(name = "code", value = "310", description = "用户名或密码为空")
    public Student addCode(Student student) {
        return student;
    }
}
