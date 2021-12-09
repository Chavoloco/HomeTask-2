package com.solvd.financialIntitution.models.commercialBanks;

import com.solvd.financialIntitution.models.CentralBank;
import com.solvd.financialIntitution.models.interfaces.ICurrency;

import java.util.List;
import java.util.Objects;

public class CommercialBank extends CentralBank  {

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


    public void printExchange(ICurrency currency){
        System.out.println("Congrats you earned " + currency.exchange() + " dollars");
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CommercialBank that = (CommercialBank) o;
        return Double.compare(that.savingsAccount, savingsAccount) == 0 && idSecurityBox == that.idSecurityBox && securityBox == that.securityBox;
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityBox, savingsAccount, idSecurityBox);
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
