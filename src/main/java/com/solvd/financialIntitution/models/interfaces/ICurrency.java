package com.solvd.financialIntitution.models.interfaces;

public interface ICurrency {
    double VALUE_COMPARED_WITH_DOLLAR = 0.0100;
    double VALUE_COMPARED_WITH_EURO = 0.0087;

    double exchangeDollar(double currency);
    double exchangeEuro(double currency);
}
