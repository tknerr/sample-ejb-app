package org.sample.remotelocal;

import java.util.Hashtable;

import javax.naming.InitialContext;

public class CoffeeMain {

    public static void main(String[] args) {
        Hashtable<String, String> env = new Hashtable<String, String>();
        env.put("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
        env.put("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
        env.put("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
        env.put("org.omg.CORBA.ORBInitialHost", "localhost");
        env.put("org.omg.CORBA.ORBInitialPort", "3700");
        try {
            InitialContext ctx = new InitialContext(env);
            CoffeeFacade facade =
                (CoffeeFacade)ctx
                    .lookup("java:global/sample-ear-0.0.1-SNAPSHOT/sample-ejbs-0.0.1-SNAPSHOT/CoffeeFacadeBean!org.sample.remotelocal.CoffeeFacade$Remote");
            System.out.println(facade.drinkLocalCoffee());
            System.out.println(facade.drinkRemoteCoffee());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
