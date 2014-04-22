package org.sample;

import javax.ejb.EJB;
import javax.servlet.ServletContextEvent;

public class SampleContextListener extends BazContextListenerBase {

    @EJB(name = "some/Foo")
    private Foo foo;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.err.println("---- context initialized");
        System.err.println("  baz is: " + getBaz().baz());
        System.err.println("  foo says: " + foo.tellMeSomething());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.err.println("---- context destroyed");
    }

}
