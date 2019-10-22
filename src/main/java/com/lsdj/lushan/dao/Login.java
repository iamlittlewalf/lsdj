package com.lsdj.lushan.dao;

import com.lsdj.lushan.impl.LoginMapper;
import com.lsdj.lushan.utils.PasswordEncryption;
import com.lsdj.lushan.utils.SessionFactory;
import org.apache.ibatis.session.SqlSession;

public class Login {

    public boolean login(String username,String password){
        //获取sqlSession对象
        SqlSession openSession = new SessionFactory().getSqlSessionFactory();
        try {
            //获取接口实现类对象
            LoginMapper maper = openSession.getMapper(LoginMapper.class);
            //获取返回对象
            //LoginBean loginBean=maper.login(username,password);
            if (maper.login(username, PasswordEncryption.md5(password)).equals(null)) {//对象为空说明用户名或密码不对，或者不存在该用户
                return false;
            } else {
                return true;
            }
        }finally {
            openSession.close();
        }
    }

    public boolean logout(){
        //推出登陆


        return false;
    }
}
