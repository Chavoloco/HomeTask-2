package main.java.com.solvd.financial_intitution.exceptions;

import java.io.IOException;

public class IllegalObjectsInSecurityBox extends RuntimeException {
    public IllegalObjectsInSecurityBox() {
    }

    public IllegalObjectsInSecurityBox(String message) {
        super(message);
    }
}
