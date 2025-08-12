package com.bank.www.application.gateway;

import com.bank.www.core.domain.TransactionPin;

public interface TransactionPinValidateGateway {
    boolean validate(TransactionPin transactionPin);
}
