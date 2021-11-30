package com.solvd.financialIntitution.models.employees;

import com.solvd.financialIntitution.models.customers.Person;

import java.util.Objects;

public class Employee extends Person {
    private String role;

    public Employee(String name, int id, String role) {
        super(name, id);
        this.role = role;
    }

    public Employee() {
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String talk() {
        return "Thanks for Apply, we are giving you an answer in minutes";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return role.equals(employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role);
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "Role='" + role + '\'' +
                '}';
    }
}
