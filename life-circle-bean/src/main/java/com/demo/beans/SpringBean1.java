package com.demo.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class SpringBean1 implements InitializingBean , DisposableBean {
    private SpringBean2 springBean2;

    public SpringBean1(){
        System.out.println(this.getClass().getSimpleName() + "::: Constructor");
    }
    @PostConstruct
    public void init(){
        System.out.println(this.getClass().getSimpleName() + ":: PostContruct");
    }
    @Autowired
    public void setSpringBean2(SpringBean2 springBean2) {
        System.out.println("Setting SpringBean1 to::" + this.getClass().getSimpleName());
        this.springBean2 = springBean2;
    }
    public void  customInit(){
        System.out.println(this.getClass().getSimpleName() + "::customInit");
    }
    private void customDestroy() {
        System.out.println(this.getClass().getSimpleName() +"::customDestroy");

    }

    public String sayGreeting(){
        return "Hello";
    }
    @PreDestroy
    private void preDestroy(){
        System.out.println(this.getClass().getSimpleName() + "::PreDestroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getSimpleName() + ":: afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean 's Destroy");
    }


}
