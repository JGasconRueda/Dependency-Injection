package com.example.springframework.dependencyinjection.config;

import com.example.springframework.dependencyinjection.services.ConstructorGreetingService;
import com.example.springframework.dependencyinjection.services.PropertyInjectedGreetingService;
import com.example.springframework.dependencyinjection.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }
}
