package com.solvd.financialIntitution.exceptions;

public class IllegalObjectsInSecurityBox extends RuntimeException {
    public IllegalObjectsInSecurityBox() {
    }

    public IllegalObjectsInSecurityBox(String message) {
        super(message);
    }
}
