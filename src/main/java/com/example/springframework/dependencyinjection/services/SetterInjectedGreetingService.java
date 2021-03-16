package com.example.springframework.dependencyinjection.services;

public class SetterInjectedGreetingService implements  GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola Mundo - Setter";
    }
}
