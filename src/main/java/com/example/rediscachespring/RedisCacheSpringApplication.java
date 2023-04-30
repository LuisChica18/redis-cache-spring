package com.example.rediscachespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class RedisCacheSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisCacheSpringApplication.class, args);
    }

}
