package org.sample;

import javax.ejb.Stateless;

@Stateless(name = "AlternativeBar")
public class AlternativeBarBean implements Bar {

    @Override
    public String sayHello() {
        return "ola!";
    }

}
