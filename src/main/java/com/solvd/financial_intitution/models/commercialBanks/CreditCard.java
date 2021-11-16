package com.solvd.financial_intitution.models.commercialBanks;

import java.time.LocalDate;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CreditCard that = (CreditCard) o;
        return idCard == that.idCard && securityCode == that.securityCode && commercialBank.equals(that.commercialBank) && expireDate.equals(that.expireDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), commercialBank, idCard, expireDate, securityCode);
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
