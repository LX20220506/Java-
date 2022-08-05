package com.boot;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class Boot02AdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot02AdminServerApplication.class, args);
    }

}
