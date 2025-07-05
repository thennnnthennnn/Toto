package com.p;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.p.Dao")
public class TotoApplication {
    public static void main(String[] args){
        SpringApplication.run(TotoApplication.class, args);
    }
}
