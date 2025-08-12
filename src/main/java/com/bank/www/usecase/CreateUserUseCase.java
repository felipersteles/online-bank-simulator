package com.bank.www.usecase;

import com.bank.www.core.domain.User;
import com.bank.www.core.exception.EmailException;
import com.bank.www.core.exception.InternalServerErrorException;
import com.bank.www.core.exception.TaxNumberException;
import com.bank.www.core.exception.TransactionPinException;

public interface CreateUserUseCase {
    void create(User user, String pin) throws TaxNumberException, EmailException, TransactionPinException, InternalServerErrorException;        
}
