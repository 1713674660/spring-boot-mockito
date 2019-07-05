package com.zc.mockito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.zc.mockito.domain.repository"})
@EntityScan(basePackages = {"com.zc.mockito.domain.model"})
@EnableTransactionManagement
public class SpringBootMockitoApplication{

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMockitoApplication.class, args);
    }

}
