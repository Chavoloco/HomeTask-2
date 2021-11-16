package main.java.com.solvd.financial_intitution.models.commercialBanks;

import main.java.com.solvd.financial_intitution.models.CentralBank;

import java.util.List;

public class CommercialBank extends CentralBank {

    private double savingsAccount;
    private int idSecurityBox;
    private List<String> securityBox;

    public CommercialBank(int idAccount, String name, double maxCredit, double savingsAccount, int idSecurityBox, List<String> securityBox) {
        super(idAccount, name, maxCredit);
        this.savingsAccount = savingsAccount;
        this.idSecurityBox = idSecurityBox;
        this.securityBox = securityBox;
    }

    public CommercialBank() {
        super();
    }

    //Getters and Setters
    public double getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(double savingsAccount) {
        this.savingsAccount += savingsAccount;
    }

    public double getIdSecurityBox() {
        return idSecurityBox;
    }

    public void setIdSecurityBox(int idSecurityBox) {
        this.idSecurityBox = idSecurityBox;
    }

    public List<String> getSecurityBox() {
        return securityBox;
    }

    public void setSecurityBox(String object) {
        this.securityBox.add(object);
    }

    @Override
    public boolean giveLoan(double loan) {
        return super.giveLoan(loan);
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
    public double applyTax(double loan) {
        return super.applyTax(loan);
    }

    @Override
    public String toString() {
        return "CommercialBank {" + super.toString() + ", savingsAccount= " + savingsAccount + ", idSecurityBox= " + idSecurityBox + '}';
    }
}
