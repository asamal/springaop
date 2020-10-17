package com.samal.springaop;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.function.Supplier;

public interface BeanBSupplier extends Supplier<BeanB> {
    @Autowired
    default void register(BeanA beanA) {
        System.out.println("via setter: A >> SupB" + getIndex());
        System.out.println("SupB" + getIndex() + ": " + this.getClass().getSimpleName());
        beanA.register(getIndex(), this);
    }

    int getIndex();
}
