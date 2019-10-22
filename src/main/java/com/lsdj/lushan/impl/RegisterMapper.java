package com.lsdj.lushan.impl;

import com.lsdj.lushan.bean.RegisterBean;

public interface RegisterMapper {

    public RegisterBean register(String user_name,String user_psd);

}
