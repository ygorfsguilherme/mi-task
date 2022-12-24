package com.guilherme.mitask.exceptions;

public class NoAuthorized extends Exception {
    @Override
    public String toString() {
        return "Usuario não autorizado / item não encontrado";
    }
}
