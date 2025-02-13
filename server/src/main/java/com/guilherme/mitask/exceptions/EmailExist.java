package com.guilherme.mitask.exceptions;

@Deprecated
/**
 * @deprecated Esta classe não deve ser mais usada. 
 * Utilize {@link EmailAlreadyExistsException} em seu lugar.
 */
public class EmailExist extends Exception {
    private String Error = "email ja existe";

    @Override
    public String toString() {
        return Error;
    }
}
