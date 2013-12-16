package org.sample;

import javax.ejb.Stateless;

@Stateless
public class AlternativeBarBean implements Bar {

    public String sayHello() {
        return "ola!";
    }

}
