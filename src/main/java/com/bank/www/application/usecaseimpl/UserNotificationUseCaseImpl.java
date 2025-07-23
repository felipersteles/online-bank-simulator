package com.bank.www.application.usecaseimpl;

import com.bank.www.application.gateway.UserNotificationGateway;
import com.bank.www.core.domain.TransactionEntity;
import com.bank.www.usecase.UserNotificationUseCase;

public class UserNotificationUseCaseImpl implements UserNotificationUseCase {

    private UserNotificationGateway userNotificationGateway;
    @Override
    public Boolean notifyUser(TransactionEntity transaction, String email) {
        return userNotificationGateway.notifyUser(transaction, email);
    }
}