package com.bank.www.application.gateway;

import com.bank.www.core.domain.WalletEntity;

import java.math.BigDecimal;

public interface ConsultBalanceGateway {
    BigDecimal consult(WalletEntity wallet);
}