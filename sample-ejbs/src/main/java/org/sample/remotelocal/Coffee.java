package org.sample.remotelocal;

@javax.ejb.Local
public interface Coffee {

    @javax.ejb.Remote
    interface Remote extends Coffee {}

    String drink();

}
