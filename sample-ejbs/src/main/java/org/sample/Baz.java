package org.sample;

import javax.ejb.Local;
import javax.ejb.Remote;

@Remote
@Local
public interface Baz {

    String baz();

}
