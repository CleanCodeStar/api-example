package com.citrsw.apiexample.entity;

import com.citrsw.annatation.ApiModel;
import com.citrsw.annatation.ApiProperty;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;


/**
* 学生
*
* @author Zhenfeng Li
* @version 1.0.0
* @date 2020-10-02 08:59:51
*/
@TableName("tb_student")
@Accessors(chain = true)
@Data
@ApiModel("学生")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键Id
    */
    @ApiProperty(description = "主键Id")
    private Long id;

    /**
    * 学号
    */
    @ApiProperty(description = "学号")
    private String no;

    /**
    * 姓名
    */
    @ApiProperty(description = "姓名")
    private String name;

    /**
    * 年龄
    */
    @ApiProperty(description = "年龄")
    private Integer age;

    /**
     * 性别 0：女，1：男，3：保密
     */
    @ApiProperty(description = "性别 0：女，1：男，3：保密")
    private Integer sex;

    /**
    * 班级Id
    */
    @ApiProperty(description = "班级Id")
    private Long clazzId;

    /**
    * 班主任Id
    */
    @ApiProperty(description = "班主任Id")
    private Long teacherId;
}