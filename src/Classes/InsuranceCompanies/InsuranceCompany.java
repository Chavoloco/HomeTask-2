package Classes.InsuranceCompanies;

import Classes.CentralBank;

public class InsuranceCompany extends CentralBank {

    private double totalQuotation;
    private double carQuotation;
    private double houseQuotation;

    public InsuranceCompany(int idAccount, double maxCredit, int maxDues, String name, double carQuotation, double houseQuotation) {
        super(idAccount, maxCredit, maxDues, name);
        this.totalQuotation += this.carQuotation + this.houseQuotation;
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
    public void askForALoan() {

    }

    @Override
    public String toString() {
        return "InsuranceCompany { " + super.toString() + ", totalQuotation= $" + totalQuotation + ", carQuotation= $" + carQuotation +
                ", houseQuotation= $" + houseQuotation + '}';
    }
}
