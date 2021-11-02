package Classes.CommercialBanks;

import Classes.CentralBank;

public class InternetBank extends CentralBank {

    private String url;
    private double savingsAccount;

    public InternetBank(int idAccount, double maxCredit, int maxDues, String name, String url, double savingsAccount) {
        super(idAccount, maxCredit, maxDues, name);
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
    public void askForALoan() {

    }

    @Override
    public String toString() {
        return "InternetBank {" + super.toString() + ", url= '" + url + '\'' + ", savingsAccount= " + savingsAccount + '}';
    }
}
