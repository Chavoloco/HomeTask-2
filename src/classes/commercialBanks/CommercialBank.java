package classes.commercialBanks;

import classes.CentralBank;
import classes.customers.Customer;
import classes.customers.Person;
import classes.employees.Employee;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Scanner;

public class CommercialBank extends CentralBank {

    private double savingsAccount;
    private int idSecurityBox;
    private List<String> securityBox;

    public CommercialBank(int idAccount, String name, double maxCredit, double savingsAccount, int idSecurityBox, List<String> securityBox) {
        super(idAccount, name, maxCredit);
        this.savingsAccount = savingsAccount;
        this.idSecurityBox = idSecurityBox;
        this.securityBox = securityBox;
    }

    public CommercialBank() {
        super();
    }

    //Getters and Setters
    public double getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(double savingsAccount) {
        this.savingsAccount += savingsAccount;
    }

    public double getIdSecurityBox() {
        return idSecurityBox;
    }

    public void setIdSecurityBox(int idSecurityBox) {
        this.idSecurityBox = idSecurityBox;
    }

    public List<String> getSecurityBox() {
        return securityBox;
    }

    public void setSecurityBox(String object) {
        this.securityBox.add(object);
    }

    @Override
    public boolean giveLoan(double loan) {
        return super.giveLoan(loan);
    }

    @Override
    public String toString() {
        return "CommercialBank {" + super.toString() + ", savingsAccount= " + savingsAccount + ", idSecurityBox= " + idSecurityBox + '}';
    }
}
