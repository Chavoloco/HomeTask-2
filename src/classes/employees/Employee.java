package classes.employees;

import classes.customers.Person;

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
    public String toString() {
        return "Employee{" + super.toString() +
                "Role='" + Role + '\'' +
                '}';
    }
}
