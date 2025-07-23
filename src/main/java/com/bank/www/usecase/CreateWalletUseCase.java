package com.bank.www.usecase;

import com.bank.www.core.domain.WalletEntity;

public interface CreateWalletUseCase {
    void create(WalletEntity wallet);
}
