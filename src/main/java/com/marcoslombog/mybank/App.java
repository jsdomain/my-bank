package com.marcoslombog.mybank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App 
{
    public static void main(String[] args) {
    	System.out.println("Test");
        SpringApplication.run(App.class, args);
    }
}
