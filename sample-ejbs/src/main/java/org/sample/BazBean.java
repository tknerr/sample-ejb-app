package org.sample;

import javax.ejb.Stateless;

@Stateless
public class BazBean implements Baz {

    @Override
    public String baz() {
        return "baaaaaaaazzzzz!";
    }

}
