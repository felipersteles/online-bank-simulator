package com.bank.www.application.gateway;

import com.bank.www.core.domain.Wallet;

public interface FindWalletByTaxNumberGateway {
    Wallet findByTazNumber(String taxNumber);
}