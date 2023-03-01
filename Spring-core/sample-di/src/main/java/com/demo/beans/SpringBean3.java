package com.demo.beans;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class SpringBean3 implements MyInterface , Ordered {
    public SpringBean3(){
//        System.out.println("Spring Bean 3");
    }

    @Override
    public int getOrder() {
        return 3;
    }
    public String toString(){
        return  "Spring Bean 3";
    }
}
