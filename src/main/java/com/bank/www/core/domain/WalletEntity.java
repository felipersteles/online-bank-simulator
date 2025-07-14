package com.bank.www.core.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

import com.bank.www.core.domain.enums.UserTypeEnum;
import com.bank.www.core.exception.TransferException;
import com.bank.www.core.exception.enums.ErrorCodeEnum;

public class WalletEntity {
    private Long id;
    private UserEntity user;
    private BigDecimal balance;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public WalletEntity(Long id, UserEntity user, BigDecimal balance, LocalDateTime createdAt,
            LocalDateTime updatedAt) {
        this.id = id;
        this.user = user;
        this.balance = balance;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public WalletEntity(BigDecimal balance, UserEntity user) {
        this.user = user;
        this.balance = balance;
        this.createdAt = LocalDateTime.now();
    }

    public WalletEntity() {
    }

    public Long getId() {
        return id;
    }

    public UserEntity getUser() {
        return user;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void receiveAmount(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }

    public void transferAmount(BigDecimal amount) throws TransferException {
        if(this.user.getType() == UserTypeEnum.MERCHANT) {
            throw new TransferException(ErrorCodeEnum.TR0001.getMessage(), ErrorCodeEnum.TR0001.getCode());
        } 

        if(this.balance.compareTo(amount) < 0) {
            throw new TransferException(ErrorCodeEnum.TR0002.getMessage(), ErrorCodeEnum.TR0002.getCode()); 
        }

        this.balance = this.balance.subtract(amount);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }   

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "WalletEntity [id=" + id + ", user=" + user + ", balance=" + balance + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, balance, createdAt, updatedAt);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WalletEntity other = (WalletEntity) obj;
        return Objects.equals(id, other.id) && Objects.equals(user, other.user) && Objects.equals(balance, other.balance) && Objects.equals(createdAt, other.createdAt) && Objects.equals(updatedAt, other.updatedAt);
    }
}

