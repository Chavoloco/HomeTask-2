package com.solvd.financial_intitution.generics;

public abstract class personDAO<L> {
    public abstract L getById(long id);
    public abstract void save(L e);
    public abstract void update(L e);
    public abstract void delete(long id);
}
