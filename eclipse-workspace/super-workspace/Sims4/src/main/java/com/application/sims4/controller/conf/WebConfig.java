package com.application.sims4.controller.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.application.sims4.service.ServicePack;
import com.application.sims4.service.ServiceWorld;
import com.application.sims4.service.impl.ServicePackImpl;
import com.application.sims4.service.impl.ServiceWorldImpl;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedMethods("GET", "POST", "PUT", "DELETE");
    }
    
    @Bean
    ServicePack servicePack() {
        return new ServicePackImpl();
    }
    
    @Bean
    ServiceWorld serviceWorld() {
        return new ServiceWorldImpl();
    }
    
}
