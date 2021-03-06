package com.samal.springaop;

import org.springframework.stereotype.Component;

@Component
public class BeanC {
    private final BeanA beanA;

    public BeanC(BeanA beanA) {
        System.out.println("A >> C");
        this.beanA = beanA;
    }

//    @Surrounded
    public void run() {
        System.out.println("C is running");
    }
}
