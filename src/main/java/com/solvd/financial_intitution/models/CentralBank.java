package main.java.com.solvd.financial_intitution.models;

import main.java.com.solvd.financial_intitution.models.interfaces.IDeny;
import main.java.com.solvd.financial_intitution.models.interfaces.ITalk;
import main.java.com.solvd.financial_intitution.models.interfaces.ITaxes;
import main.java.com.solvd.financial_intitution.models.interfaces.IValidate;

public abstract class CentralBank implements ITaxes, ITalk, IValidate, IDeny {

    private int idAccount;
    private String name;
    private double maxCredit;

    public CentralBank() {
    }

    public CentralBank(int idAccount, String name, double maxCredit) {
        this.idAccount = idAccount;
        this.name = name;
        this.maxCredit = maxCredit;
    }

    //Getters and Setters
    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxCredit() {
        return maxCredit;
    }

    public void setMaxCredit(double maxCredit) {
        this.maxCredit = maxCredit;
    }

    public boolean giveLoan(double loan) {
        if (loan < this.maxCredit) {
            return true;
        }
        return false;
    }

    @Override
    public double applyTax(double loan) {
        return loan += loan * TAX;
    }

    @Override
    public String talk() {
        return null;
    }

    @Override
    public void validate() {
        System.out.println("Your loan has been approved");
    }

    @Override
    public void deny() {
        System.out.println("The loan has not been approved");
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
        return "Name=' " + name + '\'' +
                "idAccount= " + idAccount +
                ", maxCredit= " + maxCredit +
                '}';
    }
}
