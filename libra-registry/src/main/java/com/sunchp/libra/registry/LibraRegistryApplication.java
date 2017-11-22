package com.sunchp.libra.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author sunchangpeng
 */
@EnableEurekaServer
@SpringBootApplication
public class LibraRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LibraRegistryApplication.class, args);
    }
}
