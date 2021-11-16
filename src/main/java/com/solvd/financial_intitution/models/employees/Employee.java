package main.java.com.solvd.financial_intitution.models.employees;

import main.java.com.solvd.financial_intitution.models.customers.Person;

public class Employee extends Person {
    private String Role;

    public Employee(String name, int id, String role) {
        super(name, id);
        Role = role;
    }

    public Employee() {
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    @Override
    public String talk() {
        return "Thanks for Apply, we are giving you an answer in minutes";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "Role='" + Role + '\'' +
                '}';
    }
}
