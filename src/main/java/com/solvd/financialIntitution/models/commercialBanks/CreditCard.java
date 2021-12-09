package com.solvd.financialIntitution.models.commercialBanks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class CreditCard extends CommercialBank {

    private CommercialBank commercialBank;
    private long idCard;
    private Date expireDate;
    private int securityCode;
    private boolean isEmpty;
    private ArrayList<Double> purchases;

    public CreditCard(CommercialBank commercialBank, long idCard, Date expireDate, int securityCode) {
        this.commercialBank = commercialBank;
        this.idCard = idCard;
        this.expireDate = expireDate;
        this.securityCode = securityCode;
        this.purchases = new ArrayList<>();
        this.isEmpty = true;
    }

    public void getPurchases() {
        if (isEmpty) {
            System.out.println("There are no purchases");
        } else {
            System.out.println(purchases);
        }
    }

    public void setPurchases(Double purchases) {
        this.purchases.add(purchases);
        this.isEmpty = false;
    }

    public void highestPurchases(){
        this.purchases.stream().filter((p)-> p > 350).forEach(p -> System.out.println(p));
    }

    public void lowestPurchases(){
        this.purchases.stream().filter((p)-> p < 350).forEach(p -> System.out.println(p));
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

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CreditCard that = (CreditCard) o;
        return idCard == that.idCard && securityCode == that.securityCode && commercialBank.equals(that.commercialBank) && expireDate.equals(that.expireDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commercialBank, idCard, expireDate, securityCode);
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
