package org.sample;

import javax.ejb.Stateless;

@Stateless
public class BarBean implements Bar {

    @Override
    public String sayHello() {
        return "Dear Sir, humble greetings from the SAMPLE bar bean!";
    }

}
