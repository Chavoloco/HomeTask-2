package classes.SavingsAndLoansBanks;

import classes.CentralBank;

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
    public String toString() {
        return "SavingsAndLoansBank { " + super.toString() +
                ", loan= $" + loan + ", savingsAccount= $" + savingsAccount + '}';
    }
}
