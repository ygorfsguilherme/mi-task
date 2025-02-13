package com.guilherme.mitask.exceptions;

public class ErrorResponse {
    private int statusCode;
    private String message;
    private long timestamp;

    public ErrorResponse(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
        this.timestamp = System.currentTimeMillis();
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "{" +
                "\"statusCode\": " + statusCode + "," +
                "\"message\": \"" + message + "\"," +
                "\"timestamp\": " + timestamp +
                "}";
    }
}
