package com.ivoyant.springandspringboot.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("A")
public class ClassA implements MyInterface{
    @Override
    public String greetings() {
        return " In Class A";
    }
}
