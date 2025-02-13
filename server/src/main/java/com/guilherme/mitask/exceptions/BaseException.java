package com.guilherme.mitask.exceptions;

public abstract class BaseException extends Exception {
    private final ErrorResponse errorResponse;

    public BaseException(int statusCode, String message) {
        super(message);
        this.errorResponse = new ErrorResponse(statusCode, message);
    }

    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

    @Override
    public String toString() {
        return errorResponse.toString();
    }
}
