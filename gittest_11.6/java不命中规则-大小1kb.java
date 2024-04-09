package com.alibaba.cro.yunbei.agent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

/**
 * Yun Bei Agent
 */
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
