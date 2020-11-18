package com.example.TestAndRegistrationSpring.Boots.Configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfigs implements WebMvcConfigurer {
     //для страниц которые возвращают только маппинг

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/Test").setViewName("Test");
    }
    }