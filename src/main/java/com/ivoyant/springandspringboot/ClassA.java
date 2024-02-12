package com.ivoyant.springandspringboot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ClassA implements MyInterface{
    @Override
    public String greetings() {
        return " From Class A";
    }
}
