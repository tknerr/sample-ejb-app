package org.sample;

import javax.ejb.Stateless;

@Stateless
public class DefaultBarBean implements Bar {

    public String sayHello() {
        return "hello from default bean";
    }

}
