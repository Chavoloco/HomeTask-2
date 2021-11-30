package com.solvd.financialIntitution.models.investmentBanks;

import com.solvd.financialIntitution.models.CentralBank;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        InvestmentService that = (InvestmentService) o;
        return Double.compare(that.mutualFunds, mutualFunds) == 0 && Double.compare(that.fixedTerms, fixedTerms) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mutualFunds);
    }

    @Override
    public String toString() {
        return "InvestmentBank { " + super.toString() + ", mutualFunds=" + mutualFunds + ", fixedTerms=" + fixedTerms + '}';
    }
}
