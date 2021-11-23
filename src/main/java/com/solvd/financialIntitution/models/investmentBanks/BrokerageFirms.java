package com.solvd.financialIntitution.models.investmentBanks;


import com.solvd.financialIntitution.models.CentralBank;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BrokerageFirms that = (BrokerageFirms) o;
        return Double.compare(that.investmentAccount, investmentAccount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), investmentAccount);
    }

    @Override
    public String toString() {
        return "BrokerageFirms { " + super.toString() +
                ", investmentAccount= $" + investmentAccount +
                ", investments= " + investments + '}';
    }
}
