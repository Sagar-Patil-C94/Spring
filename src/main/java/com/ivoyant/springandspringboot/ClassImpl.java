package com.ivoyant.springandspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClassImpl {
    @Autowired
    @Qualifier("A")
    private MyInterface myInterface;
    public String greeting(){
        return myInterface.greetings();
    }
}
