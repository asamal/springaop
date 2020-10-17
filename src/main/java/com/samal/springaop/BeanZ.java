package com.samal.springaop;

import org.springframework.stereotype.Component;

@Component
public class BeanZ {
    private final BeanB1Supplier beanB1Supplier;
    private final BeanB2Supplier beanB2Supplier;

    public BeanZ(BeanB1Supplier beanB1Supplier, BeanB2Supplier beanB2Supplier) {
        System.out.println("SupB1 + SupB2 >> Z");
        System.out.println("SupB1: " + beanB1Supplier.getClass().getSimpleName());
        System.out.println("SupB2: " + beanB2Supplier.getClass().getSimpleName());
        this.beanB1Supplier = beanB1Supplier;
        this.beanB2Supplier = beanB2Supplier;
    }
}
