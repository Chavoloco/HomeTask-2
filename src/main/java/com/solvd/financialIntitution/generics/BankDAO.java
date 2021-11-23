package com.solvd.financialIntitution.generics;

import com.solvd.financialIntitution.models.CentralBank;

public  class BankDAO<L extends CentralBank> {


    public  String getName(L e){
        return e.getName();
    }
    public int getIdAccount(L e){
        return e.getIdAccount();
    }
    public  void editName(L e, String newName){
        e.setName(newName);
    }

}
