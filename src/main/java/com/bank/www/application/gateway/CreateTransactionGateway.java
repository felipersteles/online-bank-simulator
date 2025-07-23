package com.bank.www.application.gateway;

import com.bank.www.core.domain.TransactionEntity;

public interface CreateTransactionGateway {
    TransactionEntity create(TransactionEntity transaction);
}