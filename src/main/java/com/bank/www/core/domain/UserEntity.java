package com.bank.www.core.domain;
import java.time.LocalDateTime;
import java.util.Objects;

import com.bank.www.core.domain.enums.UserTypeEnum;


public class UserEntity {
    private Long id;
    private String fullName;
    private String email;
    private String password;
    private UserTypeEnum type;
    private TaxNumberEntity taxNumber;
    private TransactionPinEntity transactionPin;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;   

    public UserEntity(Long id, String fullName, String email, String password, UserTypeEnum type, TaxNumberEntity taxNumber, TransactionPinEntity transactionPin, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.type = type;
        this.taxNumber = taxNumber;
        this.transactionPin = transactionPin;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UserEntity(String fullName, String email, String password, UserTypeEnum type, TaxNumberEntity taxNumber, TransactionPinEntity transactionPin) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.type = type;
        this.taxNumber = taxNumber;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public UserEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public UserTypeEnum getType() {
        return type;
    }

    public TaxNumberEntity getTaxNumber() {
        return taxNumber;
    }

    public TransactionPinEntity getTransactionPin() {
        return transactionPin;
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

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setType(UserTypeEnum type) {
        this.type = type;
    }

    public void setTaxNumber(TaxNumberEntity taxNumber) {
        this.taxNumber = taxNumber;
    }

    public void setTransactionPin(TransactionPinEntity transactionPin) {
        this.transactionPin = transactionPin;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "UserEntity [id=" + id + ", fullName=" + fullName + ", email=" + email + ", password=" + password + ", type=" + type + ", taxNumber=" + taxNumber + ", transactionPin=" + transactionPin + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, email, password, type, taxNumber, transactionPin, createdAt, updatedAt);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserEntity other = (UserEntity) obj;
        return Objects.equals(id, other.id) && Objects.equals(fullName, other.fullName) && Objects.equals(email, other.email) && Objects.equals(password, other.password) && type == other.type && Objects.equals(taxNumber, other.taxNumber) && Objects.equals(transactionPin, other.transactionPin) && Objects.equals(createdAt, other.createdAt) && Objects.equals(updatedAt, other.updatedAt);
    }

}
