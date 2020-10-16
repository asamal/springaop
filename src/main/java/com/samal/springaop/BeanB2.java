package com.samal.springaop;

import org.springframework.stereotype.Component;

@Component
public class BeanB2 implements BeanB {
    private final BeanC beanC;

    public BeanB2(BeanC beanC) {
        this.beanC = beanC;
    }


    @Override
    @Surrounded
    public void run() {
        System.out.print("B2 -> ");
        beanC.run();
    }

    @Override
    public int getIndex() {
        return 2;
    }
}
