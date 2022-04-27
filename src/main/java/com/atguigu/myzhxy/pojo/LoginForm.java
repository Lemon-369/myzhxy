package com.atguigu.myzhxy.pojo;

import lombok.Data;

/**
 * @project: ssm_sms
 * @description: 用户登录表单信息
 */
@Data
public class LoginForm {

    private String username;
    private String password;
    //验证码
    private String verifiCode;
    //用户类型
    private Integer userType;

}
