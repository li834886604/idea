package com.llt;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ClassPathXmlApplication {
    public static void main(String[] args) throws IOException {
        new ClassPathXmlApplicationContext("classpath:spring-provider.xml");
        System.in.read();
    }
}
