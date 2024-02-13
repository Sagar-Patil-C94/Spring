package com.ivoyant.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ComponentPersonDao {
    @Autowired
    ComponentJdbc jdbc;
    public Object getConnection(){
        return jdbc;
    }
}
