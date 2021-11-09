package main;

import classes.CentralBank;
import classes.SavingsAndLoansBanks.SavingsAndLoansService;
import classes.commercialBanks.CommercialBank;
import classes.commercialBanks.CreditCard;
import classes.commercialBanks.InternetBank;
import classes.creditUnions.CreditUnion;
import classes.customers.Customer;
import classes.customers.Enterprise;
import classes.customers.Person;
import classes.employees.Employee;
import classes.insuranceCompanies.InsuranceCompany;
import classes.investmentBanks.BrokerageFirms;
import classes.investmentBanks.InvestmentService;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> objects = new ArrayList<String>();
        LocalDate expireDate = LocalDate.of(2025, Month.MAY, 23);

        CentralBank insuranceCompany = new InsuranceCompany(458778, "Security insurance", 45000, 5400.00, 120000.00);
        CentralBank investmentBank = new InvestmentService(878765, "Brothers investment", 12000, 00, 00);
        CentralBank savingsAndLoansService = new SavingsAndLoansService(554541, "National Cooperative", 15000.00, 00, 0);
        CentralBank internetBank = new InternetBank(4848775, "World Wide Bank", 0, "www.publicurl.com", 2500.00);
        CentralBank brokerageFirms = new BrokerageFirms(5565, "O-Toro", 0.0, 1500.00, "Google");
        CentralBank commercialBank = new CommercialBank(454547, "National Bank", 5000, 450.00, 54581211, objects);
        CommercialBank creditCard = new CreditCard((CommercialBank) commercialBank, 454874545, expireDate, 565);
        CentralBank creditUnion = new CreditUnion(4545877, "Brothers Credits", 36000.00, 4500.00);

        Person javier = new Employee("javier", 45877442, "Teller");
        Person sancor = new Enterprise("Sancor S.A", 555211544, 2000);
        Person leandro = new Customer("Leandro", 39448090, "Tambourine", false, true, false);


        System.out.println(
                insuranceCompany.toString() + "\n" +
                        investmentBank.toString() + "\n" +
                        savingsAndLoansService.toString() + "\n" +
                        internetBank.toString() + "\n" +
                        brokerageFirms.toString() + "\n" +
                        commercialBank.toString() + "\n" +
                        creditCard.toString() + "\n" +
                        creditUnion.toString() + "\n");
        //"//***************************************************************************\\" );
        System.out.println(javier.toString() + "\n" + sancor.toString() + "\n" + leandro.toString());

        askForALoan(commercialBank, savingsAndLoansService);

    }
    public static void askForALoan (CentralBank commercialBank, CentralBank savingsAndLoansService) {
        System.out.println("welcome, please select where do you are asking for a loan");
        String op;
        do {
            op = "";
            System.out.println("Type 1 for a commercial bank");
            System.out.println("Type 2 for savings and loans service");
            System.out.println("Type 0 to quit");
            Scanner in = new Scanner(System.in);
            op = in.nextLine();
            switch (Integer.parseInt(op)) {
                case 1:
                    System.out.println("okay!, Please type how much do you need");
                    String amount = in.nextLine();
                    if (commercialBank.giveLoan(Double.parseDouble(amount))) {
                        ((CommercialBank) commercialBank).setSavingsAccount(Double.parseDouble(amount));
                        System.out.println("congrats you have $" + ((CommercialBank) commercialBank).getSavingsAccount() + " in your account");
                    } else {
                        System.out.println("Sorry we couldn't give you a loan");
                        System.out.println("do you want to put some objects in your security box?");
                        String answer = in.nextLine();
                        if (answer.equals("yes")) {
                            String op1;
                            do {
                                op1 = in.nextLine();
                                System.out.println("type 1 if you want to put an object");
                                System.out.println("type 0 if you want to quit");
                                switch (Integer.parseInt(op1)) {
                                    case 1:
                                        System.out.println("What do you want to put?");
                                        String object = in.nextLine();
                                        ((CommercialBank) commercialBank).setSecurityBox(object);
                                        break;
                                    case 0:
                                        System.out.println("Thank you for choosing us!!");
                                        break;
                                    default:
                                        System.out.println("wrong typed");
                                        break;
                                }

                            } while (Integer.parseInt(op1) != 0);
                        }
                    }
                    break;
                case 2:
                    System.out.println("okay!, Please type how much do you need");
                    amount = in.nextLine();
                    if (savingsAndLoansService.giveLoan(Double.parseDouble(amount))) {
                        ((SavingsAndLoansService) savingsAndLoansService).setSavingsAccount(Double.parseDouble(amount));
                        System.out.println("congrats you have $" + ((SavingsAndLoansService) savingsAndLoansService).getSavingsAccount() + " in your account");
                    } else {
                        System.out.println("Sorry we couldn't give you a loan");
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
}
