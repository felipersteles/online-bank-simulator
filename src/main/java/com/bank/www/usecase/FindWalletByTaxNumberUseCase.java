package com.bank.www.usecase;

import com.bank.www.core.domain.WalletEntity;
import com.bank.www.core.exception.NotFoundException;

public interface FindWalletByTaxNumberUseCase {
    WalletEntity findByTaxNumber(String taxNumber) throws NotFoundException;
}
