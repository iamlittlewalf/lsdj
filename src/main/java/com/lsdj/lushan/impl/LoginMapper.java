package com.lsdj.lushan.impl;

import com.lsdj.lushan.bean.LoginBean;

public interface LoginMapper {
    //登陆接口
    public LoginBean login(String user_name, String user_psd);
    //退出登陆接口
    public String logout();

}
