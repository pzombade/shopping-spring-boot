package com.pzombade.shoppingspringboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppInit {

    @Bean
    public CommandLineRunner simpleInit(String[] args){
        //TODO add some meaning full dat here
        System.out.println("@@@@@@@@@@@@@@@@@@ This is app initializer executing with Configuarion and Bean method.");
        return (arg)->{};
    }
}
