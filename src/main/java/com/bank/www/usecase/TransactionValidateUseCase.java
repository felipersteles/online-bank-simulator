package com.bank.www.usecase;

import com.bank.www.core.domain.TransactionEntity;
import com.bank.www.core.exception.TransferException;

public interface TransactionValidateUseCase {
    Boolean validate(TransactionEntity transaction) throws TransferException;
}
