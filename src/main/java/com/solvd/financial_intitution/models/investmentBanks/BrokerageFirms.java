package main.java.com.solvd.financial_intitution.models.investmentBanks;


import main.java.com.solvd.financial_intitution.models.CentralBank;

public class BrokerageFirms extends CentralBank {
    private double investmentAccount;
    private String investments;


    public BrokerageFirms() {
        super();
    }

    public BrokerageFirms(int idAccount, String name, double maxCredit, double investmentAccount, String investments) {
        super(idAccount, name, maxCredit);
        this.investmentAccount = investmentAccount;
        this.investments = investments;
    }

    public double getInvestmentAccount() {
        return investmentAccount;
    }

    public void setInvestmentAccount(double investmentAccount) {
        this.investmentAccount = investmentAccount;
    }

    public String getInvestments() {
        return investments;
    }

    public void setInvestments(String investments) {
        this.investments = investments;
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
        return "BrokerageFirms { " + super.toString() +
                ", investmentAccount= $" + investmentAccount +
                ", investments= " + investments + '}';
    }
}
