package com.bank.www.usecase;

import com.bank.www.core.domain.TransactionEntity;

public interface UserNotificationUseCase {
    Boolean notifyUser(TransactionEntity transaction, String userEmail);
}
