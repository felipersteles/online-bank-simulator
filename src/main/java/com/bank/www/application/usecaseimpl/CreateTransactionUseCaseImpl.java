package com.bank.www.application.usecaseimpl;

import com.bank.www.application.gateway.CreateTransactionGateway;
import com.bank.www.core.domain.TransactionEntity;
import com.bank.www.core.exception.TransferException;
import com.bank.www.core.exception.enums.ErrorCodeEnum;
import com.bank.www.usecase.CreateTransactionUseCase;

public class CreateTransactionUseCaseImpl implements CreateTransactionUseCase {
    private CreateTransactionGateway createTransactionGateway;

    public CreateTransactionUseCaseImpl(CreateTransactionGateway createTransactionGateway) {
        this.createTransactionGateway = createTransactionGateway;
    }

    @Override
    public TransactionEntity create(TransactionEntity transaction) throws TransferException {
        var transactionSaved = createTransactionGateway.create(transaction);

        if (transactionSaved == null) {
            throw new TransferException(ErrorCodeEnum.TR0003.getMessage(), ErrorCodeEnum.TR0003.getCode());
        }

        return transactionSaved;
    }
}
