package com.bank.www.application.usecaseimpl;

import com.bank.www.application.gateway.EmailAvailableGateway;
import com.bank.www.usecase.EmailAvailableUseCase;

public class EmailAvailableUseCaseImpl implements EmailAvailableUseCase {
    private EmailAvailableGateway emailAvailableGateway;

    public EmailAvailableUseCaseImpl(EmailAvailableGateway emailAvailableGateway) {
        this.emailAvailableGateway = emailAvailableGateway;
    }

    @Override
    public Boolean isAvailable(String email) {
        return emailAvailableGateway.isAvailable(email);
    }
}
