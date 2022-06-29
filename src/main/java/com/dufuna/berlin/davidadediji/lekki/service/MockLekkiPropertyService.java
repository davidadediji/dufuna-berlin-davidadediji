package com.dufuna.berlin.davidadediji.lekki.service;

import com.dufuna.berlin.davidadediji.lekki.model.LekkiProperty;

public class MockLekkiPropertyService implements LekkiPropertyService {
    @Override
    public void saveProperty(LekkiProperty property) {
        System.out.println("MockLekkiPropertyService.saveProperty called");
    }

    @Override
    public LekkiProperty getProperty() {
        System.out.println("MockLekkiPropertyService.getProperty called");
        return null;
    }
}

