package com.demo.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component @Scope("prototype") @Lazy(value = false)
public class SpringBean2 {
    public SpringBean2(){
        System.out.println(this.getClass().getSimpleName());
    }
}
