package com.zhiyou.scheduling_system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.zhiyou")
@MapperScan("com.zhiyou.mapper")
public class SchedulingSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchedulingSystemApplication.class, args);
    }

}
