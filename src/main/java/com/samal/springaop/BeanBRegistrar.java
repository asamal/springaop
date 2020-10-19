package com.samal.springaop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class BeanBRegistrar {
    private final Collection<BeanB> beanBCollection;

    public BeanBRegistrar(Collection<BeanB> beanBCollection) {
        this.beanBCollection = beanBCollection;
    }

    @Autowired
    public void register(BeanA beanA) {
        beanBCollection.forEach((beanB) -> {
            System.out.println("via registrar setter: A >> SupB" + beanB.getIndex());
            System.out.println("SupB" + beanB.getIndex() + ": " + beanB.getClass().getSimpleName());
            beanA.register(beanB.getIndex(), beanB);
        });
    }
}
