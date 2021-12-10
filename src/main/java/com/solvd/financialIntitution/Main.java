package com.solvd.financialIntitution;

import com.solvd.financialIntitution.collections.MyLinkedList;
import com.solvd.financialIntitution.db.ConnectionPool;
import com.solvd.financialIntitution.enums.Days;
import com.solvd.financialIntitution.enums.LoanStatus;
import com.solvd.financialIntitution.exceptions.*;
import com.solvd.financialIntitution.generics.BankDAO;
import com.solvd.financialIntitution.generics.PersonDAO;
import com.solvd.financialIntitution.generics.UnionDAO;
import com.solvd.financialIntitution.models.CentralBank;
import com.solvd.financialIntitution.models.interfaces.ICurrency;
import com.solvd.financialIntitution.models.savingsAndLoansBanks.SavingsAndLoansService;
import com.solvd.financialIntitution.models.commercialBanks.*;
import com.solvd.financialIntitution.models.creditUnions.*;
import com.solvd.financialIntitution.models.customers.*;
import com.solvd.financialIntitution.models.employees.Employee;
import com.solvd.financialIntitution.models.insuranceCompanies.InsuranceCompany;
import com.solvd.financialIntitution.models.investmentBanks.*;
import com.solvd.financialIntitution.user.User;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Main {
    private static MyLinkedList myLinkedList;
    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IOException, ParseException, ExecutionException, InterruptedException {

        myLinkedList = new MyLinkedList();

        User user1 = new User("admin", "admin");
        User user2 = new User("admin", "admin");
        User user3 = new User("admin", "admin");



        myLinkedList.add("1");
        myLinkedList.add("4");

        log.info("linked list: " + myLinkedList);

        ArrayList<String> objects = new ArrayList<>();
        Date expireDate = DateUtils.parseDate("2030/06/13", "yyyy/MM/dd");

        CentralBank insuranceCompany = new InsuranceCompany(458778, "Security insurance", 45000, 5400.00, 120000.00);
        CentralBank investmentBank = new InvestmentService(878765, "Brothers investment", 12000, 0, 0);
        CentralBank savingsAndLoansService = new SavingsAndLoansService(554541, "National Cooperative", 15000.00, 0,
                0);
        CentralBank internetBank = new InternetBank(4848775, "World Wide Bank", 0, "www.publicurl.com", 2500.00);
        CentralBank brokerageFirms = new BrokerageFirms(5565, "O-Toro", 0.0, 1500.00);
        CentralBank commercialBank = new CommercialBank(454547, "National Bank", 5000, 450.00, 54581211, objects);
        CommercialBank creditCard = new CreditCard((CommercialBank) commercialBank, 454874545, expireDate, 565);
        CentralBank creditUnion = new CreditUnion(4545877, "Brothers Credits", 36000.00, 4500.00);

        Person javier = new Employee("javier", 45877442, "Teller");
        Person sancor = new Enterprise("Sancor S.A", 555211544, 2000);
        Person leandro = new Customer("Leandro", 39448090, "Tambourine", false, true, false);

        log.info(
                insuranceCompany + "\n" + investmentBank + "\n" + savingsAndLoansService + "\n" + internetBank + "\n"
                        + brokerageFirms + "\n" + commercialBank + "\n" + creditCard + "\n" + creditUnion + "\n");
        // "//***************************************************************************\\"
        log.info(javier + "\n" + sancor + "\n" + leandro);

        BankDAO<CommercialBank> commercialBankGeneric = new BankDAO<>();
        commercialBankGeneric.editName((CommercialBank) commercialBank, "Nation Bank");
        commercialBankGeneric.getName((CommercialBank) commercialBank);
        commercialBankGeneric.getIdAccount((CommercialBank) commercialBank);

        PersonDAO<Customer> customerPersonGeneric = new PersonDAO<>();
        customerPersonGeneric.updateName((Customer) leandro, "Leandro Rodolfo");
        customerPersonGeneric.getName((Customer) leandro);

        UnionDAO<CommercialBank, Customer> unionGeneric = new UnionDAO<>();
        log.info(unionGeneric.makeUnion((CommercialBank) commercialBank, (Customer) leandro));

        //try {
        //    askForALoan(commercialBank, savingsAndLoansService, javier, leandro);
        //} catch (IsNotANumberException e) {
        //    log.info("you must put an number in this field, please be careful");
        //    throw new IsNotANumberException("What did you type?");
        //} catch (LowLoanException e) {
        //    log.info("we can't give you a loan under $600");
        //    throw new LowLoanException("The minimum loan is $600");
        //} catch (IllegalObjectsInSecurityBox e) {
        //    log.info("Sorry we cannot allow those objects, you can go to jail and so am we");
        //    throw new IllegalObjectsInSecurityBox("That object is not allowed");
        //}

        askForALoan(commercialBank, savingsAndLoansService, javier, leandro, brokerageFirms, creditCard);

    }


    public static void askForALoan(CentralBank commercialBank, CentralBank savingsAndLoansService, Person employee, Person customer, CentralBank brokerageFirms, CommercialBank creditCard) throws IOException {
        Days day = Days.MONDAY;
        if (day.equals(Days.SATURDAY) || day.equals(Days.SUNDAY)) {
            log.info("operations are closed");
        } else if (day.openingTime() < 7.00 || day.closingTime() > 13.30) {
            log.info("operations are closed");
        } else {
            log.info("welcome, please select where do you are asking for a loan");
            log.info("welcome, please select where do you are asking for a loan");
            String op;
            do {
                op = "";
                log.info("Type 1 for a commercial bank");
                log.info("Type 2 for savings and loans service");
                log.info("Type 3 for for exchange service");
                log.info("Type 4 for make an inversion");
                log.info("Type 0 to quit");
                Scanner in = new Scanner(System.in);
                op = in.nextLine();
                switch (Integer.parseInt(op)) {
                    case 1:
                        //log.info("okay!, Please type how much do you need");
                        log.info("okay!, Please type how much do you need");
                        String amount = "";
                        amount = in.nextLine();
                        boolean isNumeric = amount.matches("[+-]?\\d*(\\.\\d+)?");
                        if (!isNumeric) {
                            throw new IsNotANumberException("What did you type?");
                        }
                        if (Objects.isNull(Double.parseDouble(amount))) {
                            throw new IsANullNumberException("The number is null");
                        }
                        if (Double.parseDouble(amount) <= 600) {
                            throw new LowLoanException("The minimum loan is $600");
                        }
                        //  if (((Customer) customer).getLevel() == Levels.LOW && Double.parseDouble(amount) > 1250) {
                        //      throw new HighLoanForLevelException("Loan to high for you level");
                        //  } else if (((Customer) customer).getLevel() == Levels.MEDIUM && Double.parseDouble(amount) > 2500) {
                        //      throw new HighLoanForLevelException("Loan to high for you level");
                        //  }
                        LoanStatus status = LoanStatus.TODO;
                        log.info(customer.talk());
                        log.info(employee.talk());
                        log.info(commercialBank.talk());
                        status = LoanStatus.IN_PROGRESS;
                        log.info("status: " + status.status());
                        if (commercialBank.giveLoan(Double.parseDouble(amount))) {
                            try {
                                ((CommercialBank) commercialBank).setSavingsAccount(Double.parseDouble(amount));
                            } catch (NoHierarchyException e) {
                                throw new NoHierarchyException("That class cannot be casted");
                            }
                            log.info("Before continue please read the terms and conditions");
                            readDocs();
                            commercialBank.printValidate(() -> "Your loan has been approved");
                            status = LoanStatus.DONE;
                            log.info("congrats you have $" + ((CommercialBank) commercialBank).getSavingsAccount()
                                    + " in your account");
                            Date now = new Date();
                            Date giveBack = DateUtils.addMonths(now, 3);
                            log.info("You must give back $" + commercialBank.applyTax(Double.parseDouble(amount))
                                    + "in " + giveBack);
                        } else {
                            commercialBank.printDeny(() -> "Your loan has been denied");
                            status = LoanStatus.CANCELED;
                            log.info("Sorry we couldn't give you a loan");
                            log.info("do you want to put some objects in your security box?");
                            String answer = "";
                            answer = in.nextLine();
                            if (answer.equals("yes")) {
                                int op1;
                                do {
                                    op1 = in.nextInt();
                                    log.info("type 1 if you want to put an object");

                                    log.info("type 0 if you want to quit");
                                    String object = "";
                                    switch (op1) {
                                        case 1:
                                            LoanStatus boxStatus = LoanStatus.TODO;
                                            log.info("What do you want to put?");
                                            object = in.nextLine();
                                            boxStatus = LoanStatus.IN_PROGRESS;
                                            if (object.equals("gun") || object.equals("drug")
                                                    || object.equals("another security box")) {
                                                boxStatus = LoanStatus.CANCELED;
                                                throw new IllegalObjectsInSecurityBox("That object is not allowed");
                                            } else {
                                                ((CommercialBank) commercialBank).setSecurityBox(object);
                                                boxStatus = LoanStatus.DONE;
                                                log.info(
                                                        "Thanks you have " + ((CommercialBank) commercialBank).getSecurityBox()
                                                                + " in your security box");
                                            }
                                            break;
                                        case 0:
                                            log.info("Thank you for choosing us!!");
                                            break;
                                        default:
                                            log.info("wrong typed");
                                            break;
                                    }

                                } while (op1 != 0);
                            } else {
                                log.info("do you want to buy something with your credit card?");
                                answer = in.nextLine();
                                if (answer.equals("yes")) {
                                    log.info("Please type the amount of your purchase");
                                    double purchase = in.nextDouble();
                                    ((CreditCard) creditCard).setPurchases(purchase);
                                    log.info("Okay, you have brought this");
                                    ((CreditCard) creditCard).getPurchases();
                                    log.info("Purchases higher than 350");
                                    ((CreditCard) creditCard).highestPurchases();
                                    log.info("Purchases lower than 350");
                                    ((CreditCard) creditCard).lowestPurchases();
                                }
                                log.info("Ok, thanks for choosing us");
                            }
                        }
                        break;

                    case 2:
                        log.info("okay!, Please type how much do you need");
                        String amount1 = in.nextLine();
                        isNumeric = amount1.matches("[+-]?\\d*(\\.\\d+)?");
                        if (!isNumeric) {
                            throw new IsNotANumberException();
                        }
                        if (Double.parseDouble(amount1) <= 0) {
                            throw new LowLoanException();
                        }
                        if (Objects.isNull(Double.parseDouble(amount1))) {
                            throw new IsANullNumberException("The number is null");
                        }
                        log.info(customer.talk());
                        log.info(employee.talk());
                        log.info(savingsAndLoansService.talk());
                        if (savingsAndLoansService.giveLoan(Double.parseDouble(amount1))) {
                            ((SavingsAndLoansService) savingsAndLoansService).setSavingsAccount(Double.parseDouble(amount1));
                            savingsAndLoansService.printValidate(() -> "Your loan has been approved");
                            log.info("congrats you have $"
                                    + ((SavingsAndLoansService) savingsAndLoansService).getSavingsAccount()
                                    + " in your account");
                            Date now = new Date();
                            Date giveBack = DateUtils.addMonths(now, 3);
                            log.info("You must give back $"
                                    + savingsAndLoansService.applyTax(Double.parseDouble(amount1)) + "in " + giveBack);
                        } else {
                            savingsAndLoansService.printDeny(() -> "Your loan has been denied");
                            log.info("Sorry we couldn't give you a loan");
                        }
                        break;
                    case 3:
                        log.info("Please type 1 for exchange Dollar");
                        log.info("Please type 2 for exchange Euro");
                        log.info("Please type 0 to quit");
                        String answer = in.nextLine();
                        switch (Integer.parseInt(answer)) {
                            case 1:
                                log.info("how much do you want to exchange?");
                                answer = in.nextLine();
                                double pesos = Double.parseDouble(answer);
                                ((BrokerageFirms) brokerageFirms).printExchange(() -> {
                                    return pesos * ICurrency.VALUE_COMPARED_WITH_DOLLAR;
                                });
                                break;
                            case 2:
                                log.info("how much do you want to exchange?");
                                answer = in.nextLine();
                                pesos = Double.parseDouble(answer);
                                ((BrokerageFirms) brokerageFirms).printExchange(() -> {
                                    return pesos * ICurrency.VALUE_COMPARED_WITH_EURO;
                                });
                                break;
                            case 0:
                                log.info("Thanks for choosing us!");
                                break;
                        }
                        if (answer.equals("yes")) {
                            log.info("how much do you want to exchange?");
                            answer = in.nextLine();
                            double pesos = Double.parseDouble(answer);
                            ((BrokerageFirms) brokerageFirms).printExchange(() -> {
                                return pesos * ICurrency.VALUE_COMPARED_WITH_DOLLAR;
                            });
                        }
                        break;
                    case 4:
                        log.info("Please type where do you want to invest");
                        String investment = in.nextLine();
                        log.info("Please type how much do you want to invest");
                        Double price = in.nextDouble();
                        ((BrokerageFirms) brokerageFirms).setInvestments(investment, price);
                        log.info("Cool, look at your investments");
                        log.info(((BrokerageFirms) brokerageFirms).getInvestments());
                        log.info("Investment higher than $300");
                        break;
                    case 0:
                        log.info("Thanks for choosing us");
                        break;
                    default:
                        log.info("Wrong election, please type again");
                        break;

                }

            } while (Integer.parseInt(op) != 0);
        }
    }

    public static boolean readDocs() throws IOException {
        File terms = new File("src/main/recourses/terms-and-conditions.txt");

        log.info(terms);

        String lines = String.valueOf(FileUtils.readLines(terms));

        log.info(lines);

        StringUtils.countMatches(lines, "loan");
        StringUtils.countMatches(lines, "fees");
        StringUtils.countMatches(lines, "cancel");

        File newFile = new File("src/main/recourses/are-you-sure.txt");
        FileUtils.touch(newFile);

        String writeFile = "Be careful of what you sing \n" +
                "there are many dangerous words in these terms \n" +
                "for instance: \n" +
                StringUtils.join("loan:   ", StringUtils.countMatches(lines, "loan")) + "\n" +
                StringUtils.join("fees:   ", StringUtils.countMatches(lines, "fees")) + "\n" +
                StringUtils.join("cancel:   ", StringUtils.countMatches(lines, "cancel"));

        FileUtils.writeStringToFile(newFile, writeFile);

        log.info("Are you sure that you want to sign?");
        log.info(newFile);

        Scanner sure = new Scanner(System.in);
        sure.nextLine();
        if (sure.equals("yes")) return true;
        else return false;


    }

}
