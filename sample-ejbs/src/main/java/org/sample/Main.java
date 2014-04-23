package org.sample;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Main {

    public static void main(String[] args) throws NamingException {

        System.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
        System.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
        System.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
        System.setProperty("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
        System.setProperty("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
        System.setProperty("java.naming.provider.url", "jnp://localhost:1099");

        System.err.println("ddd");
        InitialContext ctx = new InitialContext();
        //ctx.list("java:global/sample-ear-0.0.1-SNAPSHOT/acme-ejbs-0.0.1-SNAPSHOT");
        Object o = ctx.lookup("java:global/sample-ear-0.0.1-SNAPSHOT/sample-ejbs-0.0.1-SNAPSHOT/org.sample.Baz");
        System.err.println(o.getClass());

        //        while (list.hasMore()) {
        //            NameClassPair entry = list.next();
        //            System.err.println("++++++++++++++++++");
        //            System.err.println(entry.getName());
        //            System.err.println(entry.getClassName());
        //            System.err.println(entry.toString());
        //            System.err.println(entry.isRelative());
        //            String name = entry.getName();
        //            if (name.endsWith("$Remote")) {
        //                System.err.println(name);
        //            }
        //        }
    }

}
