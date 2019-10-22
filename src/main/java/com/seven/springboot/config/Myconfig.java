package com.seven.springboot.config;

import com.seven.springboot.service.Helloservice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration: 指明当前类是一个配置类；替代之前的spring配置文件；
 *
 *  在配置文件中用<bean></bean>标签添加组件
 */
@Configuration
public class Myconfig {

    //将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
    @Bean
    public Helloservice helloservice(){
        System.out.println("@Bean给容器中添加组件了。。。");
        return new Helloservice();
    }
}
