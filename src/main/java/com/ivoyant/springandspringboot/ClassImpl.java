package com.ivoyant.springandspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassImpl {
    @Autowired
    private MyInterface myInterface;
    public ClassImpl(MyInterface myInterface) {
        this.myInterface = myInterface;
    }
    public String greeting(){
        return myInterface.greetings();
    }
}
