package com.bank.www.usecase;

import java.math.BigDecimal;

import com.bank.www.core.domain.WalletEntity;

public interface ConsultBalanceUseCase {
    BigDecimal consult(WalletEntity wallet);
}
