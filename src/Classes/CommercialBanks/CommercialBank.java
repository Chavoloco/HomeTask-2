package Classes.CommercialBanks;

import Classes.CentralBank;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CommercialBank extends CentralBank {

    private double savingsAccount;
    private int idSecurityBox;

    public CommercialBank(int idAccount, double maxCredit, int maxDues, String name, double savingsAccount, int idSecurityBox) {
        super(idAccount, maxCredit, maxDues, name);
        this.savingsAccount = savingsAccount;
        this.idSecurityBox = idSecurityBox;
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

    @Override
    public void askForALoan() {
        System.out.println("You have asked for a loan in: " + this.getName());

        System.out.println("Please insert the amount that you want and our team is going to evaluate your situation");
        String amount = "";
        Scanner typed = new Scanner(System.in);
        amount = typed.nextLine();

        double parsedAmount = Double.parseDouble(amount);
        double max = this.getMaxCredit();
        if (parsedAmount < max) {
            System.out.println("Your credit has been approved. Congrats!");
            this.setSavingsAccount(+parsedAmount);
            LocalDate now = LocalDate.now();
            Period period = Period.ofDays(4).ofDays(120);
            System.out.println("You have $" + this.getSavingsAccount() + " in your Savings Account");
            System.out.println("You must pay:" + (parsedAmount + parsedAmount * .15) + ", before " + now.plus(period));
        } else {
            System.out.println("Sorry we can't give you a loan");
        }
    }

    @Override
    public String toString() {
        return "CommercialBank {" + super.toString() + ", savingsAccount= " + savingsAccount + ", idSecurityBox= " + idSecurityBox + '}';
    }
}
