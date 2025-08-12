package com.bank.www.core.domain;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

import com.bank.www.core.domain.enums.UserTypeEnum;

public class User {
    private UUID id;
    private String fullname;
    private String email;
    private String password;
    private UserTypeEnum type;
    private TaxNumber taxNumber;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;   

    public User(UUID id, String fullname, String email, String password, UserTypeEnum type, TaxNumber taxNumber, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.type = type;
        this.taxNumber = taxNumber;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public User(String fullname, String email, String password, UserTypeEnum type, TaxNumber taxNumber) {
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.type = type;
        this.taxNumber = taxNumber;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public User() {
    }

    public UUID getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
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

    public TaxNumber getTaxNumber() {
        return taxNumber;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public void setTaxNumber(TaxNumber taxNumber) {
        this.taxNumber = taxNumber;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", fullname=" + fullname + ", email=" + email + ", password=" + password + ", type=" + type + ", taxNumber=" + taxNumber + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullname, email, password, type, taxNumber, createdAt, updatedAt);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        return Objects.equals(id, other.id) && Objects.equals(fullname, other.fullname) && Objects.equals(email, other.email) && Objects.equals(password, other.password) && type == other.type && Objects.equals(taxNumber, other.taxNumber) && Objects.equals(createdAt, other.createdAt) && Objects.equals(updatedAt, other.updatedAt);
    }

}
