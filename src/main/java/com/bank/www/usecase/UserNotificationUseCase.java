package com.bank.www.usecase;

import com.bank.www.core.domain.Transaction;

public interface UserNotificationUseCase {
    Boolean notifyUser(Transaction transaction, String userEmail);
}
