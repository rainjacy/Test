package com.sccba.eop.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import com.primeton.eos.dap.sdk.api.bizflow.EnableSDKBizflows;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
@EnableSDKBizflows
@EnableDiscoveryClient
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
