package Classes;

public abstract class CentralBank {

    protected int idAccount;
    protected double maxCredit;
    protected int maxDues;
    protected String name;

    public CentralBank() {
    }

    public CentralBank(int idAccount, double maxCredit, int maxDues, String name) {
        this.idAccount = idAccount;
        this.maxCredit = maxCredit;
        this.maxDues = maxDues;
        this.name = name;
    }

    //Getters and Setters
    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public double getMaxCredit() {
        return maxCredit;
    }

    public void setMaxCredit(double maxCredit) {
        this.maxCredit = maxCredit;
    }

    public int getMaxDues() {
        return maxDues;
    }

    public void setMaxDues(int maxDues) {
        this.maxDues = maxDues;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Methods
    public abstract void askForALoan();

    @Override
    public String toString() {
        return name + ", idAccount= " + idAccount + ", maxCredit= " + maxCredit;
    }
}
