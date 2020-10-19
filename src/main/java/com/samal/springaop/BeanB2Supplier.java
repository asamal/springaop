package com.samal.springaop;

import org.springframework.stereotype.Component;

//@Component
public class BeanB2Supplier implements BeanBSupplier {
    private final BeanB2 beanB2;

    public BeanB2Supplier(BeanB2 beanB2) {
        System.out.println("B2 >> SupB2");
        this.beanB2 = beanB2;
    }

    @Override
    public int getIndex() {
        return beanB2.getIndex();
    }

    @Override
    public BeanB get() {
        return beanB2;
    }
}
