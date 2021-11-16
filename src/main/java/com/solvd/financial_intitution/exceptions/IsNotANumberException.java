package main.java.com.solvd.financial_intitution.exceptions;

public class IsNotANumberException extends IllegalArgumentException {

    public IsNotANumberException(String message){
        super(message);
    }

    public IsNotANumberException(){}
}
