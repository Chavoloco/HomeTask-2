package Classes.CreditUnions;

import Classes.CentralBank;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CreditUnion extends CentralBank {

    private double loan;

    public CreditUnion(int idAccount, double maxCredit, int maxDues, String name, double loan) {
        super(idAccount, maxCredit, maxDues, name);

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
    public void askForALoan() {
        System.out.println("You have asked for a loan in: " + this.getName());
        System.out.println("You owe $" + this.getLoan() + " in this account");
        System.out.println("Please insert the amount that you want, and our team is going to evaluate your situation");
        String amount = "";
        Scanner typed = new Scanner(System.in);
        amount = typed.nextLine();

        double parsedAmount = Double.parseDouble(amount);
        double max = this.getMaxCredit();
        if (parsedAmount < max) {
            System.out.println("Your credit has been approved. Congrats!");
            this.setLoan(parsedAmount + parsedAmount * .15);
            LocalDate now = LocalDate.now();
            Period period = Period.ofDays(4).ofDays(120);
            System.out.println("You must pay:" + this.getLoan() + ", before " + now.plus(period));
        } else {
            System.out.println("Sorry we can't give you a loan");
        }
    }

    @Override
    public String toString() {
        return "CreditUnion {" + super.toString() + ", loan= $" + loan + '}';
    }
}
