package classes.investmentBanks;

import classes.CentralBank;
import classes.customers.Customer;
import classes.customers.Person;
import classes.employees.Employee;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

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
    public String toString() {
        return "InvestmentBank { " + super.toString() + ", mutualFunds=" + mutualFunds + ", fixedTerms=" + fixedTerms + '}';
    }
}
