package com.solvd.financialIntitution.exceptions;

public class IsNotANumberException extends RuntimeException {

    public IsNotANumberException(String message){
        super(message);
    }

    public IsNotANumberException(){}
}
