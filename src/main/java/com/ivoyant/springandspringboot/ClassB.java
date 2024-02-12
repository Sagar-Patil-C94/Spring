package com.ivoyant.springandspringboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("B")
public class ClassB implements MyInterface{
    @Override
    public String greetings() {
        return "In Class B";
    }
}
