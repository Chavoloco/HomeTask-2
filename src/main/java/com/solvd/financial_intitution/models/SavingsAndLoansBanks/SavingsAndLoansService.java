package com.solvd.financial_intitution.models.SavingsAndLoansBanks;

import com.solvd.financial_intitution.models.CentralBank;

public class SavingsAndLoansService extends CentralBank {

    private double loan;
    private double savingsAccount;

    public SavingsAndLoansService() {
        super();
    }

    public SavingsAndLoansService(int idAccount, String name, double maxCredit, double loan, double savingsAccount) {
        super(idAccount, name, maxCredit);
        this.loan = loan;
        this.savingsAccount = savingsAccount;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public double getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(double savingsAccount) {
        this.savingsAccount = this.loan + this.getSavingsAccount() + savingsAccount;
    }


    @Override
    public boolean giveLoan(double loan) {
        return super.giveLoan(loan);
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
        return "SavingsAndLoansBank { " + super.toString() +
                ", loan= $" + loan + ", savingsAccount= $" + savingsAccount + '}';
    }
}
