package com.samal.springaop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {
    private final BeanA beanA;

    public SpringAopApplication(BeanA beanA) {
        this.beanA = beanA;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAopApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello, world!");
        beanA.run(1);
        beanA.run(2);
    }
}
