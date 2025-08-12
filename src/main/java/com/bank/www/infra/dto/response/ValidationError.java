package com.bank.www.infra.dto.response;

public record ValidationError(String field, String message) {
}