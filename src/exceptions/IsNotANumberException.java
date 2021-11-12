package exceptions;

import java.io.IOException;

public class IsNotANumberException extends IllegalArgumentException {

    public IsNotANumberException(String message){
        super(message);
    }

    public IsNotANumberException(){}
}
