package org.sample.remotelocal;

import javax.ejb.Stateless;

@Stateless
public class CoffeeBean implements Coffee, Coffee.Remote {

    @Override
    public String drink() {
        return "drinking coffee!";
    }

}
