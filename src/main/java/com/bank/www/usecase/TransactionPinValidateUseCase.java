package com.bank.www.usecase;

import com.bank.www.core.domain.TransactionPin;
import com.bank.www.core.exception.TransactionPinException;
import com.bank.www.core.exception.TransferException;

public interface TransactionPinValidateUseCase {
    Boolean validate(TransactionPin transactionPin) throws TransferException, TransactionPinException;
}
