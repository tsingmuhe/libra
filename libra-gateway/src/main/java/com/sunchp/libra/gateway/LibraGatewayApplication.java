package com.sunchp.libra.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author sunchangpeng
 */
@EnableZuulProxy
@SpringCloudApplication
public class LibraGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(LibraGatewayApplication.class, args);
    }
}
