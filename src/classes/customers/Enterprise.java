package classes.customers;

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
    public String toString() {
        return "Enterprise{" + super.toString() +
                "enterpriseSize=" + enterpriseSize +
                '}';
    }
}
