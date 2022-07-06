package com.dufuna.berlin.davidadediji.lekki;

import com.dufuna.berlin.davidadediji.lekki.enums.PropertyType;
import com.dufuna.berlin.davidadediji.lekki.model.LekkiProperty;
import com.dufuna.berlin.davidadediji.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.davidadediji.lekki.service.MockLekkiPropertyService;


public class MockLekkiPropertyApp {
    public static void main(String[] args) {

        LekkiProperty ppt = new LekkiProperty();
        LekkiProperty ppt2 = new LekkiProperty();
        LekkiProperty ppt3 = new LekkiProperty();
        MockLekkiPropertyService newProperty = new MockLekkiPropertyService();

        ppt.setPropertyId(1);
        ppt.setPropertyAddress("Bond chemical");
        ppt.setType(PropertyType.FLAT);

        ppt2.setPropertyId(2);
        ppt2.setPropertyAddress("Bond chemical Awe Oyo");
        ppt2.setType(PropertyType.FLAT);




        newProperty.saveProperty(ppt);
        System.out.println(newProperty.getProperty(1));
        System.out.println(newProperty.getproperties());

        newProperty.saveProperty(ppt2);
        System.out.println(newProperty.getProperty(2));
        System.out.println(newProperty.getproperties());

    }
}
