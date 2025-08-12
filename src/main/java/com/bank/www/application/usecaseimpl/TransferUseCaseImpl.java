package com.bank.www.application.usecaseimpl;

import java.math.BigDecimal;

import com.bank.www.application.gateway.TransferGateway;
import com.bank.www.core.domain.Transaction;
import com.bank.www.core.exception.InternalServerErrorException;
import com.bank.www.core.exception.NotFoundException;
import com.bank.www.core.exception.NotificationException;
import com.bank.www.core.exception.TransactionPinException;
import com.bank.www.core.exception.TransferException;
import com.bank.www.core.exception.enums.ErrorCodeEnum;
import com.bank.www.usecase.CreateTransactionUseCase;
import com.bank.www.usecase.FindWalletByTaxNumberUseCase;
import com.bank.www.usecase.UserNotificationUseCase;
import com.bank.www.usecase.TransactionPinValidateUseCase;
import com.bank.www.usecase.TransactionValidateUseCase;
import com.bank.www.usecase.TransferUseCase;

public class TransferUseCaseImpl implements TransferUseCase {
    private TransferGateway transferGateway;
    private FindWalletByTaxNumberUseCase findWalletByTaxNumberUseCase;
    private TransactionValidateUseCase transactionValidateUseCase;
    private CreateTransactionUseCase createTransactionUseCase;
    private UserNotificationUseCase userNotificationUseCase;
    private TransactionPinValidateUseCase transactionPinValidateUseCase;

    public TransferUseCaseImpl(TransferGateway transferGateway, FindWalletByTaxNumberUseCase findWalletByTaxNumberUseCase, TransactionValidateUseCase transactionValidateUseCase, CreateTransactionUseCase createTransactionUseCase, UserNotificationUseCase userNotificationUseCase, TransactionPinValidateUseCase transactionPinValidateUseCase) {
        this.transferGateway = transferGateway; 
        this.transactionPinValidateUseCase = transactionPinValidateUseCase;
        this.findWalletByTaxNumberUseCase = findWalletByTaxNumberUseCase;
        this.transactionValidateUseCase = transactionValidateUseCase;
        this.createTransactionUseCase = createTransactionUseCase;
        this.userNotificationUseCase = userNotificationUseCase;
        this.transactionPinValidateUseCase = transactionPinValidateUseCase;
    }

    @Override
    public Boolean transfer(String fromTaxNumber, String toTaxNumber, BigDecimal amount ) throws TransferException, InternalServerErrorException, NotFoundException, TransactionPinException, TransferException, NotificationException {
        var fromWallet = findWalletByTaxNumberUseCase.findByTaxNumber(fromTaxNumber);
        var toWallet = findWalletByTaxNumberUseCase.findByTaxNumber(toTaxNumber);

        if(fromWallet.getTransactionPin().getBlocked()) {
            throw new TransactionPinException(ErrorCodeEnum.TP0002.getMessage(), ErrorCodeEnum.TP0002.getCode());
        }

        transactionPinValidateUseCase.validate(fromWallet.getTransactionPin());

        fromWallet.transferAmount(amount);
        toWallet.receiveAmount(amount);

        var transaction = createTransactionUseCase.create(new Transaction(fromWallet, toWallet, amount));

        transactionValidateUseCase.validate(transaction);

        if(!transferGateway.transfer(transaction)){
            throw new InternalServerErrorException(ErrorCodeEnum.TR0003.getMessage(), ErrorCodeEnum.TR0003.getCode());
        }

        if(!userNotificationUseCase.notifyUser(transaction, toWallet.getUser().getEmail())){
            throw new NotificationException(ErrorCodeEnum.NO0001.getMessage(), ErrorCodeEnum.NO0001.getCode());
        }

        return true;
    }

}
