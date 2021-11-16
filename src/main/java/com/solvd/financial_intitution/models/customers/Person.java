package com.solvd.financial_intitution.models.customers;


import com.solvd.financial_intitution.models.interfaces.ITalk;

import java.util.Objects;

public abstract class Person implements ITalk {
    private String name;
    private int id;

    public Person() {
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String talk() {
        return null;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", id=" + id ;
    }
}
