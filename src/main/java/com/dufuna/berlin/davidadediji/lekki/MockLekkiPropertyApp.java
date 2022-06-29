package com.dufuna.berlin.davidadediji.lekki;

import com.dufuna.berlin.davidadediji.lekki.model.LekkiProperty;
import com.dufuna.berlin.davidadediji.lekki.service.MockLekkiPropertyService;

public class MockLekkiPropertyApp {
    public static void main(String[] args) {
        LekkiProperty davidProperty1 = new LekkiProperty();
        MockLekkiPropertyService newService = new MockLekkiPropertyService();

        newService.saveProperty(davidProperty1);
        newService.getProperty();
    }
}
