package com.bank.www.infra.mapper;

import com.bank.www.core.domain.TaxNumber;
import com.bank.www.core.domain.User;
import com.bank.www.infra.dto.request.CreateUserRequest;
import com.bank.www.infra.entity.UserEntity;


import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserEntity toUserEntity(User user){
        return new UserEntity(
                user.getId(),
                user.getEmail(),
                user.getPassword(),
                user.getTaxNumber().getValue(),
                user.getFullname(),
                user.getType(),
                user.getCreatedAt(), 
                user.getUpdatedAt()
        );
    }

    public User toUser(CreateUserRequest request) throws Exception {
        return new User(
            request.fullname(),
            request.email(),
            request.password(),
            request.type(),
            new TaxNumber(request.taxNumber())
        );
    }
}