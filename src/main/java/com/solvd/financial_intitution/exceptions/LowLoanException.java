package com.solvd.financial_intitution.exceptions;

import java.io.IOException;

public class LowLoanException extends RuntimeException {
    public LowLoanException() {
    }

    public LowLoanException(String message) {
        super(message);
    }
}
