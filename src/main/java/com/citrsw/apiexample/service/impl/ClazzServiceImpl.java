package com.citrsw.apiexample.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.citrsw.apiexample.entity.Clazz;
import com.citrsw.apiexample.mapper.ClazzMapper;
import com.citrsw.apiexample.service.ClazzService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
* 班级ServiceImpl
*
* @author Zhenfeng Li
* @version 0.0.1
* @date 2020-04-01 08:04:05
*/
@Service
@Slf4j
public class ClazzServiceImpl extends ServiceImpl<ClazzMapper,Clazz> implements  ClazzService {

    private final ClazzMapper clazzMapper;

    public ClazzServiceImpl(ClazzMapper clazzMapper) {
        this.clazzMapper = clazzMapper;
    }

}