package com.solvd.financialIntitution.enums;

public enum LoanStatus {
    TODO("to do"),
    IN_PROGRESS("in progress"),
    DONE("done");

    private String status;

    LoanStatus(String status){
        this.status = status;
    }

    public String status(){
        return this.status;
    }
}
