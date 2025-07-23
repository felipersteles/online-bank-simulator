package com.bank.www.core.domain;

import java.time.LocalDateTime;
import java.util.Objects;

import com.bank.www.core.exception.TransactionPinException;
import com.bank.www.core.exception.enums.ErrorCodeEnum;

public class TransactionPinEntity {
    private Long id;
    private String pin;
    private Boolean blocked;
    private Integer attempts;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public TransactionPinEntity(Long id, WalletEntity wallet, String pin, Boolean blocked, Integer attempts, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.pin = pin;
        this.blocked = blocked;
        this.attempts = attempts;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    public TransactionPinEntity(String pin) throws TransactionPinException {
        this.setPin(pin);
        this.blocked = false;
        this.attempts = 3;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public TransactionPinEntity() {
    }
    
    public Long getId() {
        return id;
    }

    public String getPin() {
        return pin;
    }

    public Boolean getBlocked() {
        return blocked;
    }
    
    public Integer getAttempts() {
        return attempts;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void pinIsValid(String pin) throws TransactionPinException {
        if(this.pin.length() != 6) {
            throw new TransactionPinException(ErrorCodeEnum.TP0001.getMessage(), ErrorCodeEnum.TP0001.getCode());
        }
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public void setPin(String pin) throws TransactionPinException {
        this.pinIsValid(pin);
        this.pin = pin;
    }
    
    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public void increaseAttempt() {
        this.attempts++;
    }

    public void resetAttempts() {
        this.attempts = 0;
    }
    
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    
    @Override
    public String toString() {
        return "TransactionPinEntity [id=" + id + ", pin=" + pin + ", blocked=" + blocked + ", attempts=" + attempts + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pin, blocked, attempts, createdAt, updatedAt);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TransactionPinEntity other = (TransactionPinEntity) obj;
        return Objects.equals(id, other.id) && Objects.equals(pin, other.pin) && Objects.equals(blocked, other.blocked) && Objects.equals(attempts, other.attempts) && Objects.equals(createdAt, other.createdAt) && Objects.equals(updatedAt, other.updatedAt);
    }

}
