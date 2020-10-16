package com.samal.springaop;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class BeanA {
    private Map<Integer, BeanBSupplier> map = new HashMap<>();

    @Surrounded
    public void run(int index) {
        System.out.print("A -> ");
        map.get(index).get().run();
    }

    public void register(int index, BeanBSupplier beanB) {
        map.put(index, beanB);
    }
}
