package classes.commercialBanks;

import classes.customers.Customer;
import classes.customers.Person;
import classes.employees.Employee;

import java.time.LocalDate;
import java.util.List;

public class CreditCard extends CommercialBank {

    private CommercialBank commercialBank;
    private long idCard;
    private LocalDate expireDate;
    private int securityCode;

    public CreditCard(CommercialBank commercialBank, long idCard, LocalDate expireDate, int securityCode) {
        this.commercialBank = commercialBank;
        this.idCard = idCard;
        this.expireDate = expireDate;
        this.securityCode = securityCode;
    }

    public CreditCard() {
        super();
    }

    public long getIdCard() {
        return idCard;
    }

    public void setIdCard(long idCard) {
        this.idCard = idCard;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public CommercialBank getCommercialBank() {
        return commercialBank;
    }

    public void setCommercialBank(CommercialBank commercialBank) {
        this.commercialBank = commercialBank;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "commercialBank=" + commercialBank +
                ", idCard=" + idCard +
                ", expireDate=" + expireDate +
                ", securityCode=" + securityCode +
                '}';
    }
}
