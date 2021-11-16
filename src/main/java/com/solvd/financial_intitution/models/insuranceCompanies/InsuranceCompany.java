package com.solvd.financial_intitution.models.insuranceCompanies;

import com.solvd.financial_intitution.models.CentralBank;

public class InsuranceCompany extends CentralBank {

    private double totalQuotation;
    private double carQuotation;
    private double houseQuotation;

    public InsuranceCompany(int idAccount, String name, double maxCredit,  double carQuotation, double houseQuotation) {
        super(idAccount, name, maxCredit);
        this.carQuotation = carQuotation;
        this.houseQuotation = houseQuotation;
    }

    public InsuranceCompany() {
        super();
    }

    public double getTotalQuotation() {
        return totalQuotation;
    }

    public void setTotalQuotation() {
        this.totalQuotation += this.carQuotation + this.houseQuotation;
    }

    public double getCarQuotation() {
        return carQuotation;
    }

    public void setCarQuotation(double carQuotation) {
        this.carQuotation = carQuotation;
    }

    public double getHouseQuotation() {
        return houseQuotation;
    }

    public void setHouseQuotation(double houseQuotation) {
        this.houseQuotation = houseQuotation;
    }

    @Override
    public double applyTax(double loan) {
        return super.applyTax(loan);
    }

    @Override
    public String talk() {
        return "We are evaluating the situation";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "InsuranceCompany { " + super.toString() + ", totalQuotation= $" + totalQuotation + ", carQuotation= $" + carQuotation +
                ", houseQuotation= $" + houseQuotation + '}';
    }
}
