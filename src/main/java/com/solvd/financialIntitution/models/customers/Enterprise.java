package com.solvd.financialIntitution.models.customers;

import java.util.Objects;

public class Enterprise extends Person {
    private int enterpriseSize;

    public Enterprise() {
        super();
    }

    public Enterprise(String name, int id, int enterpriseSize) {
        super(name, id);
        this.enterpriseSize = enterpriseSize;
    }

    public int getEnterpriseSize() {
        return enterpriseSize;
    }

    public void setEnterpriseSize(int enterpriseSize) {
        this.enterpriseSize = enterpriseSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Enterprise that = (Enterprise) o;
        return enterpriseSize == that.enterpriseSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseSize);
    }

    @Override
    public String talk() {
        return "You must give me a loan";
    }

    @Override
    public String toString() {
        return "Enterprise{" + super.toString() +
                "enterpriseSize=" + enterpriseSize +
                '}';
    }
}
