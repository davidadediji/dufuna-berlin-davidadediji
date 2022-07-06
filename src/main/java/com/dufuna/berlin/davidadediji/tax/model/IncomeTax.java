package com.dufuna.berlin.davidadediji.tax.model;

public class IncomeTax {
    private double taxBracket;
    private double taxAmount;
    private double rate;

    public IncomeTax(double taxBracket, double taxAmount, double rate) {
        this.taxBracket = taxBracket;
        this.taxAmount = taxAmount;
        this.rate = rate;
    }

    public double getTaxBracket() {
        return taxBracket;
    }

    public void setTaxBracket(double taxBracket) {
        this.taxBracket = taxBracket;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
