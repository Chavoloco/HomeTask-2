package com.solvd.financialIntitution.generics;

import com.solvd.financialIntitution.models.CentralBank;
import com.solvd.financialIntitution.models.customers.Person;

import java.util.ArrayList;
import java.util.List;

public class UnionDAO<L extends CentralBank, T extends Person> {
    private List union = new ArrayList();

    public List makeUnion(L e, T r){
        union.add(e);
        union.add(r);
        int unionId = (int) Math.floor(Math.random() * 500);
        union.add(unionId);
        return union;
    }
}
