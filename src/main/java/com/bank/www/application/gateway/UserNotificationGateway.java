package com.bank.www.application.gateway;

import com.bank.www.core.domain.Transaction;

public interface UserNotificationGateway {
    Boolean notifyUser(Transaction transaction, String email);
}