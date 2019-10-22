package com.seven.springboot;

import com.seven.springboot.bean.Person;
import org.apache.catalina.core.ApplicationContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Springboot单元测试；
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器的功能
 *
 */
@ImportResource(locations = {"classpath:beans.xml"})
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigApplicationTests {

	@Autowired
	Person person;

//	//@Autowired
//	ApplicationContext ioc;
//
//	@Test
//	public  void testHelloservice(){
//		boolean b=ioc.containsBean(name:"helloService");
//		System.out.println(b);
//	}



	@Test
	public void contextLoads() {

		System.out.println(person);
	}

}
