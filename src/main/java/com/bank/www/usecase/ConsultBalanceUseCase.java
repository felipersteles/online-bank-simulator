package com.bank.www.usecase;

import java.math.BigDecimal;

import com.bank.www.core.domain.Wallet;

public interface ConsultBalanceUseCase {
    BigDecimal consult(Wallet wallet);
}
