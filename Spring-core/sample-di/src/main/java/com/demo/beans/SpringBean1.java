package com.demo.beans;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 implements Ordered {
    public SpringBean1(){
        System.out.println("Spring Bean 1");
    }

    @Override
    public int getOrder() {
        return 3;
    }
}
