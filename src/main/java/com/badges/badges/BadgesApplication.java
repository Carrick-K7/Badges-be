package com.badges.badges;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.badges.badges.mapper")
public class BadgesApplication {

    public static void main(String[] args) {
        SpringApplication.run(BadgesApplication.class, args);
    }
}
