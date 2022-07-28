package org.srping.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component

public class ClassicalMusic implements Music{
    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initilaziton");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destroylaziton");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
