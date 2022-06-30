package com.dufuna.berlin.davidadediji.lekki.repository;
import java.util.ArrayList;
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

    @Override
    public LekkiProperty findById(int propertyId) {
        for(Map.Entry<Integer, LekkiProperty> property: properties.entrySet()){
            if (propertyId == property.getKey()){
                return property.getValue();
            }
        }
        return null;
    }
    @Override
    public List<LekkiProperty> findAll() {
        List<LekkiProperty> propertyList = new ArrayList<>(properties.values());
        return propertyList;
    }

    @Override
    public void update(int id, LekkiProperty property) {
        for(Map.Entry<Integer, LekkiProperty> propertyUpdate: properties.entrySet()){
            if(property.getPropertyId() == id){
                propertyUpdate.setValue(property);
            }

        }
    }

}



