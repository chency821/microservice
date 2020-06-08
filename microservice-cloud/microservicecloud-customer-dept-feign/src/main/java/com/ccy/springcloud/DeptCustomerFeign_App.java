package com.ccy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description TODO
 * @Author chency
 * @Date 2020/6/5 11:49
 */
@SpringBootApplication
@EnableEurekaClient
//@EnableFeignClients(basePackages = {"com.ccy.springcloud"})//,clients = DeptClientService.class) //开启feign
@EnableFeignClients(basePackages = {"com.ccy.springcloud.service"})
public class DeptCustomerFeign_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptCustomerFeign_App.class,args);
    }
}
