package com.solvd.financialIntitution.generics;

import com.solvd.financialIntitution.models.customers.Person;

public  class PersonDAO<L extends Person> {
    public  String getName(L e){
        return e.getName();
    }
    public  void updateName(L e, String newName){
        e.setName(newName);
    }
}
