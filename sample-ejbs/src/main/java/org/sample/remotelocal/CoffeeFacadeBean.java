package org.sample.remotelocal;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class CoffeeFacadeBean implements CoffeeFacade.Local, CoffeeFacade.Remote {

    @EJB
    private Coffee.Local localCoffee;
    @EJB
    private Coffee.Remote remoteCoffee;

    @Override
    public String drinkLocalCoffee() {
        return "drinking Wacker's Kaffee: " + localCoffee.drink() + " (via " + localCoffee.getClass().getSimpleName()
            + ")";
    }

    @Override
    public String drinkRemoteCoffee() {
        return "drinking Starbucks: " + remoteCoffee.drink() + " (via " + remoteCoffee.getClass().getSimpleName() + ")";
    }

}
