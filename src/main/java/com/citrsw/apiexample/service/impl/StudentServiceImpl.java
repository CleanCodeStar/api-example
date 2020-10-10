package com.citrsw.apiexample.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citrsw.apiexample.entity.Student;
import com.citrsw.apiexample.mapper.StudentMapper;
import com.citrsw.apiexample.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
* 学生ServiceImpl
*
* @author Zhenfeng Li
* @version 0.0.1
* @date 2020-04-01 08:04:05
*/
@Service
@Slf4j
public class StudentServiceImpl extends ServiceImpl<StudentMapper,Student> implements  StudentService {

    private final StudentMapper studentMapper;

    public StudentServiceImpl(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public List<Map<String, Object>> groupCountNumByClazzId() {
        return studentMapper.groupCountNumByClazzId();
    }

    @Override
    public Map<String, Object> countNumByClazzId(Long id) {
        return studentMapper.countNumByClazzId(id);
    }
}