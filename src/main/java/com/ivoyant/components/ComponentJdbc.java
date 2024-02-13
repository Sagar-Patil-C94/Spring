package com.ivoyant.components;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ComponentJdbc {
    public ComponentJdbc(){
        System.out.println("Jdbc Connection");
    }

    public void getConnection(){
        System.out.println("Connection Succesful");
    }
}
