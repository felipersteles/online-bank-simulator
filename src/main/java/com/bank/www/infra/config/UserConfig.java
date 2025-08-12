package com.bank.www.infra.config;

import com.bank.www.application.gateway.CreateUserGateway;
import com.bank.www.application.gateway.EmailAvailableGateway;
import com.bank.www.application.gateway.TaxNumberAvailableGateway;
import com.bank.www.application.usecaseimpl.CreateUserUseCaseImpl;
import com.bank.www.application.usecaseimpl.EmailAvailableUseCaseImpl;
import com.bank.www.application.usecaseimpl.TaxNumberAvailableUseCaseImpl;
import com.bank.www.usecase.CreateUserUseCase;
import com.bank.www.usecase.EmailAvailableUseCase;
import com.bank.www.usecase.TaxNumberAvailableUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public TaxNumberAvailableUseCase taxNumberAvailableUseCase(TaxNumberAvailableGateway taxNumberAvailableGateway){
        return new TaxNumberAvailableUseCaseImpl(taxNumberAvailableGateway);
    }

    @Bean
    public EmailAvailableUseCase emailAvailableUseCase(EmailAvailableGateway emailAvailableGateway){
        return new EmailAvailableUseCaseImpl(emailAvailableGateway);
    }

    @Bean
    public CreateUserUseCase createUserUseCase(TaxNumberAvailableUseCase taxNumberAvailableUseCase, EmailAvailableUseCase emailAvailableUseCase, CreateUserGateway createUserGateway){
        return new CreateUserUseCaseImpl(taxNumberAvailableUseCase, emailAvailableUseCase, createUserGateway);
    }
}