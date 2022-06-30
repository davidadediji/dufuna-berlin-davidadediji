package com.dufuna.berlin.davidadediji.lekki;

import com.dufuna.berlin.davidadediji.lekki.enums.PropertyType;
import com.dufuna.berlin.davidadediji.lekki.model.LekkiProperty;
import com.dufuna.berlin.davidadediji.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.davidadediji.lekki.service.MockLekkiPropertyService;

import java.util.Arrays;

public class MockLekkiPropertyApp {
    public static void main(String[] args) {
        LekkiPropertyService service = new MockLekkiPropertyService();

        String[] address = {"Lagos", "Ibadan", "Greenwich"};
        PropertyType[] types = {PropertyType.DUPLEX, PropertyType.FLAT, PropertyType.HOUSE};

        for(int i = 1; i <= address.length; i++ ){
            LekkiProperty property = new LekkiProperty(i, address[i], types[i]);
            service.saveProperty(property);
            System.out.println(service.getProperty(i));

        }
        System.out.println(service.getproperties());
    }
}
