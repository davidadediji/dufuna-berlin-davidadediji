package com.dufuna.berlin.davidadediji;

import com.dufuna.berlin.davidadediji.lekki.Address;
import com.dufuna.berlin.davidadediji.lekki.enums.PropertyType;
import com.dufuna.berlin.davidadediji.lekki.model.LekkiProperty;

//top level package...
public class HelloWorld {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreetAddress("some street");
        address.setCity("lekki");

        LekkiProperty david= new LekkiProperty();
        david.setId(1);
        david.setAddress(address);
        david.setType(PropertyType.FLAT);

        System.out.println("Hello, World!");
    }
}
