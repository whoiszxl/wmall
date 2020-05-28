package com.whoiszxl.wmall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableFeignClients(basePackages = "com.whoiszxl.wmall.order.feign")
@EnableDiscoveryClient
@MapperScan("com.whoiszxl.wmall.order.dao")
@SpringBootApplication
public class WMallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(WMallOrderApplication.class, args);
    }
}
