package com.dufuna.berlin.davidadediji.lekki.repository;

import com.dufuna.berlin.davidadediji.lekki.enums.PropertyType;
import com.dufuna.berlin.davidadediji.lekki.model.LekkiProperty;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleLekkiPropertyRepositoryImplTest {

    SimpleLekkiPropertyRepository repository = new SimpleLekkiPropertyRepositoryImpl();

    @Test
    @DisplayName("test for property saved")
    void save() {
        LekkiProperty ppt1 = new LekkiProperty(1, "Bond Chemical", PropertyType.FLAT);
        LekkiProperty saveProperty = repository.save(ppt1);
        assertEquals(saveProperty, ppt1);
        assertEquals(repository.findById(1), ppt1);

    }

    @Test
    @DisplayName("test property object returned correlates with property Id")
    void testPropertyPassOnIdInput() {
        LekkiProperty ppt1 = new LekkiProperty(1, "Bond Chemical", PropertyType.FLAT);
        LekkiProperty ppt2 = new LekkiProperty(2, "Tokunbo street", PropertyType.DUPLEX);
        LekkiProperty ppt3 = new LekkiProperty(3, "Tony Ayeni CL", PropertyType.HOUSE);
        LekkiProperty ppt4 = new LekkiProperty(4, "Bond Chemical", PropertyType.DUPLEX);
        LekkiProperty saveProperty = repository.save(ppt2);
        assertEquals(repository.findById(2), ppt2);
    }

    @Test
    @DisplayName("test property object returned doesn't correlate with property Id")
    void testPropertyFailOnIdInput() {
        LekkiProperty ppt1 = new LekkiProperty(1, "Bond Chemical", PropertyType.FLAT);
        LekkiProperty ppt2 = new LekkiProperty(2, "Tokunbo street", PropertyType.DUPLEX);
        LekkiProperty ppt3 = new LekkiProperty(3, "Tony Ayeni CL", PropertyType.HOUSE);
        LekkiProperty ppt4 = new LekkiProperty(4, "Bond Chemical", PropertyType.DUPLEX);
        LekkiProperty saveProperty = repository.save(ppt2);
        assertNotEquals(repository.findById(1), ppt2);
    }


    @Test
    @DisplayName("test property object returned doesn't correlate with property Id")
    void testPropertyFailOnIdInput2() {
        LekkiProperty ppt1 = new LekkiProperty(1, "Bond Chemical", PropertyType.FLAT);
        LekkiProperty ppt2 = new LekkiProperty(2, "Tokunbo street", PropertyType.DUPLEX);
        LekkiProperty ppt3 = new LekkiProperty(3, "Tony Ayeni CL", PropertyType.HOUSE);
        LekkiProperty ppt4 = new LekkiProperty(4, "Bond Chemical", PropertyType.DUPLEX);
        LekkiProperty saveProperty = repository.save(ppt4);
        assertNotEquals(repository.findById(1), ppt4);
    }

    @Test
    @DisplayName("test for entity update in property object when an id and property is passed")
    void testUpdateProperty(){
        LekkiProperty ppt1 = new LekkiProperty(1, "Bond Chemical", PropertyType.FLAT);
        LekkiProperty ppt2 = new LekkiProperty(2, "Tokunbo street", PropertyType.DUPLEX);
        LekkiProperty saveProperty1 = repository.save(ppt1);
//        LekkiProperty saveProperty2 = repository.save(ppt2);
        repository.update(1, ppt2);
        assertEquals(ppt2, repository.findById(1));
    }

    @Test
    @DisplayName("test for array size of properties")
    void testFindAll(){
        LekkiProperty ppt1 = new LekkiProperty(1, "Bond Chemical", PropertyType.FLAT);
        LekkiProperty ppt2 = new LekkiProperty(2, "Tokunbo street", PropertyType.DUPLEX);
        LekkiProperty ppt3 = new LekkiProperty(3, "Olatunbosun street", PropertyType.HOUSE);
        LekkiProperty saveProperty1 = repository.save(ppt1);
        LekkiProperty saveProperty2 = repository.save(ppt2);
        LekkiProperty saveProperty3 = repository.save(ppt3);

        assertEquals(3, repository.findAll().size());
    }
}