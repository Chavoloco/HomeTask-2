package com.solvd.financialIntitution.exceptions;

import java.io.IOException;

public class IllegalObjectsInSecurityBox extends IOException {
    public IllegalObjectsInSecurityBox() {
    }

    public IllegalObjectsInSecurityBox(String message) {
        super(message);
    }
}
