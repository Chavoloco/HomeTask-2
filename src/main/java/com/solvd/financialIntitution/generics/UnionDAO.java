package com.solvd.financialIntitution.generics;

import com.solvd.financialIntitution.models.CentralBank;
import com.solvd.financialIntitution.models.customers.Person;

import java.util.List;

public class UnionDAO<L extends CentralBank, T extends Person> {
    public List union;

    public List makeUnion(L e, T r){
        union.add(e);
        union.add(r);
        return union;
    }
}
