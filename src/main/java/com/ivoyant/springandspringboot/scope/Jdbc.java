package com.ivoyant.springandspringboot.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Jdbc {
    public Jdbc(){
        System.out.println("Jdbc Connection");
    }

    public void getConnection(){
        System.out.println("Connection Succesful");
    }
}
