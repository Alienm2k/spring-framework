package com.demo.beans;

import org.springframework.stereotype.Component;

//@Component
public class Address {
    private  String streetName = "Creek Bridege Road!";

    public String getStreetName() {
        return this.streetName;
    }

//    public void setStreetName(String streetName) {
//        this.streetName = streetName;
//    }
}
