package com.bank.www.application.usecaseimpl;

import com.bank.www.application.gateway.TransactionPinValidateGateway;
import com.bank.www.core.domain.TransactionPin;
import com.bank.www.core.exception.TransactionPinException;
import com.bank.www.core.exception.enums.ErrorCodeEnum;
import com.bank.www.usecase.TransactionPinValidateUseCase;
import com.bank.www.usecase.UpdateTransactionPinUseCase;

public class TransactionPinValidateUseCaseImpl implements TransactionPinValidateUseCase {
    private TransactionPinValidateGateway transactionPinValidateGateway;
    private UpdateTransactionPinUseCase updateTransactionPinUseCase;

    public TransactionPinValidateUseCaseImpl(TransactionPinValidateGateway transactionPinValidateGateway) {
        this.transactionPinValidateGateway = transactionPinValidateGateway;
    }

    @Override
    public Boolean validate(TransactionPin transactionPin) throws TransactionPinException {
        if (transactionPin.getBlocked()) throw new TransactionPinException(ErrorCodeEnum.TP0001.getMessage(), ErrorCodeEnum.TP0001.getCode());

        if (!transactionPinValidateGateway.validate(transactionPin)){
            transactionPin.increaseAttempt();
            var transactionPinUpdated = updateTransactionPinUseCase.update(transactionPin);
            throw new TransactionPinException(ErrorCodeEnum.pin0002GetMessage(transactionPinUpdated.getAttempts()), ErrorCodeEnum.TP0001.getCode());
        }

        if (transactionPin.getAttempts() < 3){
            transactionPin.resetAttempts();
            updateTransactionPinUseCase.update(transactionPin);
        }

        return true;
    }
}
