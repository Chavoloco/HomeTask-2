package Classes.SavingsAndLoansBanks;

import Classes.CentralBank;

public class SavingsAndLoansBank extends CentralBank {

    private double loan;
    private double savingsAccount;

    public SavingsAndLoansBank() {
        super();
    }

    public SavingsAndLoansBank(int idAccount, double maxCredit, int maxDues, String name, double loan, double savingsAccount) {
        super(idAccount, maxCredit, maxDues, name);
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
        this.savingsAccount = savingsAccount;
    }

    @Override
    public void askForALoan() {

    }

    @Override
    public String toString() {
        return "SavingsAndLoansBank { " + super.toString() +
                ", loan= $" + loan + ", savingsAccount= $" + savingsAccount + '}';
    }
}
