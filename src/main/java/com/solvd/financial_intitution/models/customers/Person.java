package com.solvd.financial_intitution.models.customers;


import com.solvd.financial_intitution.models.interfaces.ITalk;

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
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
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
