package com.whoiszxl.wmall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableFeignClients(basePackages = "com.whoiszxl.wmall.member.feign")
@EnableDiscoveryClient
@MapperScan("com.whoiszxl.wmall.member.dao")
@SpringBootApplication
public class WMallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(WMallMemberApplication.class, args);
    }
}
