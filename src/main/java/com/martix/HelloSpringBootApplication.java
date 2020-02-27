package com.martix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 必须标注一个主程序类，说明这是一个Spring Boot应用
 * 在pom.xml里配置Spring后代码才不会报错
 */
@SpringBootApplication
public class HelloSpringBootApplication {
    public static void main(String[] args) {
        //使Spring 应用启动起来
        SpringApplication.run(HelloSpringBootApplication.class,args);
    }
}
