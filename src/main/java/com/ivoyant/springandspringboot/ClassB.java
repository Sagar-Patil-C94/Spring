package com.ivoyant.springandspringboot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ClassB implements MyInterface{
    @Override
    public String greetings() {
        return "In Class B";
    }
}
