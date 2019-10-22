package com.lsdj.lushan.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * SessionFactory工具类
 */
public class SessionFactory {
    //获取sqlSessionFactory对象方法
    public SqlSession getSqlSessionFactory(){
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("conf/mybatis-config.xml");
        } catch (IOException e) {
            //读取文件失败返回空
            e.printStackTrace();
            return null;
        }
        SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory.openSession();
    }

}
