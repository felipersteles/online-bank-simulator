package com.bank.www.usecase;

import com.bank.www.core.domain.TransactionPinEntity;

public interface CreateTransactionPinUseCase {
    void create(TransactionPinEntity transactionPin);
}
