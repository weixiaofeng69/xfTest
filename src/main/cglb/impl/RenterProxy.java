package main.cglb.impl;

import main.cglb.Person;

public class RenterProxy {
    private Person renter;

    public RenterProxy(Person renter) {
        this.renter = renter;
    }

    public void rentHouse() {
        System.out.println("中介找房东租房，转租给租客！");
        renter.rentHouse();
        System.out.println("中介给租客钥匙，租客入住！");

    }
}
