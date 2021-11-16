package com.solvd.financial_intitution.models.investmentBanks;

import com.solvd.financial_intitution.models.CentralBank;

public class InvestmentService extends CentralBank {
    private double mutualFunds;
    private double fixedTerms;

    public InvestmentService(int idAccount, String name, double maxCredit, double mutualFunds, double fixedTerms) {
        super(idAccount, name, maxCredit);
        this.mutualFunds = mutualFunds;
        this.fixedTerms = fixedTerms;
    }

    public InvestmentService() {
        super();
    }

    public double getMutualFunds() {
        return mutualFunds;
    }

    public void setMutualFunds(double mutualFunds) {
        this.mutualFunds += mutualFunds;
    }

    public double getFixedTerms() {
        return fixedTerms;
    }

    public void setFixedTerms(double fixedTerms) {
        this.fixedTerms = fixedTerms;
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
        return "InvestmentBank { " + super.toString() + ", mutualFunds=" + mutualFunds + ", fixedTerms=" + fixedTerms + '}';
    }
}
