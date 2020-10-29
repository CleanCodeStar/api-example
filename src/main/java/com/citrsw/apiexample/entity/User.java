package com.citrsw.apiexample.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.citrsw.annatation.ApiMapProperty;
import com.citrsw.annatation.ApiModel;
import com.citrsw.annatation.ApiProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Map;


/**
 * 管理员
 *
 * @author Zhenfeng Li
 * @version 1.0.0
 * @date 2020-10-02 08:59:51
 */
@TableName("tb_user")
@Accessors(chain = true)
@Data
@ApiModel("管理员")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    @ApiProperty(description = "主键Id")
    private Long id;

    /**
     * 用户名
     */
    @ApiProperty(description = "用户名")
    private String username;

    /**
     * 登录名
     */
    @ApiProperty(description = "登录名", name = "loginName", required = true, example = "admin")
    private String loginName;

    /**
     * 密码
     */
    @ApiProperty(description = "密码")
    private String password;

    /**
     * 手机号
     */
    @ApiProperty(description = "手机号")
    private String phone;

    /**
     * 用户扩展信息
     */
    @ApiMapProperty(name = "level", description = "用户等级", type = "int")
    @ApiMapProperty(name = "integral", description = "用户积分", type = "int")
    @ApiProperty(description = "用户扩展信息")
    private Map<String, Integer> userInfo;
}