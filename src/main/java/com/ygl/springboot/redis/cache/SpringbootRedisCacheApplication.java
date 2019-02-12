package com.ygl.springboot.redis.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableCaching
@MapperScan(basePackages = "com.ygl.springboot.redis.cache.mapper")
public class SpringbootRedisCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRedisCacheApplication.class, args);
    }

}

