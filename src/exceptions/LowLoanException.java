package exceptions;

import java.io.IOException;

public class LowLoanException extends IOException {
    public LowLoanException() {
    }

    public LowLoanException(String message) {
        super(message);
    }
}
