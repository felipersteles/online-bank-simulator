package com.bank.www.usecase;

import com.bank.www.core.domain.Transaction;
import com.bank.www.core.exception.TransferException;

public interface TransactionValidateUseCase {
    Boolean validate(Transaction transaction) throws TransferException;
}
