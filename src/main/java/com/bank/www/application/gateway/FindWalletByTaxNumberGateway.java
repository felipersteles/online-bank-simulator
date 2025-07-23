package com.bank.www.application.gateway;

import com.bank.www.core.domain.WalletEntity;

public interface FindWalletByTaxNumberGateway {
    WalletEntity findByTazNumber(String taxNumber);
}