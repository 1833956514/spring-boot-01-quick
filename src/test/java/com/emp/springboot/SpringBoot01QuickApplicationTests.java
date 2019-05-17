package com.emp.springboot;

import com.emp.springboot.bean.Person;
import com.emp.springboot.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * SpringBoot单元测试
 *
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot01QuickApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void testHelloService(){
        boolean b = applicationContext.containsBean("helloService");
        System.out.println(b);
    }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
