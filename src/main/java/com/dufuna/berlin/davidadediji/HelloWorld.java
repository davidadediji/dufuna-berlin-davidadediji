package com.dufuna.berlin.davidadediji;


import com.dufuna.berlin.davidadediji.lekki.model.LekkiProperty;

//top level package...
public class HelloWorld {
    public static void main(String[] args) {

        LekkiProperty one  = new LekkiProperty();
        LekkiProperty two = new LekkiProperty();

        one.setPropertyId(1);
        two.setPropertyId(1);

        one.setToiletNumber(-5);
        System.out.println(one.equals(two));

        System.out.println("Hello, World!");
    }
}
