package com.bank.www.usecase;

import com.bank.www.core.domain.TransactionPinEntity;
import com.bank.www.core.exception.TransactionPinException;
import com.bank.www.core.exception.TransferException;

public interface TransactionPinValidateUseCase {
    Boolean validate(TransactionPinEntity transactionPin) throws TransferException, TransactionPinException;
}
