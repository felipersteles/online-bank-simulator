package com.bank.www.core.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

import com.bank.www.core.domain.enums.TransactionStatusEnum;

public class TransactionEntity {
    private Long id;
    private WalletEntity fromWallet;
    private WalletEntity toWallet;
    private BigDecimal amount;
    private TransactionStatusEnum status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public TransactionEntity(Long id, WalletEntity fromWallet, WalletEntity toWallet, BigDecimal amount, TransactionStatusEnum status, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.fromWallet = fromWallet;
        this.toWallet = toWallet;
        this.amount = amount;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public TransactionEntity(WalletEntity fromWallet, WalletEntity toWallet, BigDecimal amount) {
        this.fromWallet = fromWallet;
        this.toWallet = toWallet;
        this.amount = amount;
        this.status = TransactionStatusEnum.CREATED;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public TransactionEntity() {
    }

    public Long getId() {
        return id;
    }

    public WalletEntity getFromWallet() {
        return fromWallet;
    }

    public WalletEntity getToWallet() {
        return toWallet;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public TransactionStatusEnum getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFromWallet(WalletEntity fromWallet) {
        this.fromWallet = fromWallet;
    }

    public void setToWallet(WalletEntity toWallet) {
        this.toWallet = toWallet;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setStatus(TransactionStatusEnum status) {
        this.status = status;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "TransactionEntity [id=" + id + ", fromWallet=" + fromWallet + ", toWallet=" + toWallet + ", amount=" + amount + ", status=" + status + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fromWallet, toWallet, amount, status, createdAt, updatedAt);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TransactionEntity other = (TransactionEntity) obj;
        return Objects.equals(fromWallet, other.fromWallet) && Objects.equals(toWallet, other.toWallet) && Objects.equals(amount, other.amount) && status == other.status && Objects.equals(createdAt, other.createdAt);
    }   
}
