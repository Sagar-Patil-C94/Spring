package com.ivoyant.springandspringboot.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class PersonDao {
    @Autowired
    Jdbc jdbc;
    public Object getConnection(){
        return jdbc;
    }
}