package com.solvd.financialIntitution.models;

import com.solvd.financialIntitution.Main;
import com.solvd.financialIntitution.enums.Levels;
import com.solvd.financialIntitution.models.interfaces.IDeny;
import com.solvd.financialIntitution.models.interfaces.ITalk;
import com.solvd.financialIntitution.models.interfaces.ITaxes;
import com.solvd.financialIntitution.models.interfaces.IValidate;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.Objects;



public abstract class CentralBank implements ITaxes, ITalk {

    public static final Logger log = LogManager.getLogger(CentralBank.class);

    private int idAccount;
    private String name;
    private double maxCredit;

    public CentralBank() {
    }

    public CentralBank(int idAccount, String name, double maxCredit) {
        this.idAccount = idAccount;
        this.name = name;
        Levels level = Levels.LOW;
        switch (level) {
            case LOW:
                this.maxCredit = maxCredit * 1;
                break;
            case HIGH:
                this.maxCredit = maxCredit * 2;
                break;
            case MEDIUM:
                this.maxCredit = maxCredit * 1.5;
                break;
            //this.maxCredit = maxCredit;
        }
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
        Levels level = Levels.HIGH;
        switch (level){
            case LOW:
                this.maxCredit = maxCredit * 1;
                break;
            case HIGH:
                this.maxCredit = maxCredit *2;
                break;
            case MEDIUM:
                this.maxCredit = maxCredit *1.5;
                break;
        }

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


    public void printValidate(IValidate validate) {
        log.info(validate.validate());
    }


    public void printDeny(IDeny deny) {
        log.info(deny.deny());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CentralBank that = (CentralBank) o;
        return idAccount == that.idAccount && name.equals(that.name) && Double.compare(that.maxCredit, maxCredit) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAccount, name, maxCredit);
    }

    @Override
    public String toString() {
        return "Name=' " + name + '\'' +
                "idAccount= " + idAccount +
                ", maxCredit= " + maxCredit +
                '}';
    }
}
