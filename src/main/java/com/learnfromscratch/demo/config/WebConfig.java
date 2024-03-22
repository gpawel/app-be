package com.learnfromscratch.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Bean
    public WebMvcConfigurer corsConfig() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // Allow cross-origin requests to all endpoints in the application
                registry.addMapping("/**") // Apply CORS to all endpoints
                        .allowedOrigins("http://localhost:3000") // Allow this origin
                        .allowedMethods(HttpMethod.GET.name(),HttpMethod.POST.name(),HttpMethod.DELETE.name()) // Allow these HTTP methods
                        .allowedHeaders(HttpHeaders.CONTENT_TYPE,HttpHeaders.AUTHORIZATION) // Allow all headers
                        .allowCredentials(true).maxAge(3600);// Credential support
            }
        };
    }
}

