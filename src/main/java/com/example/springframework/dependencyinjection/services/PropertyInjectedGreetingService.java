package com.example.springframework.dependencyinjection.services;

public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mundo - Property";
    }
}
