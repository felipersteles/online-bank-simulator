package com.bank.www.application.gateway;

import com.bank.www.core.domain.TransactionPinEntity;

public interface TransactionPinValidateGateway {
    boolean validate(TransactionPinEntity transactionPin);
}
