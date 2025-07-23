package com.bank.www.application.gateway;

import com.bank.www.core.exception.AuthenticateException;

public interface UserAuthenticateGateway {
    Boolean authenticate(String username, String password) throws AuthenticateException;
}
