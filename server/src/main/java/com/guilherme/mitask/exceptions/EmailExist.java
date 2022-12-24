package com.guilherme.mitask.exceptions;

public class EmailExist extends Exception {
    private String Error = "email ja existe";

    @Override
    public String toString() {
        return Error;
    }
}
