package com.ivoyant.springandspringboot.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeBusiness {
    @Inject
    SomeDao someDao;

    public SomeDao getDao() {
        return this.someDao;
    }
}
