package com.demo.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//@Lazy
@Component //@Scope("prototype")
public class SpringBean1 {
    private static int count = 0;
    public SpringBean1() {
        System.out.println("Spring Bean 1 Constructor");
        count ++;
    }
    public static int getCount(){
        return count;
    }
}
