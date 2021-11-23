package com.solvd.financialIntitution.models.commercialBanks;

import com.solvd.financialIntitution.models.CentralBank;

import java.util.Objects;

public class InternetBank extends CentralBank {

    private String url;
    private double savingsAccount;

    public InternetBank(int idAccount, String name, double maxCredit, String url, double savingsAccount) {
        super(idAccount, name, maxCredit);
        this.url = url;
        this.savingsAccount = savingsAccount;
    }

    public InternetBank() {
        super();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(double savingsAccount) {
        this.savingsAccount = savingsAccount;
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
        InternetBank that = (InternetBank) o;
        return Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), url);
    }

    @Override
    public String toString() {
        return "InternetBank {" + super.toString() + ", url= '" + url + '\'' + ", savingsAccount= " + savingsAccount + '}';
    }
}
