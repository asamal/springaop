package com.samal.springaop;

import org.springframework.beans.factory.annotation.Autowired;

public interface BeanB {
    void run();

//    @Autowired
//    default void register(BeanA beanA) {
//        beanA.register(getIndex(), this);
//    }

    int getIndex();
}
