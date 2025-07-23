package com.bank.www.usecase;

import java.math.BigDecimal;

import com.bank.www.core.exception.InternalServerErrorException;
import com.bank.www.core.exception.TransferException;
import com.bank.www.core.exception.NotFoundException;
import com.bank.www.core.exception.TransactionPinException;
import com.bank.www.core.exception.NotificationException;

public interface TransferUseCase {
    Boolean transfer(String fromTaxNumber, String toTaxNumber, BigDecimal amount) throws TransferException, InternalServerErrorException, NotFoundException, TransactionPinException, TransferException, NotificationException;
}
