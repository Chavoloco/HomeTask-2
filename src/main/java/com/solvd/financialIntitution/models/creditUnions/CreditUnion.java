package com.solvd.financialIntitution.models.creditUnions;

import com.solvd.financialIntitution.models.CentralBank;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CreditUnion that = (CreditUnion) o;
        return Double.compare(that.loan, loan) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(loan);
    }

    @Override
    public String toString() {
        return "CreditUnion {" + super.toString() + ", loan= $" + loan + '}';
    }
}
