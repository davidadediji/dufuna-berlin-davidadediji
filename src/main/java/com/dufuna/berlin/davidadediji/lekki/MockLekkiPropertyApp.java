package com.dufuna.berlin.davidadediji.lekki;

import com.dufuna.berlin.davidadediji.lekki.enums.PropertyType;
import com.dufuna.berlin.davidadediji.lekki.model.LekkiProperty;
import com.dufuna.berlin.davidadediji.lekki.repository.SimpleLekkiPropertyRepository;
import com.dufuna.berlin.davidadediji.lekki.repository.SimpleLekkiPropertyRepositoryImpl;
import com.dufuna.berlin.davidadediji.lekki.service.LekkiPropertyService;
import com.dufuna.berlin.davidadediji.lekki.service.MockLekkiPropertyService;


public class MockLekkiPropertyApp {
    public static void main(String[] args) {
//        LekkiPropertyService service = new MockLekkiPropertyService();
//
//        String[] address = {"Lagos", "Ibadan", "Greenwich"};
//        PropertyType[] types = {PropertyType.DUPLEX, PropertyType.FLAT, PropertyType.HOUSE};
//
//        for(int i = 1; i < address.length + 1; i++ ){
//            LekkiProperty property = new LekkiProperty(i, address[i], types[i]);
//            service.saveProperty(property);
//            System.out.println(service.getProperty(i));
//
//        }
//        System.out.println(service.getproperties());

        SimpleLekkiPropertyRepository check = new SimpleLekkiPropertyRepositoryImpl();

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

        check.save(ppt);
        check.save(ppt2);
        check.update( 1, ppt2);
//        System.out.println(check.findAll());

    }
}
