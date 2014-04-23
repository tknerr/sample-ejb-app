package org.sample.remotelocal;

@javax.ejb.Local
public interface CoffeeFacade {

    @javax.ejb.Remote
    interface Remote extends CoffeeFacade {}

    String drinkLocalCoffee();

    String drinkRemoteCoffee();

}
