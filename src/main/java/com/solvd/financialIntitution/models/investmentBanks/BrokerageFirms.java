package com.solvd.financialIntitution.models.investmentBanks;


import com.solvd.financialIntitution.models.CentralBank;
import com.solvd.financialIntitution.models.interfaces.ICurrency;

import java.util.HashMap;
import java.util.Objects;

public class BrokerageFirms extends CentralBank {
    private double investmentAccount;
    private HashMap<String, Double> investments;


    public BrokerageFirms() {
        super();
    }

    public BrokerageFirms(int idAccount, String name, double maxCredit, double investmentAccount) {
        super(idAccount, name, maxCredit);
        this.investmentAccount = investmentAccount;
        this.investments = new HashMap<>();
    }

    public double getInvestmentAccount() {
        return investmentAccount;
    }

    public void setInvestmentAccount(double investmentAccount) {
        this.investmentAccount = investmentAccount;
    }

    public HashMap<String, Double> getInvestments() {
        return investments;
    }

    public void setInvestments(String enterprise, Double price) {
        this.investments.put(enterprise, price);
    }


    @Override
    public double applyTax(double loan) {
        return super.applyTax(loan);
    }

    @Override
    public String talk() {
        return "We are evaluating the situation";
    }

    public void printExchange(ICurrency currency){
        System.out.println("Congrats you earned $" + currency.exchange());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BrokerageFirms that = (BrokerageFirms) o;
        return Double.compare(that.investmentAccount, investmentAccount) == 0 && investments.equals(that.investments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(investments, investmentAccount);
    }

    @Override
    public String toString() {
        return "BrokerageFirms { " + super.toString() +
                ", investmentAccount= $" + investmentAccount +
                ", investments= " + investments + '}';
    }
}
