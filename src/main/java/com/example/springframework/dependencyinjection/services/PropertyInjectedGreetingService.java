package com.example.springframework.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mundo - Property";
    }
}
