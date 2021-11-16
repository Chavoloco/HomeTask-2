package com.solvd.financial_intitution.models.employees;

import com.solvd.financial_intitution.models.customers.Person;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Role.equals(employee.Role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Role);
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "Role='" + Role + '\'' +
                '}';
    }
}
