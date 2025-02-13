package com.guilherme.mitask.exceptions;

public class EmailAlreadyExistsException extends BaseException {
    public EmailAlreadyExistsException() {
        super(409, "E-mail já está em uso");
    }
}