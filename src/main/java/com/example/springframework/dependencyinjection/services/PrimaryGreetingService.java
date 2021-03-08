package com.example.springframework.dependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements  GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mundo - PRIMARY";
    }
}
