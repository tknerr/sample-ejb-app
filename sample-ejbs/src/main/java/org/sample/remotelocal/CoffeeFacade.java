package org.sample.remotelocal;

public interface CoffeeFacade {

    @javax.ejb.Local
    interface Local extends CoffeeFacade {}

    @javax.ejb.Remote
    interface Remote extends CoffeeFacade {}

    String drinkLocalCoffee();

    String drinkRemoteCoffee();

}
