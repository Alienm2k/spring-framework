package com.demo.beans;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class SpringBean1 implements MyInterface {
    public SpringBean1(){

//        System.out.println("Spring Bean 1");
    }


    public String toString(){
        return "Spring Bean 1";
    }
}
