package com.bank.www.application.usecaseimpl;

import com.bank.www.application.gateway.TransactionValidateGateway;
import com.bank.www.core.domain.TransactionEntity;
import com.bank.www.core.exception.TransferException;
import com.bank.www.core.exception.enums.ErrorCodeEnum;
import com.bank.www.usecase.TransactionValidateUseCase;

public class TransactionValidateUseCaseImpl implements TransactionValidateUseCase {
    private TransactionValidateGateway transactionValidateGateway;
    @Override
    public Boolean validate(TransactionEntity transaction) throws TransferException {
        if (!transactionValidateGateway.validate(transaction)){
            throw new TransferException(ErrorCodeEnum.TR0004.getMessage(), ErrorCodeEnum.TR0004.getCode());
        }
        return true;
    }
}