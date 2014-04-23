package org.sample.remotelocal;

import javax.ejb.Local;
import javax.ejb.Remote;

@Local
@Remote
public interface CoffeeFacade {

    String drinkLocalCoffee();

    String drinkRemoteCoffee();

}
