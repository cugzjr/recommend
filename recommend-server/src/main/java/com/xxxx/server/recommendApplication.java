package com.xxxx.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class recommendApplication {
    public static void main(String[] args){
        SpringApplication.run(recommendApplication.class, args);
    }
}
