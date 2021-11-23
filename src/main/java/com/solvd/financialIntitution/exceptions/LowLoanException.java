package com.solvd.financialIntitution.exceptions;

public class LowLoanException extends RuntimeException {
    public LowLoanException() {
    }

    public LowLoanException(String message) {
        super(message);
    }
}
