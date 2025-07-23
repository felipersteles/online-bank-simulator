package com.bank.www.core.exception.enums;

public enum ErrorCodeEnum {
    ON0001("ON0001", "Invalid tax number"),
    ON0002("ON0002", "Tax number already exists"),
    ON0003("ON0003", "Invalid email"),
    ON0004("ON0004", "Email already exists"),
    ON0005("ON0005", "Erro ao criar usuário"),

    TR0001("TR0001", "Tipo de usuário inválido. Apenas comerciantes podem transferir"), 
    TR0002("TR0002", "Saldo insuficiente"),
    TR0003("TR0003", "Transferência falhou. Tente novamente mais tarde."),
    TR0004("TR0004", "Transferência não autorizada"),

    TP0001("TP0001", "Invalid pin. The pin must be 6 digits"),
    TP0002("TP0002", "Pin blocked"),

    WA0001("WA0001", "Carteira não encontrada"),

    NO0001("NO0001", "Erro ao notificar usuário"),

    ATH0001("ATH0001", "Usuário ou senha inválidos");

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

    public static String pin0002GetMessage(Integer attempts) {
        return "Invalid pin. You have " + attempts + " attempts left";
    }
}
