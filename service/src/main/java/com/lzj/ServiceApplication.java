package com.lzj;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.CountDownLatch;

/**
 * @Description:
 * @Author: dell
 * @Date： 2019/12/4 17:42
 */


@EnableDubbo
@SpringBootApplication
public class ServiceApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ServiceApplication.class, args);
        //new CountDownLatch(1).await();
    }
}
