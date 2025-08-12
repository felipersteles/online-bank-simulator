package com.bank.www.application.usecaseimpl;

import java.math.BigDecimal;

import com.bank.www.application.gateway.CreateUserGateway;
import com.bank.www.core.domain.User;
import com.bank.www.core.domain.Wallet;
import com.bank.www.core.domain.TransactionPin;
import com.bank.www.core.exception.EmailException;
import com.bank.www.core.exception.InternalServerErrorException;
import com.bank.www.core.exception.TransactionPinException;
import com.bank.www.core.exception.TaxNumberException;
import com.bank.www.core.exception.enums.ErrorCodeEnum;
import com.bank.www.usecase.CreateUserUseCase;
import com.bank.www.usecase.TaxNumberAvailableUseCase;
import com.bank.www.usecase.EmailAvailableUseCase;

public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private TaxNumberAvailableUseCase taxNumberAvailableUseCase;
    private EmailAvailableUseCase emailAvailableUseCase;
    private CreateUserGateway createUserGateway;

    public CreateUserUseCaseImpl(TaxNumberAvailableUseCase taxNumberAvailableUseCase,
            EmailAvailableUseCase emailAvailableUseCase, CreateUserGateway createUserGateway) {
        this.taxNumberAvailableUseCase = taxNumberAvailableUseCase;
        this.emailAvailableUseCase = emailAvailableUseCase;
        this.createUserGateway = createUserGateway;
    }

    @Override
    public void create(User user, String pin)
            throws TaxNumberException, EmailException, TransactionPinException, InternalServerErrorException {
        if (!taxNumberAvailableUseCase.isAvailable(user.getTaxNumber().getValue())) {
            throw new TaxNumberException(ErrorCodeEnum.ON0002.getMessage(), ErrorCodeEnum.ON0002.getCode());
        }

        if (!emailAvailableUseCase.isAvailable(user.getEmail())) {
            throw new EmailException(ErrorCodeEnum.ON0004.getMessage(), ErrorCodeEnum.ON0004.getCode());
        }

        if (!createUserGateway.create(user, new Wallet(BigDecimal.ZERO, user, new TransactionPin(pin)))) {
            throw new InternalServerErrorException(ErrorCodeEnum.ON0005.getMessage(), ErrorCodeEnum.ON0005.getCode());
        }
    }
}
