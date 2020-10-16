package com.samal.springaop;

import org.springframework.stereotype.Component;

@Component
public class BeanB1Supplier implements BeanBSupplier {
    private final BeanB1 beanB1;

    public BeanB1Supplier(BeanB1 beanB1) {
        this.beanB1 = beanB1;
    }

    @Override
    public BeanB get() {
        return beanB1;
    }

    @Override
    public int getIndex() {
        return beanB1.getIndex();
    }
}
