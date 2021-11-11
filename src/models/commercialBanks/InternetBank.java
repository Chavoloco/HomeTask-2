package models.commercialBanks;

import models.CentralBank;

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
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "InternetBank {" + super.toString() + ", url= '" + url + '\'' + ", savingsAccount= " + savingsAccount + '}';
    }
}
