package com.lsdj.lushan.bean;


import lombok.Data;

import java.util.Date;

@Data
public class RegisterBean {

    private Date user_regtime;
    private String user_name;
    private String user_psd;
    private String user_type;
    private String user_position;
    private String user_permission;
    private String user_qq;
    private String user_wechat;
    private String user_email;
    private String user_tel;
    private String user_encrypted1;
    private String user_encrypted2;
    private String user_encrypted3;
    private String user_answer1;
    private String user_answer2;
    private String user_answer3;

}
