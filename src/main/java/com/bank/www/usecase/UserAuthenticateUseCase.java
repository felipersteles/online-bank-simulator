package com.bank.www.usecase;

import com.bank.www.core.exception.AuthenticateException;

public interface UserAuthenticateUseCase {
    Boolean authenticate(String username, String password) throws AuthenticateException;
}
