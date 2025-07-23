package com.bank.www.application.usecaseimpl;

import com.bank.www.application.gateway.UserAuthenticateGateway;
import com.bank.www.core.exception.AuthenticateException;
import com.bank.www.core.exception.enums.ErrorCodeEnum;
import com.bank.www.usecase.UserAuthenticateUseCase;

public class UserAuthenticateUseCaseImpl implements UserAuthenticateUseCase {
    private UserAuthenticateGateway userAuthenticateGateway;

    public UserAuthenticateUseCaseImpl(UserAuthenticateGateway userAuthenticateGateway) {
        this.userAuthenticateGateway = userAuthenticateGateway;
    }


    @Override
    public Boolean authenticate(String username, String password) throws AuthenticateException {
        
         if (!userAuthenticateGateway.authenticate(username, password)){
             throw new AuthenticateException(ErrorCodeEnum.ATH0001.getMessage(), ErrorCodeEnum.ATH0001.getCode());
         }

         return true;
    }
}