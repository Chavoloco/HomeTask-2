package com.solvd.financialIntitution.models.interfaces;

@FunctionalInterface
public interface ICurrency {
    double VALUE_COMPARED_WITH_DOLLAR = 0.0099;
    double VALUE_COMPARED_WITH_EURO = 0.0087;

    double exchange();
}
