package com.grimmslaw.taxonomy.exception;

public class InvalidNameException extends Exception {

    public InvalidNameException(String name) {
        super("The name=" + name + " is not a valid binomial name.");
    }

}
