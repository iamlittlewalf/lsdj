package com.lsdj.lushan.dao;

import com.lsdj.lushan.bean.RegisterBean;
import com.lsdj.lushan.impl.LoginMapper;
import com.lsdj.lushan.impl.RegisterMapper;
import com.lsdj.lushan.utils.PasswordEncryption;
import com.lsdj.lushan.utils.SessionFactory;
import org.apache.ibatis.session.SqlSession;

public class Register {

    public boolean register(String user_name,String user_psd){

        //获取sqlSession对象
        SqlSession openSession = new SessionFactory().getSqlSessionFactory();
        try {
            //获取接口实现类对象
            RegisterMapper Mapper  = openSession.getMapper(RegisterMapper.class);
            //获取返回对象
            RegisterBean registerBean=Mapper.register(user_name,user_psd);



        }finally {
            openSession.close();
        }


        return false;
    }


}
