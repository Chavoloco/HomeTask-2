package com.solvd.financial_intitution.generics;

public interface IUnionDAO<L, T> {
    Object union(L e, T r);
}
