package com.dufuna.berlin.davidadediji.lekki.service;

import com.dufuna.berlin.davidadediji.lekki.model.LekkiProperty;
import com.dufuna.berlin.davidadediji.lekki.repository.SimpleLekkiPropertyRepository;

import java.util.List;

public interface LekkiPropertyService {
    LekkiProperty saveProperty(LekkiProperty property);
    LekkiProperty getProperty(int id);

    List<LekkiProperty> getproperties();

}
