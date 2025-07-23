package com.bank.www.application.gateway;

import com.bank.www.core.domain.TransactionEntity;

public interface TransactionValidateGateway {
    Boolean validate(TransactionEntity transaction);
}