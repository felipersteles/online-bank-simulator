package com.bank.www.infra.mapper;

import com.bank.www.core.domain.Wallet;
import com.bank.www.infra.entity.TransactionPinEntity;
import com.bank.www.infra.entity.UserEntity;
import com.bank.www.infra.entity.WalletEntity;
import org.springframework.stereotype.Component;

@Component
public class WalletMapper {

    public WalletEntity toWalletEntity(Wallet wallet, UserEntity userEntity, TransactionPinEntity transactionPinEntity) {
        return new WalletEntity(
                wallet.getBalance(),
                userEntity,
                transactionPinEntity,
                wallet.getCreatedAt(),
                wallet.getUpdatedAt()
        );
    }
}