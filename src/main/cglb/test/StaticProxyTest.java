package main.cglb.test;

import main.cglb.Person;
import main.cglb.impl.Renter;
import main.cglb.impl.RenterProxy;

public class StaticProxyTest {
    public static void main(String[] args) {
        Person renter = new Renter();
        RenterProxy proxy = new RenterProxy(renter);
        proxy.rentHouse();
    }
}
