package com.boot.config;

import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Value("${spring.application.name}")
    private String applicationName;

    @Bean
    public RequestInterceptor requestInterceptor() {
        return template ->
                template.header("X-Service-Name", applicationName);
    }
}