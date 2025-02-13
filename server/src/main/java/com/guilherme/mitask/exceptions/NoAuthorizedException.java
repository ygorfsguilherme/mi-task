package com.guilherme.mitask.exceptions;

public class NoAuthorizedException extends BaseException {
    public NoAuthorizedException() {
        super(403, "Usuário não autorizado");
    }
}
