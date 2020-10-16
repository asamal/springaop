package com.samal.springaop;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Supplier;

public interface BeanBSupplier extends Supplier<BeanB> {
    @Autowired
    default void register(BeanA beanA) {
        beanA.register(getIndex(), this);
    }

    int getIndex();
}
