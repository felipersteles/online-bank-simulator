package com.bank.www.usecase;

import com.bank.www.core.domain.TransactionPinEntity;

public interface UpdateTransactionPinUseCase {
    TransactionPinEntity update(TransactionPinEntity transactionPin);
}
