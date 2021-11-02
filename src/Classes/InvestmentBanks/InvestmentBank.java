package Classes.InvestmentBanks;

import Classes.CentralBank;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class InvestmentBank extends CentralBank {
    private double mutualFunds;
    private double fixedTerms;


    public InvestmentBank(int idAccount, double maxCredit, int maxDues, String name) {
        super(idAccount, maxCredit, maxDues, name);
        this.mutualFunds = 0;
        this.fixedTerms = 0;
    }

    public InvestmentBank() {
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
    public void askForALoan() {
        System.out.println("welcome, select where you want to invest");
        double max = this.getMaxCredit();
        String op;
        do {
            op = "";
            System.out.println("Type 1 if you want invest in an mutual fonds");
            System.out.println("Type 2 if you want invest in an fixed terms");
            System.out.println("Type 0 to quit");
            Scanner in = new Scanner(System.in);
            op = in.nextLine();
            String amount = "";
            double parsedAmount = 0;
            switch (Integer.parseInt(op)) {
                case 1:
                    System.out.println("okay!, Please type the amount that you want to invest");
                    amount = in.nextLine();
                    parsedAmount = Double.parseDouble(amount);
                    if (parsedAmount < max) {
                        System.out.println("Yay! you did it ");
                        this.setMutualFunds(parsedAmount);
                        System.out.println("now you have $" + this.getMutualFunds() + " invested");
                        LocalDate now = LocalDate.now();
                        Period period = Period.ofDays(4).ofDays(30);
                        System.out.println(this.getMutualFunds());
                        System.out.println("it will be " + (this.getMutualFunds() + this.getMutualFunds() * .09) + " in " + now.plus(period));
                    } else {
                        System.out.println("Sorry we can´t invest that amount for you");
                    }
                    break;
                case 2:
                    System.out.println("okay!, Please type the amount that you want to invest");
                    amount = in.nextLine();
                    parsedAmount = Double.parseDouble(amount);
                    if (parsedAmount < max) {
                        System.out.println("Yay! you did it ");
                        this.setFixedTerms(parsedAmount);
                        System.out.println("now you have $" + this.getFixedTerms() + " invested");
                        LocalDate now = LocalDate.now();
                        Period period = Period.ofDays(4).ofDays(30);
                        System.out.println("it will be " + (this.getFixedTerms() + this.getFixedTerms() * .1) + " in " + now.plus(period));
                    }
                    break;
                case 0:
                    System.out.println("Thanks for choosing us");
                    break;
                default:
                    System.out.println("Wrong election, please type again");
                    break;

            }

        } while (Integer.parseInt(op) != 0);
    }

    @Override
    public String toString() {
        return "InvestmentBank { " + super.toString() + ", mutualFunds=" + mutualFunds + ", fixedTerms=" + fixedTerms + '}';
    }
}
