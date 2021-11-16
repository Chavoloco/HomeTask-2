package com.solvd.financial_intitution.generics;

public abstract class bankDAO <L> {
    public abstract String getName(L e);
    public abstract String getIdAccount(L e);
    public abstract void editName(L e);
    public abstract void delete(L e);
}
