package com.dufuna.berlin.davidadediji.lekki.service;

import com.dufuna.berlin.davidadediji.lekki.model.LekkiProperty;
import com.dufuna.berlin.davidadediji.lekki.repository.SimpleLekkiPropertyRepository;
import com.dufuna.berlin.davidadediji.lekki.repository.SimpleLekkiPropertyRepositoryImpl;

import java.util.List;

public class MockLekkiPropertyService implements LekkiPropertyService {

    SimpleLekkiPropertyRepository repository = new SimpleLekkiPropertyRepositoryImpl();
    @Override
    public LekkiProperty saveProperty(LekkiProperty property) {
        return repository.save(property);
    }

    @Override
    public LekkiProperty getProperty(int id) {
        return repository.findById(id);
    }

    @Override
    public List<LekkiProperty> getproperties() {
        return repository.findAll();
    }

}

