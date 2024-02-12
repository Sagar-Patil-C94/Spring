package com.ivoyant.springandspringboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("A")
public class ClassA implements MyInterface{
    @Override
    public String greetings() {
        return " In Class A";
    }
}
