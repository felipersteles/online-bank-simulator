package com.bank.www.application.gateway;

import com.bank.www.core.domain.TransactionEntity;

public interface TransferGateway {
    Boolean transfer(TransactionEntity transaction);
}