package com.dufuna.berlin.davidadediji.tax.service;

public interface TaxService {
    /**
     * Calculates taxowed from an income tax
     * @param income
     * @return double type
     */
    double getTaxOwed(int income);
}
