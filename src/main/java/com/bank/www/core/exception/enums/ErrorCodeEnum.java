package com.bank.www.core.exception.enums;

public enum ErrorCodeEnum {
    ON0001("ON0001", "Invalid tax number"),

    TR0001("TR0001", "Invalid user type. Only merchants can transfer"), 
    TR0002("TR0002", "Insufficient balance"),

    TP0001("TP0001", "Invalid pin. The pin must be 6 digits");

    private String code;
    private String message;

    ErrorCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
    
    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
