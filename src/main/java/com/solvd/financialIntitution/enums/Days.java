package com.solvd.financialIntitution.enums;

public enum Days {
    MONDAY(7.00, 13.30),
    TUESDAY(7.00, 13.30),
    WEDNESDAY(7.00, 13.30),
    THURSDAY(7.00, 13.30),
    FRIDAY(7.00, 13.30),
    SATURDAY(0, 0),
    SUNDAY(0, 0);

    private double openingTime;
    private double closingTime;

    Days(double openingTime, double closingTime){
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    public double closingTime() {
        return closingTime;
    }

    public double openingTime() {
        return openingTime;
    }
}
