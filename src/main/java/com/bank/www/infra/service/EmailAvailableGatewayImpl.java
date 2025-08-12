package com.bank.www.infra.service;

import com.bank.www.application.gateway.EmailAvailableGateway;
import com.bank.www.infra.repo.UserEntityRepository;
import org.springframework.stereotype.Service;

@Service
public class EmailAvailableGatewayImpl implements EmailAvailableGateway {
    private UserEntityRepository userEntityRepository;

    public EmailAvailableGatewayImpl(UserEntityRepository userEntityRepository) {
        this.userEntityRepository = userEntityRepository;
    }

    @Override
    public Boolean isAvailable(String email) {
        return !userEntityRepository.existsByEmail(email);
    }
}