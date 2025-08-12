package com.bank.www.application.gateway;

import com.bank.www.core.domain.Transaction;

public interface TransactionValidateGateway {
    Boolean validate(Transaction transaction);
}