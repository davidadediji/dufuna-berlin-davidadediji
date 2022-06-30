package com.dufuna.berlin.davidadediji.lekki.repository;
import java.util.List;
import com.dufuna.berlin.davidadediji.lekki.model.LekkiProperty;

public interface SimpleLekkiPropertyRepository {
    LekkiProperty save(LekkiProperty property);
    LekkiProperty findById(int propertyId);
    List<LekkiProperty> findAll();
    void update( int id, LekkiProperty property);
}
