package com.solvd.financial_intitution.models.creditUnions;

import com.solvd.financial_intitution.models.CentralBank;

public class CreditUnion extends CentralBank {

    private double loan;

    public CreditUnion(int idAccount, String name, double maxCredit, double loan) {
        super(idAccount, name, maxCredit);
        this.loan = loan;
    }

    public CreditUnion() {
        super();
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan += loan;
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
    public String toString() {
        return "CreditUnion {" + super.toString() + ", loan= $" + loan + '}';
    }
}
