package com.bank.www.usecase;

import com.bank.www.core.domain.TransactionEntity;
import com.bank.www.core.exception.TransferException;

public interface CreateTransactionUseCase {
    TransactionEntity create(TransactionEntity transaction) throws TransferException;
}