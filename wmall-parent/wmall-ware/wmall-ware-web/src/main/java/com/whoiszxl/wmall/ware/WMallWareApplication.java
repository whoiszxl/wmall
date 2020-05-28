package com.whoiszxl.wmall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableFeignClients(basePackages = "com.whoiszxl.wmall.ware.feign")
@EnableDiscoveryClient
@MapperScan("com.whoiszxl.wmall.ware.dao")
@SpringBootApplication
public class WMallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(WMallWareApplication.class, args);
    }
}
