package com.wenjing.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Aaron
 * @description
 * @date 2021/5/10 下午5:12
 */
@SpringBootApplication
@MapperScan("com.wenjing.mybatis.dao")
public class MybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }
}
