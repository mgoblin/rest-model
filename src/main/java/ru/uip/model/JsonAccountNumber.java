package ru.uip.model;

import javax.validation.constraints.NotBlank;
import java.util.Objects;

public class JsonAccountNumber {

    private String accountNumber;

    @NotBlank
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JsonAccountNumber that = (JsonAccountNumber) o;
        return accountNumber.equals(that.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }

    @Override
    public String toString() {
        return "JsonAccountNumber{" +
                "accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
