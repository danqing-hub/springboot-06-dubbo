package com.danqing.user;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.引入依赖
 * 2.配置dubbo的注册中心
 * 3.引用服务
 *
 */
@EnableDubbo
@SpringBootApplication
public class ConsumeUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumeUserApplication.class, args);
    }

}
