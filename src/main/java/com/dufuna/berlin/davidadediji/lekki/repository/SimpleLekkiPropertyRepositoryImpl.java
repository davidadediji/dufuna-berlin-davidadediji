package com.dufuna.berlin.davidadediji.lekki.repository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dufuna.berlin.davidadediji.lekki.model.LekkiProperty;


public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository{
    Map<Integer, LekkiProperty> properties = new HashMap<>();

    @Override
    public LekkiProperty save(LekkiProperty property) {
        properties.put(property.getPropertyId(), property);
        return property;
    }

    //create lekki property
    //

    @Override
    public LekkiProperty findById(int propertyId) {
        return properties.get(propertyId);
    }
    @Override
    public List<LekkiProperty> findAll() {
        return properties.values().stream().toList();
    }

    @Override
    public void update(int id, LekkiProperty property) {

        for(Integer key: properties.keySet()){
            if (id == key) {
                properties.replace(key, property);
            }
        }

        System.out.println(properties);
    }

}



