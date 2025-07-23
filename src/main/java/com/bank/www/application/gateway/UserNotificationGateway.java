package com.bank.www.application.gateway;

import com.bank.www.core.domain.TransactionEntity;

public interface UserNotificationGateway {
    Boolean notifyUser(TransactionEntity transaction, String email);
}