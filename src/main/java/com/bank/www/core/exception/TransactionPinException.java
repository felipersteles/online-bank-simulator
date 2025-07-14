package com.bank.www.core.exception;

public class TransactionPinException extends Exception {
    private String code;

    public TransactionPinException(String message, String code) {
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