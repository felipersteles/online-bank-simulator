package com.bank.www.application.usecaseimpl;

import com.bank.www.application.gateway.TaxNumberAvailableGateway;
import com.bank.www.usecase.TaxNumberAvailableUseCase;

public class TaxNumberAvailableUseCaseImpl implements TaxNumberAvailableUseCase {
    private TaxNumberAvailableGateway taxNumberAvailableGateway;

    public TaxNumberAvailableUseCaseImpl(TaxNumberAvailableGateway taxNumberAvailableGateway) {
        this.taxNumberAvailableGateway = taxNumberAvailableGateway;
    }

    @Override
    public Boolean isAvailable(String taxNumber) {
        return taxNumberAvailableGateway.isAvailable(taxNumber);
    }
}