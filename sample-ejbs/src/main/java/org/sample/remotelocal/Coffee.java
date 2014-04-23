package org.sample.remotelocal;

public interface Coffee {

    @javax.ejb.Local
    interface Local extends Coffee {}

    @javax.ejb.Remote
    interface Remote extends Coffee {}

    String drink();

}
