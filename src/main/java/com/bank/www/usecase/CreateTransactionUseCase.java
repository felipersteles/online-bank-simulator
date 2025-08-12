package com.bank.www.usecase;

import com.bank.www.core.domain.Transaction;
import com.bank.www.core.exception.TransferException;

public interface CreateTransactionUseCase {
    Transaction create(Transaction transaction) throws TransferException;
}