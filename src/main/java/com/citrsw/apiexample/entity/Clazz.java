package com.citrsw.apiexample.entity;

import com.citrsw.annatation.ApiModel;
import com.citrsw.annatation.ApiProperty;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;


/**
* 班级
*
* @author Zhenfeng Li
* @version 1.0.0
* @date 2020-10-02 08:59:51
*/
@TableName("tb_clazz")
@Accessors(chain = true)
@Data
@ApiModel("班级")
public class Clazz implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键Id
    */
    @ApiProperty(description = "主键Id")
    private Long id;

    /**
    * 班级编号
    */
    @ApiProperty(description = "班级编号")
    private String no;

    /**
    * 班级名称
    */
    @ApiProperty(description = "班级名称")
    private String name;

    /**
    * 班主任Id
    */
    @ApiProperty(description = "班主任Id")
    private Long teacherId;
}