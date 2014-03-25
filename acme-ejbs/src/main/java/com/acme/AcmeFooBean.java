package com.acme;

import javax.ejb.Stateless;

import org.sample.Foo;
import org.sample.FooBean;

@Stateless
public class AcmeFooBean extends FooBean implements Foo {

    @Override
    public String tellMeSomething() {
        return "this is ACME FOO. any my parent says: " + super.tellMeSomething();
    }

}
