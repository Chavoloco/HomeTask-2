package com.solvd.financialIntitution.models.customers;

import java.util.Objects;

public class Customer extends Person {
    private String occupation;
    private boolean hasCar;
    private boolean hasHouse;
    private boolean hasYatch;

    public Customer() {
    }

    public Customer(String name, int id, String occupation, boolean hasCar, boolean hasHouse, boolean hasYatch) {
        super(name, id);
        this.occupation = occupation;
        this.hasCar = hasCar;
        this.hasHouse = hasHouse;
        this.hasYatch = hasYatch;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }

    public boolean isHasHouse() {
        return hasHouse;
    }

    public void setHasHouse(boolean hasHouse) {
        this.hasHouse = hasHouse;
    }

    public boolean isHasYatch() {
        return hasYatch;
    }

    public void setHasYatch(boolean hasYatch) {
        this.hasYatch = hasYatch;
    }

    @Override
    public String talk() {
        return "I hope you gave me the loan";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return occupation == customer.occupation && hasCar == customer.hasCar && hasHouse == customer.hasHouse && hasYatch == customer.hasYatch;
    }

    @Override
    public int hashCode() {
        return Objects.hash(occupation, hasCar, hasHouse, hasYatch);
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "occupation='" + occupation + '\'' + '}';
    }
}
