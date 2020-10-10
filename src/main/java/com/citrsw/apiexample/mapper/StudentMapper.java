package com.citrsw.apiexample.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.citrsw.apiexample.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 学生Mapper
 *
 * @author Zhenfeng Li
 * @version 1.0.0
 * @date 2020-10-02 08:59:51
 */
public interface StudentMapper extends BaseMapper<Student> {

    /**
     * 根据班级分组统计人数
     *
     * @return
     */
    List<Map<String, Object>> groupCountNumByClazzId();

    /**
     * 根据班级Id统计人数
     *
     * @param id
     * @return
     */
    Map<String, Object> countNumByClazzId(@Param("id") Long id);
}