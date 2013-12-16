package com.acme;

import javax.ejb.Stateless;

import org.sample.Bar;

@Stateless
public class AcmeBarBean implements Bar {

    @Override
    public String sayHello() {
        return "Hey Dude, ACME wants to say H3ll0 to you!";
    }

}
