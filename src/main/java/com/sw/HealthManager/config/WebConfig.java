package com.sw.HealthManager.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        /*
            http://localhost:8081로 들어오는 모든 URL(/**)의
            모든 요청을 허락함
         */
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8081")
                .allowedMethods("*");
    }
}
