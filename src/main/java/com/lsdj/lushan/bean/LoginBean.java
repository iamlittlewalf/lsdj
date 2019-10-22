package com.lsdj.lushan.bean;

import lombok.Data;

@Data   //自动生成get、set方法和tostring方法注解
public class LoginBean {
    private String user_name;
    private String user_psd;
}
