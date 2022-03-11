package com.jianspace.jianlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class JianlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(JianlogApplication.class, args);
    }

}
