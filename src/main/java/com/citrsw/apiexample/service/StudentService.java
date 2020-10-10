package com.citrsw.apiexample.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.citrsw.apiexample.entity.Student;

import java.util.List;
import java.util.Map;

/**
 * 学生Service
 *
 * @author Zhenfeng Li
 * @version 1.0.0
 * @date 2020-10-02 08:59:51
 */
public interface StudentService extends IService<Student> {

    /**
     * 根据班级分组统计人数
     * @return
     */
    List<Map<String, Object>> groupCountNumByClazzId();

    /**
     * 根据班级Id统计人数
     *
     * @param id
     * @return
     */
    Map<String, Object> countNumByClazzId(Long id);
}