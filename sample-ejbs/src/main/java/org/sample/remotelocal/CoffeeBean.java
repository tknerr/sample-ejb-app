package org.sample.remotelocal;

import javax.ejb.Stateless;

@Stateless
public class CoffeeBean implements Coffee.Local, Coffee.Remote {

    @Override
    public String drink() {
        return "drinking coffee!";
    }

}
