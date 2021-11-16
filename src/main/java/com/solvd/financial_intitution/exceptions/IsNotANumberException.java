package com.solvd.financial_intitution.exceptions;

public class IsNotANumberException extends RuntimeException {

    public IsNotANumberException(String message){
        super(message);
    }

    public IsNotANumberException(){}
}
