package classes;

public abstract class CentralBank {

    private int idAccount;
    private String name;
    private double maxCredit;

    public CentralBank() {
    }

    public CentralBank(int idAccount, String name, double maxCredit) {
        this.idAccount = idAccount;
        this.name = name;
        this.maxCredit = maxCredit;
    }

    //Getters and Setters
    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxCredit() {
        return maxCredit;
    }

    public void setMaxCredit(double maxCredit) {
        this.maxCredit = maxCredit;
    }

    public boolean giveLoan(double loan) {
        if (loan < this.maxCredit) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Name=' " + name + '\'' +
                "idAccount= " + idAccount +
                ", maxCredit= " + maxCredit +
                '}';
    }
}
