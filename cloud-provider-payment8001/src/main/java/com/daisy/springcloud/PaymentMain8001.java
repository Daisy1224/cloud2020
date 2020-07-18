package com.daisy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description
 * @Author daisy
 * @Date 2020/3/24 18:42
 * @Version 1.0
 **/
@SpringBootApplication
@EnableSwagger2
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class, args);
    }
}
