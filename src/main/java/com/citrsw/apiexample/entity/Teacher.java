package com.citrsw.apiexample.entity;

import com.citrsw.annatation.ApiModel;
import com.citrsw.annatation.ApiProperty;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;


/**
* 老师
*
* @author Zhenfeng Li
* @version 1.0.0
* @date 2020-10-02 08:59:51
*/
@TableName("tb_teacher")
@Accessors(chain = true)
@Data
@ApiModel("老师")
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * 主键Id
    */
    @ApiProperty(description = "主键Id")
    private Long id;

    /**
    * 工号
    */
    @ApiProperty(description = "工号")
    private String no;

    /**
    * 教师名称
    */
    @ApiProperty(description = "教师名称")
    private String name;

    /**
    * 性别 0：女，1：男，3：保密
    */
    @ApiProperty(description = "性别 0：女，1：男，3：保密")
    private Integer sex;

    /**
    * 身份证号
    */
    @ApiProperty(description = "身份证号")
    private String pId;

    /**
    * 手机号
    */
    @ApiProperty(description = "手机号")
    private String phone;

    /**
    * 班主任 0：否，1：是
    */
    @ApiProperty(description = "班主任 0：否，1：是")
    private Boolean master;
}