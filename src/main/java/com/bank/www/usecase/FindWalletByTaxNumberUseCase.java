package com.bank.www.usecase;

import com.bank.www.core.domain.Wallet;
import com.bank.www.core.exception.NotFoundException;

public interface FindWalletByTaxNumberUseCase {
    Wallet findByTaxNumber(String taxNumber) throws NotFoundException;
}
