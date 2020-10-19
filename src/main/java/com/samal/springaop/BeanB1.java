package com.samal.springaop;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BeanB1 implements BeanB {
    private final BeanC beanC;

    public BeanB1(BeanC beanC) {
        System.out.println("C >> B1");
        this.beanC = beanC;
    }

    @Override
    @Surrounded
    public void run() {
        System.out.print("B1 -> ");
        beanC.run();
    }

    @Override
    public int getIndex() {
        return 1;
    }
}
