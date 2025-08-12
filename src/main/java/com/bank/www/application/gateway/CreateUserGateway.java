package com.bank.www.application.gateway;

import com.bank.www.core.domain.User;
import com.bank.www.core.domain.Wallet;

public interface CreateUserGateway {
    Boolean create(User user, Wallet wallet);
}
