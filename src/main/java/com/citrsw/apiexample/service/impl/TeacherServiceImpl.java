package com.citrsw.apiexample.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citrsw.apiexample.entity.Teacher;
import com.citrsw.apiexample.mapper.TeacherMapper;
import com.citrsw.apiexample.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
* 老师ServiceImpl
*
* @author Zhenfeng Li
* @version 0.0.1
* @date 2020-04-01 08:04:05
*/
@Service
@Slf4j
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper,Teacher> implements  TeacherService {

    private final TeacherMapper teacherMapper;

    public TeacherServiceImpl(TeacherMapper teacherMapper) {
        this.teacherMapper = teacherMapper;
    }

}