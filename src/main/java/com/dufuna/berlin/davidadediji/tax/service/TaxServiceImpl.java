package com.dufuna.berlin.davidadediji.tax.service;

import com.dufuna.berlin.davidadediji.tax.model.TaxEntity;
import org.springframework.stereotype.Service;


public class TaxServiceImpl implements TaxService{
    /**
     * Calculates taxOwed from an income tax
     * @param income The value will be non-negative
     * If a negative income value is give an exception "Number cannot be less or equal to zero"
     * @return double type. The value will always be a non-negative
     */
    @Override
    public double getTaxOwed(int income) {
        if (income <= 0){
            throw new IllegalArgumentException("Number cannot be less or equal to zero");
        } else if (income <= TaxEntity.HIGH_INCOME_BRACKET_TWO) {
            return 0.0;
        } else if (income <= TaxEntity.HIGH_INCOME_BRACKET_THREE) {
            double taxOwed = Math.round((TaxEntity.HIGH_INCOME_BRACKET_TWO - TaxEntity.LOW_INCOME_BRACKET_TWO)*TaxEntity.RATE_TWO);
            return taxOwed;
        } else if (income <= TaxEntity.HIGH_INCOME_BRACKET_FOUR) {
            double taxOwed = Math.round(((TaxEntity.HIGH_INCOME_BRACKET_TWO - TaxEntity.LOW_INCOME_BRACKET_TWO)*TaxEntity.RATE_TWO) + (TaxEntity.HIGH_INCOME_BRACKET_THREE - TaxEntity.LOW_INCOME_BRACKET_THREE)*TaxEntity.RATE_THREE);
            return taxOwed;
        }double taxOwed = Math.round(((TaxEntity.HIGH_INCOME_BRACKET_TWO - TaxEntity.LOW_INCOME_BRACKET_TWO)*TaxEntity.RATE_TWO) +
                    ((TaxEntity.HIGH_INCOME_BRACKET_THREE - TaxEntity.LOW_INCOME_BRACKET_THREE)*TaxEntity.RATE_THREE) +
                    ((TaxEntity.HIGH_INCOME_BRACKET_FOUR - TaxEntity.LOW_INCOME_BRACKET_FOUR)* TaxEntity.RATE_FOUR));
        return taxOwed;
    }
}
