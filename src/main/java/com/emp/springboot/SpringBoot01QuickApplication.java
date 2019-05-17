package com.emp.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

/**
 * ImportResource(locations = {"classpath:beans.xml"})：导入Spring配置文件让其生效
 */
//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBoot01QuickApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot01QuickApplication.class, args);
    }

}
