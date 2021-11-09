package classes.creditUnions;

import classes.CentralBank;
import classes.customers.Customer;
import classes.customers.Person;
import classes.employees.Employee;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

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
    public String toString() {
        return "CreditUnion {" + super.toString() + ", loan= $" + loan + '}';
    }
}
