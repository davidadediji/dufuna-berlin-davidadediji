package com.dufuna.berlin.davidadediji.lekki.service;

import com.dufuna.berlin.davidadediji.lekki.enums.PropertyType;
import com.dufuna.berlin.davidadediji.lekki.model.LekkiProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MockLekkiPropertyServiceTest {

    LekkiPropertyService service = new MockLekkiPropertyService();

    @Test
    void saveProperty() {
        LekkiProperty ppt1 = new LekkiProperty(1, "Bond Chemical", PropertyType.FLAT);
        LekkiProperty saveProperty = service.saveProperty(ppt1);
        assertEquals(saveProperty, ppt1);
        assertEquals(service.getProperty(1), ppt1);
    }

    @Test
    void getPropertyPassOnIdInputTest() {
        LekkiProperty ppt1 = new LekkiProperty(1, "Bond Chemical", PropertyType.FLAT);
        LekkiProperty ppt2 = new LekkiProperty(2, "Tokunbo street", PropertyType.DUPLEX);
        LekkiProperty ppt3 = new LekkiProperty(3, "Tony Ayeni CL", PropertyType.HOUSE);
        LekkiProperty ppt4 = new LekkiProperty(4, "Bond Chemical", PropertyType.DUPLEX);
        LekkiProperty saveProperty = service.saveProperty(ppt2);
        assertEquals(service.getProperty(2), ppt2);
    }

    @Test
    @DisplayName("test property object returned doesn't correlate with property Id")
    void getPropertyFailOnIdInputTest() {
        LekkiProperty ppt1 = new LekkiProperty(1, "Bond Chemical", PropertyType.FLAT);
        LekkiProperty ppt2 = new LekkiProperty(2, "Tokunbo street", PropertyType.DUPLEX);
        LekkiProperty ppt3 = new LekkiProperty(3, "Tony Ayeni CL", PropertyType.HOUSE);
        LekkiProperty ppt4 = new LekkiProperty(4, "Bond Chemical", PropertyType.DUPLEX);
        LekkiProperty saveProperty = service.saveProperty(ppt2);
        assertNotEquals(service.getProperty(1), ppt2);
    }

    @Test
    @DisplayName("test property object returned doesn't correlate with property Id")
    void testPropertyFailOnIdInput2() {
        LekkiProperty ppt1 = new LekkiProperty(1, "Bond Chemical", PropertyType.FLAT);
        LekkiProperty ppt2 = new LekkiProperty(2, "Tokunbo street", PropertyType.DUPLEX);
        LekkiProperty ppt3 = new LekkiProperty(3, "Tony Ayeni CL", PropertyType.HOUSE);
        LekkiProperty ppt4 = new LekkiProperty(4, "Bond Chemical", PropertyType.DUPLEX);
        LekkiProperty saveProperty = service.saveProperty(ppt4);
        assertNotEquals(service.getProperty(1), ppt4);
    }


    @Test
    @DisplayName("test for array size of properties")
    void testFindAll(){
        LekkiProperty ppt1 = new LekkiProperty(1, "Bond Chemical", PropertyType.FLAT);
        LekkiProperty ppt2 = new LekkiProperty(2, "Tokunbo street", PropertyType.DUPLEX);
        LekkiProperty ppt3 = new LekkiProperty(3, "Olatunbosun street", PropertyType.HOUSE);
        LekkiProperty saveProperty1 = service.saveProperty(ppt1);
        LekkiProperty saveProperty2 = service.saveProperty(ppt2);
        LekkiProperty saveProperty3 = service.saveProperty(ppt3);

        assertEquals(3, service.getproperties().size());
    }
}