package org.sample;

import javax.ejb.EJB;
import javax.servlet.ServletContextListener;

public abstract class BazContextListenerBase implements ServletContextListener {

    @EJB
    private Baz baz;

    protected final Baz getBaz() {
        return baz;
    }
}
