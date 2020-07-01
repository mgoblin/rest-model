package ru.uip.model;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class JsonAccount {

    private String accountNumber;
    private String accountName;
    private double accountBalance;
    private EnumAccountStatus accountStatus;

    public String getAccountNumber() {
        return accountNumber;
    }

    @NotBlank
    public String getAccountName() {
        return accountName;
    }

    @DecimalMax("10000.0") @DecimalMin("0.0")
    @NotNull
    public double getAccountBalance() {
        return accountBalance;
    }

    @NotNull
    public EnumAccountStatus getAccountStatus() {
        return accountStatus;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountStatus(EnumAccountStatus accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JsonAccount that = (JsonAccount) o;
        return accountNumber.equals(that.accountNumber) &&
                accountName.equals(that.accountName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, accountName);
    }

    @Override
    public String toString() {
        return "JsonAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountName='" + accountName + '\'' +
                '}';
    }
}
