package org.sample;

import javax.servlet.ServletContextEvent;

public class SampleContextListener extends BazContextListenerBase {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.err.println("---- context initialized");
        System.err.println(" ** " + getBaz().baz());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.err.println("---- context destroyed");
    }

}
