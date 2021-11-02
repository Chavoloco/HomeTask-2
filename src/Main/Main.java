package Main;

import Classes.CentralBank;
import Classes.CommercialBanks.CommercialBank;
import Classes.CommercialBanks.CreditCard;
import Classes.CommercialBanks.InternetBank;
import Classes.CreditUnions.CreditUnion;
import Classes.InsuranceCompanies.InsuranceCompany;
import Classes.InvestmentBanks.BrokerageFirms;
import Classes.InvestmentBanks.InvestmentBank;
import Classes.SavingsAndLoansBanks.SavingsAndLoansBank;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        LocalDate expireDate = LocalDate.of(2025, Month.MAY, 23);

        CentralBank insuranceCompany = new InsuranceCompany(458778, 50000.00, 24, "Security insurance", 5400.00, 120000.00);
        CentralBank investmentBank = new InvestmentBank(13213213, 150000, 12, "Inversions S.A");
        CentralBank savingsAndLoansBank = new SavingsAndLoansBank(554541, 69000.00, 36, "National Cooperative", 15000.00, 5000.00);
        CentralBank internetBank = new InternetBank(4848775, 0.0, 0, "World Wide Bank", "www.publicurl.com", 2500.00);
        CentralBank brokerageFirms = new BrokerageFirms(5565, 0.0, 0, "O-Toro", 150.00, "Google");
        CentralBank commercialBank = new CommercialBank(454547, 25000.00, 12, "National Bank", 450.00, 454581211);
        CommercialBank creditCard = new CreditCard((CommercialBank) commercialBank, 454874545, expireDate, 565);
        CentralBank creditUnion = new CreditUnion(4545877, 36000.00, 36, "Brothers Credits", 4500.00);


        System.out.println(
                insuranceCompany.toString() + "\n" +
                        investmentBank.toString() + "\n" +
                        savingsAndLoansBank.toString() + "\n" +
                        internetBank.toString() + "\n" +
                        brokerageFirms.toString() + "\n" +
                        commercialBank.toString() + "\n" +
                        creditCard.toString() + "\n" +
                        creditUnion.toString() + "\n" +
                        "//***************************************************************************\\" );

        commercialBank.askForALoan();
        creditUnion.askForALoan();
        investmentBank.askForALoan();
    }
}
