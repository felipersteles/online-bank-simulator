package com.bank.www.application.gateway;

import com.bank.www.core.domain.UserEntity;
import com.bank.www.core.domain.WalletEntity;

public interface CreateUserGateway {
    Boolean create(UserEntity user, WalletEntity wallet);
}
