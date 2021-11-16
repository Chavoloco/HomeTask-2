package com.solvd.financial_intitution.models.insuranceCompanies;

import com.solvd.financial_intitution.models.CentralBank;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        InsuranceCompany that = (InsuranceCompany) o;
        return Double.compare(that.totalQuotation, totalQuotation) == 0 && Double.compare(that.carQuotation, carQuotation) == 0 && Double.compare(that.houseQuotation, houseQuotation) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), totalQuotation, carQuotation, houseQuotation);
    }

    @Override
    public String toString() {
        return "InsuranceCompany { " + super.toString() + ", totalQuotation= $" + totalQuotation + ", carQuotation= $" + carQuotation +
                ", houseQuotation= $" + houseQuotation + '}';
    }
}
