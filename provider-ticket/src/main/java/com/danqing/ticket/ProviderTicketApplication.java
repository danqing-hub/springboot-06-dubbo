package com.danqing.ticket;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、（整合dubbo）将服务提供者注册到注册中心
 * 		①引入dubbo和zkclient相关依赖
 * 		②配置dubbo的扫描包和注册中心地址
 * 		③使用@Service发布服务
 *
 */
@EnableDubbo
@SpringBootApplication
public class ProviderTicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderTicketApplication.class, args);
	}

}
