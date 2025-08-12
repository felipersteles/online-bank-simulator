package com.bank.www.application.usecaseimpl;

import com.bank.www.application.gateway.FindWalletByTaxNumberGateway;
import com.bank.www.core.domain.Wallet;
import com.bank.www.core.exception.NotFoundException;
import com.bank.www.core.exception.enums.ErrorCodeEnum;
import com.bank.www.usecase.FindWalletByTaxNumberUseCase;

public class FindWalletByTaxNumberUseCaseImpl implements FindWalletByTaxNumberUseCase {
    private FindWalletByTaxNumberGateway findWalletByTaxNumberGateway;

    @Override
    public Wallet findByTaxNumber(String taxNumber) throws NotFoundException {
        var wallet = findWalletByTaxNumberGateway.findByTazNumber(taxNumber);

        if (wallet == null) {
            throw new NotFoundException(ErrorCodeEnum.WA0001.getMessage(), ErrorCodeEnum.WA0001.getCode());
        }

        return wallet;
    }
}
