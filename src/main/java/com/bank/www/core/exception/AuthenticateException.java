package com.bank.www.core.exception;

public class AuthenticateException extends Exception {
    private String code;

    public AuthenticateException(String message, String code) {
        super(message);
        this.code = code;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
