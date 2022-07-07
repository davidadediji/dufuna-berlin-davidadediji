package com.dufuna.berlin.davidadediji.tax.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxServiceImplTest {
    @Test
    @DisplayName("test negative income should throw an exception")
    void negativeNumShouldReturnIllegalArgumentException(){
        var taxOwed = new TaxServiceImpl();
        assertThrows(IllegalArgumentException.class, () ->{
            taxOwed.getTaxOwed(-4500);
        });
    }
    @Test
    @DisplayName("test for value of two decimal places")
    void outputShouldBeDoubleInTwoDecimalPlaces(){
        var taxOwed = new TaxServiceImpl();
        assertEquals(54096.00, taxOwed.getTaxOwed(190000));
    }
    @Test
    @DisplayName("test for value of income less than 37000")
    void outputZeroForIncomeLessThan37000(){
        var taxOwed = new TaxServiceImpl();
        assertEquals(0.0, taxOwed.getTaxOwed(30000));
    }
    @Test
    @DisplayName("test for value of income equal to 37000")
    void outputZeroForIncomeEqualTo37000(){
        var taxOwed = new TaxServiceImpl();
        assertEquals(0.0, taxOwed.getTaxOwed(37000));
    }

    @Test
    @DisplayName("test for value of income equal to 37001")
    void outputValueForIncomeEqualTo37001(){
        var taxOwed = new TaxServiceImpl();
        assertEquals(3572.0, taxOwed.getTaxOwed(37001));
    }

    @Test
    @DisplayName("test for value of income greater than 180000")
    void outputValueForIncomeGreaterThan180000(){
        var taxOwed = new TaxServiceImpl();
        assertEquals(54096.0, taxOwed.getTaxOwed(190000) );

    }

}