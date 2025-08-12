package com.bank.www.infra.service;

import com.bank.www.application.gateway.TaxNumberAvailableGateway;
import com.bank.www.infra.repo.UserEntityRepository;
import org.springframework.stereotype.Service;


@Service
public class TaxNumberAvailableGatewayImpl implements TaxNumberAvailableGateway {
    private UserEntityRepository userEntityRepository;

    public TaxNumberAvailableGatewayImpl(UserEntityRepository userEntityRepository) {
        this.userEntityRepository = userEntityRepository;
    }

    @Override
    public Boolean isAvailable(String taxNumber) {
        return !userEntityRepository.existsByTaxNumber(taxNumber);
    }
}
