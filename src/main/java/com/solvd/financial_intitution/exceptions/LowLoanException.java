package main.java.com.solvd.financial_intitution.exceptions;

import java.io.IOException;

public class LowLoanException extends IOException {
    public LowLoanException() {
    }

    public LowLoanException(String message) {
        super(message);
    }
}
