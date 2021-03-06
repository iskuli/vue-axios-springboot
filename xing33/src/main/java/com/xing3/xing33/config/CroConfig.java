package com.xing3.xing33.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CroConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {


        registry.addMapping("/**")

                .allowedOrigins("*")

                .allowCredentials(false)

                .allowedMethods("GET", "POST", "DELETE", "PUT")

                .maxAge(3600);


    }
}
