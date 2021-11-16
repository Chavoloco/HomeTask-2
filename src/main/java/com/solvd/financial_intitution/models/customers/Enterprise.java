package main.java.com.solvd.financial_intitution.models.customers;

public class Enterprise extends Person  {
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
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String talk() {
        return "You must give me a loan";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Enterprise{" + super.toString() +
                "enterpriseSize=" + enterpriseSize +
                '}';
    }
}
