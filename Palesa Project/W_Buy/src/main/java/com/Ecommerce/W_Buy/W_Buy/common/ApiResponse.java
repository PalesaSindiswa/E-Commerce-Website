package com.Ecommerce.W_Buy.W_Buy.common;

import java.time.LocalDateTime;

public class ApiResponse {
	private final boolean success;
    private String message;

    public ApiResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
}
    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return LocalDateTime.now().toString();
    }


    

   

    @Override
    public String toString() {
        return String.format("HelloWorldBean [message=%s]", message);
    }
}