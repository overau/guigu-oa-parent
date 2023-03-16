package com.sanfen.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author HeJin
 * @version 1.0
 * @since 2023/03/16 22:07
 */
@SpringBootApplication
@MapperScan("com.sanfen.*.mapper")
public class ServiceAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAuthApplication.class, args);
    }

}
